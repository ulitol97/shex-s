// Generated from /home/labra/src/shapes/shex-s/modules/shex/src/main/antlr4/ShExDoc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShExDocParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, KW_ABSTRACT=29, KW_AS=30, KW_BASE=31, 
		KW_EXTENDS=32, KW_IMPORT=33, KW_RESTRICTS=34, KW_EXTERNAL=35, KW_PREFIX=36, 
		KW_START=37, KW_VIRTUAL=38, KW_CLOSED=39, KW_EXTRA=40, KW_LITERAL=41, 
		KW_IRI=42, KW_NONLITERAL=43, KW_BNODE=44, KW_AND=45, KW_OR=46, KW_MININCLUSIVE=47, 
		KW_MINEXCLUSIVE=48, KW_MAXINCLUSIVE=49, KW_MAXEXCLUSIVE=50, KW_LENGTH=51, 
		KW_MINLENGTH=52, KW_MAXLENGTH=53, KW_TOTALDIGITS=54, KW_FRACTIONDIGITS=55, 
		KW_NOT=56, KW_TRUE=57, KW_FALSE=58, SKIP_=59, CODE=60, RDF_TYPE=61, IRIREF=62, 
		PNAME_NS=63, PNAME_LN=64, ATPNAME_NS=65, ATPNAME_LN=66, REGEXP=67, REGEXP_FLAGS=68, 
		BLANK_NODE_LABEL=69, LANGTAG=70, INTEGER=71, DECIMAL=72, DOUBLE=73, STEM_MARK=74, 
		UNBOUNDED=75, STRING_LITERAL1=76, STRING_LITERAL2=77, STRING_LITERAL_LONG1=78, 
		STRING_LITERAL_LONG2=79;
	public static final int
		RULE_shExDoc = 0, RULE_directive = 1, RULE_baseDecl = 2, RULE_prefixDecl = 3, 
		RULE_importDecl = 4, RULE_notStartAction = 5, RULE_start = 6, RULE_startActions = 7, 
		RULE_statement = 8, RULE_shapeExprDecl = 9, RULE_shapeExpression = 10, 
		RULE_inlineShapeExpression = 11, RULE_shapeOr = 12, RULE_inlineShapeOr = 13, 
		RULE_shapeAnd = 14, RULE_inlineShapeAnd = 15, RULE_shapeNot = 16, RULE_inlineShapeNot = 17, 
		RULE_negation = 18, RULE_shapeAtom = 19, RULE_inlineShapeAtom = 20, RULE_shapeOrRef = 21, 
		RULE_inlineShapeOrRef = 22, RULE_shapeRef = 23, RULE_inlineLitNodeConstraint = 24, 
		RULE_litNodeConstraint = 25, RULE_inlineNonLitNodeConstraint = 26, RULE_nonLitNodeConstraint = 27, 
		RULE_nonLiteralKind = 28, RULE_xsFacet = 29, RULE_stringFacet = 30, RULE_stringLength = 31, 
		RULE_numericFacet = 32, RULE_numericRange = 33, RULE_numericLength = 34, 
		RULE_rawNumeric = 35, RULE_shapeDefinition = 36, RULE_inlineShapeDefinition = 37, 
		RULE_qualifier = 38, RULE_extraPropertySet = 39, RULE_tripleExpression = 40, 
		RULE_oneOfTripleExpr = 41, RULE_multiElementOneOf = 42, RULE_groupTripleExpr = 43, 
		RULE_singleElementGroup = 44, RULE_multiElementGroup = 45, RULE_unaryTripleExpr = 46, 
		RULE_bracketedTripleExpr = 47, RULE_tripleConstraint = 48, RULE_cardinality = 49, 
		RULE_repeatRange = 50, RULE_min_range = 51, RULE_max_range = 52, RULE_expr = 53, 
		RULE_binOp = 54, RULE_basicExpr = 55, RULE_senseFlags = 56, RULE_valueSet = 57, 
		RULE_valueSetValue = 58, RULE_iriRange = 59, RULE_iriExclusion = 60, RULE_literalRange = 61, 
		RULE_literalExclusion = 62, RULE_languageRange = 63, RULE_languageExclusion = 64, 
		RULE_include = 65, RULE_annotation = 66, RULE_semanticAction = 67, RULE_literal = 68, 
		RULE_predicate = 69, RULE_rdfType = 70, RULE_datatype = 71, RULE_shapeExprLabel = 72, 
		RULE_tripleExprLabel = 73, RULE_numericLiteral = 74, RULE_rdfLiteral = 75, 
		RULE_booleanLiteral = 76, RULE_string = 77, RULE_iri = 78, RULE_prefixedName = 79, 
		RULE_blankNode = 80, RULE_extension = 81, RULE_restrictions = 82;
	public static final String[] ruleNames = {
		"shExDoc", "directive", "baseDecl", "prefixDecl", "importDecl", "notStartAction", 
		"start", "startActions", "statement", "shapeExprDecl", "shapeExpression", 
		"inlineShapeExpression", "shapeOr", "inlineShapeOr", "shapeAnd", "inlineShapeAnd", 
		"shapeNot", "inlineShapeNot", "negation", "shapeAtom", "inlineShapeAtom", 
		"shapeOrRef", "inlineShapeOrRef", "shapeRef", "inlineLitNodeConstraint", 
		"litNodeConstraint", "inlineNonLitNodeConstraint", "nonLitNodeConstraint", 
		"nonLiteralKind", "xsFacet", "stringFacet", "stringLength", "numericFacet", 
		"numericRange", "numericLength", "rawNumeric", "shapeDefinition", "inlineShapeDefinition", 
		"qualifier", "extraPropertySet", "tripleExpression", "oneOfTripleExpr", 
		"multiElementOneOf", "groupTripleExpr", "singleElementGroup", "multiElementGroup", 
		"unaryTripleExpr", "bracketedTripleExpr", "tripleConstraint", "cardinality", 
		"repeatRange", "min_range", "max_range", "expr", "binOp", "basicExpr", 
		"senseFlags", "valueSet", "valueSetValue", "iriRange", "iriExclusion", 
		"literalRange", "literalExclusion", "languageRange", "languageExclusion", 
		"include", "annotation", "semanticAction", "literal", "predicate", "rdfType", 
		"datatype", "shapeExprLabel", "tripleExprLabel", "numericLiteral", "rdfLiteral", 
		"booleanLiteral", "string", "iri", "prefixedName", "blankNode", "extension", 
		"restrictions"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'!'", "'('", "')'", "'.'", "'@'", "'{'", "'}'", "'|'", "';'", 
		"'$'", "'+'", "'?'", "','", "'!='", "'>'", "'<'", "'>='", "'<='", "'/'", 
		"'-'", "'^'", "'['", "']'", "'&'", "'//'", "'%'", "'^^'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'true'", "'false'", null, null, "'a'", null, null, null, 
		null, null, null, null, null, null, null, null, null, "'~'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "KW_ABSTRACT", "KW_AS", "KW_BASE", "KW_EXTENDS", 
		"KW_IMPORT", "KW_RESTRICTS", "KW_EXTERNAL", "KW_PREFIX", "KW_START", "KW_VIRTUAL", 
		"KW_CLOSED", "KW_EXTRA", "KW_LITERAL", "KW_IRI", "KW_NONLITERAL", "KW_BNODE", 
		"KW_AND", "KW_OR", "KW_MININCLUSIVE", "KW_MINEXCLUSIVE", "KW_MAXINCLUSIVE", 
		"KW_MAXEXCLUSIVE", "KW_LENGTH", "KW_MINLENGTH", "KW_MAXLENGTH", "KW_TOTALDIGITS", 
		"KW_FRACTIONDIGITS", "KW_NOT", "KW_TRUE", "KW_FALSE", "SKIP_", "CODE", 
		"RDF_TYPE", "IRIREF", "PNAME_NS", "PNAME_LN", "ATPNAME_NS", "ATPNAME_LN", 
		"REGEXP", "REGEXP_FLAGS", "BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", 
		"DOUBLE", "STEM_MARK", "UNBOUNDED", "STRING_LITERAL1", "STRING_LITERAL2", 
		"STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ShExDoc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShExDocParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ShExDocContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ShExDocParser.EOF, 0); }
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public NotStartActionContext notStartAction() {
			return getRuleContext(NotStartActionContext.class,0);
		}
		public StartActionsContext startActions() {
			return getRuleContext(StartActionsContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ShExDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shExDoc; }
	}

	public final ShExDocContext shExDoc() throws RecognitionException {
		ShExDocContext _localctx = new ShExDocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_shExDoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BASE) | (1L << KW_IMPORT) | (1L << KW_PREFIX))) != 0)) {
				{
				{
				setState(166);
				directive();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (KW_START - 27)) | (1L << (IRIREF - 27)) | (1L << (PNAME_NS - 27)) | (1L << (PNAME_LN - 27)) | (1L << (BLANK_NODE_LABEL - 27)))) != 0)) {
				{
				setState(174);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_START:
				case IRIREF:
				case PNAME_NS:
				case PNAME_LN:
				case BLANK_NODE_LABEL:
					{
					setState(172);
					notStartAction();
					}
					break;
				case T__26:
					{
					setState(173);
					startActions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (KW_BASE - 31)) | (1L << (KW_IMPORT - 31)) | (1L << (KW_PREFIX - 31)) | (1L << (KW_START - 31)) | (1L << (IRIREF - 31)) | (1L << (PNAME_NS - 31)) | (1L << (PNAME_LN - 31)) | (1L << (BLANK_NODE_LABEL - 31)))) != 0)) {
					{
					{
					setState(176);
					statement();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(184);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public BaseDeclContext baseDecl() {
			return getRuleContext(BaseDeclContext.class,0);
		}
		public PrefixDeclContext prefixDecl() {
			return getRuleContext(PrefixDeclContext.class,0);
		}
		public ImportDeclContext importDecl() {
			return getRuleContext(ImportDeclContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directive);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				baseDecl();
				}
				break;
			case KW_PREFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				prefixDecl();
				}
				break;
			case KW_IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				importDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseDeclContext extends ParserRuleContext {
		public TerminalNode KW_BASE() { return getToken(ShExDocParser.KW_BASE, 0); }
		public TerminalNode IRIREF() { return getToken(ShExDocParser.IRIREF, 0); }
		public BaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseDecl; }
	}

	public final BaseDeclContext baseDecl() throws RecognitionException {
		BaseDeclContext _localctx = new BaseDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_baseDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(KW_BASE);
			setState(192);
			match(IRIREF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixDeclContext extends ParserRuleContext {
		public TerminalNode KW_PREFIX() { return getToken(ShExDocParser.KW_PREFIX, 0); }
		public TerminalNode PNAME_NS() { return getToken(ShExDocParser.PNAME_NS, 0); }
		public TerminalNode IRIREF() { return getToken(ShExDocParser.IRIREF, 0); }
		public PrefixDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDecl; }
	}

	public final PrefixDeclContext prefixDecl() throws RecognitionException {
		PrefixDeclContext _localctx = new PrefixDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefixDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(KW_PREFIX);
			setState(195);
			match(PNAME_NS);
			setState(196);
			match(IRIREF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode KW_IMPORT() { return getToken(ShExDocParser.KW_IMPORT, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(KW_IMPORT);
			setState(199);
			iri();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotStartActionContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ShapeExprDeclContext shapeExprDecl() {
			return getRuleContext(ShapeExprDeclContext.class,0);
		}
		public NotStartActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notStartAction; }
	}

	public final NotStartActionContext notStartAction() throws RecognitionException {
		NotStartActionContext _localctx = new NotStartActionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_notStartAction);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				start();
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				shapeExprDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode KW_START() { return getToken(ShExDocParser.KW_START, 0); }
		public ShapeExpressionContext shapeExpression() {
			return getRuleContext(ShapeExpressionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(KW_START);
			setState(206);
			match(T__0);
			setState(207);
			shapeExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartActionsContext extends ParserRuleContext {
		public List<SemanticActionContext> semanticAction() {
			return getRuleContexts(SemanticActionContext.class);
		}
		public SemanticActionContext semanticAction(int i) {
			return getRuleContext(SemanticActionContext.class,i);
		}
		public StartActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startActions; }
	}

	public final StartActionsContext startActions() throws RecognitionException {
		StartActionsContext _localctx = new StartActionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_startActions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				semanticAction();
				}
				}
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__26 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public NotStartActionContext notStartAction() {
			return getRuleContext(NotStartActionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BASE:
			case KW_IMPORT:
			case KW_PREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				directive();
				}
				break;
			case KW_START:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				notStartAction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeExprDeclContext extends ParserRuleContext {
		public ShapeExprLabelContext shapeExprLabel() {
			return getRuleContext(ShapeExprLabelContext.class,0);
		}
		public ShapeExpressionContext shapeExpression() {
			return getRuleContext(ShapeExpressionContext.class,0);
		}
		public TerminalNode KW_EXTERNAL() { return getToken(ShExDocParser.KW_EXTERNAL, 0); }
		public ShapeExprDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeExprDecl; }
	}

	public final ShapeExprDeclContext shapeExprDecl() throws RecognitionException {
		ShapeExprDeclContext _localctx = new ShapeExprDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_shapeExprDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			shapeExprLabel();
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case T__22:
			case T__24:
			case KW_EXTENDS:
			case KW_CLOSED:
			case KW_EXTRA:
			case KW_LITERAL:
			case KW_IRI:
			case KW_NONLITERAL:
			case KW_BNODE:
			case KW_MININCLUSIVE:
			case KW_MINEXCLUSIVE:
			case KW_MAXINCLUSIVE:
			case KW_MAXEXCLUSIVE:
			case KW_LENGTH:
			case KW_MINLENGTH:
			case KW_MAXLENGTH:
			case KW_TOTALDIGITS:
			case KW_FRACTIONDIGITS:
			case KW_NOT:
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
			case ATPNAME_NS:
			case ATPNAME_LN:
			case REGEXP:
				{
				setState(219);
				shapeExpression();
				}
				break;
			case KW_EXTERNAL:
				{
				setState(220);
				match(KW_EXTERNAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeExpressionContext extends ParserRuleContext {
		public ShapeOrContext shapeOr() {
			return getRuleContext(ShapeOrContext.class,0);
		}
		public ShapeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeExpression; }
	}

	public final ShapeExpressionContext shapeExpression() throws RecognitionException {
		ShapeExpressionContext _localctx = new ShapeExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_shapeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			shapeOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineShapeExpressionContext extends ParserRuleContext {
		public InlineShapeOrContext inlineShapeOr() {
			return getRuleContext(InlineShapeOrContext.class,0);
		}
		public InlineShapeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineShapeExpression; }
	}

	public final InlineShapeExpressionContext inlineShapeExpression() throws RecognitionException {
		InlineShapeExpressionContext _localctx = new InlineShapeExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inlineShapeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			inlineShapeOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeOrContext extends ParserRuleContext {
		public List<ShapeAndContext> shapeAnd() {
			return getRuleContexts(ShapeAndContext.class);
		}
		public ShapeAndContext shapeAnd(int i) {
			return getRuleContext(ShapeAndContext.class,i);
		}
		public List<TerminalNode> KW_OR() { return getTokens(ShExDocParser.KW_OR); }
		public TerminalNode KW_OR(int i) {
			return getToken(ShExDocParser.KW_OR, i);
		}
		public ShapeOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeOr; }
	}

	public final ShapeOrContext shapeOr() throws RecognitionException {
		ShapeOrContext _localctx = new ShapeOrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shapeOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			shapeAnd();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_OR) {
				{
				{
				setState(228);
				match(KW_OR);
				setState(229);
				shapeAnd();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineShapeOrContext extends ParserRuleContext {
		public List<InlineShapeAndContext> inlineShapeAnd() {
			return getRuleContexts(InlineShapeAndContext.class);
		}
		public InlineShapeAndContext inlineShapeAnd(int i) {
			return getRuleContext(InlineShapeAndContext.class,i);
		}
		public List<TerminalNode> KW_OR() { return getTokens(ShExDocParser.KW_OR); }
		public TerminalNode KW_OR(int i) {
			return getToken(ShExDocParser.KW_OR, i);
		}
		public InlineShapeOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineShapeOr; }
	}

	public final InlineShapeOrContext inlineShapeOr() throws RecognitionException {
		InlineShapeOrContext _localctx = new InlineShapeOrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inlineShapeOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			inlineShapeAnd();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_OR) {
				{
				{
				setState(236);
				match(KW_OR);
				setState(237);
				inlineShapeAnd();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeAndContext extends ParserRuleContext {
		public List<ShapeNotContext> shapeNot() {
			return getRuleContexts(ShapeNotContext.class);
		}
		public ShapeNotContext shapeNot(int i) {
			return getRuleContext(ShapeNotContext.class,i);
		}
		public List<TerminalNode> KW_AND() { return getTokens(ShExDocParser.KW_AND); }
		public TerminalNode KW_AND(int i) {
			return getToken(ShExDocParser.KW_AND, i);
		}
		public ShapeAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeAnd; }
	}

	public final ShapeAndContext shapeAnd() throws RecognitionException {
		ShapeAndContext _localctx = new ShapeAndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_shapeAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			shapeNot();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_AND) {
				{
				{
				setState(244);
				match(KW_AND);
				setState(245);
				shapeNot();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineShapeAndContext extends ParserRuleContext {
		public List<InlineShapeNotContext> inlineShapeNot() {
			return getRuleContexts(InlineShapeNotContext.class);
		}
		public InlineShapeNotContext inlineShapeNot(int i) {
			return getRuleContext(InlineShapeNotContext.class,i);
		}
		public List<TerminalNode> KW_AND() { return getTokens(ShExDocParser.KW_AND); }
		public TerminalNode KW_AND(int i) {
			return getToken(ShExDocParser.KW_AND, i);
		}
		public InlineShapeAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineShapeAnd; }
	}

	public final InlineShapeAndContext inlineShapeAnd() throws RecognitionException {
		InlineShapeAndContext _localctx = new InlineShapeAndContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inlineShapeAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			inlineShapeNot();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_AND) {
				{
				{
				setState(252);
				match(KW_AND);
				setState(253);
				inlineShapeNot();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeNotContext extends ParserRuleContext {
		public ShapeAtomContext shapeAtom() {
			return getRuleContext(ShapeAtomContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public ShapeNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeNot; }
	}

	public final ShapeNotContext shapeNot() throws RecognitionException {
		ShapeNotContext _localctx = new ShapeNotContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_shapeNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==KW_NOT) {
				{
				setState(259);
				negation();
				}
			}

			setState(262);
			shapeAtom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineShapeNotContext extends ParserRuleContext {
		public InlineShapeAtomContext inlineShapeAtom() {
			return getRuleContext(InlineShapeAtomContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public InlineShapeNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineShapeNot; }
	}

	public final InlineShapeNotContext inlineShapeNot() throws RecognitionException {
		InlineShapeNotContext _localctx = new InlineShapeNotContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inlineShapeNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==KW_NOT) {
				{
				setState(264);
				negation();
				}
			}

			setState(267);
			inlineShapeAtom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegationContext extends ParserRuleContext {
		public TerminalNode KW_NOT() { return getToken(ShExDocParser.KW_NOT, 0); }
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_negation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==KW_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeAtomContext extends ParserRuleContext {
		public ShapeAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeAtom; }
	 
		public ShapeAtomContext() { }
		public void copyFrom(ShapeAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShapeAtomShapeOrRefContext extends ShapeAtomContext {
		public ShapeOrRefContext shapeOrRef() {
			return getRuleContext(ShapeOrRefContext.class,0);
		}
		public NonLitNodeConstraintContext nonLitNodeConstraint() {
			return getRuleContext(NonLitNodeConstraintContext.class,0);
		}
		public ShapeAtomShapeOrRefContext(ShapeAtomContext ctx) { copyFrom(ctx); }
	}
	public static class ShapeAtomNonLitNodeConstraintContext extends ShapeAtomContext {
		public NonLitNodeConstraintContext nonLitNodeConstraint() {
			return getRuleContext(NonLitNodeConstraintContext.class,0);
		}
		public ShapeOrRefContext shapeOrRef() {
			return getRuleContext(ShapeOrRefContext.class,0);
		}
		public ShapeAtomNonLitNodeConstraintContext(ShapeAtomContext ctx) { copyFrom(ctx); }
	}
	public static class ShapeAtomLitNodeConstraintContext extends ShapeAtomContext {
		public LitNodeConstraintContext litNodeConstraint() {
			return getRuleContext(LitNodeConstraintContext.class,0);
		}
		public ShapeAtomLitNodeConstraintContext(ShapeAtomContext ctx) { copyFrom(ctx); }
	}
	public static class ShapeAtomShapeExpressionContext extends ShapeAtomContext {
		public ShapeExpressionContext shapeExpression() {
			return getRuleContext(ShapeExpressionContext.class,0);
		}
		public ShapeAtomShapeExpressionContext(ShapeAtomContext ctx) { copyFrom(ctx); }
	}
	public static class ShapeAtomAnyContext extends ShapeAtomContext {
		public ShapeAtomAnyContext(ShapeAtomContext ctx) { copyFrom(ctx); }
	}

	public final ShapeAtomContext shapeAtom() throws RecognitionException {
		ShapeAtomContext _localctx = new ShapeAtomContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_shapeAtom);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ShapeAtomNonLitNodeConstraintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				nonLitNodeConstraint();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__6 - 6)) | (1L << (T__24 - 6)) | (1L << (KW_EXTENDS - 6)) | (1L << (KW_CLOSED - 6)) | (1L << (KW_EXTRA - 6)) | (1L << (ATPNAME_NS - 6)) | (1L << (ATPNAME_LN - 6)))) != 0)) {
					{
					setState(272);
					shapeOrRef();
					}
				}

				}
				break;
			case 2:
				_localctx = new ShapeAtomLitNodeConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				litNodeConstraint();
				}
				break;
			case 3:
				_localctx = new ShapeAtomShapeOrRefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				shapeOrRef();
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (KW_IRI - 42)) | (1L << (KW_NONLITERAL - 42)) | (1L << (KW_BNODE - 42)) | (1L << (KW_LENGTH - 42)) | (1L << (KW_MINLENGTH - 42)) | (1L << (KW_MAXLENGTH - 42)) | (1L << (REGEXP - 42)))) != 0)) {
					{
					setState(277);
					nonLitNodeConstraint();
					}
				}

				}
				break;
			case 4:
				_localctx = new ShapeAtomShapeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				match(T__2);
				setState(281);
				shapeExpression();
				setState(282);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new ShapeAtomAnyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineShapeAtomContext extends ParserRuleContext {
		public InlineShapeAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineShapeAtom; }
	 
		public InlineShapeAtomContext() { }
		public void copyFrom(InlineShapeAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InlineShapeAtomShapeExpressionContext extends InlineShapeAtomContext {
		public ShapeExpressionContext shapeExpression() {
			return getRuleContext(ShapeExpressionContext.class,0);
		}
		public InlineShapeAtomShapeExpressionContext(InlineShapeAtomContext ctx) { copyFrom(ctx); }
	}
	public static class InlineShapeAtomLitNodeConstraintContext extends InlineShapeAtomContext {
		public InlineLitNodeConstraintContext inlineLitNodeConstraint() {
			return getRuleContext(InlineLitNodeConstraintContext.class,0);
		}
		public InlineShapeAtomLitNodeConstraintContext(InlineShapeAtomContext ctx) { copyFrom(ctx); }
	}
	public static class InlineShapeAtomShapeOrRefContext extends InlineShapeAtomContext {
		public InlineShapeOrRefContext inlineShapeOrRef() {
			return getRuleContext(InlineShapeOrRefContext.class,0);
		}
		public InlineNonLitNodeConstraintContext inlineNonLitNodeConstraint() {
			return getRuleContext(InlineNonLitNodeConstraintContext.class,0);
		}
		public InlineShapeAtomShapeOrRefContext(InlineShapeAtomContext ctx) { copyFrom(ctx); }
	}
	public static class InlineShapeAtomAnyContext extends InlineShapeAtomContext {
		public InlineShapeAtomAnyContext(InlineShapeAtomContext ctx) { copyFrom(ctx); }
	}
	public static class InlineShapeAtomNonLitNodeConstraintContext extends InlineShapeAtomContext {
		public InlineNonLitNodeConstraintContext inlineNonLitNodeConstraint() {
			return getRuleContext(InlineNonLitNodeConstraintContext.class,0);
		}
		public InlineShapeOrRefContext inlineShapeOrRef() {
			return getRuleContext(InlineShapeOrRefContext.class,0);
		}
		public InlineShapeAtomNonLitNodeConstraintContext(InlineShapeAtomContext ctx) { copyFrom(ctx); }
	}

	public final InlineShapeAtomContext inlineShapeAtom() throws RecognitionException {
		InlineShapeAtomContext _localctx = new InlineShapeAtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inlineShapeAtom);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new InlineShapeAtomNonLitNodeConstraintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				inlineNonLitNodeConstraint();
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(288);
					inlineShapeOrRef();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InlineShapeAtomLitNodeConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				inlineLitNodeConstraint();
				}
				break;
			case 3:
				_localctx = new InlineShapeAtomShapeOrRefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				inlineShapeOrRef();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (KW_IRI - 42)) | (1L << (KW_NONLITERAL - 42)) | (1L << (KW_BNODE - 42)) | (1L << (KW_LENGTH - 42)) | (1L << (KW_MINLENGTH - 42)) | (1L << (KW_MAXLENGTH - 42)) | (1L << (REGEXP - 42)))) != 0)) {
					{
					setState(293);
					inlineNonLitNodeConstraint();
					}
				}

				}
				break;
			case 4:
				_localctx = new InlineShapeAtomShapeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				match(T__2);
				setState(297);
				shapeExpression();
				setState(298);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new InlineShapeAtomAnyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeOrRefContext extends ParserRuleContext {
		public ShapeDefinitionContext shapeDefinition() {
			return getRuleContext(ShapeDefinitionContext.class,0);
		}
		public ShapeRefContext shapeRef() {
			return getRuleContext(ShapeRefContext.class,0);
		}
		public ShapeOrRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeOrRef; }
	}

	public final ShapeOrRefContext shapeOrRef() throws RecognitionException {
		ShapeOrRefContext _localctx = new ShapeOrRefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_shapeOrRef);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__24:
			case KW_EXTENDS:
			case KW_CLOSED:
			case KW_EXTRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				shapeDefinition();
				}
				break;
			case T__5:
			case ATPNAME_NS:
			case ATPNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				shapeRef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineShapeOrRefContext extends ParserRuleContext {
		public InlineShapeDefinitionContext inlineShapeDefinition() {
			return getRuleContext(InlineShapeDefinitionContext.class,0);
		}
		public ShapeRefContext shapeRef() {
			return getRuleContext(ShapeRefContext.class,0);
		}
		public InlineShapeOrRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineShapeOrRef; }
	}

	public final InlineShapeOrRefContext inlineShapeOrRef() throws RecognitionException {
		InlineShapeOrRefContext _localctx = new InlineShapeOrRefContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inlineShapeOrRef);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__24:
			case KW_EXTENDS:
			case KW_CLOSED:
			case KW_EXTRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				inlineShapeDefinition();
				}
				break;
			case T__5:
			case ATPNAME_NS:
			case ATPNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				shapeRef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeRefContext extends ParserRuleContext {
		public TerminalNode ATPNAME_LN() { return getToken(ShExDocParser.ATPNAME_LN, 0); }
		public TerminalNode ATPNAME_NS() { return getToken(ShExDocParser.ATPNAME_NS, 0); }
		public ShapeExprLabelContext shapeExprLabel() {
			return getRuleContext(ShapeExprLabelContext.class,0);
		}
		public ShapeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeRef; }
	}

	public final ShapeRefContext shapeRef() throws RecognitionException {
		ShapeRefContext _localctx = new ShapeRefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_shapeRef);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATPNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(ATPNAME_LN);
				}
				break;
			case ATPNAME_NS:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(ATPNAME_NS);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(T__5);
				setState(314);
				shapeExprLabel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineLitNodeConstraintContext extends ParserRuleContext {
		public InlineLitNodeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineLitNodeConstraint; }
	 
		public InlineLitNodeConstraintContext() { }
		public void copyFrom(InlineLitNodeConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NodeConstraintNumericFacetContext extends InlineLitNodeConstraintContext {
		public List<NumericFacetContext> numericFacet() {
			return getRuleContexts(NumericFacetContext.class);
		}
		public NumericFacetContext numericFacet(int i) {
			return getRuleContext(NumericFacetContext.class,i);
		}
		public NodeConstraintNumericFacetContext(InlineLitNodeConstraintContext ctx) { copyFrom(ctx); }
	}
	public static class NodeConstraintLiteralContext extends InlineLitNodeConstraintContext {
		public TerminalNode KW_LITERAL() { return getToken(ShExDocParser.KW_LITERAL, 0); }
		public List<XsFacetContext> xsFacet() {
			return getRuleContexts(XsFacetContext.class);
		}
		public XsFacetContext xsFacet(int i) {
			return getRuleContext(XsFacetContext.class,i);
		}
		public NodeConstraintLiteralContext(InlineLitNodeConstraintContext ctx) { copyFrom(ctx); }
	}
	public static class NodeConstraintNonLiteralContext extends InlineLitNodeConstraintContext {
		public NonLiteralKindContext nonLiteralKind() {
			return getRuleContext(NonLiteralKindContext.class,0);
		}
		public List<StringFacetContext> stringFacet() {
			return getRuleContexts(StringFacetContext.class);
		}
		public StringFacetContext stringFacet(int i) {
			return getRuleContext(StringFacetContext.class,i);
		}
		public NodeConstraintNonLiteralContext(InlineLitNodeConstraintContext ctx) { copyFrom(ctx); }
	}
	public static class NodeConstraintDatatypeContext extends InlineLitNodeConstraintContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<XsFacetContext> xsFacet() {
			return getRuleContexts(XsFacetContext.class);
		}
		public XsFacetContext xsFacet(int i) {
			return getRuleContext(XsFacetContext.class,i);
		}
		public NodeConstraintDatatypeContext(InlineLitNodeConstraintContext ctx) { copyFrom(ctx); }
	}
	public static class NodeConstraintValueSetContext extends InlineLitNodeConstraintContext {
		public ValueSetContext valueSet() {
			return getRuleContext(ValueSetContext.class,0);
		}
		public List<XsFacetContext> xsFacet() {
			return getRuleContexts(XsFacetContext.class);
		}
		public XsFacetContext xsFacet(int i) {
			return getRuleContext(XsFacetContext.class,i);
		}
		public NodeConstraintValueSetContext(InlineLitNodeConstraintContext ctx) { copyFrom(ctx); }
	}

	public final InlineLitNodeConstraintContext inlineLitNodeConstraint() throws RecognitionException {
		InlineLitNodeConstraintContext _localctx = new InlineLitNodeConstraintContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_inlineLitNodeConstraint);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_LITERAL:
				_localctx = new NodeConstraintLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(KW_LITERAL);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (KW_MININCLUSIVE - 47)) | (1L << (KW_MINEXCLUSIVE - 47)) | (1L << (KW_MAXINCLUSIVE - 47)) | (1L << (KW_MAXEXCLUSIVE - 47)) | (1L << (KW_LENGTH - 47)) | (1L << (KW_MINLENGTH - 47)) | (1L << (KW_MAXLENGTH - 47)) | (1L << (KW_TOTALDIGITS - 47)) | (1L << (KW_FRACTIONDIGITS - 47)) | (1L << (REGEXP - 47)))) != 0)) {
					{
					{
					setState(318);
					xsFacet();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KW_IRI:
			case KW_NONLITERAL:
			case KW_BNODE:
				_localctx = new NodeConstraintNonLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				nonLiteralKind();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (KW_LENGTH - 51)) | (1L << (KW_MINLENGTH - 51)) | (1L << (KW_MAXLENGTH - 51)) | (1L << (REGEXP - 51)))) != 0)) {
					{
					{
					setState(325);
					stringFacet();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				_localctx = new NodeConstraintDatatypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				datatype();
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (KW_MININCLUSIVE - 47)) | (1L << (KW_MINEXCLUSIVE - 47)) | (1L << (KW_MAXINCLUSIVE - 47)) | (1L << (KW_MAXEXCLUSIVE - 47)) | (1L << (KW_LENGTH - 47)) | (1L << (KW_MINLENGTH - 47)) | (1L << (KW_MAXLENGTH - 47)) | (1L << (KW_TOTALDIGITS - 47)) | (1L << (KW_FRACTIONDIGITS - 47)) | (1L << (REGEXP - 47)))) != 0)) {
					{
					{
					setState(332);
					xsFacet();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__22:
				_localctx = new NodeConstraintValueSetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				valueSet();
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (KW_MININCLUSIVE - 47)) | (1L << (KW_MINEXCLUSIVE - 47)) | (1L << (KW_MAXINCLUSIVE - 47)) | (1L << (KW_MAXEXCLUSIVE - 47)) | (1L << (KW_LENGTH - 47)) | (1L << (KW_MINLENGTH - 47)) | (1L << (KW_MAXLENGTH - 47)) | (1L << (KW_TOTALDIGITS - 47)) | (1L << (KW_FRACTIONDIGITS - 47)) | (1L << (REGEXP - 47)))) != 0)) {
					{
					{
					setState(339);
					xsFacet();
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KW_MININCLUSIVE:
			case KW_MINEXCLUSIVE:
			case KW_MAXINCLUSIVE:
			case KW_MAXEXCLUSIVE:
			case KW_TOTALDIGITS:
			case KW_FRACTIONDIGITS:
				_localctx = new NodeConstraintNumericFacetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(345);
					numericFacet();
					}
					}
					setState(348); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_MININCLUSIVE) | (1L << KW_MINEXCLUSIVE) | (1L << KW_MAXINCLUSIVE) | (1L << KW_MAXEXCLUSIVE) | (1L << KW_TOTALDIGITS) | (1L << KW_FRACTIONDIGITS))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LitNodeConstraintContext extends ParserRuleContext {
		public InlineLitNodeConstraintContext inlineLitNodeConstraint() {
			return getRuleContext(InlineLitNodeConstraintContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<SemanticActionContext> semanticAction() {
			return getRuleContexts(SemanticActionContext.class);
		}
		public SemanticActionContext semanticAction(int i) {
			return getRuleContext(SemanticActionContext.class,i);
		}
		public LitNodeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_litNodeConstraint; }
	}

	public final LitNodeConstraintContext litNodeConstraint() throws RecognitionException {
		LitNodeConstraintContext _localctx = new LitNodeConstraintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_litNodeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			inlineLitNodeConstraint();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(353);
				annotation();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(359);
				semanticAction();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineNonLitNodeConstraintContext extends ParserRuleContext {
		public InlineNonLitNodeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineNonLitNodeConstraint; }
	 
		public InlineNonLitNodeConstraintContext() { }
		public void copyFrom(InlineNonLitNodeConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LitNodeConstraintStringFacetContext extends InlineNonLitNodeConstraintContext {
		public List<StringFacetContext> stringFacet() {
			return getRuleContexts(StringFacetContext.class);
		}
		public StringFacetContext stringFacet(int i) {
			return getRuleContext(StringFacetContext.class,i);
		}
		public LitNodeConstraintStringFacetContext(InlineNonLitNodeConstraintContext ctx) { copyFrom(ctx); }
	}
	public static class LitNodeConstraintLiteralContext extends InlineNonLitNodeConstraintContext {
		public NonLiteralKindContext nonLiteralKind() {
			return getRuleContext(NonLiteralKindContext.class,0);
		}
		public List<StringFacetContext> stringFacet() {
			return getRuleContexts(StringFacetContext.class);
		}
		public StringFacetContext stringFacet(int i) {
			return getRuleContext(StringFacetContext.class,i);
		}
		public LitNodeConstraintLiteralContext(InlineNonLitNodeConstraintContext ctx) { copyFrom(ctx); }
	}

	public final InlineNonLitNodeConstraintContext inlineNonLitNodeConstraint() throws RecognitionException {
		InlineNonLitNodeConstraintContext _localctx = new InlineNonLitNodeConstraintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_inlineNonLitNodeConstraint);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_IRI:
			case KW_NONLITERAL:
			case KW_BNODE:
				_localctx = new LitNodeConstraintLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				nonLiteralKind();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (KW_LENGTH - 51)) | (1L << (KW_MINLENGTH - 51)) | (1L << (KW_MAXLENGTH - 51)) | (1L << (REGEXP - 51)))) != 0)) {
					{
					{
					setState(366);
					stringFacet();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KW_LENGTH:
			case KW_MINLENGTH:
			case KW_MAXLENGTH:
			case REGEXP:
				_localctx = new LitNodeConstraintStringFacetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(372);
					stringFacet();
					}
					}
					setState(375); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (KW_LENGTH - 51)) | (1L << (KW_MINLENGTH - 51)) | (1L << (KW_MAXLENGTH - 51)) | (1L << (REGEXP - 51)))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonLitNodeConstraintContext extends ParserRuleContext {
		public InlineNonLitNodeConstraintContext inlineNonLitNodeConstraint() {
			return getRuleContext(InlineNonLitNodeConstraintContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<SemanticActionContext> semanticAction() {
			return getRuleContexts(SemanticActionContext.class);
		}
		public SemanticActionContext semanticAction(int i) {
			return getRuleContext(SemanticActionContext.class,i);
		}
		public NonLitNodeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonLitNodeConstraint; }
	}

	public final NonLitNodeConstraintContext nonLitNodeConstraint() throws RecognitionException {
		NonLitNodeConstraintContext _localctx = new NonLitNodeConstraintContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nonLitNodeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			inlineNonLitNodeConstraint();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(380);
				annotation();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(386);
				semanticAction();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonLiteralKindContext extends ParserRuleContext {
		public TerminalNode KW_IRI() { return getToken(ShExDocParser.KW_IRI, 0); }
		public TerminalNode KW_BNODE() { return getToken(ShExDocParser.KW_BNODE, 0); }
		public TerminalNode KW_NONLITERAL() { return getToken(ShExDocParser.KW_NONLITERAL, 0); }
		public NonLiteralKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonLiteralKind; }
	}

	public final NonLiteralKindContext nonLiteralKind() throws RecognitionException {
		NonLiteralKindContext _localctx = new NonLiteralKindContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nonLiteralKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IRI) | (1L << KW_NONLITERAL) | (1L << KW_BNODE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XsFacetContext extends ParserRuleContext {
		public StringFacetContext stringFacet() {
			return getRuleContext(StringFacetContext.class,0);
		}
		public NumericFacetContext numericFacet() {
			return getRuleContext(NumericFacetContext.class,0);
		}
		public XsFacetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xsFacet; }
	}

	public final XsFacetContext xsFacet() throws RecognitionException {
		XsFacetContext _localctx = new XsFacetContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_xsFacet);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_LENGTH:
			case KW_MINLENGTH:
			case KW_MAXLENGTH:
			case REGEXP:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				stringFacet();
				}
				break;
			case KW_MININCLUSIVE:
			case KW_MINEXCLUSIVE:
			case KW_MAXINCLUSIVE:
			case KW_MAXEXCLUSIVE:
			case KW_TOTALDIGITS:
			case KW_FRACTIONDIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				numericFacet();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringFacetContext extends ParserRuleContext {
		public StringLengthContext stringLength() {
			return getRuleContext(StringLengthContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(ShExDocParser.INTEGER, 0); }
		public TerminalNode REGEXP() { return getToken(ShExDocParser.REGEXP, 0); }
		public TerminalNode REGEXP_FLAGS() { return getToken(ShExDocParser.REGEXP_FLAGS, 0); }
		public StringFacetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringFacet; }
	}

	public final StringFacetContext stringFacet() throws RecognitionException {
		StringFacetContext _localctx = new StringFacetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stringFacet);
		int _la;
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_LENGTH:
			case KW_MINLENGTH:
			case KW_MAXLENGTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				stringLength();
				setState(399);
				match(INTEGER);
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(REGEXP);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REGEXP_FLAGS) {
					{
					setState(402);
					match(REGEXP_FLAGS);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLengthContext extends ParserRuleContext {
		public TerminalNode KW_LENGTH() { return getToken(ShExDocParser.KW_LENGTH, 0); }
		public TerminalNode KW_MINLENGTH() { return getToken(ShExDocParser.KW_MINLENGTH, 0); }
		public TerminalNode KW_MAXLENGTH() { return getToken(ShExDocParser.KW_MAXLENGTH, 0); }
		public StringLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLength; }
	}

	public final StringLengthContext stringLength() throws RecognitionException {
		StringLengthContext _localctx = new StringLengthContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_LENGTH) | (1L << KW_MINLENGTH) | (1L << KW_MAXLENGTH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericFacetContext extends ParserRuleContext {
		public NumericRangeContext numericRange() {
			return getRuleContext(NumericRangeContext.class,0);
		}
		public RawNumericContext rawNumeric() {
			return getRuleContext(RawNumericContext.class,0);
		}
		public NumericLengthContext numericLength() {
			return getRuleContext(NumericLengthContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(ShExDocParser.INTEGER, 0); }
		public NumericFacetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericFacet; }
	}

	public final NumericFacetContext numericFacet() throws RecognitionException {
		NumericFacetContext _localctx = new NumericFacetContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numericFacet);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MININCLUSIVE:
			case KW_MINEXCLUSIVE:
			case KW_MAXINCLUSIVE:
			case KW_MAXEXCLUSIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				numericRange();
				setState(410);
				rawNumeric();
				}
				break;
			case KW_TOTALDIGITS:
			case KW_FRACTIONDIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				numericLength();
				setState(413);
				match(INTEGER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericRangeContext extends ParserRuleContext {
		public TerminalNode KW_MININCLUSIVE() { return getToken(ShExDocParser.KW_MININCLUSIVE, 0); }
		public TerminalNode KW_MINEXCLUSIVE() { return getToken(ShExDocParser.KW_MINEXCLUSIVE, 0); }
		public TerminalNode KW_MAXINCLUSIVE() { return getToken(ShExDocParser.KW_MAXINCLUSIVE, 0); }
		public TerminalNode KW_MAXEXCLUSIVE() { return getToken(ShExDocParser.KW_MAXEXCLUSIVE, 0); }
		public NumericRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericRange; }
	}

	public final NumericRangeContext numericRange() throws RecognitionException {
		NumericRangeContext _localctx = new NumericRangeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numericRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_MININCLUSIVE) | (1L << KW_MINEXCLUSIVE) | (1L << KW_MAXINCLUSIVE) | (1L << KW_MAXEXCLUSIVE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLengthContext extends ParserRuleContext {
		public TerminalNode KW_TOTALDIGITS() { return getToken(ShExDocParser.KW_TOTALDIGITS, 0); }
		public TerminalNode KW_FRACTIONDIGITS() { return getToken(ShExDocParser.KW_FRACTIONDIGITS, 0); }
		public NumericLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLength; }
	}

	public final NumericLengthContext numericLength() throws RecognitionException {
		NumericLengthContext _localctx = new NumericLengthContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numericLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_la = _input.LA(1);
			if ( !(_la==KW_TOTALDIGITS || _la==KW_FRACTIONDIGITS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawNumericContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ShExDocParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(ShExDocParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(ShExDocParser.DOUBLE, 0); }
		public RawNumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawNumeric; }
	}

	public final RawNumericContext rawNumeric() throws RecognitionException {
		RawNumericContext _localctx = new RawNumericContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rawNumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (INTEGER - 71)) | (1L << (DECIMAL - 71)) | (1L << (DOUBLE - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeDefinitionContext extends ParserRuleContext {
		public InlineShapeDefinitionContext inlineShapeDefinition() {
			return getRuleContext(InlineShapeDefinitionContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<SemanticActionContext> semanticAction() {
			return getRuleContexts(SemanticActionContext.class);
		}
		public SemanticActionContext semanticAction(int i) {
			return getRuleContext(SemanticActionContext.class,i);
		}
		public ShapeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeDefinition; }
	}

	public final ShapeDefinitionContext shapeDefinition() throws RecognitionException {
		ShapeDefinitionContext _localctx = new ShapeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_shapeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			inlineShapeDefinition();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(424);
				annotation();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(430);
				semanticAction();
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineShapeDefinitionContext extends ParserRuleContext {
		public List<QualifierContext> qualifier() {
			return getRuleContexts(QualifierContext.class);
		}
		public QualifierContext qualifier(int i) {
			return getRuleContext(QualifierContext.class,i);
		}
		public TripleExpressionContext tripleExpression() {
			return getRuleContext(TripleExpressionContext.class,0);
		}
		public InlineShapeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineShapeDefinition; }
	}

	public final InlineShapeDefinitionContext inlineShapeDefinition() throws RecognitionException {
		InlineShapeDefinitionContext _localctx = new InlineShapeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_inlineShapeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << KW_EXTENDS) | (1L << KW_CLOSED) | (1L << KW_EXTRA))) != 0)) {
				{
				{
				setState(436);
				qualifier();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			match(T__6);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__10) | (1L << T__21) | (1L << T__24) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << RDF_TYPE) | (1L << IRIREF) | (1L << PNAME_NS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PNAME_LN - 64)) | (1L << (BLANK_NODE_LABEL - 64)) | (1L << (INTEGER - 64)) | (1L << (DECIMAL - 64)) | (1L << (DOUBLE - 64)) | (1L << (STRING_LITERAL1 - 64)) | (1L << (STRING_LITERAL2 - 64)) | (1L << (STRING_LITERAL_LONG1 - 64)) | (1L << (STRING_LITERAL_LONG2 - 64)))) != 0)) {
				{
				setState(443);
				tripleExpression();
				}
			}

			setState(446);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifierContext extends ParserRuleContext {
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public ExtraPropertySetContext extraPropertySet() {
			return getRuleContext(ExtraPropertySetContext.class,0);
		}
		public TerminalNode KW_CLOSED() { return getToken(ShExDocParser.KW_CLOSED, 0); }
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_qualifier);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case KW_EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				extension();
				}
				break;
			case KW_EXTRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				extraPropertySet();
				}
				break;
			case KW_CLOSED:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(KW_CLOSED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtraPropertySetContext extends ParserRuleContext {
		public TerminalNode KW_EXTRA() { return getToken(ShExDocParser.KW_EXTRA, 0); }
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public ExtraPropertySetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraPropertySet; }
	}

	public final ExtraPropertySetContext extraPropertySet() throws RecognitionException {
		ExtraPropertySetContext _localctx = new ExtraPropertySetContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_extraPropertySet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(KW_EXTRA);
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				predicate();
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (RDF_TYPE - 61)) | (1L << (IRIREF - 61)) | (1L << (PNAME_NS - 61)) | (1L << (PNAME_LN - 61)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TripleExpressionContext extends ParserRuleContext {
		public OneOfTripleExprContext oneOfTripleExpr() {
			return getRuleContext(OneOfTripleExprContext.class,0);
		}
		public TripleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tripleExpression; }
	}

	public final TripleExpressionContext tripleExpression() throws RecognitionException {
		TripleExpressionContext _localctx = new TripleExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tripleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			oneOfTripleExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OneOfTripleExprContext extends ParserRuleContext {
		public GroupTripleExprContext groupTripleExpr() {
			return getRuleContext(GroupTripleExprContext.class,0);
		}
		public MultiElementOneOfContext multiElementOneOf() {
			return getRuleContext(MultiElementOneOfContext.class,0);
		}
		public OneOfTripleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneOfTripleExpr; }
	}

	public final OneOfTripleExprContext oneOfTripleExpr() throws RecognitionException {
		OneOfTripleExprContext _localctx = new OneOfTripleExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_oneOfTripleExpr);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				groupTripleExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				multiElementOneOf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiElementOneOfContext extends ParserRuleContext {
		public List<GroupTripleExprContext> groupTripleExpr() {
			return getRuleContexts(GroupTripleExprContext.class);
		}
		public GroupTripleExprContext groupTripleExpr(int i) {
			return getRuleContext(GroupTripleExprContext.class,i);
		}
		public MultiElementOneOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiElementOneOf; }
	}

	public final MultiElementOneOfContext multiElementOneOf() throws RecognitionException {
		MultiElementOneOfContext _localctx = new MultiElementOneOfContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_multiElementOneOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			groupTripleExpr();
			setState(468); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(466);
				match(T__8);
				setState(467);
				groupTripleExpr();
				}
				}
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupTripleExprContext extends ParserRuleContext {
		public SingleElementGroupContext singleElementGroup() {
			return getRuleContext(SingleElementGroupContext.class,0);
		}
		public MultiElementGroupContext multiElementGroup() {
			return getRuleContext(MultiElementGroupContext.class,0);
		}
		public GroupTripleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupTripleExpr; }
	}

	public final GroupTripleExprContext groupTripleExpr() throws RecognitionException {
		GroupTripleExprContext _localctx = new GroupTripleExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_groupTripleExpr);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				singleElementGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				multiElementGroup();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementGroupContext extends ParserRuleContext {
		public UnaryTripleExprContext unaryTripleExpr() {
			return getRuleContext(UnaryTripleExprContext.class,0);
		}
		public SingleElementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementGroup; }
	}

	public final SingleElementGroupContext singleElementGroup() throws RecognitionException {
		SingleElementGroupContext _localctx = new SingleElementGroupContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_singleElementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			unaryTripleExpr();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(477);
				match(T__9);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiElementGroupContext extends ParserRuleContext {
		public List<UnaryTripleExprContext> unaryTripleExpr() {
			return getRuleContexts(UnaryTripleExprContext.class);
		}
		public UnaryTripleExprContext unaryTripleExpr(int i) {
			return getRuleContext(UnaryTripleExprContext.class,i);
		}
		public MultiElementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiElementGroup; }
	}

	public final MultiElementGroupContext multiElementGroup() throws RecognitionException {
		MultiElementGroupContext _localctx = new MultiElementGroupContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_multiElementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			unaryTripleExpr();
			setState(483); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(481);
					match(T__9);
					setState(482);
					unaryTripleExpr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(485); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(487);
				match(T__9);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryTripleExprContext extends ParserRuleContext {
		public TripleConstraintContext tripleConstraint() {
			return getRuleContext(TripleConstraintContext.class,0);
		}
		public BracketedTripleExprContext bracketedTripleExpr() {
			return getRuleContext(BracketedTripleExprContext.class,0);
		}
		public TripleExprLabelContext tripleExprLabel() {
			return getRuleContext(TripleExprLabelContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryTripleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryTripleExpr; }
	}

	public final UnaryTripleExprContext unaryTripleExpr() throws RecognitionException {
		UnaryTripleExprContext _localctx = new UnaryTripleExprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unaryTripleExpr);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(490);
					match(T__10);
					setState(491);
					tripleExprLabel();
					}
				}

				setState(496);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__21:
				case RDF_TYPE:
				case IRIREF:
				case PNAME_NS:
				case PNAME_LN:
					{
					setState(494);
					tripleConstraint();
					}
					break;
				case T__2:
					{
					setState(495);
					bracketedTripleExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				include();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketedTripleExprContext extends ParserRuleContext {
		public TripleExpressionContext tripleExpression() {
			return getRuleContext(TripleExpressionContext.class,0);
		}
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<SemanticActionContext> semanticAction() {
			return getRuleContexts(SemanticActionContext.class);
		}
		public SemanticActionContext semanticAction(int i) {
			return getRuleContext(SemanticActionContext.class,i);
		}
		public BracketedTripleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketedTripleExpr; }
	}

	public final BracketedTripleExprContext bracketedTripleExpr() throws RecognitionException {
		BracketedTripleExprContext _localctx = new BracketedTripleExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_bracketedTripleExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__2);
			setState(503);
			tripleExpression();
			setState(504);
			match(T__3);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12))) != 0) || _la==UNBOUNDED) {
				{
				setState(505);
				cardinality();
				}
			}

			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(508);
				annotation();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(514);
				semanticAction();
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TripleConstraintContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public InlineShapeExpressionContext inlineShapeExpression() {
			return getRuleContext(InlineShapeExpressionContext.class,0);
		}
		public SenseFlagsContext senseFlags() {
			return getRuleContext(SenseFlagsContext.class,0);
		}
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<SemanticActionContext> semanticAction() {
			return getRuleContexts(SemanticActionContext.class);
		}
		public SemanticActionContext semanticAction(int i) {
			return getRuleContext(SemanticActionContext.class,i);
		}
		public TripleConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tripleConstraint; }
	}

	public final TripleConstraintContext tripleConstraint() throws RecognitionException {
		TripleConstraintContext _localctx = new TripleConstraintContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tripleConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__21) {
				{
				setState(520);
				senseFlags();
				}
			}

			setState(523);
			predicate();
			setState(524);
			inlineShapeExpression();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12))) != 0) || _la==UNBOUNDED) {
				{
				setState(525);
				cardinality();
				}
			}

			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(528);
				annotation();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(534);
				semanticAction();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CardinalityContext extends ParserRuleContext {
		public CardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardinality; }
	 
		public CardinalityContext() { }
		public void copyFrom(CardinalityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarCardinalityContext extends CardinalityContext {
		public StarCardinalityContext(CardinalityContext ctx) { copyFrom(ctx); }
	}
	public static class RepeatCardinalityContext extends CardinalityContext {
		public RepeatRangeContext repeatRange() {
			return getRuleContext(RepeatRangeContext.class,0);
		}
		public RepeatCardinalityContext(CardinalityContext ctx) { copyFrom(ctx); }
	}
	public static class PlusCardinalityContext extends CardinalityContext {
		public PlusCardinalityContext(CardinalityContext ctx) { copyFrom(ctx); }
	}
	public static class OptionalCardinalityContext extends CardinalityContext {
		public OptionalCardinalityContext(CardinalityContext ctx) { copyFrom(ctx); }
	}

	public final CardinalityContext cardinality() throws RecognitionException {
		CardinalityContext _localctx = new CardinalityContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cardinality);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				_localctx = new StarCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(UNBOUNDED);
				}
				break;
			case T__11:
				_localctx = new PlusCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new OptionalCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				match(T__12);
				}
				break;
			case T__6:
				_localctx = new RepeatCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				repeatRange();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatRangeContext extends ParserRuleContext {
		public RepeatRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatRange; }
	 
		public RepeatRangeContext() { }
		public void copyFrom(RepeatRangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExactRangeContext extends RepeatRangeContext {
		public TerminalNode INTEGER() { return getToken(ShExDocParser.INTEGER, 0); }
		public ExactRangeContext(RepeatRangeContext ctx) { copyFrom(ctx); }
	}
	public static class MinMaxRangeContext extends RepeatRangeContext {
		public Min_rangeContext min_range() {
			return getRuleContext(Min_rangeContext.class,0);
		}
		public Max_rangeContext max_range() {
			return getRuleContext(Max_rangeContext.class,0);
		}
		public MinMaxRangeContext(RepeatRangeContext ctx) { copyFrom(ctx); }
	}

	public final RepeatRangeContext repeatRange() throws RecognitionException {
		RepeatRangeContext _localctx = new RepeatRangeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_repeatRange);
		int _la;
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new ExactRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				match(T__6);
				setState(547);
				match(INTEGER);
				setState(548);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new MinMaxRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				match(T__6);
				setState(550);
				min_range();
				setState(551);
				match(T__13);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER || _la==UNBOUNDED) {
					{
					setState(552);
					max_range();
					}
				}

				setState(555);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Min_rangeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ShExDocParser.INTEGER, 0); }
		public Min_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_range; }
	}

	public final Min_rangeContext min_range() throws RecognitionException {
		Min_rangeContext _localctx = new Min_rangeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_min_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Max_rangeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ShExDocParser.INTEGER, 0); }
		public Max_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_range; }
	}

	public final Max_rangeContext max_range() throws RecognitionException {
		Max_rangeContext _localctx = new Max_rangeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_max_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==UNBOUNDED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public BasicExprContext basicExpr() {
			return getRuleContext(BasicExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(564);
			basicExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(566);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(567);
					binOp();
					setState(568);
					expr(3);
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinOpContext extends ParserRuleContext {
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
	 
		public BinOpContext() { }
		public void copyFrom(BinOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends BinOpContext {
		public DivContext(BinOpContext ctx) { copyFrom(ctx); }
	}
	public static class AddContext extends BinOpContext {
		public AddContext(BinOpContext ctx) { copyFrom(ctx); }
	}
	public static class MinusContext extends BinOpContext {
		public MinusContext(BinOpContext ctx) { copyFrom(ctx); }
	}
	public static class MultContext extends BinOpContext {
		public MultContext(BinOpContext ctx) { copyFrom(ctx); }
	}
	public static class EqualsContext extends BinOpContext {
		public EqualsContext(BinOpContext ctx) { copyFrom(ctx); }
	}
	public static class NotEqualsContext extends BinOpContext {
		public NotEqualsContext(BinOpContext ctx) { copyFrom(ctx); }
	}
	public static class LtContext extends BinOpContext {
		public LtContext(BinOpContext ctx) { copyFrom(ctx); }
	}
	public static class LeContext extends BinOpContext {
		public LeContext(BinOpContext ctx) { copyFrom(ctx); }
	}
	public static class GtContext extends BinOpContext {
		public GtContext(BinOpContext ctx) { copyFrom(ctx); }
	}
	public static class GeContext extends BinOpContext {
		public GeContext(BinOpContext ctx) { copyFrom(ctx); }
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_binOp);
		try {
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				match(T__0);
				}
				break;
			case T__14:
				_localctx = new NotEqualsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new GtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new LtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new GeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(579);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new LeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(580);
				match(T__18);
				}
				break;
			case UNBOUNDED:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(581);
				match(UNBOUNDED);
				}
				break;
			case T__19:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(582);
				match(T__19);
				}
				break;
			case T__11:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(583);
				match(T__11);
				}
				break;
			case T__20:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(584);
				match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicExprContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public BasicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpr; }
	}

	public final BasicExprContext basicExpr() throws RecognitionException {
		BasicExprContext _localctx = new BasicExprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_basicExpr);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TRUE:
			case KW_FALSE:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				literal();
				}
				break;
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				iri();
				}
				break;
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				blankNode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenseFlagsContext extends ParserRuleContext {
		public SenseFlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senseFlags; }
	}

	public final SenseFlagsContext senseFlags() throws RecognitionException {
		SenseFlagsContext _localctx = new SenseFlagsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_senseFlags);
		int _la;
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(T__1);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(593);
					match(T__21);
					}
				}

				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(T__21);
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(597);
					match(T__1);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueSetContext extends ParserRuleContext {
		public List<ValueSetValueContext> valueSetValue() {
			return getRuleContexts(ValueSetValueContext.class);
		}
		public ValueSetValueContext valueSetValue(int i) {
			return getRuleContext(ValueSetValueContext.class,i);
		}
		public ValueSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueSet; }
	}

	public final ValueSetContext valueSet() throws RecognitionException {
		ValueSetContext _localctx = new ValueSetContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_valueSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(T__22);
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << IRIREF) | (1L << PNAME_NS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PNAME_LN - 64)) | (1L << (LANGTAG - 64)) | (1L << (INTEGER - 64)) | (1L << (DECIMAL - 64)) | (1L << (DOUBLE - 64)) | (1L << (STRING_LITERAL1 - 64)) | (1L << (STRING_LITERAL2 - 64)) | (1L << (STRING_LITERAL_LONG1 - 64)) | (1L << (STRING_LITERAL_LONG2 - 64)))) != 0)) {
				{
				{
				setState(603);
				valueSetValue();
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(609);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueSetValueContext extends ParserRuleContext {
		public IriRangeContext iriRange() {
			return getRuleContext(IriRangeContext.class,0);
		}
		public LiteralRangeContext literalRange() {
			return getRuleContext(LiteralRangeContext.class,0);
		}
		public LanguageRangeContext languageRange() {
			return getRuleContext(LanguageRangeContext.class,0);
		}
		public List<IriExclusionContext> iriExclusion() {
			return getRuleContexts(IriExclusionContext.class);
		}
		public IriExclusionContext iriExclusion(int i) {
			return getRuleContext(IriExclusionContext.class,i);
		}
		public List<LiteralExclusionContext> literalExclusion() {
			return getRuleContexts(LiteralExclusionContext.class);
		}
		public LiteralExclusionContext literalExclusion(int i) {
			return getRuleContext(LiteralExclusionContext.class,i);
		}
		public List<LanguageExclusionContext> languageExclusion() {
			return getRuleContexts(LanguageExclusionContext.class);
		}
		public LanguageExclusionContext languageExclusion(int i) {
			return getRuleContext(LanguageExclusionContext.class,i);
		}
		public ValueSetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueSetValue; }
	}

	public final ValueSetValueContext valueSetValue() throws RecognitionException {
		ValueSetValueContext _localctx = new ValueSetValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_valueSetValue);
		int _la;
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				iriRange();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				literalRange();
				}
				break;
			case T__5:
			case LANGTAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				languageRange();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				match(T__4);
				setState(630);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(616); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(615);
						iriExclusion();
						}
						}
						setState(618); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__20 );
					}
					break;
				case 2:
					{
					setState(621); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(620);
						literalExclusion();
						}
						}
						setState(623); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__20 );
					}
					break;
				case 3:
					{
					setState(626); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(625);
						languageExclusion();
						}
						}
						setState(628); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__20 );
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IriRangeContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode STEM_MARK() { return getToken(ShExDocParser.STEM_MARK, 0); }
		public List<IriExclusionContext> iriExclusion() {
			return getRuleContexts(IriExclusionContext.class);
		}
		public IriExclusionContext iriExclusion(int i) {
			return getRuleContext(IriExclusionContext.class,i);
		}
		public IriRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iriRange; }
	}

	public final IriRangeContext iriRange() throws RecognitionException {
		IriRangeContext _localctx = new IriRangeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_iriRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			iri();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEM_MARK) {
				{
				setState(635);
				match(STEM_MARK);
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(636);
					iriExclusion();
					}
					}
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IriExclusionContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode STEM_MARK() { return getToken(ShExDocParser.STEM_MARK, 0); }
		public IriExclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iriExclusion; }
	}

	public final IriExclusionContext iriExclusion() throws RecognitionException {
		IriExclusionContext _localctx = new IriExclusionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_iriExclusion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(T__20);
			setState(645);
			iri();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEM_MARK) {
				{
				setState(646);
				match(STEM_MARK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralRangeContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode STEM_MARK() { return getToken(ShExDocParser.STEM_MARK, 0); }
		public List<LiteralExclusionContext> literalExclusion() {
			return getRuleContexts(LiteralExclusionContext.class);
		}
		public LiteralExclusionContext literalExclusion(int i) {
			return getRuleContext(LiteralExclusionContext.class,i);
		}
		public LiteralRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalRange; }
	}

	public final LiteralRangeContext literalRange() throws RecognitionException {
		LiteralRangeContext _localctx = new LiteralRangeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_literalRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			literal();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEM_MARK) {
				{
				setState(650);
				match(STEM_MARK);
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(651);
					literalExclusion();
					}
					}
					setState(656);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralExclusionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode STEM_MARK() { return getToken(ShExDocParser.STEM_MARK, 0); }
		public LiteralExclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExclusion; }
	}

	public final LiteralExclusionContext literalExclusion() throws RecognitionException {
		LiteralExclusionContext _localctx = new LiteralExclusionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_literalExclusion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(T__20);
			setState(660);
			literal();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEM_MARK) {
				{
				setState(661);
				match(STEM_MARK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguageRangeContext extends ParserRuleContext {
		public LanguageRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageRange; }
	 
		public LanguageRangeContext() { }
		public void copyFrom(LanguageRangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LanguageRangeFullContext extends LanguageRangeContext {
		public TerminalNode LANGTAG() { return getToken(ShExDocParser.LANGTAG, 0); }
		public TerminalNode STEM_MARK() { return getToken(ShExDocParser.STEM_MARK, 0); }
		public List<LanguageExclusionContext> languageExclusion() {
			return getRuleContexts(LanguageExclusionContext.class);
		}
		public LanguageExclusionContext languageExclusion(int i) {
			return getRuleContext(LanguageExclusionContext.class,i);
		}
		public LanguageRangeFullContext(LanguageRangeContext ctx) { copyFrom(ctx); }
	}
	public static class LanguageRangeAtContext extends LanguageRangeContext {
		public TerminalNode STEM_MARK() { return getToken(ShExDocParser.STEM_MARK, 0); }
		public List<LanguageExclusionContext> languageExclusion() {
			return getRuleContexts(LanguageExclusionContext.class);
		}
		public LanguageExclusionContext languageExclusion(int i) {
			return getRuleContext(LanguageExclusionContext.class,i);
		}
		public LanguageRangeAtContext(LanguageRangeContext ctx) { copyFrom(ctx); }
	}

	public final LanguageRangeContext languageRange() throws RecognitionException {
		LanguageRangeContext _localctx = new LanguageRangeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_languageRange);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGTAG:
				_localctx = new LanguageRangeFullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(LANGTAG);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STEM_MARK) {
					{
					setState(665);
					match(STEM_MARK);
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__20) {
						{
						{
						setState(666);
						languageExclusion();
						}
						}
						setState(671);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case T__5:
				_localctx = new LanguageRangeAtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(T__5);
				setState(675);
				match(STEM_MARK);
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(676);
					languageExclusion();
					}
					}
					setState(681);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguageExclusionContext extends ParserRuleContext {
		public TerminalNode LANGTAG() { return getToken(ShExDocParser.LANGTAG, 0); }
		public TerminalNode STEM_MARK() { return getToken(ShExDocParser.STEM_MARK, 0); }
		public LanguageExclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageExclusion; }
	}

	public final LanguageExclusionContext languageExclusion() throws RecognitionException {
		LanguageExclusionContext _localctx = new LanguageExclusionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_languageExclusion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(T__20);
			setState(685);
			match(LANGTAG);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEM_MARK) {
				{
				setState(686);
				match(STEM_MARK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeContext extends ParserRuleContext {
		public TripleExprLabelContext tripleExprLabel() {
			return getRuleContext(TripleExprLabelContext.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(T__24);
			setState(690);
			tripleExprLabel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(T__25);
			setState(693);
			predicate();
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				{
				setState(694);
				iri();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				{
				setState(695);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemanticActionContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode CODE() { return getToken(ShExDocParser.CODE, 0); }
		public SemanticActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semanticAction; }
	}

	public final SemanticActionContext semanticAction() throws RecognitionException {
		SemanticActionContext _localctx = new SemanticActionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_semanticAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(T__26);
			setState(699);
			iri();
			setState(700);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==CODE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_literal);
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL1:
			case STRING_LITERAL2:
			case STRING_LITERAL_LONG1:
			case STRING_LITERAL_LONG2:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				rdfLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				numericLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(704);
				booleanLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RdfTypeContext rdfType() {
			return getRuleContext(RdfTypeContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_predicate);
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				iri();
				}
				break;
			case RDF_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				rdfType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RdfTypeContext extends ParserRuleContext {
		public TerminalNode RDF_TYPE() { return getToken(ShExDocParser.RDF_TYPE, 0); }
		public RdfTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfType; }
	}

	public final RdfTypeContext rdfType() throws RecognitionException {
		RdfTypeContext _localctx = new RdfTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_rdfType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(RDF_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			iri();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeExprLabelContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public ShapeExprLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeExprLabel; }
	}

	public final ShapeExprLabelContext shapeExprLabel() throws RecognitionException {
		ShapeExprLabelContext _localctx = new ShapeExprLabelContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_shapeExprLabel);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				iri();
				}
				break;
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				blankNode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TripleExprLabelContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public TripleExprLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tripleExprLabel; }
	}

	public final TripleExprLabelContext tripleExprLabel() throws RecognitionException {
		TripleExprLabelContext _localctx = new TripleExprLabelContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tripleExprLabel);
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				iri();
				}
				break;
			case BLANK_NODE_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				blankNode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ShExDocParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(ShExDocParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(ShExDocParser.DOUBLE, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (INTEGER - 71)) | (1L << (DECIMAL - 71)) | (1L << (DOUBLE - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RdfLiteralContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode LANGTAG() { return getToken(ShExDocParser.LANGTAG, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public RdfLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfLiteral; }
	}

	public final RdfLiteralContext rdfLiteral() throws RecognitionException {
		RdfLiteralContext _localctx = new RdfLiteralContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_rdfLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			string();
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(726);
				match(LANGTAG);
				}
				break;
			case 2:
				{
				setState(727);
				match(T__27);
				setState(728);
				datatype();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(ShExDocParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(ShExDocParser.KW_FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_la = _input.LA(1);
			if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL_LONG1() { return getToken(ShExDocParser.STRING_LITERAL_LONG1, 0); }
		public TerminalNode STRING_LITERAL_LONG2() { return getToken(ShExDocParser.STRING_LITERAL_LONG2, 0); }
		public TerminalNode STRING_LITERAL1() { return getToken(ShExDocParser.STRING_LITERAL1, 0); }
		public TerminalNode STRING_LITERAL2() { return getToken(ShExDocParser.STRING_LITERAL2, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (STRING_LITERAL1 - 76)) | (1L << (STRING_LITERAL2 - 76)) | (1L << (STRING_LITERAL_LONG1 - 76)) | (1L << (STRING_LITERAL_LONG2 - 76)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IriContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(ShExDocParser.IRIREF, 0); }
		public PrefixedNameContext prefixedName() {
			return getRuleContext(PrefixedNameContext.class,0);
		}
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_iri);
		try {
			setState(737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IRIREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(IRIREF);
				}
				break;
			case PNAME_NS:
			case PNAME_LN:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				prefixedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixedNameContext extends ParserRuleContext {
		public TerminalNode PNAME_LN() { return getToken(ShExDocParser.PNAME_LN, 0); }
		public TerminalNode PNAME_NS() { return getToken(ShExDocParser.PNAME_NS, 0); }
		public PrefixedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedName; }
	}

	public final PrefixedNameContext prefixedName() throws RecognitionException {
		PrefixedNameContext _localctx = new PrefixedNameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_prefixedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_la = _input.LA(1);
			if ( !(_la==PNAME_NS || _la==PNAME_LN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlankNodeContext extends ParserRuleContext {
		public TerminalNode BLANK_NODE_LABEL() { return getToken(ShExDocParser.BLANK_NODE_LABEL, 0); }
		public BlankNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNode; }
	}

	public final BlankNodeContext blankNode() throws RecognitionException {
		BlankNodeContext _localctx = new BlankNodeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_blankNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(BLANK_NODE_LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionContext extends ParserRuleContext {
		public TerminalNode KW_EXTENDS() { return getToken(ShExDocParser.KW_EXTENDS, 0); }
		public ShapeExprLabelContext shapeExprLabel() {
			return getRuleContext(ShapeExprLabelContext.class,0);
		}
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_extension);
		try {
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				match(KW_EXTENDS);
				setState(744);
				shapeExprLabel();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				match(T__24);
				setState(746);
				shapeExprLabel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestrictionsContext extends ParserRuleContext {
		public TerminalNode KW_RESTRICTS() { return getToken(ShExDocParser.KW_RESTRICTS, 0); }
		public List<ShapeExprLabelContext> shapeExprLabel() {
			return getRuleContexts(ShapeExprLabelContext.class);
		}
		public ShapeExprLabelContext shapeExprLabel(int i) {
			return getRuleContext(ShapeExprLabelContext.class,i);
		}
		public RestrictionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restrictions; }
	}

	public final RestrictionsContext restrictions() throws RecognitionException {
		RestrictionsContext _localctx = new RestrictionsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_restrictions);
		int _la;
		try {
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_RESTRICTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				match(KW_RESTRICTS);
				setState(751); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(750);
					shapeExprLabel();
					}
					}
					setState(753); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (IRIREF - 62)) | (1L << (PNAME_NS - 62)) | (1L << (PNAME_LN - 62)) | (1L << (BLANK_NODE_LABEL - 62)))) != 0) );
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				match(T__20);
				setState(757); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(756);
					shapeExprLabel();
					}
					}
					setState(759); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (IRIREF - 62)) | (1L << (PNAME_NS - 62)) | (1L << (PNAME_LN - 62)) | (1L << (BLANK_NODE_LABEL - 62)))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 53:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u02fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\7\2\u00aa\n\2\f\2\16\2\u00ad\13\2\3\2\3\2\5\2\u00b1\n\2\3\2\7\2\u00b4"+
		"\n\2\f\2\16\2\u00b7\13\2\5\2\u00b9\n\2\3\2\3\2\3\3\3\3\3\3\5\3\u00c0\n"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7\u00ce\n\7\3\b\3"+
		"\b\3\b\3\b\3\t\6\t\u00d5\n\t\r\t\16\t\u00d6\3\n\3\n\5\n\u00db\n\n\3\13"+
		"\3\13\3\13\5\13\u00e0\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u00e9\n"+
		"\16\f\16\16\16\u00ec\13\16\3\17\3\17\3\17\7\17\u00f1\n\17\f\17\16\17\u00f4"+
		"\13\17\3\20\3\20\3\20\7\20\u00f9\n\20\f\20\16\20\u00fc\13\20\3\21\3\21"+
		"\3\21\7\21\u0101\n\21\f\21\16\21\u0104\13\21\3\22\5\22\u0107\n\22\3\22"+
		"\3\22\3\23\5\23\u010c\n\23\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u0114\n"+
		"\25\3\25\3\25\3\25\5\25\u0119\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u0120"+
		"\n\25\3\26\3\26\5\26\u0124\n\26\3\26\3\26\3\26\5\26\u0129\n\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0130\n\26\3\27\3\27\5\27\u0134\n\27\3\30\3\30"+
		"\5\30\u0138\n\30\3\31\3\31\3\31\3\31\5\31\u013e\n\31\3\32\3\32\7\32\u0142"+
		"\n\32\f\32\16\32\u0145\13\32\3\32\3\32\7\32\u0149\n\32\f\32\16\32\u014c"+
		"\13\32\3\32\3\32\7\32\u0150\n\32\f\32\16\32\u0153\13\32\3\32\3\32\7\32"+
		"\u0157\n\32\f\32\16\32\u015a\13\32\3\32\6\32\u015d\n\32\r\32\16\32\u015e"+
		"\5\32\u0161\n\32\3\33\3\33\7\33\u0165\n\33\f\33\16\33\u0168\13\33\3\33"+
		"\7\33\u016b\n\33\f\33\16\33\u016e\13\33\3\34\3\34\7\34\u0172\n\34\f\34"+
		"\16\34\u0175\13\34\3\34\6\34\u0178\n\34\r\34\16\34\u0179\5\34\u017c\n"+
		"\34\3\35\3\35\7\35\u0180\n\35\f\35\16\35\u0183\13\35\3\35\7\35\u0186\n"+
		"\35\f\35\16\35\u0189\13\35\3\36\3\36\3\37\3\37\5\37\u018f\n\37\3 \3 \3"+
		" \3 \3 \5 \u0196\n \5 \u0198\n \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01a2"+
		"\n\"\3#\3#\3$\3$\3%\3%\3&\3&\7&\u01ac\n&\f&\16&\u01af\13&\3&\7&\u01b2"+
		"\n&\f&\16&\u01b5\13&\3\'\7\'\u01b8\n\'\f\'\16\'\u01bb\13\'\3\'\3\'\5\'"+
		"\u01bf\n\'\3\'\3\'\3(\3(\3(\5(\u01c6\n(\3)\3)\6)\u01ca\n)\r)\16)\u01cb"+
		"\3*\3*\3+\3+\5+\u01d2\n+\3,\3,\3,\6,\u01d7\n,\r,\16,\u01d8\3-\3-\5-\u01dd"+
		"\n-\3.\3.\5.\u01e1\n.\3/\3/\3/\6/\u01e6\n/\r/\16/\u01e7\3/\5/\u01eb\n"+
		"/\3\60\3\60\5\60\u01ef\n\60\3\60\3\60\5\60\u01f3\n\60\3\60\3\60\5\60\u01f7"+
		"\n\60\3\61\3\61\3\61\3\61\5\61\u01fd\n\61\3\61\7\61\u0200\n\61\f\61\16"+
		"\61\u0203\13\61\3\61\7\61\u0206\n\61\f\61\16\61\u0209\13\61\3\62\5\62"+
		"\u020c\n\62\3\62\3\62\3\62\5\62\u0211\n\62\3\62\7\62\u0214\n\62\f\62\16"+
		"\62\u0217\13\62\3\62\7\62\u021a\n\62\f\62\16\62\u021d\13\62\3\63\3\63"+
		"\3\63\3\63\5\63\u0223\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u022c"+
		"\n\64\3\64\3\64\5\64\u0230\n\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\7\67\u023d\n\67\f\67\16\67\u0240\13\67\38\38\38\38\38"+
		"\38\38\38\38\38\58\u024c\n8\39\39\39\59\u0251\n9\3:\3:\5:\u0255\n:\3:"+
		"\3:\5:\u0259\n:\5:\u025b\n:\3;\3;\7;\u025f\n;\f;\16;\u0262\13;\3;\3;\3"+
		"<\3<\3<\3<\3<\6<\u026b\n<\r<\16<\u026c\3<\6<\u0270\n<\r<\16<\u0271\3<"+
		"\6<\u0275\n<\r<\16<\u0276\5<\u0279\n<\5<\u027b\n<\3=\3=\3=\7=\u0280\n"+
		"=\f=\16=\u0283\13=\5=\u0285\n=\3>\3>\3>\5>\u028a\n>\3?\3?\3?\7?\u028f"+
		"\n?\f?\16?\u0292\13?\5?\u0294\n?\3@\3@\3@\5@\u0299\n@\3A\3A\3A\7A\u029e"+
		"\nA\fA\16A\u02a1\13A\5A\u02a3\nA\3A\3A\3A\7A\u02a8\nA\fA\16A\u02ab\13"+
		"A\5A\u02ad\nA\3B\3B\3B\5B\u02b2\nB\3C\3C\3C\3D\3D\3D\3D\5D\u02bb\nD\3"+
		"E\3E\3E\3E\3F\3F\3F\5F\u02c4\nF\3G\3G\5G\u02c8\nG\3H\3H\3I\3I\3J\3J\5"+
		"J\u02d0\nJ\3K\3K\5K\u02d4\nK\3L\3L\3M\3M\3M\3M\5M\u02dc\nM\3N\3N\3O\3"+
		"O\3P\3P\5P\u02e4\nP\3Q\3Q\3R\3R\3S\3S\3S\3S\5S\u02ee\nS\3T\3T\6T\u02f2"+
		"\nT\rT\16T\u02f3\3T\3T\6T\u02f8\nT\rT\16T\u02f9\5T\u02fc\nT\3T\2\3lU\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\2\r\4\2\4\4::\3\2,.\3\2\65\67\3\2\61\64\3\289\3\2IK\4\2IIMM\4\2\35\35"+
		">>\3\2;<\3\2NQ\3\2AB\2\u032b\2\u00ab\3\2\2\2\4\u00bf\3\2\2\2\6\u00c1\3"+
		"\2\2\2\b\u00c4\3\2\2\2\n\u00c8\3\2\2\2\f\u00cd\3\2\2\2\16\u00cf\3\2\2"+
		"\2\20\u00d4\3\2\2\2\22\u00da\3\2\2\2\24\u00dc\3\2\2\2\26\u00e1\3\2\2\2"+
		"\30\u00e3\3\2\2\2\32\u00e5\3\2\2\2\34\u00ed\3\2\2\2\36\u00f5\3\2\2\2 "+
		"\u00fd\3\2\2\2\"\u0106\3\2\2\2$\u010b\3\2\2\2&\u010f\3\2\2\2(\u011f\3"+
		"\2\2\2*\u012f\3\2\2\2,\u0133\3\2\2\2.\u0137\3\2\2\2\60\u013d\3\2\2\2\62"+
		"\u0160\3\2\2\2\64\u0162\3\2\2\2\66\u017b\3\2\2\28\u017d\3\2\2\2:\u018a"+
		"\3\2\2\2<\u018e\3\2\2\2>\u0197\3\2\2\2@\u0199\3\2\2\2B\u01a1\3\2\2\2D"+
		"\u01a3\3\2\2\2F\u01a5\3\2\2\2H\u01a7\3\2\2\2J\u01a9\3\2\2\2L\u01b9\3\2"+
		"\2\2N\u01c5\3\2\2\2P\u01c7\3\2\2\2R\u01cd\3\2\2\2T\u01d1\3\2\2\2V\u01d3"+
		"\3\2\2\2X\u01dc\3\2\2\2Z\u01de\3\2\2\2\\\u01e2\3\2\2\2^\u01f6\3\2\2\2"+
		"`\u01f8\3\2\2\2b\u020b\3\2\2\2d\u0222\3\2\2\2f\u022f\3\2\2\2h\u0231\3"+
		"\2\2\2j\u0233\3\2\2\2l\u0235\3\2\2\2n\u024b\3\2\2\2p\u0250\3\2\2\2r\u025a"+
		"\3\2\2\2t\u025c\3\2\2\2v\u027a\3\2\2\2x\u027c\3\2\2\2z\u0286\3\2\2\2|"+
		"\u028b\3\2\2\2~\u0295\3\2\2\2\u0080\u02ac\3\2\2\2\u0082\u02ae\3\2\2\2"+
		"\u0084\u02b3\3\2\2\2\u0086\u02b6\3\2\2\2\u0088\u02bc\3\2\2\2\u008a\u02c3"+
		"\3\2\2\2\u008c\u02c7\3\2\2\2\u008e\u02c9\3\2\2\2\u0090\u02cb\3\2\2\2\u0092"+
		"\u02cf\3\2\2\2\u0094\u02d3\3\2\2\2\u0096\u02d5\3\2\2\2\u0098\u02d7\3\2"+
		"\2\2\u009a\u02dd\3\2\2\2\u009c\u02df\3\2\2\2\u009e\u02e3\3\2\2\2\u00a0"+
		"\u02e5\3\2\2\2\u00a2\u02e7\3\2\2\2\u00a4\u02ed\3\2\2\2\u00a6\u02fb\3\2"+
		"\2\2\u00a8\u00aa\5\4\3\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b8\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00b1\5\f\7\2\u00af\u00b1\5\20\t\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b4\5\22\n\2\u00b3\u00b2\3"+
		"\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\2\2\3\u00bb\3\3\2\2\2\u00bc\u00c0"+
		"\5\6\4\2\u00bd\u00c0\5\b\5\2\u00be\u00c0\5\n\6\2\u00bf\u00bc\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\5\3\2\2\2\u00c1\u00c2\7!\2\2"+
		"\u00c2\u00c3\7@\2\2\u00c3\7\3\2\2\2\u00c4\u00c5\7&\2\2\u00c5\u00c6\7A"+
		"\2\2\u00c6\u00c7\7@\2\2\u00c7\t\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca"+
		"\5\u009eP\2\u00ca\13\3\2\2\2\u00cb\u00ce\5\16\b\2\u00cc\u00ce\5\24\13"+
		"\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\r\3\2\2\2\u00cf\u00d0"+
		"\7\'\2\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2\5\26\f\2\u00d2\17\3\2\2\2\u00d3"+
		"\u00d5\5\u0088E\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\21\3\2\2\2\u00d8\u00db\5\4\3\2\u00d9"+
		"\u00db\5\f\7\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\23\3\2\2"+
		"\2\u00dc\u00df\5\u0092J\2\u00dd\u00e0\5\26\f\2\u00de\u00e0\7%\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\25\3\2\2\2\u00e1\u00e2\5\32\16"+
		"\2\u00e2\27\3\2\2\2\u00e3\u00e4\5\34\17\2\u00e4\31\3\2\2\2\u00e5\u00ea"+
		"\5\36\20\2\u00e6\u00e7\7\60\2\2\u00e7\u00e9\5\36\20\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\33\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f2\5 \21\2\u00ee\u00ef\7\60\2"+
		"\2\u00ef\u00f1\5 \21\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\35\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00fa\5\"\22\2\u00f6\u00f7\7/\2\2\u00f7\u00f9\5\"\22\2\u00f8\u00f6\3"+
		"\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\37\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0102\5$\23\2\u00fe\u00ff\7/\2\2"+
		"\u00ff\u0101\5$\23\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103!\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0107\5&\24\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0109\5(\25\2\u0109#\3\2\2\2\u010a\u010c\5&\24\2\u010b\u010a"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\5*\26\2\u010e"+
		"%\3\2\2\2\u010f\u0110\t\2\2\2\u0110\'\3\2\2\2\u0111\u0113\58\35\2\u0112"+
		"\u0114\5,\27\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0120\3\2"+
		"\2\2\u0115\u0120\5\64\33\2\u0116\u0118\5,\27\2\u0117\u0119\58\35\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0120\3\2\2\2\u011a\u011b\7\5"+
		"\2\2\u011b\u011c\5\26\f\2\u011c\u011d\7\6\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u0120\7\7\2\2\u011f\u0111\3\2\2\2\u011f\u0115\3\2\2\2\u011f\u0116\3\2"+
		"\2\2\u011f\u011a\3\2\2\2\u011f\u011e\3\2\2\2\u0120)\3\2\2\2\u0121\u0123"+
		"\5\66\34\2\u0122\u0124\5.\30\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2"+
		"\u0124\u0130\3\2\2\2\u0125\u0130\5\62\32\2\u0126\u0128\5.\30\2\u0127\u0129"+
		"\5\66\34\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0130\3\2\2\2"+
		"\u012a\u012b\7\5\2\2\u012b\u012c\5\26\f\2\u012c\u012d\7\6\2\2\u012d\u0130"+
		"\3\2\2\2\u012e\u0130\7\7\2\2\u012f\u0121\3\2\2\2\u012f\u0125\3\2\2\2\u012f"+
		"\u0126\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012e\3\2\2\2\u0130+\3\2\2\2"+
		"\u0131\u0134\5J&\2\u0132\u0134\5\60\31\2\u0133\u0131\3\2\2\2\u0133\u0132"+
		"\3\2\2\2\u0134-\3\2\2\2\u0135\u0138\5L\'\2\u0136\u0138\5\60\31\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138/\3\2\2\2\u0139\u013e\7D\2\2\u013a"+
		"\u013e\7C\2\2\u013b\u013c\7\b\2\2\u013c\u013e\5\u0092J\2\u013d\u0139\3"+
		"\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013e\61\3\2\2\2\u013f"+
		"\u0143\7+\2\2\u0140\u0142\5<\37\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0161\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u014a\5:\36\2\u0147\u0149\5> \2\u0148\u0147\3\2\2"+
		"\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0161"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0151\5\u0090I\2\u014e\u0150\5<\37"+
		"\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0161\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0158\5t;\2\u0155"+
		"\u0157\5<\37\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u0161\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015d\5B\"\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u013f\3\2\2\2\u0160"+
		"\u0146\3\2\2\2\u0160\u014d\3\2\2\2\u0160\u0154\3\2\2\2\u0160\u015c\3\2"+
		"\2\2\u0161\63\3\2\2\2\u0162\u0166\5\62\32\2\u0163\u0165\5\u0086D\2\u0164"+
		"\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u016c\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\5\u0088E\2\u016a"+
		"\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\65\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0173\5:\36\2\u0170\u0172"+
		"\5> \2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u017c\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\5>"+
		" \2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u016f\3\2\2\2\u017b\u0177\3\2"+
		"\2\2\u017c\67\3\2\2\2\u017d\u0181\5\66\34\2\u017e\u0180\5\u0086D\2\u017f"+
		"\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0187\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\5\u0088E\2\u0185"+
		"\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u01889\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\t\3\2\2\u018b;\3\2"+
		"\2\2\u018c\u018f\5> \2\u018d\u018f\5B\"\2\u018e\u018c\3\2\2\2\u018e\u018d"+
		"\3\2\2\2\u018f=\3\2\2\2\u0190\u0191\5@!\2\u0191\u0192\7I\2\2\u0192\u0198"+
		"\3\2\2\2\u0193\u0195\7E\2\2\u0194\u0196\7F\2\2\u0195\u0194\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0190\3\2\2\2\u0197\u0193\3\2"+
		"\2\2\u0198?\3\2\2\2\u0199\u019a\t\4\2\2\u019aA\3\2\2\2\u019b\u019c\5D"+
		"#\2\u019c\u019d\5H%\2\u019d\u01a2\3\2\2\2\u019e\u019f\5F$\2\u019f\u01a0"+
		"\7I\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019b\3\2\2\2\u01a1\u019e\3\2\2\2\u01a2"+
		"C\3\2\2\2\u01a3\u01a4\t\5\2\2\u01a4E\3\2\2\2\u01a5\u01a6\t\6\2\2\u01a6"+
		"G\3\2\2\2\u01a7\u01a8\t\7\2\2\u01a8I\3\2\2\2\u01a9\u01ad\5L\'\2\u01aa"+
		"\u01ac\5\u0086D\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b3\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b2\5\u0088E\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4K\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b8\5N(\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2"+
		"\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be"+
		"\7\t\2\2\u01bd\u01bf\5R*\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\7\n\2\2\u01c1M\3\2\2\2\u01c2\u01c6\5\u00a4"+
		"S\2\u01c3\u01c6\5P)\2\u01c4\u01c6\7)\2\2\u01c5\u01c2\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6O\3\2\2\2\u01c7\u01c9\7*\2\2\u01c8\u01ca"+
		"\5\u008cG\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2"+
		"\2\u01cb\u01cc\3\2\2\2\u01ccQ\3\2\2\2\u01cd\u01ce\5T+\2\u01ceS\3\2\2\2"+
		"\u01cf\u01d2\5X-\2\u01d0\u01d2\5V,\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3"+
		"\2\2\2\u01d2U\3\2\2\2\u01d3\u01d6\5X-\2\u01d4\u01d5\7\13\2\2\u01d5\u01d7"+
		"\5X-\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9W\3\2\2\2\u01da\u01dd\5Z.\2\u01db\u01dd\5\\/\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01ddY\3\2\2\2\u01de\u01e0\5^\60\2"+
		"\u01df\u01e1\7\f\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1[\3"+
		"\2\2\2\u01e2\u01e5\5^\60\2\u01e3\u01e4\7\f\2\2\u01e4\u01e6\5^\60\2\u01e5"+
		"\u01e3\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01eb\7\f\2\2\u01ea\u01e9\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb]\3\2\2\2\u01ec\u01ed\7\r\2\2\u01ed\u01ef\5\u0094"+
		"K\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0"+
		"\u01f3\5b\62\2\u01f1\u01f3\5`\61\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2"+
		"\2\2\u01f3\u01f7\3\2\2\2\u01f4\u01f7\5\u0084C\2\u01f5\u01f7\5l\67\2\u01f6"+
		"\u01ee\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7_\3\2\2\2"+
		"\u01f8\u01f9\7\5\2\2\u01f9\u01fa\5R*\2\u01fa\u01fc\7\6\2\2\u01fb\u01fd"+
		"\5d\63\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0201\3\2\2\2\u01fe"+
		"\u0200\5\u0086D\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0207\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0206\5\u0088E\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208a\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u020c\5r:\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2"+
		"\2\u020d\u020e\5\u008cG\2\u020e\u0210\5\30\r\2\u020f\u0211\5d\63\2\u0210"+
		"\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0215\3\2\2\2\u0212\u0214\5\u0086"+
		"D\2\u0213\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u021b\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021a\5\u0088"+
		"E\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021cc\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0223\7M\2\2\u021f"+
		"\u0223\7\16\2\2\u0220\u0223\7\17\2\2\u0221\u0223\5f\64\2\u0222\u021e\3"+
		"\2\2\2\u0222\u021f\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2\2\u0223"+
		"e\3\2\2\2\u0224\u0225\7\t\2\2\u0225\u0226\7I\2\2\u0226\u0230\7\n\2\2\u0227"+
		"\u0228\7\t\2\2\u0228\u0229\5h\65\2\u0229\u022b\7\20\2\2\u022a\u022c\5"+
		"j\66\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022e\7\n\2\2\u022e\u0230\3\2\2\2\u022f\u0224\3\2\2\2\u022f\u0227\3\2"+
		"\2\2\u0230g\3\2\2\2\u0231\u0232\7I\2\2\u0232i\3\2\2\2\u0233\u0234\t\b"+
		"\2\2\u0234k\3\2\2\2\u0235\u0236\b\67\1\2\u0236\u0237\5p9\2\u0237\u023e"+
		"\3\2\2\2\u0238\u0239\f\4\2\2\u0239\u023a\5n8\2\u023a\u023b\5l\67\5\u023b"+
		"\u023d\3\2\2\2\u023c\u0238\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023fm\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u024c"+
		"\7\3\2\2\u0242\u024c\7\21\2\2\u0243\u024c\7\22\2\2\u0244\u024c\7\23\2"+
		"\2\u0245\u024c\7\24\2\2\u0246\u024c\7\25\2\2\u0247\u024c\7M\2\2\u0248"+
		"\u024c\7\26\2\2\u0249\u024c\7\16\2\2\u024a\u024c\7\27\2\2\u024b\u0241"+
		"\3\2\2\2\u024b\u0242\3\2\2\2\u024b\u0243\3\2\2\2\u024b\u0244\3\2\2\2\u024b"+
		"\u0245\3\2\2\2\u024b\u0246\3\2\2\2\u024b\u0247\3\2\2\2\u024b\u0248\3\2"+
		"\2\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024co\3\2\2\2\u024d\u0251"+
		"\5\u008aF\2\u024e\u0251\5\u009eP\2\u024f\u0251\5\u00a2R\2\u0250\u024d"+
		"\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251q\3\2\2\2\u0252"+
		"\u0254\7\4\2\2\u0253\u0255\7\30\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3"+
		"\2\2\2\u0255\u025b\3\2\2\2\u0256\u0258\7\30\2\2\u0257\u0259\7\4\2\2\u0258"+
		"\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u0252\3\2"+
		"\2\2\u025a\u0256\3\2\2\2\u025bs\3\2\2\2\u025c\u0260\7\31\2\2\u025d\u025f"+
		"\5v<\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\7\32"+
		"\2\2\u0264u\3\2\2\2\u0265\u027b\5x=\2\u0266\u027b\5|?\2\u0267\u027b\5"+
		"\u0080A\2\u0268\u0278\7\7\2\2\u0269\u026b\5z>\2\u026a\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0279\3\2"+
		"\2\2\u026e\u0270\5~@\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u026f"+
		"\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0279\3\2\2\2\u0273\u0275\5\u0082B"+
		"\2\u0274\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277"+
		"\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u026a\3\2\2\2\u0278\u026f\3\2\2\2\u0278"+
		"\u0274\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0265\3\2\2\2\u027a\u0266\3\2"+
		"\2\2\u027a\u0267\3\2\2\2\u027a\u0268\3\2\2\2\u027bw\3\2\2\2\u027c\u0284"+
		"\5\u009eP\2\u027d\u0281\7L\2\2\u027e\u0280\5z>\2\u027f\u027e\3\2\2\2\u0280"+
		"\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0285\3\2"+
		"\2\2\u0283\u0281\3\2\2\2\u0284\u027d\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"y\3\2\2\2\u0286\u0287\7\27\2\2\u0287\u0289\5\u009eP\2\u0288\u028a\7L\2"+
		"\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a{\3\2\2\2\u028b\u0293"+
		"\5\u008aF\2\u028c\u0290\7L\2\2\u028d\u028f\5~@\2\u028e\u028d\3\2\2\2\u028f"+
		"\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0294\3\2"+
		"\2\2\u0292\u0290\3\2\2\2\u0293\u028c\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"}\3\2\2\2\u0295\u0296\7\27\2\2\u0296\u0298\5\u008aF\2\u0297\u0299\7L\2"+
		"\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\177\3\2\2\2\u029a\u02a2"+
		"\7H\2\2\u029b\u029f\7L\2\2\u029c\u029e\5\u0082B\2\u029d\u029c\3\2\2\2"+
		"\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a3"+
		"\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u029b\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02ad\3\2\2\2\u02a4\u02a5\7\b\2\2\u02a5\u02a9\7L\2\2\u02a6\u02a8\5\u0082"+
		"B\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u029a\3\2"+
		"\2\2\u02ac\u02a4\3\2\2\2\u02ad\u0081\3\2\2\2\u02ae\u02af\7\27\2\2\u02af"+
		"\u02b1\7H\2\2\u02b0\u02b2\7L\2\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2"+
		"\2\u02b2\u0083\3\2\2\2\u02b3\u02b4\7\33\2\2\u02b4\u02b5\5\u0094K\2\u02b5"+
		"\u0085\3\2\2\2\u02b6\u02b7\7\34\2\2\u02b7\u02ba\5\u008cG\2\u02b8\u02bb"+
		"\5\u009eP\2\u02b9\u02bb\5\u008aF\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2"+
		"\2\2\u02bb\u0087\3\2\2\2\u02bc\u02bd\7\35\2\2\u02bd\u02be\5\u009eP\2\u02be"+
		"\u02bf\t\t\2\2\u02bf\u0089\3\2\2\2\u02c0\u02c4\5\u0098M\2\u02c1\u02c4"+
		"\5\u0096L\2\u02c2\u02c4\5\u009aN\2\u02c3\u02c0\3\2\2\2\u02c3\u02c1\3\2"+
		"\2\2\u02c3\u02c2\3\2\2\2\u02c4\u008b\3\2\2\2\u02c5\u02c8\5\u009eP\2\u02c6"+
		"\u02c8\5\u008eH\2\u02c7\u02c5\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8\u008d"+
		"\3\2\2\2\u02c9\u02ca\7?\2\2\u02ca\u008f\3\2\2\2\u02cb\u02cc\5\u009eP\2"+
		"\u02cc\u0091\3\2\2\2\u02cd\u02d0\5\u009eP\2\u02ce\u02d0\5\u00a2R\2\u02cf"+
		"\u02cd\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0\u0093\3\2\2\2\u02d1\u02d4\5\u009e"+
		"P\2\u02d2\u02d4\5\u00a2R\2\u02d3\u02d1\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"\u0095\3\2\2\2\u02d5\u02d6\t\7\2\2\u02d6\u0097\3\2\2\2\u02d7\u02db\5\u009c"+
		"O\2\u02d8\u02dc\7H\2\2\u02d9\u02da\7\36\2\2\u02da\u02dc\5\u0090I\2\u02db"+
		"\u02d8\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u0099\3\2"+
		"\2\2\u02dd\u02de\t\n\2\2\u02de\u009b\3\2\2\2\u02df\u02e0\t\13\2\2\u02e0"+
		"\u009d\3\2\2\2\u02e1\u02e4\7@\2\2\u02e2\u02e4\5\u00a0Q\2\u02e3\u02e1\3"+
		"\2\2\2\u02e3\u02e2\3\2\2\2\u02e4\u009f\3\2\2\2\u02e5\u02e6\t\f\2\2\u02e6"+
		"\u00a1\3\2\2\2\u02e7\u02e8\7G\2\2\u02e8\u00a3\3\2\2\2\u02e9\u02ea\7\""+
		"\2\2\u02ea\u02ee\5\u0092J\2\u02eb\u02ec\7\33\2\2\u02ec\u02ee\5\u0092J"+
		"\2\u02ed\u02e9\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u00a5\3\2\2\2\u02ef\u02f1"+
		"\7$\2\2\u02f0\u02f2\5\u0092J\2\u02f1\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2"+
		"\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02fc\3\2\2\2\u02f5\u02f7"+
		"\7\27\2\2\u02f6\u02f8\5\u0092J\2\u02f7\u02f6\3\2\2\2\u02f8\u02f9\3\2\2"+
		"\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02ef"+
		"\3\2\2\2\u02fb\u02f5\3\2\2\2\u02fc\u00a7\3\2\2\2f\u00ab\u00b0\u00b5\u00b8"+
		"\u00bf\u00cd\u00d6\u00da\u00df\u00ea\u00f2\u00fa\u0102\u0106\u010b\u0113"+
		"\u0118\u011f\u0123\u0128\u012f\u0133\u0137\u013d\u0143\u014a\u0151\u0158"+
		"\u015e\u0160\u0166\u016c\u0173\u0179\u017b\u0181\u0187\u018e\u0195\u0197"+
		"\u01a1\u01ad\u01b3\u01b9\u01be\u01c5\u01cb\u01d1\u01d8\u01dc\u01e0\u01e7"+
		"\u01ea\u01ee\u01f2\u01f6\u01fc\u0201\u0207\u020b\u0210\u0215\u021b\u0222"+
		"\u022b\u022f\u023e\u024b\u0250\u0254\u0258\u025a\u0260\u026c\u0271\u0276"+
		"\u0278\u027a\u0281\u0284\u0289\u0290\u0293\u0298\u029f\u02a2\u02a9\u02ac"+
		"\u02b1\u02ba\u02c3\u02c7\u02cf\u02d3\u02db\u02e3\u02ed\u02f3\u02f9\u02fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}