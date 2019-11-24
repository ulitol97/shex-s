package es.weso.shex

import es.weso.rdf.nodes.IRI
import values._
import cats.data._  
import cats._
import cats.implicits._

sealed trait TripleExpr {
  def addId(label: ShapeLabel): TripleExpr
  def id: Option[ShapeLabel]
  def predicates(schema:Schema): List[IRI] =
    paths(schema).collect { case i: Direct => i.pred }

  def getShapeRefs(schema: Schema): Either[String, List[ShapeLabel]] = this match {
    case e: EachOf => e.expressions.map(_.getShapeRefs(schema)).sequence.map(_.flatten)
    case o: OneOf => o.expressions.map(_.getShapeRefs(schema)).sequence.map(_.flatten)
    case i: Inclusion => ???
    case tc: TripleConstraint => 
      tc.valueExpr.fold(List[ShapeLabel]().asRight[String])(se => se.getShapeRefs(schema)) 
    
    case e: Expr => List[ShapeLabel]().asRight[String]
  }

  def relativize(base: IRI): TripleExpr

  def paths(schema: Schema): List[Path] = getPaths(schema, this).getOrElse(List())

  private def getPaths(schema: Schema, te: TripleExpr): Either[String,List[Path]] = {

   /* We use a state monad to handle the list of visited triple expressions in case 
      a triple expr refers to itself */
   case class State(visited: List[TripleExpr]) {
     def add(te: TripleExpr): State = this.copy(visited = this.visited :+ te)
   }
   val initialState = State(List())  
   type S[A] = StateT[Id, State, A]
   type E[A] = EitherT[S, String, A]
   def getState: E[State] = EitherT.liftF(StateT.get)
   def modifyS(f: State => State): S[Unit] = StateT.modify(f)
   def modify[A](f: State => State): E[Unit] = for {
     _ <- EitherT.liftF(modifyS(f))
   } yield ()
   def ok[A](x:A): E[A] = EitherT.pure(x)
   def empty: List[Path] = List()
   def fromEither[A](e: Either[String,A]): E[A] = EitherT.fromEither(e)

   def checkPaths(te: TripleExpr): E[List[Path]] = for {
     s <- getState
     ps <- if (s.visited contains te) ok(empty)
           else for {
             _ <- modify(_.add(te))
             v <- pathsAux(te)
           } yield v 
   } yield ps

   def pathsAux(te: TripleExpr): E[List[Path]] = 
    te match {
     case e: EachOf => e.expressions.map(checkPaths(_)).sequence.map(_.flatten)
     case o: OneOf => o.expressions.map(checkPaths(_)).sequence.map(_.flatten)
     case e: Expr => ok(empty)
     case i: Inclusion => for {
       te <- fromEither(schema.getTripleExpr(i.include))
       ps <- checkPaths(te)
     } yield ps
     case tc: TripleConstraint => ok(List(tc.path))
   }

  val (_, paths) = pathsAux(te).value.run(initialState)
  paths
 }
}

case class EachOf( id: Option[ShapeLabel],
                   expressions: List[TripleExpr],
                   optMin: Option[Int],
                   optMax: Option[Max],
                   semActs: Option[List[SemAct]],
                   annotations: Option[List[Annotation]]) extends TripleExpr {
  lazy val min: Int = optMin.getOrElse(Cardinality.defaultMin)
  lazy val max: Max = optMax.getOrElse(Cardinality.defaultMax)
  override def addId(lbl: ShapeLabel): EachOf = this.copy(id = Some(lbl))

//  override def getShapeRefs (schema: Schema): List[ShapeLabel] = expressions.flatMap(_.getShapeRefs(schema))

  override def relativize(base: IRI): EachOf =
    EachOf(
      id.map(_.relativize(base)),
      expressions.map(_.relativize(base)),
      optMin,
      optMax,
      semActs.map(_.map(_.relativize(base))),
      annotations.map(_.map(_.relativize(base)))
    )
}

object EachOf {
  def fromExpressions(es: TripleExpr*): EachOf =
    EachOf(None,es.toList,None,None,None,None)
}

case class OneOf(
                  id: Option[ShapeLabel],
                  expressions: List[TripleExpr],
                  optMin: Option[Int],
                  optMax: Option[Max],
                  semActs: Option[List[SemAct]],
                  annotations: Option[List[Annotation]]) extends TripleExpr {
  lazy val min: Int = optMin.getOrElse(Cardinality.defaultMin)
  lazy val max: Max = optMax.getOrElse(Cardinality.defaultMax)
  override def addId(lbl: ShapeLabel): OneOf = this.copy(id = Some(lbl))

//  override def getShapeRefs (schema: Schema): List[ShapeLabel] = expressions.flatMap(_.getShapeRefs(schema))

  override def relativize(base: IRI): OneOf =
    OneOf(id.map(_.relativize(base)),
      expressions.map(_.relativize(base)),
      optMin,
      optMax,
      semActs.map(_.map(_.relativize(base))),
      annotations.map(_.map(_.relativize(base)))
    )
}

object OneOf {
  def fromExpressions(es: TripleExpr*): OneOf =
    OneOf(None,es.toList,None,None,None,None)
}

case class Inclusion(include: ShapeLabel) extends TripleExpr {
  override def addId(lbl: ShapeLabel): Inclusion = this
  override def id: None.type = None

  // TODO: The following code can raise stack overflow when a label refers to itself
  //override def getShapeRefs(schema: Schema): List[ShapeLabel] =
  //  schema.getTripleExpr(include).map(_.getShapeRefs(schema)).getOrElse(List())

  override def relativize(base: IRI): Inclusion =
    Inclusion(include.relativize(base))

}

case class TripleConstraint(
                             id: Option[ShapeLabel],
                             optInverse: Option[Boolean],
                             optNegated: Option[Boolean],
                             predicate: IRI,
                             valueExpr: Option[ShapeExpr],
                             optMin: Option[Int],
                             optMax: Option[Max],
                             optVariableDecl: Option[VarName],
                             semActs: Option[List[SemAct]],
                             annotations: Option[List[Annotation]]) extends TripleExpr {
  lazy val inverse: Boolean = optInverse.getOrElse(false)
  lazy val direct: Boolean = !inverse
  lazy val negated: Boolean = optNegated.getOrElse(false)
  lazy val min: Int = optMin.getOrElse(Cardinality.defaultMin)
  lazy val max: Max = optMax.getOrElse(Cardinality.defaultMax)
  lazy val path: Path =
    if (direct) Direct(predicate)
    else Inverse(predicate)
  override def addId(lbl: ShapeLabel): TripleConstraint = this.copy(id = Some(lbl))

  def decreaseCard: TripleConstraint = this.copy(
    optMin = optMin.map(x => Math.min(x - 1,0)),
    optMax = optMax.map(_.decreaseCard)
  )

  override def getShapeRefs(schema: Schema): Either[String, List[ShapeLabel]] = 
     ??? // valueExpr.map(_.getShapeRefs(schema)).sequence  // .map(_.flatten)

  override def relativize(base: IRI): TripleConstraint =
    TripleConstraint(
      id.map(_.relativize(base)),
      optInverse,
      optNegated,
      predicate.relativizeIRI(base),
      valueExpr.map(_.relativize(base)),
      optMin,
      optMax,
      optVariableDecl,
      semActs.map(_.map(_.relativize(base))),
      annotations.map(_.map(_.relativize(base)))
    )
}

/**
  * Support for arithmetic expressions
  * @param id an optional ShapeLabel
  * @param e value expression
  */
case class Expr(id: Option[ShapeLabel],
                e: ValueExpr
               ) extends TripleExpr {
  def addId(label: ShapeLabel): Expr = this.copy(id = Some(label))
  // override def getShapeRefs(schema: Schema): List[ShapeLabel] = List()
  override def relativize(base: IRI): Expr =
    Expr(id.map(_.relativize(base)),e)
}

object TripleConstraint {
  def emptyPred(pred: IRI): TripleConstraint =
    TripleConstraint(
      None, None, None, pred, None, None, None, None, None, None)

  def valueExpr(pred: IRI, ve: ShapeExpr): TripleConstraint =
    emptyPred(pred).copy(valueExpr = Some(ve))

  def datatype(pred: IRI, iri: IRI, facets: List[XsFacet]): TripleConstraint =
    emptyPred(pred).copy(valueExpr = Some(NodeConstraint.datatype(iri, facets)))

}

