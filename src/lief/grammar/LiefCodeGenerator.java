// $ANTLR 3.5 C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g 2013-06-30 18:52:37

	package lief.grammar;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class LiefCodeGenerator extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANDERS", "BEGIN", "BLIJE", "BY", 
		"CHARACTER", "COMMENT", "DAN", "DIGIT", "DIVIDE", "EEN", "EN", "GROOTST", 
		"GROTER", "H", "HARTJE", "IDENTIFIER", "IS", "KLAAR", "KLEINER", "KLEINST", 
		"LAAT", "LETTER", "LOWER", "LPAREN", "MAAR", "MIN", "ML_COMMENT", "MODULO", 
		"MULTIPLY", "NEGATIEF", "NIET", "NUMBER", "OF", "PERIOD", "PLUS", "POSITIEF", 
		"PROGRAM", "QUOT", "RPAREN", "SMILEY", "STEENTJE", "UPPER", "VARIABLE", 
		"VRAAG", "WORDT", "WS", "ZEG", "ZOALS", "ZOLANG"
	};
	public static final int EOF=-1;
	public static final int ANDERS=4;
	public static final int BEGIN=5;
	public static final int BLIJE=6;
	public static final int BY=7;
	public static final int CHARACTER=8;
	public static final int COMMENT=9;
	public static final int DAN=10;
	public static final int DIGIT=11;
	public static final int DIVIDE=12;
	public static final int EEN=13;
	public static final int EN=14;
	public static final int GROOTST=15;
	public static final int GROTER=16;
	public static final int H=17;
	public static final int HARTJE=18;
	public static final int IDENTIFIER=19;
	public static final int IS=20;
	public static final int KLAAR=21;
	public static final int KLEINER=22;
	public static final int KLEINST=23;
	public static final int LAAT=24;
	public static final int LETTER=25;
	public static final int LOWER=26;
	public static final int LPAREN=27;
	public static final int MAAR=28;
	public static final int MIN=29;
	public static final int ML_COMMENT=30;
	public static final int MODULO=31;
	public static final int MULTIPLY=32;
	public static final int NEGATIEF=33;
	public static final int NIET=34;
	public static final int NUMBER=35;
	public static final int OF=36;
	public static final int PERIOD=37;
	public static final int PLUS=38;
	public static final int POSITIEF=39;
	public static final int PROGRAM=40;
	public static final int QUOT=41;
	public static final int RPAREN=42;
	public static final int SMILEY=43;
	public static final int STEENTJE=44;
	public static final int UPPER=45;
	public static final int VARIABLE=46;
	public static final int VRAAG=47;
	public static final int WORDT=48;
	public static final int WS=49;
	public static final int ZEG=50;
	public static final int ZOALS=51;
	public static final int ZOLANG=52;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public LiefCodeGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public LiefCodeGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("LiefCodeGeneratorTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return LiefCodeGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g"; }


	  int localStore = 0;
	  int lblNum     = 0;
	  private int lblNum() { return lblNum++; }
	  private boolean returnsVoid(LiefTree t) {return t.getLiefType().equals(CheckerFunc.VOID_TYPE) || t.getLiefType().equals(CheckerFunc.NO_TYPE);}
	  //Returns a boolean array with r[0] if type is an int, r[1] if it is a char, r[2] if it is a boolean
	  private boolean[] type(LiefTree t) { return new boolean[] {t.getLiefType().equals(CheckerFunc.GETALLETJE),
	                                                             t.getLiefType().equals(CheckerFunc.LETTERTJE),
	                                                             t.getLiefType().equals(CheckerFunc.SMILEY)};  }


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:24:1: program : ^( PROGRAM (s+= sentence )+ ) -> program(filename=Lief.getFilename()classname=Lief.getClassname()locals=100stack=50sentence=$s);
	public final LiefCodeGenerator.program_return program() throws RecognitionException {
		LiefCodeGenerator.program_return retval = new LiefCodeGenerator.program_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:25:3: ( ^( PROGRAM (s+= sentence )+ ) -> program(filename=Lief.getFilename()classname=Lief.getClassname()locals=100stack=50sentence=$s))
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:25:7: ^( PROGRAM (s+= sentence )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program87); 
			match(input, Token.DOWN, null); 
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:25:18: (s+= sentence )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ANDERS && LA1_0 <= BLIJE)||LA1_0==CHARACTER||LA1_0==DIVIDE||(LA1_0 >= EN && LA1_0 <= GROTER)||LA1_0==HARTJE||(LA1_0 >= KLEINER && LA1_0 <= LAAT)||LA1_0==LPAREN||LA1_0==MIN||(LA1_0 >= MODULO && LA1_0 <= OF)||(LA1_0 >= PLUS && LA1_0 <= POSITIEF)||(LA1_0 >= SMILEY && LA1_0 <= STEENTJE)||(LA1_0 >= VARIABLE && LA1_0 <= WORDT)||(LA1_0 >= ZEG && LA1_0 <= ZOLANG)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:25:19: s+= sentence
					{
					pushFollow(FOLLOW_sentence_in_program93);
					s=sentence();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 26:7: -> program(filename=Lief.getFilename()classname=Lief.getClassname()locals=100stack=50sentence=$s)
			{
				retval.st = templateLib.getInstanceOf("program",new STAttrMap().put("filename", Lief.getFilename()).put("classname", Lief.getClassname()).put("locals", 100).put("stack", 50).put("sentence", list_s));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class sentence_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sentence"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:29:1: sentence : ( (d= declaration ) -> sentence(sentence=$d.stlinenumber=$d.start.getLine()pop=!returnsVoid($d.start) && !$d.start.shouldReturn())| (c= command ) -> sentence(sentence=$c.stlinenumber=$c.start.getLine()pop=!returnsVoid($c.start) && !$c.start.shouldReturn()));
	public final LiefCodeGenerator.sentence_return sentence() throws RecognitionException {
		LiefCodeGenerator.sentence_return retval = new LiefCodeGenerator.sentence_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope d =null;
		TreeRuleReturnScope c =null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:30:3: ( (d= declaration ) -> sentence(sentence=$d.stlinenumber=$d.start.getLine()pop=!returnsVoid($d.start) && !$d.start.shouldReturn())| (c= command ) -> sentence(sentence=$c.stlinenumber=$c.start.getLine()pop=!returnsVoid($c.start) && !$c.start.shouldReturn()))
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==HARTJE||LA2_0==STEENTJE) ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= ANDERS && LA2_0 <= BLIJE)||LA2_0==CHARACTER||LA2_0==DIVIDE||(LA2_0 >= EN && LA2_0 <= GROTER)||(LA2_0 >= KLEINER && LA2_0 <= LAAT)||LA2_0==LPAREN||LA2_0==MIN||(LA2_0 >= MODULO && LA2_0 <= OF)||(LA2_0 >= PLUS && LA2_0 <= POSITIEF)||LA2_0==SMILEY||(LA2_0 >= VARIABLE && LA2_0 <= WORDT)||(LA2_0 >= ZEG && LA2_0 <= ZOLANG)) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:30:7: (d= declaration )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:30:7: (d= declaration )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:30:8: d= declaration
					{
					pushFollow(FOLLOW_declaration_in_sentence155);
					d=declaration();
					state._fsp--;

					}

					// TEMPLATE REWRITE
					// 30:25: -> sentence(sentence=$d.stlinenumber=$d.start.getLine()pop=!returnsVoid($d.start) && !$d.start.shouldReturn())
					{
						retval.st = templateLib.getInstanceOf("sentence",new STAttrMap().put("sentence", (d!=null?((StringTemplate)d.getTemplate()):null)).put("linenumber", (d!=null?((LiefTree)d.start):null).getLine()).put("pop", !returnsVoid((d!=null?((LiefTree)d.start):null)) && !(d!=null?((LiefTree)d.start):null).shouldReturn()));
					}



					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:31:7: (c= command )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:31:7: (c= command )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:31:8: c= command
					{
					pushFollow(FOLLOW_command_in_sentence186);
					c=command();
					state._fsp--;

					}

					// TEMPLATE REWRITE
					// 31:25: -> sentence(sentence=$c.stlinenumber=$c.start.getLine()pop=!returnsVoid($c.start) && !$c.start.shouldReturn())
					{
						retval.st = templateLib.getInstanceOf("sentence",new STAttrMap().put("sentence", (c!=null?((StringTemplate)c.getTemplate()):null)).put("linenumber", (c!=null?((LiefTree)c.start):null).getLine()).put("pop", !returnsVoid((c!=null?((LiefTree)c.start):null)) && !(c!=null?((LiefTree)c.start):null).shouldReturn()));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sentence"


	public static class declaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "declaration"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:34:1: declaration : ( ^( HARTJE name= IDENTIFIER type= IDENTIFIER ) -> declaration(type=$type.textaddress=localStore)| ^( STEENTJE name= IDENTIFIER value= expression ) -> steentje(ex=$value.staddress=localStore));
	public final LiefCodeGenerator.declaration_return declaration() throws RecognitionException {
		LiefCodeGenerator.declaration_return retval = new LiefCodeGenerator.declaration_return();
		retval.start = input.LT(1);

		LiefTree name=null;
		LiefTree type=null;
		TreeRuleReturnScope value =null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:35:3: ( ^( HARTJE name= IDENTIFIER type= IDENTIFIER ) -> declaration(type=$type.textaddress=localStore)| ^( STEENTJE name= IDENTIFIER value= expression ) -> steentje(ex=$value.staddress=localStore))
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==HARTJE) ) {
				alt3=1;
			}
			else if ( (LA3_0==STEENTJE) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:35:7: ^( HARTJE name= IDENTIFIER type= IDENTIFIER )
					{
					match(input,HARTJE,FOLLOW_HARTJE_in_declaration226); 
					match(input, Token.DOWN, null); 
					name=(LiefTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration230); 
					type=(LiefTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration234); 
					match(input, Token.UP, null); 

					localStore++; name.setAddress(localStore);
					// TEMPLATE REWRITE
					// 36:7: -> declaration(type=$type.textaddress=localStore)
					{
						retval.st = templateLib.getInstanceOf("declaration",new STAttrMap().put("type", (type!=null?type.getText():null)).put("address", localStore));
					}



					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:37:6: ^( STEENTJE name= IDENTIFIER value= expression )
					{
					match(input,STEENTJE,FOLLOW_STEENTJE_in_declaration265); 
					match(input, Token.DOWN, null); 
					name=(LiefTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration269); 
					pushFollow(FOLLOW_expression_in_declaration273);
					value=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					localStore++; name.setAddress(localStore);
					// TEMPLATE REWRITE
					// 38:7: -> steentje(ex=$value.staddress=localStore)
					{
						retval.st = templateLib.getInstanceOf("steentje",new STAttrMap().put("ex", (value!=null?((StringTemplate)value.getTemplate()):null)).put("address", localStore));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class command_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "command"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:41:1: command : ( (e= expression ) -> {$e.st}| (i= ifCommand ) -> {$i.st}| (w= whileCommand ) -> {$w.st}| (ec= emptyCommand ) -> {$ec.st});
	public final LiefCodeGenerator.command_return command() throws RecognitionException {
		LiefCodeGenerator.command_return retval = new LiefCodeGenerator.command_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope e =null;
		TreeRuleReturnScope i =null;
		TreeRuleReturnScope w =null;
		TreeRuleReturnScope ec =null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:42:3: ( (e= expression ) -> {$e.st}| (i= ifCommand ) -> {$i.st}| (w= whileCommand ) -> {$w.st}| (ec= emptyCommand ) -> {$ec.st})
			int alt4=4;
			switch ( input.LA(1) ) {
			case ANDERS:
			case BEGIN:
			case CHARACTER:
			case DIVIDE:
			case EN:
			case GROOTST:
			case GROTER:
			case KLEINER:
			case KLEINST:
			case LPAREN:
			case MIN:
			case MODULO:
			case MULTIPLY:
			case NEGATIEF:
			case NIET:
			case NUMBER:
			case OF:
			case PLUS:
			case POSITIEF:
			case SMILEY:
			case VARIABLE:
			case VRAAG:
			case WORDT:
			case ZEG:
			case ZOALS:
				{
				alt4=1;
				}
				break;
			case BLIJE:
				{
				alt4=2;
				}
				break;
			case ZOLANG:
				{
				alt4=3;
				}
				break;
			case LAAT:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:42:7: (e= expression )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:42:7: (e= expression )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:42:8: e= expression
					{
					pushFollow(FOLLOW_expression_in_command314);
					e=expression();
					state._fsp--;

					}

					// TEMPLATE REWRITE
					// 42:25: -> {$e.st}
					{
						retval.st = (e!=null?((StringTemplate)e.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:43:7: (i= ifCommand )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:43:7: (i= ifCommand )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:43:8: i= ifCommand
					{
					pushFollow(FOLLOW_ifCommand_in_command334);
					i=ifCommand();
					state._fsp--;

					}

					// TEMPLATE REWRITE
					// 43:25: -> {$i.st}
					{
						retval.st = (i!=null?((StringTemplate)i.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:44:7: (w= whileCommand )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:44:7: (w= whileCommand )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:44:8: w= whileCommand
					{
					pushFollow(FOLLOW_whileCommand_in_command354);
					w=whileCommand();
					state._fsp--;

					}

					// TEMPLATE REWRITE
					// 44:25: -> {$w.st}
					{
						retval.st = (w!=null?((StringTemplate)w.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:45:7: (ec= emptyCommand )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:45:7: (ec= emptyCommand )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:45:8: ec= emptyCommand
					{
					pushFollow(FOLLOW_emptyCommand_in_command371);
					ec=emptyCommand();
					state._fsp--;

					}

					// TEMPLATE REWRITE
					// 45:25: -> {$ec.st}
					{
						retval.st = (ec!=null?((StringTemplate)ec.getTemplate()):null);
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class ifCommand_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifCommand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:48:1: ifCommand : ^( BLIJE e1= expression DAN (s1+= sentence )+ ANDERS (s2+= sentence )+ ) -> ifthenelse(condition=$e1.stdan=$s1anders=$s2lbl=lblNum());
	public final LiefCodeGenerator.ifCommand_return ifCommand() throws RecognitionException {
		LiefCodeGenerator.ifCommand_return retval = new LiefCodeGenerator.ifCommand_return();
		retval.start = input.LT(1);

		List<Object> list_s1=null;
		List<Object> list_s2=null;
		TreeRuleReturnScope e1 =null;
		RuleReturnScope s1 = null;
		RuleReturnScope s2 = null;
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:49:3: ( ^( BLIJE e1= expression DAN (s1+= sentence )+ ANDERS (s2+= sentence )+ ) -> ifthenelse(condition=$e1.stdan=$s1anders=$s2lbl=lblNum()))
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:49:7: ^( BLIJE e1= expression DAN (s1+= sentence )+ ANDERS (s2+= sentence )+ )
			{
			match(input,BLIJE,FOLLOW_BLIJE_in_ifCommand395); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifCommand399);
			e1=expression();
			state._fsp--;

			match(input,DAN,FOLLOW_DAN_in_ifCommand401); 
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:49:33: (s1+= sentence )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ANDERS) ) {
					int LA5_1 = input.LA(2);
					if ( (LA5_1==DOWN) ) {
						alt5=1;
					}

				}
				else if ( ((LA5_0 >= BEGIN && LA5_0 <= BLIJE)||LA5_0==CHARACTER||LA5_0==DIVIDE||(LA5_0 >= EN && LA5_0 <= GROTER)||LA5_0==HARTJE||(LA5_0 >= KLEINER && LA5_0 <= LAAT)||LA5_0==LPAREN||LA5_0==MIN||(LA5_0 >= MODULO && LA5_0 <= OF)||(LA5_0 >= PLUS && LA5_0 <= POSITIEF)||(LA5_0 >= SMILEY && LA5_0 <= STEENTJE)||(LA5_0 >= VARIABLE && LA5_0 <= WORDT)||(LA5_0 >= ZEG && LA5_0 <= ZOLANG)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:49:34: s1+= sentence
					{
					pushFollow(FOLLOW_sentence_in_ifCommand406);
					s1=sentence();
					state._fsp--;

					if (list_s1==null) list_s1=new ArrayList<Object>();
					list_s1.add(s1.getTemplate());
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			match(input,ANDERS,FOLLOW_ANDERS_in_ifCommand410); 
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:49:56: (s2+= sentence )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= ANDERS && LA6_0 <= BLIJE)||LA6_0==CHARACTER||LA6_0==DIVIDE||(LA6_0 >= EN && LA6_0 <= GROTER)||LA6_0==HARTJE||(LA6_0 >= KLEINER && LA6_0 <= LAAT)||LA6_0==LPAREN||LA6_0==MIN||(LA6_0 >= MODULO && LA6_0 <= OF)||(LA6_0 >= PLUS && LA6_0 <= POSITIEF)||(LA6_0 >= SMILEY && LA6_0 <= STEENTJE)||(LA6_0 >= VARIABLE && LA6_0 <= WORDT)||(LA6_0 >= ZEG && LA6_0 <= ZOLANG)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:49:57: s2+= sentence
					{
					pushFollow(FOLLOW_sentence_in_ifCommand415);
					s2=sentence();
					state._fsp--;

					if (list_s2==null) list_s2=new ArrayList<Object>();
					list_s2.add(s2.getTemplate());
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 50:7: -> ifthenelse(condition=$e1.stdan=$s1anders=$s2lbl=lblNum())
			{
				retval.st = templateLib.getInstanceOf("ifthenelse",new STAttrMap().put("condition", (e1!=null?((StringTemplate)e1.getTemplate()):null)).put("dan", list_s1).put("anders", list_s2).put("lbl", lblNum()));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifCommand"


	public static class emptyCommand_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "emptyCommand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:53:1: emptyCommand : LAAT -> nop(;
	public final LiefCodeGenerator.emptyCommand_return emptyCommand() throws RecognitionException {
		LiefCodeGenerator.emptyCommand_return retval = new LiefCodeGenerator.emptyCommand_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:54:3: ( LAAT -> nop()
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:54:7: LAAT
			{
			match(input,LAAT,FOLLOW_LAAT_in_emptyCommand470); 
			// TEMPLATE REWRITE
			// 54:12: -> nop(
			{
				retval.st = templateLib.getInstanceOf("nop");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "emptyCommand"


	public static class whileCommand_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whileCommand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:57:1: whileCommand : ^( ZOLANG e1= expression (s+= sentence )+ ) -> while(condition=$e1.stsentence=$slbl=lblNum());
	public final LiefCodeGenerator.whileCommand_return whileCommand() throws RecognitionException {
		LiefCodeGenerator.whileCommand_return retval = new LiefCodeGenerator.whileCommand_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		TreeRuleReturnScope e1 =null;
		RuleReturnScope s = null;
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:58:3: ( ^( ZOLANG e1= expression (s+= sentence )+ ) -> while(condition=$e1.stsentence=$slbl=lblNum()))
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:58:7: ^( ZOLANG e1= expression (s+= sentence )+ )
			{
			match(input,ZOLANG,FOLLOW_ZOLANG_in_whileCommand496); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileCommand500);
			e1=expression();
			state._fsp--;

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:58:30: (s+= sentence )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= ANDERS && LA7_0 <= BLIJE)||LA7_0==CHARACTER||LA7_0==DIVIDE||(LA7_0 >= EN && LA7_0 <= GROTER)||LA7_0==HARTJE||(LA7_0 >= KLEINER && LA7_0 <= LAAT)||LA7_0==LPAREN||LA7_0==MIN||(LA7_0 >= MODULO && LA7_0 <= OF)||(LA7_0 >= PLUS && LA7_0 <= POSITIEF)||(LA7_0 >= SMILEY && LA7_0 <= STEENTJE)||(LA7_0 >= VARIABLE && LA7_0 <= WORDT)||(LA7_0 >= ZEG && LA7_0 <= ZOLANG)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:58:31: s+= sentence
					{
					pushFollow(FOLLOW_sentence_in_whileCommand505);
					s=sentence();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 59:7: -> while(condition=$e1.stsentence=$slbl=lblNum())
			{
				retval.st = templateLib.getInstanceOf("while",new STAttrMap().put("condition", (e1!=null?((StringTemplate)e1.getTemplate()):null)).put("sentence", list_s).put("lbl", lblNum()));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileCommand"


	public static class expression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:62:1: expression : ( ^( WORDT var= variable ex= expression ) -> wordt(var=$var.stexpression=$ex.st)| ^( NEGATIEF ex= expression ) -> negatief(expression=$ex.st)| ^( POSITIEF ex= expression ) -> positief(expression=$ex.st)| ^( NIET ex= expression ) -> niet(expression=$ex.st)| ^( EN ex1= expression ex2= expression ) -> en(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( OF ex1= expression ex2= expression ) -> of(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( MULTIPLY ex1= expression ex2= expression ) -> multiply(ex1=$ex1.stex2=$ex2.st)| ^( DIVIDE ex1= expression ex2= expression ) -> divide(ex1=$ex1.stex2=$ex2.st)| ^( MODULO ex1= expression ex2= expression ) -> modulo(ex1=$ex1.stex2=$ex2.st)| ^( PLUS ex1= expression ex2= expression ) -> plus(ex1=$ex1.stex2=$ex2.st)| ^( MIN ex1= expression ex2= expression ) -> min(ex1=$ex1.stex2=$ex2.st)| ^( KLEINST ex1= expression ex2= expression ) -> kleinst(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( GROOTST ex1= expression ex2= expression ) -> grootst(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( KLEINER ex1= expression ex2= expression ) -> kleiner(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( GROTER ex1= expression ex2= expression ) -> groter(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( ZOALS ex1= expression ex2= expression ) -> zoals(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( ANDERS ex1= expression ex2= expression ) -> anders(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| (c= compoundExpression ) -> {$c.st}| (o= operand ) -> {$o.st});
	public final LiefCodeGenerator.expression_return expression() throws RecognitionException {
		LiefCodeGenerator.expression_return retval = new LiefCodeGenerator.expression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope var =null;
		TreeRuleReturnScope ex =null;
		TreeRuleReturnScope ex1 =null;
		TreeRuleReturnScope ex2 =null;
		TreeRuleReturnScope c =null;
		TreeRuleReturnScope o =null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:63:3: ( ^( WORDT var= variable ex= expression ) -> wordt(var=$var.stexpression=$ex.st)| ^( NEGATIEF ex= expression ) -> negatief(expression=$ex.st)| ^( POSITIEF ex= expression ) -> positief(expression=$ex.st)| ^( NIET ex= expression ) -> niet(expression=$ex.st)| ^( EN ex1= expression ex2= expression ) -> en(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( OF ex1= expression ex2= expression ) -> of(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( MULTIPLY ex1= expression ex2= expression ) -> multiply(ex1=$ex1.stex2=$ex2.st)| ^( DIVIDE ex1= expression ex2= expression ) -> divide(ex1=$ex1.stex2=$ex2.st)| ^( MODULO ex1= expression ex2= expression ) -> modulo(ex1=$ex1.stex2=$ex2.st)| ^( PLUS ex1= expression ex2= expression ) -> plus(ex1=$ex1.stex2=$ex2.st)| ^( MIN ex1= expression ex2= expression ) -> min(ex1=$ex1.stex2=$ex2.st)| ^( KLEINST ex1= expression ex2= expression ) -> kleinst(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( GROOTST ex1= expression ex2= expression ) -> grootst(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( KLEINER ex1= expression ex2= expression ) -> kleiner(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( GROTER ex1= expression ex2= expression ) -> groter(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( ZOALS ex1= expression ex2= expression ) -> zoals(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| ^( ANDERS ex1= expression ex2= expression ) -> anders(ex1=$ex1.stex2=$ex2.stlbl=lblNum())| (c= compoundExpression ) -> {$c.st}| (o= operand ) -> {$o.st})
			int alt8=19;
			switch ( input.LA(1) ) {
			case WORDT:
				{
				alt8=1;
				}
				break;
			case NEGATIEF:
				{
				alt8=2;
				}
				break;
			case POSITIEF:
				{
				alt8=3;
				}
				break;
			case NIET:
				{
				alt8=4;
				}
				break;
			case EN:
				{
				alt8=5;
				}
				break;
			case OF:
				{
				alt8=6;
				}
				break;
			case MULTIPLY:
				{
				alt8=7;
				}
				break;
			case DIVIDE:
				{
				alt8=8;
				}
				break;
			case MODULO:
				{
				alt8=9;
				}
				break;
			case PLUS:
				{
				alt8=10;
				}
				break;
			case MIN:
				{
				alt8=11;
				}
				break;
			case KLEINST:
				{
				alt8=12;
				}
				break;
			case GROOTST:
				{
				alt8=13;
				}
				break;
			case KLEINER:
				{
				alt8=14;
				}
				break;
			case GROTER:
				{
				alt8=15;
				}
				break;
			case ZOALS:
				{
				alt8=16;
				}
				break;
			case ANDERS:
				{
				alt8=17;
				}
				break;
			case BEGIN:
				{
				alt8=18;
				}
				break;
			case CHARACTER:
			case LPAREN:
			case NUMBER:
			case SMILEY:
			case VARIABLE:
			case VRAAG:
			case ZEG:
				{
				alt8=19;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:63:7: ^( WORDT var= variable ex= expression )
					{
					match(input,WORDT,FOLLOW_WORDT_in_expression556); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variable_in_expression560);
					var=variable();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression564);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 63:49: -> wordt(var=$var.stexpression=$ex.st)
					{
						retval.st = templateLib.getInstanceOf("wordt",new STAttrMap().put("var", (var!=null?((StringTemplate)var.getTemplate()):null)).put("expression", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:64:7: ^( NEGATIEF ex= expression )
					{
					match(input,NEGATIEF,FOLLOW_NEGATIEF_in_expression597); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression602);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 64:49: -> negatief(expression=$ex.st)
					{
						retval.st = templateLib.getInstanceOf("negatief",new STAttrMap().put("expression", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:65:7: ^( POSITIEF ex= expression )
					{
					match(input,POSITIEF,FOLLOW_POSITIEF_in_expression637); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression642);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 65:49: -> positief(expression=$ex.st)
					{
						retval.st = templateLib.getInstanceOf("positief",new STAttrMap().put("expression", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:66:7: ^( NIET ex= expression )
					{
					match(input,NIET,FOLLOW_NIET_in_expression679); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression688);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 66:49: -> niet(expression=$ex.st)
					{
						retval.st = templateLib.getInstanceOf("niet",new STAttrMap().put("expression", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:67:7: ^( EN ex1= expression ex2= expression )
					{
					match(input,EN,FOLLOW_EN_in_expression727); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression738);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression742);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 67:49: -> en(ex1=$ex1.stex2=$ex2.stlbl=lblNum())
					{
						retval.st = templateLib.getInstanceOf("en",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)).put("lbl", lblNum()));
					}



					}
					break;
				case 6 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:68:7: ^( OF ex1= expression ex2= expression )
					{
					match(input,OF,FOLLOW_OF_in_expression775); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression786);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression790);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 68:49: -> of(ex1=$ex1.stex2=$ex2.stlbl=lblNum())
					{
						retval.st = templateLib.getInstanceOf("of",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)).put("lbl", lblNum()));
					}



					}
					break;
				case 7 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:69:7: ^( MULTIPLY ex1= expression ex2= expression )
					{
					match(input,MULTIPLY,FOLLOW_MULTIPLY_in_expression823); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression828);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression832);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 69:49: -> multiply(ex1=$ex1.stex2=$ex2.st)
					{
						retval.st = templateLib.getInstanceOf("multiply",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:70:7: ^( DIVIDE ex1= expression ex2= expression )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expression855); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression862);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression866);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 70:49: -> divide(ex1=$ex1.stex2=$ex2.st)
					{
						retval.st = templateLib.getInstanceOf("divide",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:71:7: ^( MODULO ex1= expression ex2= expression )
					{
					match(input,MODULO,FOLLOW_MODULO_in_expression891); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression898);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression902);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 71:49: -> modulo(ex1=$ex1.stex2=$ex2.st)
					{
						retval.st = templateLib.getInstanceOf("modulo",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)));
					}



					}
					break;
				case 10 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:72:7: ^( PLUS ex1= expression ex2= expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression929); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression938);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression942);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 72:49: -> plus(ex1=$ex1.stex2=$ex2.st)
					{
						retval.st = templateLib.getInstanceOf("plus",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)));
					}



					}
					break;
				case 11 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:73:7: ^( MIN ex1= expression ex2= expression )
					{
					match(input,MIN,FOLLOW_MIN_in_expression969); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression979);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression983);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 73:49: -> min(ex1=$ex1.stex2=$ex2.st)
					{
						retval.st = templateLib.getInstanceOf("min",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)));
					}



					}
					break;
				case 12 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:74:7: ^( KLEINST ex1= expression ex2= expression )
					{
					match(input,KLEINST,FOLLOW_KLEINST_in_expression1011); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1017);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1021);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 74:49: -> kleinst(ex1=$ex1.stex2=$ex2.stlbl=lblNum())
					{
						retval.st = templateLib.getInstanceOf("kleinst",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)).put("lbl", lblNum()));
					}



					}
					break;
				case 13 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:75:7: ^( GROOTST ex1= expression ex2= expression )
					{
					match(input,GROOTST,FOLLOW_GROOTST_in_expression1049); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1055);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1059);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 75:49: -> grootst(ex1=$ex1.stex2=$ex2.stlbl=lblNum())
					{
						retval.st = templateLib.getInstanceOf("grootst",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)).put("lbl", lblNum()));
					}



					}
					break;
				case 14 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:76:7: ^( KLEINER ex1= expression ex2= expression )
					{
					match(input,KLEINER,FOLLOW_KLEINER_in_expression1087); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1093);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1097);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 76:49: -> kleiner(ex1=$ex1.stex2=$ex2.stlbl=lblNum())
					{
						retval.st = templateLib.getInstanceOf("kleiner",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)).put("lbl", lblNum()));
					}



					}
					break;
				case 15 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:77:7: ^( GROTER ex1= expression ex2= expression )
					{
					match(input,GROTER,FOLLOW_GROTER_in_expression1125); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1132);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1136);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 77:49: -> groter(ex1=$ex1.stex2=$ex2.stlbl=lblNum())
					{
						retval.st = templateLib.getInstanceOf("groter",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)).put("lbl", lblNum()));
					}



					}
					break;
				case 16 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:78:7: ^( ZOALS ex1= expression ex2= expression )
					{
					match(input,ZOALS,FOLLOW_ZOALS_in_expression1165); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1173);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1177);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 78:49: -> zoals(ex1=$ex1.stex2=$ex2.stlbl=lblNum())
					{
						retval.st = templateLib.getInstanceOf("zoals",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)).put("lbl", lblNum()));
					}



					}
					break;
				case 17 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:79:7: ^( ANDERS ex1= expression ex2= expression )
					{
					match(input,ANDERS,FOLLOW_ANDERS_in_expression1207); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1214);
					ex1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1218);
					ex2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 79:49: -> anders(ex1=$ex1.stex2=$ex2.stlbl=lblNum())
					{
						retval.st = templateLib.getInstanceOf("anders",new STAttrMap().put("ex1", (ex1!=null?((StringTemplate)ex1.getTemplate()):null)).put("ex2", (ex2!=null?((StringTemplate)ex2.getTemplate()):null)).put("lbl", lblNum()));
					}



					}
					break;
				case 18 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:80:7: (c= compoundExpression )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:80:7: (c= compoundExpression )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:80:8: c= compoundExpression
					{
					pushFollow(FOLLOW_compoundExpression_in_expression1249);
					c=compoundExpression();
					state._fsp--;

					}

					// TEMPLATE REWRITE
					// 80:49: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 19 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:81:7: (o= operand )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:81:7: (o= operand )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:81:8: o= operand
					{
					pushFollow(FOLLOW_operand_in_expression1285);
					o=operand();
					state._fsp--;

					}

					// TEMPLATE REWRITE
					// 81:49: -> {$o.st}
					{
						retval.st = (o!=null?((StringTemplate)o.getTemplate()):null);
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class compoundExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "compoundExpression"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:84:1: compoundExpression : ^( BEGIN (s+= sentence )+ ) -> compound(sentence=$s);
	public final LiefCodeGenerator.compoundExpression_return compoundExpression() throws RecognitionException {
		LiefCodeGenerator.compoundExpression_return retval = new LiefCodeGenerator.compoundExpression_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:85:3: ( ^( BEGIN (s+= sentence )+ ) -> compound(sentence=$s))
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:85:7: ^( BEGIN (s+= sentence )+ )
			{
			match(input,BEGIN,FOLLOW_BEGIN_in_compoundExpression1336); 
			match(input, Token.DOWN, null); 
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:85:15: (s+= sentence )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= ANDERS && LA9_0 <= BLIJE)||LA9_0==CHARACTER||LA9_0==DIVIDE||(LA9_0 >= EN && LA9_0 <= GROTER)||LA9_0==HARTJE||(LA9_0 >= KLEINER && LA9_0 <= LAAT)||LA9_0==LPAREN||LA9_0==MIN||(LA9_0 >= MODULO && LA9_0 <= OF)||(LA9_0 >= PLUS && LA9_0 <= POSITIEF)||(LA9_0 >= SMILEY && LA9_0 <= STEENTJE)||(LA9_0 >= VARIABLE && LA9_0 <= WORDT)||(LA9_0 >= ZEG && LA9_0 <= ZOLANG)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:85:16: s+= sentence
					{
					pushFollow(FOLLOW_sentence_in_compoundExpression1341);
					s=sentence();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 85:31: -> compound(sentence=$s)
			{
				retval.st = templateLib.getInstanceOf("compound",new STAttrMap().put("sentence", list_s));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compoundExpression"


	public static class operand_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:88:1: operand : ( (n= NUMBER ) -> number(value=$n.text)| ^( LPAREN e= expression ) -> {$e.st}| (id= variable ) -> variable(address=$id.st)| (s= SMILEY ) -> smiley(value=$s.text.equals(\":)\") ? true : false)| (c= CHARACTER ) -> number(value=(int) $c.text.charAt(1))| ^( ZEG (op+= zegop )+ ) -> zegmult(var=$op)| ^( VRAAG (vv+= vraagvar )+ ) -> vraagmult(var=$vv));
	public final LiefCodeGenerator.operand_return operand() throws RecognitionException {
		LiefCodeGenerator.operand_return retval = new LiefCodeGenerator.operand_return();
		retval.start = input.LT(1);

		LiefTree n=null;
		LiefTree s=null;
		LiefTree c=null;
		List<Object> list_op=null;
		List<Object> list_vv=null;
		TreeRuleReturnScope e =null;
		TreeRuleReturnScope id =null;
		RuleReturnScope op = null;
		RuleReturnScope vv = null;
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:89:3: ( (n= NUMBER ) -> number(value=$n.text)| ^( LPAREN e= expression ) -> {$e.st}| (id= variable ) -> variable(address=$id.st)| (s= SMILEY ) -> smiley(value=$s.text.equals(\":)\") ? true : false)| (c= CHARACTER ) -> number(value=(int) $c.text.charAt(1))| ^( ZEG (op+= zegop )+ ) -> zegmult(var=$op)| ^( VRAAG (vv+= vraagvar )+ ) -> vraagmult(var=$vv))
			int alt12=7;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt12=1;
				}
				break;
			case LPAREN:
				{
				alt12=2;
				}
				break;
			case VARIABLE:
				{
				alt12=3;
				}
				break;
			case SMILEY:
				{
				alt12=4;
				}
				break;
			case CHARACTER:
				{
				alt12=5;
				}
				break;
			case ZEG:
				{
				alt12=6;
				}
				break;
			case VRAAG:
				{
				alt12=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:89:7: (n= NUMBER )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:89:7: (n= NUMBER )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:89:8: n= NUMBER
					{
					n=(LiefTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1374); 
					}

					// TEMPLATE REWRITE
					// 89:32: -> number(value=$n.text)
					{
						retval.st = templateLib.getInstanceOf("number",new STAttrMap().put("value", (n!=null?n.getText():null)));
					}



					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:90:7: ^( LPAREN e= expression )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_operand1407); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_operand1411);
					e=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 90:32: -> {$e.st}
					{
						retval.st = (e!=null?((StringTemplate)e.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:91:7: (id= variable )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:91:7: (id= variable )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:91:8: id= variable
					{
					pushFollow(FOLLOW_variable_in_operand1429);
					id=variable();
					state._fsp--;

					}

					// TEMPLATE REWRITE
					// 91:32: -> variable(address=$id.st)
					{
						retval.st = templateLib.getInstanceOf("variable",new STAttrMap().put("address", (id!=null?((StringTemplate)id.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:92:7: (s= SMILEY )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:92:7: (s= SMILEY )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:92:8: s= SMILEY
					{
					s=(LiefTree)match(input,SMILEY,FOLLOW_SMILEY_in_operand1461); 
					}

					// TEMPLATE REWRITE
					// 92:32: -> smiley(value=$s.text.equals(\":)\") ? true : false)
					{
						retval.st = templateLib.getInstanceOf("smiley",new STAttrMap().put("value", (s!=null?s.getText():null).equals(":)") ? true : false));
					}



					}
					break;
				case 5 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:93:7: (c= CHARACTER )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:93:7: (c= CHARACTER )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:93:8: c= CHARACTER
					{
					c=(LiefTree)match(input,CHARACTER,FOLLOW_CHARACTER_in_operand1496); 
					}

					// TEMPLATE REWRITE
					// 93:32: -> number(value=(int) $c.text.charAt(1))
					{
						retval.st = templateLib.getInstanceOf("number",new STAttrMap().put("value", (int) (c!=null?c.getText():null).charAt(1)));
					}



					}
					break;
				case 6 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:94:7: ^( ZEG (op+= zegop )+ )
					{
					match(input,ZEG,FOLLOW_ZEG_in_operand1526); 
					match(input, Token.DOWN, null); 
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:94:15: (op+= zegop )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==CHARACTER||LA10_0==LPAREN||LA10_0==NUMBER||LA10_0==SMILEY||(LA10_0 >= VARIABLE && LA10_0 <= VRAAG)||LA10_0==ZEG) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:94:16: op+= zegop
							{
							pushFollow(FOLLOW_zegop_in_operand1533);
							op=zegop();
							state._fsp--;

							if (list_op==null) list_op=new ArrayList<Object>();
							list_op.add(op.getTemplate());
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 94:32: -> zegmult(var=$op)
					{
						retval.st = templateLib.getInstanceOf("zegmult",new STAttrMap().put("var", list_op));
					}



					}
					break;
				case 7 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:95:7: ^( VRAAG (vv+= vraagvar )+ )
					{
					match(input,VRAAG,FOLLOW_VRAAG_in_operand1557); 
					match(input, Token.DOWN, null); 
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:95:15: (vv+= vraagvar )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==VARIABLE) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:95:16: vv+= vraagvar
							{
							pushFollow(FOLLOW_vraagvar_in_operand1562);
							vv=vraagvar();
							state._fsp--;

							if (list_vv==null) list_vv=new ArrayList<Object>();
							list_vv.add(vv.getTemplate());
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 95:32: -> vraagmult(var=$vv)
					{
						retval.st = templateLib.getInstanceOf("vraagmult",new STAttrMap().put("var", list_vv));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class variable_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variable"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:98:1: variable : (v= VARIABLE ) -> address(address=$v.getAddress());
	public final LiefCodeGenerator.variable_return variable() throws RecognitionException {
		LiefCodeGenerator.variable_return retval = new LiefCodeGenerator.variable_return();
		retval.start = input.LT(1);

		LiefTree v=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:99:3: ( (v= VARIABLE ) -> address(address=$v.getAddress()))
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:99:5: (v= VARIABLE )
			{
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:99:5: (v= VARIABLE )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:99:6: v= VARIABLE
			{
			v=(LiefTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_variable1592); 
			}

			// TEMPLATE REWRITE
			// 99:18: -> address(address=$v.getAddress())
			{
				retval.st = templateLib.getInstanceOf("address",new STAttrMap().put("address", v.getAddress()));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class vraagvar_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "vraagvar"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:102:1: vraagvar : (v= variable ) -> {b[1]}? vraagchar(var=$v.st) -> {b[2]}? vraagbool(var=$v.st) -> vraagint(var=$v.st);
	public final LiefCodeGenerator.vraagvar_return vraagvar() throws RecognitionException {
		LiefCodeGenerator.vraagvar_return retval = new LiefCodeGenerator.vraagvar_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope v =null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:103:3: ( (v= variable ) -> {b[1]}? vraagchar(var=$v.st) -> {b[2]}? vraagbool(var=$v.st) -> vraagint(var=$v.st))
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:103:5: (v= variable )
			{
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:103:5: (v= variable )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:103:6: v= variable
			{
			pushFollow(FOLLOW_variable_in_vraagvar1620);
			v=variable();
			state._fsp--;

			}

			boolean[] b = type((v!=null?((LiefTree)v.start):null));
			// TEMPLATE REWRITE
			// 103:50: -> {b[1]}? vraagchar(var=$v.st)
			if (b[1]) {
				retval.st = templateLib.getInstanceOf("vraagchar",new STAttrMap().put("var", (v!=null?((StringTemplate)v.getTemplate()):null)));
			}

			else // 104:50: -> {b[2]}? vraagbool(var=$v.st)
			if (b[2]) {
				retval.st = templateLib.getInstanceOf("vraagbool",new STAttrMap().put("var", (v!=null?((StringTemplate)v.getTemplate()):null)));
			}

			else // 105:50: -> vraagint(var=$v.st)
			{
				retval.st = templateLib.getInstanceOf("vraagint",new STAttrMap().put("var", (v!=null?((StringTemplate)v.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vraagvar"


	public static class zegop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "zegop"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:108:1: zegop : (v= operand ) -> {b[1]}? zegchar(var=$v.st) -> {b[2]}? zegbool(var=$v.stlbl=lblNum()) -> zegint(var=$v.st);
	public final LiefCodeGenerator.zegop_return zegop() throws RecognitionException {
		LiefCodeGenerator.zegop_return retval = new LiefCodeGenerator.zegop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope v =null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:109:3: ( (v= operand ) -> {b[1]}? zegchar(var=$v.st) -> {b[2]}? zegbool(var=$v.stlbl=lblNum()) -> zegint(var=$v.st))
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:109:5: (v= operand )
			{
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:109:5: (v= operand )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefCodeGenerator.g:109:6: v= operand
			{
			pushFollow(FOLLOW_operand_in_zegop1782);
			v=operand();
			state._fsp--;

			}

			boolean[] b = type((v!=null?((LiefTree)v.start):null));
			// TEMPLATE REWRITE
			// 109:49: -> {b[1]}? zegchar(var=$v.st)
			if (b[1]) {
				retval.st = templateLib.getInstanceOf("zegchar",new STAttrMap().put("var", (v!=null?((StringTemplate)v.getTemplate()):null)));
			}

			else // 110:49: -> {b[2]}? zegbool(var=$v.stlbl=lblNum())
			if (b[2]) {
				retval.st = templateLib.getInstanceOf("zegbool",new STAttrMap().put("var", (v!=null?((StringTemplate)v.getTemplate()):null)).put("lbl", lblNum()));
			}

			else // 111:49: -> zegint(var=$v.st)
			{
				retval.st = templateLib.getInstanceOf("zegint",new STAttrMap().put("var", (v!=null?((StringTemplate)v.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zegop"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program87 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sentence_in_program93 = new BitSet(new long[]{0x001DD8DFA9C5D178L});
	public static final BitSet FOLLOW_declaration_in_sentence155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_sentence186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HARTJE_in_declaration226 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration230 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration234 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STEENTJE_in_declaration265 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration269 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_declaration273 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_command314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCommand_in_command334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileCommand_in_command354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyCommand_in_command371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLIJE_in_ifCommand395 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifCommand399 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DAN_in_ifCommand401 = new BitSet(new long[]{0x001DD8DFA9C5D170L});
	public static final BitSet FOLLOW_sentence_in_ifCommand406 = new BitSet(new long[]{0x001DD8DFA9C5D170L});
	public static final BitSet FOLLOW_ANDERS_in_ifCommand410 = new BitSet(new long[]{0x001DD8DFA9C5D170L});
	public static final BitSet FOLLOW_sentence_in_ifCommand415 = new BitSet(new long[]{0x001DD8DFA9C5D178L});
	public static final BitSet FOLLOW_LAAT_in_emptyCommand470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ZOLANG_in_whileCommand496 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileCommand500 = new BitSet(new long[]{0x001DD8DFA9C5D170L});
	public static final BitSet FOLLOW_sentence_in_whileCommand505 = new BitSet(new long[]{0x001DD8DFA9C5D178L});
	public static final BitSet FOLLOW_WORDT_in_expression556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_expression560 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression564 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATIEF_in_expression597 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression602 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POSITIEF_in_expression637 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression642 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NIET_in_expression679 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression688 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EN_in_expression727 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression738 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OF_in_expression775 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression786 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression790 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULTIPLY_in_expression823 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression828 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression832 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expression855 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression862 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression866 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULO_in_expression891 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression898 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression902 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression929 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression938 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression942 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MIN_in_expression969 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression979 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression983 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_KLEINST_in_expression1011 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1017 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression1021 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GROOTST_in_expression1049 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1055 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression1059 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_KLEINER_in_expression1087 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1093 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression1097 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GROTER_in_expression1125 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1132 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression1136 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ZOALS_in_expression1165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1173 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression1177 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ANDERS_in_expression1207 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1214 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression1218 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_compoundExpression_in_expression1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expression1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_compoundExpression1336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sentence_in_compoundExpression1341 = new BitSet(new long[]{0x001DD8DFA9C5D178L});
	public static final BitSet FOLLOW_NUMBER_in_operand1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1407 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand1411 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variable_in_operand1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMILEY_in_operand1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_operand1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ZEG_in_operand1526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_zegop_in_operand1533 = new BitSet(new long[]{0x0004C80808000108L});
	public static final BitSet FOLLOW_VRAAG_in_operand1557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_vraagvar_in_operand1562 = new BitSet(new long[]{0x0000400000000008L});
	public static final BitSet FOLLOW_VARIABLE_in_variable1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_vraagvar1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_zegop1782 = new BitSet(new long[]{0x0000000000000002L});
}
