// $ANTLR 3.5 C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g 2013-06-30 19:47:08

package lief.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class LiefParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LiefParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LiefParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LiefParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:65:1: program : ( sentence )* EOF -> ^( PROGRAM ( sentence )* ) ;
	public final LiefParser.program_return program() throws RecognitionException {
		LiefParser.program_return retval = new LiefParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope sentence1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_sentence=new RewriteRuleSubtreeStream(adaptor,"rule sentence");

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:66:5: ( ( sentence )* EOF -> ^( PROGRAM ( sentence )* ) )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:66:9: ( sentence )* EOF
			{
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:66:9: ( sentence )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= BEGIN && LA1_0 <= BLIJE)||LA1_0==CHARACTER||LA1_0==HARTJE||LA1_0==LAAT||LA1_0==LPAREN||(LA1_0 >= NEGATIEF && LA1_0 <= NUMBER)||LA1_0==POSITIEF||(LA1_0 >= SMILEY && LA1_0 <= STEENTJE)||(LA1_0 >= VARIABLE && LA1_0 <= VRAAG)||LA1_0==ZEG||LA1_0==ZOLANG) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:66:10: sentence
					{
					pushFollow(FOLLOW_sentence_in_program863);
					sentence1=sentence();
					state._fsp--;

					stream_sentence.add(sentence1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program867);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: sentence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:13: -> ^( PROGRAM ( sentence )* )
			{
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:67:17: ^( PROGRAM ( sentence )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:67:27: ( sentence )*
				while ( stream_sentence.hasNext() ) {
					adaptor.addChild(root_1, stream_sentence.nextTree());
				}
				stream_sentence.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class sentence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sentence"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:70:1: sentence : ( ( command | declaration ) PERIOD !) ;
	public final LiefParser.sentence_return sentence() throws RecognitionException {
		LiefParser.sentence_return retval = new LiefParser.sentence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD5=null;
		ParserRuleReturnScope command3 =null;
		ParserRuleReturnScope declaration4 =null;

		Object PERIOD5_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:71:5: ( ( ( command | declaration ) PERIOD !) )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:71:9: ( ( command | declaration ) PERIOD !)
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:71:9: ( ( command | declaration ) PERIOD !)
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:71:10: ( command | declaration ) PERIOD !
			{
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:71:10: ( command | declaration )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= BEGIN && LA2_0 <= BLIJE)||LA2_0==CHARACTER||LA2_0==LAAT||LA2_0==LPAREN||(LA2_0 >= NEGATIEF && LA2_0 <= NUMBER)||LA2_0==POSITIEF||LA2_0==SMILEY||(LA2_0 >= VARIABLE && LA2_0 <= VRAAG)||LA2_0==ZEG||LA2_0==ZOLANG) ) {
				alt2=1;
			}
			else if ( (LA2_0==HARTJE||LA2_0==STEENTJE) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:71:11: command
					{
					pushFollow(FOLLOW_command_in_sentence914);
					command3=command();
					state._fsp--;

					adaptor.addChild(root_0, command3.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:71:21: declaration
					{
					pushFollow(FOLLOW_declaration_in_sentence918);
					declaration4=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration4.getTree());

					}
					break;

			}

			PERIOD5=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_sentence921); 
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sentence"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:74:1: command : ( expression | ifCommand | emptyCommand | whileCommand );
	public final LiefParser.command_return command() throws RecognitionException {
		LiefParser.command_return retval = new LiefParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression6 =null;
		ParserRuleReturnScope ifCommand7 =null;
		ParserRuleReturnScope emptyCommand8 =null;
		ParserRuleReturnScope whileCommand9 =null;


		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:75:5: ( expression | ifCommand | emptyCommand | whileCommand )
			int alt3=4;
			switch ( input.LA(1) ) {
			case BEGIN:
			case CHARACTER:
			case LPAREN:
			case NEGATIEF:
			case NIET:
			case NUMBER:
			case POSITIEF:
			case SMILEY:
			case VARIABLE:
			case VRAAG:
			case ZEG:
				{
				alt3=1;
				}
				break;
			case BLIJE:
				{
				alt3=2;
				}
				break;
			case LAAT:
				{
				alt3=3;
				}
				break;
			case ZOLANG:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:75:9: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_command946);
					expression6=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression6.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:76:9: ifCommand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifCommand_in_command956);
					ifCommand7=ifCommand();
					state._fsp--;

					adaptor.addChild(root_0, ifCommand7.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:77:9: emptyCommand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_emptyCommand_in_command966);
					emptyCommand8=emptyCommand();
					state._fsp--;

					adaptor.addChild(root_0, emptyCommand8.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:78:9: whileCommand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileCommand_in_command976);
					whileCommand9=whileCommand();
					state._fsp--;

					adaptor.addChild(root_0, whileCommand9.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:81:1: declaration : ( HARTJE ^ IDENTIFIER IS ! EEN ! type | STEENTJE ^ IDENTIFIER WORDT ! expression );
	public final LiefParser.declaration_return declaration() throws RecognitionException {
		LiefParser.declaration_return retval = new LiefParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token HARTJE10=null;
		Token IDENTIFIER11=null;
		Token IS12=null;
		Token EEN13=null;
		Token STEENTJE15=null;
		Token IDENTIFIER16=null;
		Token WORDT17=null;
		ParserRuleReturnScope type14 =null;
		ParserRuleReturnScope expression18 =null;

		Object HARTJE10_tree=null;
		Object IDENTIFIER11_tree=null;
		Object IS12_tree=null;
		Object EEN13_tree=null;
		Object STEENTJE15_tree=null;
		Object IDENTIFIER16_tree=null;
		Object WORDT17_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:82:5: ( HARTJE ^ IDENTIFIER IS ! EEN ! type | STEENTJE ^ IDENTIFIER WORDT ! expression )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==HARTJE) ) {
				alt4=1;
			}
			else if ( (LA4_0==STEENTJE) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:82:9: HARTJE ^ IDENTIFIER IS ! EEN ! type
					{
					root_0 = (Object)adaptor.nil();


					HARTJE10=(Token)match(input,HARTJE,FOLLOW_HARTJE_in_declaration995); 
					HARTJE10_tree = (Object)adaptor.create(HARTJE10);
					root_0 = (Object)adaptor.becomeRoot(HARTJE10_tree, root_0);

					IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration998); 
					IDENTIFIER11_tree = (Object)adaptor.create(IDENTIFIER11);
					adaptor.addChild(root_0, IDENTIFIER11_tree);

					IS12=(Token)match(input,IS,FOLLOW_IS_in_declaration1000); 
					EEN13=(Token)match(input,EEN,FOLLOW_EEN_in_declaration1003); 
					pushFollow(FOLLOW_type_in_declaration1006);
					type14=type();
					state._fsp--;

					adaptor.addChild(root_0, type14.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:83:9: STEENTJE ^ IDENTIFIER WORDT ! expression
					{
					root_0 = (Object)adaptor.nil();


					STEENTJE15=(Token)match(input,STEENTJE,FOLLOW_STEENTJE_in_declaration1016); 
					STEENTJE15_tree = (Object)adaptor.create(STEENTJE15);
					root_0 = (Object)adaptor.becomeRoot(STEENTJE15_tree, root_0);

					IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration1019); 
					IDENTIFIER16_tree = (Object)adaptor.create(IDENTIFIER16);
					adaptor.addChild(root_0, IDENTIFIER16_tree);

					WORDT17=(Token)match(input,WORDT,FOLLOW_WORDT_in_declaration1021); 
					pushFollow(FOLLOW_expression_in_declaration1024);
					expression18=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression18.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class ifCommand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifCommand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:86:1: ifCommand : BLIJE ^ exprBin ( DAN ( sentence )+ ) ( ANDERS ( sentence )+ ) KLAAR !;
	public final LiefParser.ifCommand_return ifCommand() throws RecognitionException {
		LiefParser.ifCommand_return retval = new LiefParser.ifCommand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BLIJE19=null;
		Token DAN21=null;
		Token ANDERS23=null;
		Token KLAAR25=null;
		ParserRuleReturnScope exprBin20 =null;
		ParserRuleReturnScope sentence22 =null;
		ParserRuleReturnScope sentence24 =null;

		Object BLIJE19_tree=null;
		Object DAN21_tree=null;
		Object ANDERS23_tree=null;
		Object KLAAR25_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:87:5: ( BLIJE ^ exprBin ( DAN ( sentence )+ ) ( ANDERS ( sentence )+ ) KLAAR !)
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:87:9: BLIJE ^ exprBin ( DAN ( sentence )+ ) ( ANDERS ( sentence )+ ) KLAAR !
			{
			root_0 = (Object)adaptor.nil();


			BLIJE19=(Token)match(input,BLIJE,FOLLOW_BLIJE_in_ifCommand1047); 
			BLIJE19_tree = (Object)adaptor.create(BLIJE19);
			root_0 = (Object)adaptor.becomeRoot(BLIJE19_tree, root_0);

			pushFollow(FOLLOW_exprBin_in_ifCommand1050);
			exprBin20=exprBin();
			state._fsp--;

			adaptor.addChild(root_0, exprBin20.getTree());

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:87:24: ( DAN ( sentence )+ )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:87:25: DAN ( sentence )+
			{
			DAN21=(Token)match(input,DAN,FOLLOW_DAN_in_ifCommand1053); 
			DAN21_tree = (Object)adaptor.create(DAN21);
			adaptor.addChild(root_0, DAN21_tree);

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:87:29: ( sentence )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= BEGIN && LA5_0 <= BLIJE)||LA5_0==CHARACTER||LA5_0==HARTJE||LA5_0==LAAT||LA5_0==LPAREN||(LA5_0 >= NEGATIEF && LA5_0 <= NUMBER)||LA5_0==POSITIEF||(LA5_0 >= SMILEY && LA5_0 <= STEENTJE)||(LA5_0 >= VARIABLE && LA5_0 <= VRAAG)||LA5_0==ZEG||LA5_0==ZOLANG) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:87:29: sentence
					{
					pushFollow(FOLLOW_sentence_in_ifCommand1055);
					sentence22=sentence();
					state._fsp--;

					adaptor.addChild(root_0, sentence22.getTree());

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:87:40: ( ANDERS ( sentence )+ )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:87:41: ANDERS ( sentence )+
			{
			ANDERS23=(Token)match(input,ANDERS,FOLLOW_ANDERS_in_ifCommand1060); 
			ANDERS23_tree = (Object)adaptor.create(ANDERS23);
			adaptor.addChild(root_0, ANDERS23_tree);

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:87:48: ( sentence )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= BEGIN && LA6_0 <= BLIJE)||LA6_0==CHARACTER||LA6_0==HARTJE||LA6_0==LAAT||LA6_0==LPAREN||(LA6_0 >= NEGATIEF && LA6_0 <= NUMBER)||LA6_0==POSITIEF||(LA6_0 >= SMILEY && LA6_0 <= STEENTJE)||(LA6_0 >= VARIABLE && LA6_0 <= VRAAG)||LA6_0==ZEG||LA6_0==ZOLANG) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:87:48: sentence
					{
					pushFollow(FOLLOW_sentence_in_ifCommand1062);
					sentence24=sentence();
					state._fsp--;

					adaptor.addChild(root_0, sentence24.getTree());

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			KLAAR25=(Token)match(input,KLAAR,FOLLOW_KLAAR_in_ifCommand1066); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifCommand"


	public static class emptyCommand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "emptyCommand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:90:1: emptyCommand : LAAT ^ MAAR !;
	public final LiefParser.emptyCommand_return emptyCommand() throws RecognitionException {
		LiefParser.emptyCommand_return retval = new LiefParser.emptyCommand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LAAT26=null;
		Token MAAR27=null;

		Object LAAT26_tree=null;
		Object MAAR27_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:91:5: ( LAAT ^ MAAR !)
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:91:9: LAAT ^ MAAR !
			{
			root_0 = (Object)adaptor.nil();


			LAAT26=(Token)match(input,LAAT,FOLLOW_LAAT_in_emptyCommand1093); 
			LAAT26_tree = (Object)adaptor.create(LAAT26);
			root_0 = (Object)adaptor.becomeRoot(LAAT26_tree, root_0);

			MAAR27=(Token)match(input,MAAR,FOLLOW_MAAR_in_emptyCommand1096); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "emptyCommand"


	public static class whileCommand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileCommand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:94:1: whileCommand : ZOLANG ^ exprBin DAN ! ( sentence )+ KLAAR !;
	public final LiefParser.whileCommand_return whileCommand() throws RecognitionException {
		LiefParser.whileCommand_return retval = new LiefParser.whileCommand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ZOLANG28=null;
		Token DAN30=null;
		Token KLAAR32=null;
		ParserRuleReturnScope exprBin29 =null;
		ParserRuleReturnScope sentence31 =null;

		Object ZOLANG28_tree=null;
		Object DAN30_tree=null;
		Object KLAAR32_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:95:5: ( ZOLANG ^ exprBin DAN ! ( sentence )+ KLAAR !)
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:95:9: ZOLANG ^ exprBin DAN ! ( sentence )+ KLAAR !
			{
			root_0 = (Object)adaptor.nil();


			ZOLANG28=(Token)match(input,ZOLANG,FOLLOW_ZOLANG_in_whileCommand1120); 
			ZOLANG28_tree = (Object)adaptor.create(ZOLANG28);
			root_0 = (Object)adaptor.becomeRoot(ZOLANG28_tree, root_0);

			pushFollow(FOLLOW_exprBin_in_whileCommand1123);
			exprBin29=exprBin();
			state._fsp--;

			adaptor.addChild(root_0, exprBin29.getTree());

			DAN30=(Token)match(input,DAN,FOLLOW_DAN_in_whileCommand1125); 
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:95:30: ( sentence )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= BEGIN && LA7_0 <= BLIJE)||LA7_0==CHARACTER||LA7_0==HARTJE||LA7_0==LAAT||LA7_0==LPAREN||(LA7_0 >= NEGATIEF && LA7_0 <= NUMBER)||LA7_0==POSITIEF||(LA7_0 >= SMILEY && LA7_0 <= STEENTJE)||(LA7_0 >= VARIABLE && LA7_0 <= VRAAG)||LA7_0==ZEG||LA7_0==ZOLANG) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:95:30: sentence
					{
					pushFollow(FOLLOW_sentence_in_whileCommand1128);
					sentence31=sentence();
					state._fsp--;

					adaptor.addChild(root_0, sentence31.getTree());

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			KLAAR32=(Token)match(input,KLAAR,FOLLOW_KLAAR_in_whileCommand1131); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileCommand"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:99:1: expression : exprBin ( WORDT ^ expression )? ;
	public final LiefParser.expression_return expression() throws RecognitionException {
		LiefParser.expression_return retval = new LiefParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORDT34=null;
		ParserRuleReturnScope exprBin33 =null;
		ParserRuleReturnScope expression35 =null;

		Object WORDT34_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:100:5: ( exprBin ( WORDT ^ expression )? )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:100:8: exprBin ( WORDT ^ expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprBin_in_expression1157);
			exprBin33=exprBin();
			state._fsp--;

			adaptor.addChild(root_0, exprBin33.getTree());

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:100:16: ( WORDT ^ expression )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==WORDT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:100:17: WORDT ^ expression
					{
					WORDT34=(Token)match(input,WORDT,FOLLOW_WORDT_in_expression1160); 
					WORDT34_tree = (Object)adaptor.create(WORDT34);
					root_0 = (Object)adaptor.becomeRoot(WORDT34_tree, root_0);

					pushFollow(FOLLOW_expression_in_expression1163);
					expression35=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression35.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class exprBin_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBin"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:103:1: exprBin : exprComp ( ( EN ^| OF ^) exprComp )* ;
	public final LiefParser.exprBin_return exprBin() throws RecognitionException {
		LiefParser.exprBin_return retval = new LiefParser.exprBin_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EN37=null;
		Token OF38=null;
		ParserRuleReturnScope exprComp36 =null;
		ParserRuleReturnScope exprComp39 =null;

		Object EN37_tree=null;
		Object OF38_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:104:5: ( exprComp ( ( EN ^| OF ^) exprComp )* )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:104:7: exprComp ( ( EN ^| OF ^) exprComp )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprComp_in_exprBin1186);
			exprComp36=exprComp();
			state._fsp--;

			adaptor.addChild(root_0, exprComp36.getTree());

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:104:16: ( ( EN ^| OF ^) exprComp )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==EN||LA10_0==OF) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:104:17: ( EN ^| OF ^) exprComp
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:104:17: ( EN ^| OF ^)
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EN) ) {
						alt9=1;
					}
					else if ( (LA9_0==OF) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:104:18: EN ^
							{
							EN37=(Token)match(input,EN,FOLLOW_EN_in_exprBin1190); 
							EN37_tree = (Object)adaptor.create(EN37);
							root_0 = (Object)adaptor.becomeRoot(EN37_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:104:24: OF ^
							{
							OF38=(Token)match(input,OF,FOLLOW_OF_in_exprBin1195); 
							OF38_tree = (Object)adaptor.create(OF38);
							root_0 = (Object)adaptor.becomeRoot(OF38_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_exprComp_in_exprBin1199);
					exprComp39=exprComp();
					state._fsp--;

					adaptor.addChild(root_0, exprComp39.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprBin"


	public static class exprComp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprComp"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:107:1: exprComp : exprAddSub ( binop ^ exprAddSub )* ;
	public final LiefParser.exprComp_return exprComp() throws RecognitionException {
		LiefParser.exprComp_return retval = new LiefParser.exprComp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprAddSub40 =null;
		ParserRuleReturnScope binop41 =null;
		ParserRuleReturnScope exprAddSub42 =null;


		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:108:3: ( exprAddSub ( binop ^ exprAddSub )* )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:108:5: exprAddSub ( binop ^ exprAddSub )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprAddSub_in_exprComp1222);
			exprAddSub40=exprAddSub();
			state._fsp--;

			adaptor.addChild(root_0, exprAddSub40.getTree());

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:108:16: ( binop ^ exprAddSub )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==ANDERS||(LA11_0 >= GROOTST && LA11_0 <= GROTER)||(LA11_0 >= KLEINER && LA11_0 <= KLEINST)||LA11_0==ZOALS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:108:17: binop ^ exprAddSub
					{
					pushFollow(FOLLOW_binop_in_exprComp1225);
					binop41=binop();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(binop41.getTree(), root_0);
					pushFollow(FOLLOW_exprAddSub_in_exprComp1228);
					exprAddSub42=exprAddSub();
					state._fsp--;

					adaptor.addChild(root_0, exprAddSub42.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprComp"


	public static class binop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binop"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:111:1: binop : ( KLEINST ^| GROOTST ^| KLEINER ^| GROTER ^| ZOALS ^| ANDERS ^ DAN !);
	public final LiefParser.binop_return binop() throws RecognitionException {
		LiefParser.binop_return retval = new LiefParser.binop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token KLEINST43=null;
		Token GROOTST44=null;
		Token KLEINER45=null;
		Token GROTER46=null;
		Token ZOALS47=null;
		Token ANDERS48=null;
		Token DAN49=null;

		Object KLEINST43_tree=null;
		Object GROOTST44_tree=null;
		Object KLEINER45_tree=null;
		Object GROTER46_tree=null;
		Object ZOALS47_tree=null;
		Object ANDERS48_tree=null;
		Object DAN49_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:112:3: ( KLEINST ^| GROOTST ^| KLEINER ^| GROTER ^| ZOALS ^| ANDERS ^ DAN !)
			int alt12=6;
			switch ( input.LA(1) ) {
			case KLEINST:
				{
				alt12=1;
				}
				break;
			case GROOTST:
				{
				alt12=2;
				}
				break;
			case KLEINER:
				{
				alt12=3;
				}
				break;
			case GROTER:
				{
				alt12=4;
				}
				break;
			case ZOALS:
				{
				alt12=5;
				}
				break;
			case ANDERS:
				{
				alt12=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:112:5: KLEINST ^
					{
					root_0 = (Object)adaptor.nil();


					KLEINST43=(Token)match(input,KLEINST,FOLLOW_KLEINST_in_binop1245); 
					KLEINST43_tree = (Object)adaptor.create(KLEINST43);
					root_0 = (Object)adaptor.becomeRoot(KLEINST43_tree, root_0);

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:113:5: GROOTST ^
					{
					root_0 = (Object)adaptor.nil();


					GROOTST44=(Token)match(input,GROOTST,FOLLOW_GROOTST_in_binop1252); 
					GROOTST44_tree = (Object)adaptor.create(GROOTST44);
					root_0 = (Object)adaptor.becomeRoot(GROOTST44_tree, root_0);

					}
					break;
				case 3 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:114:5: KLEINER ^
					{
					root_0 = (Object)adaptor.nil();


					KLEINER45=(Token)match(input,KLEINER,FOLLOW_KLEINER_in_binop1259); 
					KLEINER45_tree = (Object)adaptor.create(KLEINER45);
					root_0 = (Object)adaptor.becomeRoot(KLEINER45_tree, root_0);

					}
					break;
				case 4 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:115:5: GROTER ^
					{
					root_0 = (Object)adaptor.nil();


					GROTER46=(Token)match(input,GROTER,FOLLOW_GROTER_in_binop1266); 
					GROTER46_tree = (Object)adaptor.create(GROTER46);
					root_0 = (Object)adaptor.becomeRoot(GROTER46_tree, root_0);

					}
					break;
				case 5 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:116:5: ZOALS ^
					{
					root_0 = (Object)adaptor.nil();


					ZOALS47=(Token)match(input,ZOALS,FOLLOW_ZOALS_in_binop1274); 
					ZOALS47_tree = (Object)adaptor.create(ZOALS47);
					root_0 = (Object)adaptor.becomeRoot(ZOALS47_tree, root_0);

					}
					break;
				case 6 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:117:5: ANDERS ^ DAN !
					{
					root_0 = (Object)adaptor.nil();


					ANDERS48=(Token)match(input,ANDERS,FOLLOW_ANDERS_in_binop1282); 
					ANDERS48_tree = (Object)adaptor.create(ANDERS48);
					root_0 = (Object)adaptor.becomeRoot(ANDERS48_tree, root_0);

					DAN49=(Token)match(input,DAN,FOLLOW_DAN_in_binop1285); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binop"


	public static class exprAddSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprAddSub"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:120:1: exprAddSub : exprModulo ( ( PLUS ^| MIN ^) exprModulo )* ;
	public final LiefParser.exprAddSub_return exprAddSub() throws RecognitionException {
		LiefParser.exprAddSub_return retval = new LiefParser.exprAddSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS51=null;
		Token MIN52=null;
		ParserRuleReturnScope exprModulo50 =null;
		ParserRuleReturnScope exprModulo53 =null;

		Object PLUS51_tree=null;
		Object MIN52_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:121:3: ( exprModulo ( ( PLUS ^| MIN ^) exprModulo )* )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:121:5: exprModulo ( ( PLUS ^| MIN ^) exprModulo )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprModulo_in_exprAddSub1303);
			exprModulo50=exprModulo();
			state._fsp--;

			adaptor.addChild(root_0, exprModulo50.getTree());

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:121:16: ( ( PLUS ^| MIN ^) exprModulo )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==MIN||LA14_0==PLUS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:121:17: ( PLUS ^| MIN ^) exprModulo
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:121:17: ( PLUS ^| MIN ^)
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==PLUS) ) {
						alt13=1;
					}
					else if ( (LA13_0==MIN) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:121:18: PLUS ^
							{
							PLUS51=(Token)match(input,PLUS,FOLLOW_PLUS_in_exprAddSub1307); 
							PLUS51_tree = (Object)adaptor.create(PLUS51);
							root_0 = (Object)adaptor.becomeRoot(PLUS51_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:121:26: MIN ^
							{
							MIN52=(Token)match(input,MIN,FOLLOW_MIN_in_exprAddSub1312); 
							MIN52_tree = (Object)adaptor.create(MIN52);
							root_0 = (Object)adaptor.becomeRoot(MIN52_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_exprModulo_in_exprAddSub1316);
					exprModulo53=exprModulo();
					state._fsp--;

					adaptor.addChild(root_0, exprModulo53.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprAddSub"


	public static class exprModulo_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprModulo"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:124:1: exprModulo : muldiv ( ( MODULO ^) muldiv )* ;
	public final LiefParser.exprModulo_return exprModulo() throws RecognitionException {
		LiefParser.exprModulo_return retval = new LiefParser.exprModulo_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MODULO55=null;
		ParserRuleReturnScope muldiv54 =null;
		ParserRuleReturnScope muldiv56 =null;

		Object MODULO55_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:125:3: ( muldiv ( ( MODULO ^) muldiv )* )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:125:5: muldiv ( ( MODULO ^) muldiv )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_muldiv_in_exprModulo1334);
			muldiv54=muldiv();
			state._fsp--;

			adaptor.addChild(root_0, muldiv54.getTree());

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:125:12: ( ( MODULO ^) muldiv )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==MODULO) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:125:13: ( MODULO ^) muldiv
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:125:13: ( MODULO ^)
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:125:14: MODULO ^
					{
					MODULO55=(Token)match(input,MODULO,FOLLOW_MODULO_in_exprModulo1338); 
					MODULO55_tree = (Object)adaptor.create(MODULO55);
					root_0 = (Object)adaptor.becomeRoot(MODULO55_tree, root_0);

					}

					pushFollow(FOLLOW_muldiv_in_exprModulo1342);
					muldiv56=muldiv();
					state._fsp--;

					adaptor.addChild(root_0, muldiv56.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprModulo"


	public static class muldiv_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "muldiv"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:128:1: muldiv : unary ( ( MULTIPLY ^| ( DIVIDE ^ BY !) ) unary )* ;
	public final LiefParser.muldiv_return muldiv() throws RecognitionException {
		LiefParser.muldiv_return retval = new LiefParser.muldiv_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTIPLY58=null;
		Token DIVIDE59=null;
		Token BY60=null;
		ParserRuleReturnScope unary57 =null;
		ParserRuleReturnScope unary61 =null;

		Object MULTIPLY58_tree=null;
		Object DIVIDE59_tree=null;
		Object BY60_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:129:3: ( unary ( ( MULTIPLY ^| ( DIVIDE ^ BY !) ) unary )* )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:129:5: unary ( ( MULTIPLY ^| ( DIVIDE ^ BY !) ) unary )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unary_in_muldiv1357);
			unary57=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary57.getTree());

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:129:11: ( ( MULTIPLY ^| ( DIVIDE ^ BY !) ) unary )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==DIVIDE||LA17_0==MULTIPLY) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:129:12: ( MULTIPLY ^| ( DIVIDE ^ BY !) ) unary
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:129:12: ( MULTIPLY ^| ( DIVIDE ^ BY !) )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==MULTIPLY) ) {
						alt16=1;
					}
					else if ( (LA16_0==DIVIDE) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:129:13: MULTIPLY ^
							{
							MULTIPLY58=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_muldiv1361); 
							MULTIPLY58_tree = (Object)adaptor.create(MULTIPLY58);
							root_0 = (Object)adaptor.becomeRoot(MULTIPLY58_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:129:25: ( DIVIDE ^ BY !)
							{
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:129:25: ( DIVIDE ^ BY !)
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:129:26: DIVIDE ^ BY !
							{
							DIVIDE59=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_muldiv1367); 
							DIVIDE59_tree = (Object)adaptor.create(DIVIDE59);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE59_tree, root_0);

							BY60=(Token)match(input,BY,FOLLOW_BY_in_muldiv1370); 
							}

							}
							break;

					}

					pushFollow(FOLLOW_unary_in_muldiv1375);
					unary61=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary61.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "muldiv"


	public static class unary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:132:1: unary : ( ( NEGATIEF ^| POSITIEF ^| NIET ^) unary | operand );
	public final LiefParser.unary_return unary() throws RecognitionException {
		LiefParser.unary_return retval = new LiefParser.unary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEGATIEF62=null;
		Token POSITIEF63=null;
		Token NIET64=null;
		ParserRuleReturnScope unary65 =null;
		ParserRuleReturnScope operand66 =null;

		Object NEGATIEF62_tree=null;
		Object POSITIEF63_tree=null;
		Object NIET64_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:133:3: ( ( NEGATIEF ^| POSITIEF ^| NIET ^) unary | operand )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( ((LA19_0 >= NEGATIEF && LA19_0 <= NIET)||LA19_0==POSITIEF) ) {
				alt19=1;
			}
			else if ( (LA19_0==BEGIN||LA19_0==CHARACTER||LA19_0==LPAREN||LA19_0==NUMBER||LA19_0==SMILEY||(LA19_0 >= VARIABLE && LA19_0 <= VRAAG)||LA19_0==ZEG) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:133:5: ( NEGATIEF ^| POSITIEF ^| NIET ^) unary
					{
					root_0 = (Object)adaptor.nil();


					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:133:5: ( NEGATIEF ^| POSITIEF ^| NIET ^)
					int alt18=3;
					switch ( input.LA(1) ) {
					case NEGATIEF:
						{
						alt18=1;
						}
						break;
					case POSITIEF:
						{
						alt18=2;
						}
						break;
					case NIET:
						{
						alt18=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:133:6: NEGATIEF ^
							{
							NEGATIEF62=(Token)match(input,NEGATIEF,FOLLOW_NEGATIEF_in_unary1391); 
							NEGATIEF62_tree = (Object)adaptor.create(NEGATIEF62);
							root_0 = (Object)adaptor.becomeRoot(NEGATIEF62_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:133:18: POSITIEF ^
							{
							POSITIEF63=(Token)match(input,POSITIEF,FOLLOW_POSITIEF_in_unary1396); 
							POSITIEF63_tree = (Object)adaptor.create(POSITIEF63);
							root_0 = (Object)adaptor.becomeRoot(POSITIEF63_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:133:30: NIET ^
							{
							NIET64=(Token)match(input,NIET,FOLLOW_NIET_in_unary1401); 
							NIET64_tree = (Object)adaptor.create(NIET64);
							root_0 = (Object)adaptor.becomeRoot(NIET64_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unary_in_unary1405);
					unary65=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary65.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:134:5: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_unary1411);
					operand66=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand66.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:137:1: operand : ( NUMBER | LPAREN ^ expression RPAREN !| VARIABLE | SMILEY | CHARACTER | zegExpr | vraagExpr | BEGIN ^ ( sentence )+ KLAAR !);
	public final LiefParser.operand_return operand() throws RecognitionException {
		LiefParser.operand_return retval = new LiefParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER67=null;
		Token LPAREN68=null;
		Token RPAREN70=null;
		Token VARIABLE71=null;
		Token SMILEY72=null;
		Token CHARACTER73=null;
		Token BEGIN76=null;
		Token KLAAR78=null;
		ParserRuleReturnScope expression69 =null;
		ParserRuleReturnScope zegExpr74 =null;
		ParserRuleReturnScope vraagExpr75 =null;
		ParserRuleReturnScope sentence77 =null;

		Object NUMBER67_tree=null;
		Object LPAREN68_tree=null;
		Object RPAREN70_tree=null;
		Object VARIABLE71_tree=null;
		Object SMILEY72_tree=null;
		Object CHARACTER73_tree=null;
		Object BEGIN76_tree=null;
		Object KLAAR78_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:138:5: ( NUMBER | LPAREN ^ expression RPAREN !| VARIABLE | SMILEY | CHARACTER | zegExpr | vraagExpr | BEGIN ^ ( sentence )+ KLAAR !)
			int alt21=8;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt21=1;
				}
				break;
			case LPAREN:
				{
				alt21=2;
				}
				break;
			case VARIABLE:
				{
				alt21=3;
				}
				break;
			case SMILEY:
				{
				alt21=4;
				}
				break;
			case CHARACTER:
				{
				alt21=5;
				}
				break;
			case ZEG:
				{
				alt21=6;
				}
				break;
			case VRAAG:
				{
				alt21=7;
				}
				break;
			case BEGIN:
				{
				alt21=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:138:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER67=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1428); 
					NUMBER67_tree = (Object)adaptor.create(NUMBER67);
					adaptor.addChild(root_0, NUMBER67_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:139:9: LPAREN ^ expression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1438); 
					LPAREN68_tree = (Object)adaptor.create(LPAREN68);
					root_0 = (Object)adaptor.becomeRoot(LPAREN68_tree, root_0);

					pushFollow(FOLLOW_expression_in_operand1441);
					expression69=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression69.getTree());

					RPAREN70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1443); 
					}
					break;
				case 3 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:140:9: VARIABLE
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE71=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_operand1454); 
					VARIABLE71_tree = (Object)adaptor.create(VARIABLE71);
					adaptor.addChild(root_0, VARIABLE71_tree);

					}
					break;
				case 4 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:141:9: SMILEY
					{
					root_0 = (Object)adaptor.nil();


					SMILEY72=(Token)match(input,SMILEY,FOLLOW_SMILEY_in_operand1464); 
					SMILEY72_tree = (Object)adaptor.create(SMILEY72);
					adaptor.addChild(root_0, SMILEY72_tree);

					}
					break;
				case 5 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:142:9: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER73=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_operand1474); 
					CHARACTER73_tree = (Object)adaptor.create(CHARACTER73);
					adaptor.addChild(root_0, CHARACTER73_tree);

					}
					break;
				case 6 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:143:9: zegExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zegExpr_in_operand1484);
					zegExpr74=zegExpr();
					state._fsp--;

					adaptor.addChild(root_0, zegExpr74.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:144:9: vraagExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_vraagExpr_in_operand1494);
					vraagExpr75=vraagExpr();
					state._fsp--;

					adaptor.addChild(root_0, vraagExpr75.getTree());

					}
					break;
				case 8 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:145:9: BEGIN ^ ( sentence )+ KLAAR !
					{
					root_0 = (Object)adaptor.nil();


					BEGIN76=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_operand1504); 
					BEGIN76_tree = (Object)adaptor.create(BEGIN76);
					root_0 = (Object)adaptor.becomeRoot(BEGIN76_tree, root_0);

					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:145:16: ( sentence )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= BEGIN && LA20_0 <= BLIJE)||LA20_0==CHARACTER||LA20_0==HARTJE||LA20_0==LAAT||LA20_0==LPAREN||(LA20_0 >= NEGATIEF && LA20_0 <= NUMBER)||LA20_0==POSITIEF||(LA20_0 >= SMILEY && LA20_0 <= STEENTJE)||(LA20_0 >= VARIABLE && LA20_0 <= VRAAG)||LA20_0==ZEG||LA20_0==ZOLANG) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:145:16: sentence
							{
							pushFollow(FOLLOW_sentence_in_operand1507);
							sentence77=sentence();
							state._fsp--;

							adaptor.addChild(root_0, sentence77.getTree());

							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					KLAAR78=(Token)match(input,KLAAR,FOLLOW_KLAAR_in_operand1510); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class zegExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zegExpr"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:148:1: zegExpr : ZEG ^ LPAREN ! operand ( EN ! operand )* RPAREN !;
	public final LiefParser.zegExpr_return zegExpr() throws RecognitionException {
		LiefParser.zegExpr_return retval = new LiefParser.zegExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ZEG79=null;
		Token LPAREN80=null;
		Token EN82=null;
		Token RPAREN84=null;
		ParserRuleReturnScope operand81 =null;
		ParserRuleReturnScope operand83 =null;

		Object ZEG79_tree=null;
		Object LPAREN80_tree=null;
		Object EN82_tree=null;
		Object RPAREN84_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:149:5: ( ZEG ^ LPAREN ! operand ( EN ! operand )* RPAREN !)
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:149:7: ZEG ^ LPAREN ! operand ( EN ! operand )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			ZEG79=(Token)match(input,ZEG,FOLLOW_ZEG_in_zegExpr1533); 
			ZEG79_tree = (Object)adaptor.create(ZEG79);
			root_0 = (Object)adaptor.becomeRoot(ZEG79_tree, root_0);

			LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zegExpr1536); 
			pushFollow(FOLLOW_operand_in_zegExpr1539);
			operand81=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand81.getTree());

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:149:28: ( EN ! operand )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==EN) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:149:29: EN ! operand
					{
					EN82=(Token)match(input,EN,FOLLOW_EN_in_zegExpr1542); 
					pushFollow(FOLLOW_operand_in_zegExpr1545);
					operand83=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand83.getTree());

					}
					break;

				default :
					break loop22;
				}
			}

			RPAREN84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zegExpr1549); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zegExpr"


	public static class vraagExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vraagExpr"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:152:1: vraagExpr : VRAAG ^ LPAREN ! VARIABLE ( EN ! VARIABLE )* RPAREN !;
	public final LiefParser.vraagExpr_return vraagExpr() throws RecognitionException {
		LiefParser.vraagExpr_return retval = new LiefParser.vraagExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VRAAG85=null;
		Token LPAREN86=null;
		Token VARIABLE87=null;
		Token EN88=null;
		Token VARIABLE89=null;
		Token RPAREN90=null;

		Object VRAAG85_tree=null;
		Object LPAREN86_tree=null;
		Object VARIABLE87_tree=null;
		Object EN88_tree=null;
		Object VARIABLE89_tree=null;
		Object RPAREN90_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:153:5: ( VRAAG ^ LPAREN ! VARIABLE ( EN ! VARIABLE )* RPAREN !)
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:153:7: VRAAG ^ LPAREN ! VARIABLE ( EN ! VARIABLE )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			VRAAG85=(Token)match(input,VRAAG,FOLLOW_VRAAG_in_vraagExpr1571); 
			VRAAG85_tree = (Object)adaptor.create(VRAAG85);
			root_0 = (Object)adaptor.becomeRoot(VRAAG85_tree, root_0);

			LPAREN86=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_vraagExpr1574); 
			VARIABLE87=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vraagExpr1577); 
			VARIABLE87_tree = (Object)adaptor.create(VARIABLE87);
			adaptor.addChild(root_0, VARIABLE87_tree);

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:153:31: ( EN ! VARIABLE )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==EN) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:153:32: EN ! VARIABLE
					{
					EN88=(Token)match(input,EN,FOLLOW_EN_in_vraagExpr1580); 
					VARIABLE89=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vraagExpr1583); 
					VARIABLE89_tree = (Object)adaptor.create(VARIABLE89);
					adaptor.addChild(root_0, VARIABLE89_tree);

					}
					break;

				default :
					break loop23;
				}
			}

			RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_vraagExpr1587); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vraagExpr"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:156:1: type : IDENTIFIER ;
	public final LiefParser.type_return type() throws RecognitionException {
		LiefParser.type_return retval = new LiefParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER91=null;

		Object IDENTIFIER91_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:157:5: ( IDENTIFIER )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:157:9: IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER91=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type1607); 
			IDENTIFIER91_tree = (Object)adaptor.create(IDENTIFIER91);
			adaptor.addChild(root_0, IDENTIFIER91_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_sentence_in_program863 = new BitSet(new long[]{0x0014D88E09040160L});
	public static final BitSet FOLLOW_EOF_in_program867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_sentence914 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_declaration_in_sentence918 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_PERIOD_in_sentence921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_command946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCommand_in_command956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyCommand_in_command966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileCommand_in_command976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HARTJE_in_declaration995 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration998 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IS_in_declaration1000 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_EEN_in_declaration1003 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_type_in_declaration1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STEENTJE_in_declaration1016 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration1019 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_WORDT_in_declaration1021 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_expression_in_declaration1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLIJE_in_ifCommand1047 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_exprBin_in_ifCommand1050 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DAN_in_ifCommand1053 = new BitSet(new long[]{0x0014D88E09040160L});
	public static final BitSet FOLLOW_sentence_in_ifCommand1055 = new BitSet(new long[]{0x0014D88E09040170L});
	public static final BitSet FOLLOW_ANDERS_in_ifCommand1060 = new BitSet(new long[]{0x0014D88E09040160L});
	public static final BitSet FOLLOW_sentence_in_ifCommand1062 = new BitSet(new long[]{0x0014D88E09240160L});
	public static final BitSet FOLLOW_KLAAR_in_ifCommand1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAAT_in_emptyCommand1093 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_MAAR_in_emptyCommand1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ZOLANG_in_whileCommand1120 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_exprBin_in_whileCommand1123 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DAN_in_whileCommand1125 = new BitSet(new long[]{0x0014D88E09040160L});
	public static final BitSet FOLLOW_sentence_in_whileCommand1128 = new BitSet(new long[]{0x0014D88E09240160L});
	public static final BitSet FOLLOW_KLAAR_in_whileCommand1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBin_in_expression1157 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_WORDT_in_expression1160 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_expression_in_expression1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprComp_in_exprBin1186 = new BitSet(new long[]{0x0000001000004002L});
	public static final BitSet FOLLOW_EN_in_exprBin1190 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_OF_in_exprBin1195 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_exprComp_in_exprBin1199 = new BitSet(new long[]{0x0000001000004002L});
	public static final BitSet FOLLOW_exprAddSub_in_exprComp1222 = new BitSet(new long[]{0x0008000000C18012L});
	public static final BitSet FOLLOW_binop_in_exprComp1225 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_exprAddSub_in_exprComp1228 = new BitSet(new long[]{0x0008000000C18012L});
	public static final BitSet FOLLOW_KLEINST_in_binop1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROOTST_in_binop1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KLEINER_in_binop1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROTER_in_binop1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ZOALS_in_binop1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANDERS_in_binop1282 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DAN_in_binop1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprModulo_in_exprAddSub1303 = new BitSet(new long[]{0x0000004020000002L});
	public static final BitSet FOLLOW_PLUS_in_exprAddSub1307 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_MIN_in_exprAddSub1312 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_exprModulo_in_exprAddSub1316 = new BitSet(new long[]{0x0000004020000002L});
	public static final BitSet FOLLOW_muldiv_in_exprModulo1334 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_MODULO_in_exprModulo1338 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_muldiv_in_exprModulo1342 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_unary_in_muldiv1357 = new BitSet(new long[]{0x0000000100001002L});
	public static final BitSet FOLLOW_MULTIPLY_in_muldiv1361 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_DIVIDE_in_muldiv1367 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BY_in_muldiv1370 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_unary_in_muldiv1375 = new BitSet(new long[]{0x0000000100001002L});
	public static final BitSet FOLLOW_NEGATIEF_in_unary1391 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_POSITIEF_in_unary1396 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_NIET_in_unary1401 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_unary_in_unary1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_unary1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1438 = new BitSet(new long[]{0x0004C88E08000120L});
	public static final BitSet FOLLOW_expression_in_operand1441 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_operand1454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMILEY_in_operand1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_operand1474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zegExpr_in_operand1484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vraagExpr_in_operand1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_operand1504 = new BitSet(new long[]{0x0014D88E09040160L});
	public static final BitSet FOLLOW_sentence_in_operand1507 = new BitSet(new long[]{0x0014D88E09240160L});
	public static final BitSet FOLLOW_KLAAR_in_operand1510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ZEG_in_zegExpr1533 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LPAREN_in_zegExpr1536 = new BitSet(new long[]{0x0004C80808000120L});
	public static final BitSet FOLLOW_operand_in_zegExpr1539 = new BitSet(new long[]{0x0000040000004000L});
	public static final BitSet FOLLOW_EN_in_zegExpr1542 = new BitSet(new long[]{0x0004C80808000120L});
	public static final BitSet FOLLOW_operand_in_zegExpr1545 = new BitSet(new long[]{0x0000040000004000L});
	public static final BitSet FOLLOW_RPAREN_in_zegExpr1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VRAAG_in_vraagExpr1571 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LPAREN_in_vraagExpr1574 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_VARIABLE_in_vraagExpr1577 = new BitSet(new long[]{0x0000040000004000L});
	public static final BitSet FOLLOW_EN_in_vraagExpr1580 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_VARIABLE_in_vraagExpr1583 = new BitSet(new long[]{0x0000040000004000L});
	public static final BitSet FOLLOW_RPAREN_in_vraagExpr1587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type1607 = new BitSet(new long[]{0x0000000000000002L});
}
