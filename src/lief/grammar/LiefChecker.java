// $ANTLR 3.5 C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g 2013-06-30 19:47:09

package lief.grammar;

import lief.grammar.symboltable.*;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class LiefChecker extends TreeParser {
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


	public LiefChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public LiefChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LiefChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g"; }


	    CheckerFunc cf = new CheckerFunc();


	public static class program_return extends TreeRuleReturnScope {
		LiefTree tree;
		@Override
		public LiefTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:35:1: program : ^( PROGRAM ( sentence )+ ) ;
	public final LiefChecker.program_return program() throws RecognitionException {
		LiefChecker.program_return retval = new LiefChecker.program_return();
		retval.start = input.LT(1);

		LiefTree root_0 = null;

		LiefTree _first_0 = null;
		LiefTree _last = null;


		LiefTree PROGRAM1=null;
		TreeRuleReturnScope sentence2 =null;

		LiefTree PROGRAM1_tree=null;


		  cf.openScope();

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:42:5: ( ^( PROGRAM ( sentence )+ ) )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:42:9: ^( PROGRAM ( sentence )+ )
			{
			_last = (LiefTree)input.LT(1);
			{
			LiefTree _save_last_1 = _last;
			LiefTree _first_1 = null;
			_last = (LiefTree)input.LT(1);
			PROGRAM1=(LiefTree)match(input,PROGRAM,FOLLOW_PROGRAM_in_program122); 

			if ( _first_0==null ) _first_0 = PROGRAM1;
			match(input, Token.DOWN, null); 
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:42:19: ( sentence )+
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
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:42:19: sentence
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_sentence_in_program124);
					sentence2=sentence();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)sentence2.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

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
			_last = _save_last_1;
			}


			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (LiefTree)adaptor.getParent(retval.tree);

			}


			  cf.closeScope();

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class sentence_return extends TreeRuleReturnScope {
		LiefTree tree;
		@Override
		public LiefTree getTree() { return tree; }
	};


	// $ANTLR start "sentence"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:45:1: sentence : ( command | declaration );
	public final LiefChecker.sentence_return sentence() throws RecognitionException {
		LiefChecker.sentence_return retval = new LiefChecker.sentence_return();
		retval.start = input.LT(1);

		LiefTree root_0 = null;

		LiefTree _first_0 = null;
		LiefTree _last = null;


		TreeRuleReturnScope command3 =null;
		TreeRuleReturnScope declaration4 =null;


		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:46:5: ( command | declaration )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= ANDERS && LA2_0 <= BLIJE)||LA2_0==CHARACTER||LA2_0==DIVIDE||(LA2_0 >= EN && LA2_0 <= GROTER)||(LA2_0 >= KLEINER && LA2_0 <= LAAT)||LA2_0==LPAREN||LA2_0==MIN||(LA2_0 >= MODULO && LA2_0 <= OF)||(LA2_0 >= PLUS && LA2_0 <= POSITIEF)||LA2_0==SMILEY||(LA2_0 >= VARIABLE && LA2_0 <= WORDT)||(LA2_0 >= ZEG && LA2_0 <= ZOLANG)) ) {
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
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:46:9: command
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_command_in_sentence149);
					command3=command();
					state._fsp--;

					 
					if ( _first_0==null ) _first_0 = (LiefTree)command3.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:47:9: declaration
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_declaration_in_sentence159);
					declaration4=declaration();
					state._fsp--;

					 
					if ( _first_0==null ) _first_0 = (LiefTree)declaration4.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sentence"


	public static class command_return extends TreeRuleReturnScope {
		LiefTree tree;
		@Override
		public LiefTree getTree() { return tree; }
	};


	// $ANTLR start "command"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:50:1: command : ( expression | ifCommand | whileCommand | emptyCommand );
	public final LiefChecker.command_return command() throws RecognitionException {
		LiefChecker.command_return retval = new LiefChecker.command_return();
		retval.start = input.LT(1);

		LiefTree root_0 = null;

		LiefTree _first_0 = null;
		LiefTree _last = null;


		TreeRuleReturnScope expression5 =null;
		TreeRuleReturnScope ifCommand6 =null;
		TreeRuleReturnScope whileCommand7 =null;
		TreeRuleReturnScope emptyCommand8 =null;


		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:51:5: ( expression | ifCommand | whileCommand | emptyCommand )
			int alt3=4;
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
				alt3=1;
				}
				break;
			case BLIJE:
				{
				alt3=2;
				}
				break;
			case ZOLANG:
				{
				alt3=3;
				}
				break;
			case LAAT:
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
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:51:9: expression
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_command183);
					expression5=expression();
					state._fsp--;

					 
					if ( _first_0==null ) _first_0 = (LiefTree)expression5.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:52:9: ifCommand
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_ifCommand_in_command193);
					ifCommand6=ifCommand();
					state._fsp--;

					 
					if ( _first_0==null ) _first_0 = (LiefTree)ifCommand6.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 3 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:53:9: whileCommand
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_whileCommand_in_command203);
					whileCommand7=whileCommand();
					state._fsp--;

					 
					if ( _first_0==null ) _first_0 = (LiefTree)whileCommand7.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 4 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:54:9: emptyCommand
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_emptyCommand_in_command213);
					emptyCommand8=emptyCommand();
					state._fsp--;

					 
					if ( _first_0==null ) _first_0 = (LiefTree)emptyCommand8.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class ifCommand_return extends TreeRuleReturnScope {
		LiefTree tree;
		@Override
		public LiefTree getTree() { return tree; }
	};


	// $ANTLR start "ifCommand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:57:1: ifCommand : ^(r= BLIJE e1= expression DAN ( sentence )+ ANDERS ( sentence )+ ) ;
	public final LiefChecker.ifCommand_return ifCommand() throws RecognitionException {
		LiefChecker.ifCommand_return retval = new LiefChecker.ifCommand_return();
		retval.start = input.LT(1);

		LiefTree root_0 = null;

		LiefTree _first_0 = null;
		LiefTree _last = null;


		LiefTree r=null;
		LiefTree DAN9=null;
		LiefTree ANDERS11=null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope sentence10 =null;
		TreeRuleReturnScope sentence12 =null;

		LiefTree r_tree=null;
		LiefTree DAN9_tree=null;
		LiefTree ANDERS11_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:58:5: ( ^(r= BLIJE e1= expression DAN ( sentence )+ ANDERS ( sentence )+ ) )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:58:9: ^(r= BLIJE e1= expression DAN ( sentence )+ ANDERS ( sentence )+ )
			{
			_last = (LiefTree)input.LT(1);
			{
			LiefTree _save_last_1 = _last;
			LiefTree _first_1 = null;
			_last = (LiefTree)input.LT(1);
			r=(LiefTree)match(input,BLIJE,FOLLOW_BLIJE_in_ifCommand239); 

			if ( _first_0==null ) _first_0 = r;
			match(input, Token.DOWN, null); 
			_last = (LiefTree)input.LT(1);
			pushFollow(FOLLOW_expression_in_ifCommand256);
			e1=expression();
			state._fsp--;

			 
			if ( _first_1==null ) _first_1 = (LiefTree)e1.getTree();

			_last = (LiefTree)input.LT(1);
			DAN9=(LiefTree)match(input,DAN,FOLLOW_DAN_in_ifCommand272); 
			 
			if ( _first_1==null ) _first_1 = DAN9;

			 cf.openScope(); 
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:60:42: ( sentence )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ANDERS) ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1==DOWN) ) {
						alt4=1;
					}

				}
				else if ( ((LA4_0 >= BEGIN && LA4_0 <= BLIJE)||LA4_0==CHARACTER||LA4_0==DIVIDE||(LA4_0 >= EN && LA4_0 <= GROTER)||LA4_0==HARTJE||(LA4_0 >= KLEINER && LA4_0 <= LAAT)||LA4_0==LPAREN||LA4_0==MIN||(LA4_0 >= MODULO && LA4_0 <= OF)||(LA4_0 >= PLUS && LA4_0 <= POSITIEF)||(LA4_0 >= SMILEY && LA4_0 <= STEENTJE)||(LA4_0 >= VARIABLE && LA4_0 <= WORDT)||(LA4_0 >= ZEG && LA4_0 <= ZOLANG)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:60:42: sentence
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_sentence_in_ifCommand280);
					sentence10=sentence();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)sentence10.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			 cf.closeScope(); 
			_last = (LiefTree)input.LT(1);
			ANDERS11=(LiefTree)match(input,ANDERS,FOLLOW_ANDERS_in_ifCommand298); 
			 
			if ( _first_1==null ) _first_1 = ANDERS11;

			 cf.openScope(); 
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:61:42: ( sentence )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= ANDERS && LA5_0 <= BLIJE)||LA5_0==CHARACTER||LA5_0==DIVIDE||(LA5_0 >= EN && LA5_0 <= GROTER)||LA5_0==HARTJE||(LA5_0 >= KLEINER && LA5_0 <= LAAT)||LA5_0==LPAREN||LA5_0==MIN||(LA5_0 >= MODULO && LA5_0 <= OF)||(LA5_0 >= PLUS && LA5_0 <= POSITIEF)||(LA5_0 >= SMILEY && LA5_0 <= STEENTJE)||(LA5_0 >= VARIABLE && LA5_0 <= WORDT)||(LA5_0 >= ZEG && LA5_0 <= ZOLANG)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:61:42: sentence
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_sentence_in_ifCommand303);
					sentence12=sentence();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)sentence12.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			 cf.closeScope(); 
			match(input, Token.UP, null); 
			_last = _save_last_1;
			}



			            cf.checkIf(r, (e1!=null?((LiefTree)e1.getTree()):null));
			         
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (LiefTree)adaptor.getParent(retval.tree);

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifCommand"


	public static class whileCommand_return extends TreeRuleReturnScope {
		LiefTree tree;
		@Override
		public LiefTree getTree() { return tree; }
	};


	// $ANTLR start "whileCommand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:67:1: whileCommand : ^(r= ZOLANG e1= expression ( sentence )+ ) ;
	public final LiefChecker.whileCommand_return whileCommand() throws RecognitionException {
		LiefChecker.whileCommand_return retval = new LiefChecker.whileCommand_return();
		retval.start = input.LT(1);

		LiefTree root_0 = null;

		LiefTree _first_0 = null;
		LiefTree _last = null;


		LiefTree r=null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope sentence13 =null;

		LiefTree r_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:68:5: ( ^(r= ZOLANG e1= expression ( sentence )+ ) )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:68:7: ^(r= ZOLANG e1= expression ( sentence )+ )
			{
			_last = (LiefTree)input.LT(1);
			{
			LiefTree _save_last_1 = _last;
			LiefTree _first_1 = null;
			_last = (LiefTree)input.LT(1);
			r=(LiefTree)match(input,ZOLANG,FOLLOW_ZOLANG_in_whileCommand343); 

			if ( _first_0==null ) _first_0 = r;
			match(input, Token.DOWN, null); 
			_last = (LiefTree)input.LT(1);
			pushFollow(FOLLOW_expression_in_whileCommand347);
			e1=expression();
			state._fsp--;

			 
			if ( _first_1==null ) _first_1 = (LiefTree)e1.getTree();

			 cf.openScope(); 
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:68:52: ( sentence )+
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
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:68:52: sentence
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_sentence_in_whileCommand351);
					sentence13=sentence();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)sentence13.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			 cf.closeScope(); 
			match(input, Token.UP, null); 
			_last = _save_last_1;
			}



			        cf.checkWhile(r, (e1!=null?((LiefTree)e1.getTree()):null));
			      
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (LiefTree)adaptor.getParent(retval.tree);

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileCommand"


	public static class emptyCommand_return extends TreeRuleReturnScope {
		LiefTree tree;
		@Override
		public LiefTree getTree() { return tree; }
	};


	// $ANTLR start "emptyCommand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:73:1: emptyCommand : (r= LAAT ) ;
	public final LiefChecker.emptyCommand_return emptyCommand() throws RecognitionException {
		LiefChecker.emptyCommand_return retval = new LiefChecker.emptyCommand_return();
		retval.start = input.LT(1);

		LiefTree root_0 = null;

		LiefTree _first_0 = null;
		LiefTree _last = null;


		LiefTree r=null;

		LiefTree r_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:74:5: ( (r= LAAT ) )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:74:7: (r= LAAT )
			{
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:74:7: (r= LAAT )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:74:8: r= LAAT
			{
			_last = (LiefTree)input.LT(1);
			r=(LiefTree)match(input,LAAT,FOLLOW_LAAT_in_emptyCommand380); 
			 
			if ( _first_0==null ) _first_0 = r;

			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (LiefTree)adaptor.getParent(retval.tree);

			}


			        cf.checkEmptyCommand(r);
			      
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (LiefTree)adaptor.getParent(retval.tree);

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "emptyCommand"


	public static class declaration_return extends TreeRuleReturnScope {
		LiefTree tree;
		@Override
		public LiefTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:79:1: declaration : ( ^(r= HARTJE id= IDENTIFIER t= IDENTIFIER ) | ^(r= STEENTJE id= IDENTIFIER val= expression ) );
	public final LiefChecker.declaration_return declaration() throws RecognitionException {
		LiefChecker.declaration_return retval = new LiefChecker.declaration_return();
		retval.start = input.LT(1);

		LiefTree root_0 = null;

		LiefTree _first_0 = null;
		LiefTree _last = null;


		LiefTree r=null;
		LiefTree id=null;
		LiefTree t=null;
		TreeRuleReturnScope val =null;

		LiefTree r_tree=null;
		LiefTree id_tree=null;
		LiefTree t_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:80:5: ( ^(r= HARTJE id= IDENTIFIER t= IDENTIFIER ) | ^(r= STEENTJE id= IDENTIFIER val= expression ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==HARTJE) ) {
				alt7=1;
			}
			else if ( (LA7_0==STEENTJE) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:80:9: ^(r= HARTJE id= IDENTIFIER t= IDENTIFIER )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					_last = (LiefTree)input.LT(1);
					r=(LiefTree)match(input,HARTJE,FOLLOW_HARTJE_in_declaration411); 

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					_last = (LiefTree)input.LT(1);
					id=(LiefTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration415); 
					 
					if ( _first_1==null ) _first_1 = id;

					_last = (LiefTree)input.LT(1);
					t=(LiefTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration419); 
					 
					if ( _first_1==null ) _first_1 = t;

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}



					          cf.checkDeclaration(r, id, t);
					        
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:83:9: ^(r= STEENTJE id= IDENTIFIER val= expression )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					_last = (LiefTree)input.LT(1);
					r=(LiefTree)match(input,STEENTJE,FOLLOW_STEENTJE_in_declaration434); 

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					_last = (LiefTree)input.LT(1);
					id=(LiefTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration438); 
					 
					if ( _first_1==null ) _first_1 = id;

					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_declaration442);
					val=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)val.getTree();

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}



					          cf.checkConstant(r, id, (val!=null?((LiefTree)val.getTree()):null));
					        
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class expression_return extends TreeRuleReturnScope {
		LiefTree tree;
		@Override
		public LiefTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:88:1: expression : ( ^(r= WORDT id= VARIABLE ex= expression ) | (ec= compoundExpression ) | ^(r= ( NEGATIEF | POSITIEF ) ex= expression ) | ^(r= NIET ex= expression ) | ^(r= ( MULTIPLY | DIVIDE | MODULO | PLUS | MIN ) e1= expression e2= expression ) | ^(r= ( KLEINST | GROOTST | KLEINER | GROTER ) e1= expression e2= expression ) | ^(r= ( ZOALS | ANDERS ) e1= expression e2= expression ) | ^(r= ( EN | OF ) e1= expression e2= expression ) | operand );
	public final LiefChecker.expression_return expression() throws RecognitionException {
		LiefChecker.expression_return retval = new LiefChecker.expression_return();
		retval.start = input.LT(1);

		LiefTree root_0 = null;

		LiefTree _first_0 = null;
		LiefTree _last = null;


		LiefTree r=null;
		LiefTree id=null;
		TreeRuleReturnScope ex =null;
		TreeRuleReturnScope ec =null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;
		TreeRuleReturnScope operand14 =null;

		LiefTree r_tree=null;
		LiefTree id_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:89:5: ( ^(r= WORDT id= VARIABLE ex= expression ) | (ec= compoundExpression ) | ^(r= ( NEGATIEF | POSITIEF ) ex= expression ) | ^(r= NIET ex= expression ) | ^(r= ( MULTIPLY | DIVIDE | MODULO | PLUS | MIN ) e1= expression e2= expression ) | ^(r= ( KLEINST | GROOTST | KLEINER | GROTER ) e1= expression e2= expression ) | ^(r= ( ZOALS | ANDERS ) e1= expression e2= expression ) | ^(r= ( EN | OF ) e1= expression e2= expression ) | operand )
			int alt8=9;
			switch ( input.LA(1) ) {
			case WORDT:
				{
				alt8=1;
				}
				break;
			case BEGIN:
				{
				alt8=2;
				}
				break;
			case NEGATIEF:
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
			case DIVIDE:
			case MIN:
			case MODULO:
			case MULTIPLY:
			case PLUS:
				{
				alt8=5;
				}
				break;
			case GROOTST:
			case GROTER:
			case KLEINER:
			case KLEINST:
				{
				alt8=6;
				}
				break;
			case ANDERS:
			case ZOALS:
				{
				alt8=7;
				}
				break;
			case EN:
			case OF:
				{
				alt8=8;
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
				alt8=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:89:9: ^(r= WORDT id= VARIABLE ex= expression )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					_last = (LiefTree)input.LT(1);
					r=(LiefTree)match(input,WORDT,FOLLOW_WORDT_in_expression471); 

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					_last = (LiefTree)input.LT(1);
					id=(LiefTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_expression475); 
					 
					if ( _first_1==null ) _first_1 = id;

					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression479);
					ex=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)ex.getTree();

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}



					            cf.checkExprAssign(r, id, (ex!=null?((LiefTree)ex.getTree()):null));
								  
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:92:7: (ec= compoundExpression )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:92:7: (ec= compoundExpression )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:92:8: ec= compoundExpression
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_compoundExpression_in_expression493);
					ec=compoundExpression();
					state._fsp--;

					 
					if ( _first_0==null ) _first_0 = (LiefTree)ec.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}


							        cf.checkExprCompound((ec!=null?((LiefTree)ec.getTree()):null));
					        
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 3 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:95:9: ^(r= ( NEGATIEF | POSITIEF ) ex= expression )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					r=(LiefTree)input.LT(1);
					if ( input.LA(1)==NEGATIEF||input.LA(1)==POSITIEF ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression518);
					ex=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)ex.getTree();

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}



					            cf.checkExprNegate(r, (ex!=null?((LiefTree)ex.getTree()):null)); 
					        
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 4 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:98:9: ^(r= NIET ex= expression )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					_last = (LiefTree)input.LT(1);
					r=(LiefTree)match(input,NIET,FOLLOW_NIET_in_expression533); 

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression537);
					ex=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)ex.getTree();

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}



					            cf.checkExprNot(r, (ex!=null?((LiefTree)ex.getTree()):null));
					        
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 5 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:101:9: ^(r= ( MULTIPLY | DIVIDE | MODULO | PLUS | MIN ) e1= expression e2= expression )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					r=(LiefTree)input.LT(1);
					if ( input.LA(1)==DIVIDE||input.LA(1)==MIN||(input.LA(1) >= MODULO && input.LA(1) <= MULTIPLY)||input.LA(1)==PLUS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression574);
					e1=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)e1.getTree();

					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression578);
					e2=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)e2.getTree();

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}



					            cf.checkExprMath(r, (e1!=null?((LiefTree)e1.getTree()):null), (e2!=null?((LiefTree)e2.getTree()):null));
					        
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 6 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:104:9: ^(r= ( KLEINST | GROOTST | KLEINER | GROTER ) e1= expression e2= expression )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					r=(LiefTree)input.LT(1);
					if ( (input.LA(1) >= GROOTST && input.LA(1) <= GROTER)||(input.LA(1) >= KLEINER && input.LA(1) <= KLEINST) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression611);
					e1=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)e1.getTree();

					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression615);
					e2=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)e2.getTree();

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}



					            cf.checkExprCompNumber(r, (e1!=null?((LiefTree)e1.getTree()):null), (e2!=null?((LiefTree)e2.getTree()):null));
					        
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 7 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:107:8: ^(r= ( ZOALS | ANDERS ) e1= expression e2= expression )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					r=(LiefTree)input.LT(1);
					if ( input.LA(1)==ANDERS||input.LA(1)==ZOALS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression639);
					e1=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)e1.getTree();

					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression643);
					e2=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)e2.getTree();

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}



					            cf.checkExprCompThing(r, (e1!=null?((LiefTree)e1.getTree()):null), (e2!=null?((LiefTree)e2.getTree()):null));
					        
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 8 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:110:8: ^(r= ( EN | OF ) e1= expression e2= expression )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					r=(LiefTree)input.LT(1);
					if ( input.LA(1)==EN||input.LA(1)==OF ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression667);
					e1=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)e1.getTree();

					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression671);
					e2=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)e2.getTree();

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}



					            cf.checkExprBin(r, (e1!=null?((LiefTree)e1.getTree()):null), (e2!=null?((LiefTree)e2.getTree()):null));
					    
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 9 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:113:9: operand
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_expression683);
					operand14=operand();
					state._fsp--;

					 
					if ( _first_0==null ) _first_0 = (LiefTree)operand14.getTree();

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class compoundExpression_return extends TreeRuleReturnScope {
		LiefTree tree;
		@Override
		public LiefTree getTree() { return tree; }
	};


	// $ANTLR start "compoundExpression"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:116:1: compoundExpression : ^(r= BEGIN (s= sentence )+ ) ;
	public final LiefChecker.compoundExpression_return compoundExpression() throws RecognitionException {
		LiefChecker.compoundExpression_return retval = new LiefChecker.compoundExpression_return();
		retval.start = input.LT(1);

		LiefTree root_0 = null;

		LiefTree _first_0 = null;
		LiefTree _last = null;


		LiefTree r=null;
		TreeRuleReturnScope s =null;

		LiefTree r_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:117:5: ( ^(r= BEGIN (s= sentence )+ ) )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:117:7: ^(r= BEGIN (s= sentence )+ )
			{
			_last = (LiefTree)input.LT(1);
			{
			LiefTree _save_last_1 = _last;
			LiefTree _first_1 = null;
			_last = (LiefTree)input.LT(1);
			r=(LiefTree)match(input,BEGIN,FOLLOW_BEGIN_in_compoundExpression707); 

			if ( _first_0==null ) _first_0 = r;
			 cf.openScope(); 
			match(input, Token.DOWN, null); 
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:117:37: (s= sentence )+
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
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:117:38: s= sentence
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_sentence_in_compoundExpression714);
					s=sentence();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)s.getTree();


					          cf.checkCompoundExpr(r, (s!=null?((LiefTree)s.getTree()):null));
					         
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			 cf.shouldReturn((s!=null?((LiefTree)s.getTree()):null)); cf.closeScope(); 
			match(input, Token.UP, null); 
			_last = _save_last_1;
			}


			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (LiefTree)adaptor.getParent(retval.tree);

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compoundExpression"


	public static class operand_return extends TreeRuleReturnScope {
		LiefTree tree;
		@Override
		public LiefTree getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:123:1: operand : ( (n= NUMBER ) | ^(r= LPAREN ex= expression ) | (id= VARIABLE ) | (s= SMILEY ) | (c= CHARACTER ) | ^(r= ZEG (op= operand ) (op= operand )* ) | ^(r= VRAAG (id= VARIABLE ) (id= VARIABLE )* ) );
	public final LiefChecker.operand_return operand() throws RecognitionException {
		LiefChecker.operand_return retval = new LiefChecker.operand_return();
		retval.start = input.LT(1);

		LiefTree root_0 = null;

		LiefTree _first_0 = null;
		LiefTree _last = null;


		LiefTree n=null;
		LiefTree r=null;
		LiefTree id=null;
		LiefTree s=null;
		LiefTree c=null;
		TreeRuleReturnScope ex =null;
		TreeRuleReturnScope op =null;

		LiefTree n_tree=null;
		LiefTree r_tree=null;
		LiefTree id_tree=null;
		LiefTree s_tree=null;
		LiefTree c_tree=null;

		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:124:5: ( (n= NUMBER ) | ^(r= LPAREN ex= expression ) | (id= VARIABLE ) | (s= SMILEY ) | (c= CHARACTER ) | ^(r= ZEG (op= operand ) (op= operand )* ) | ^(r= VRAAG (id= VARIABLE ) (id= VARIABLE )* ) )
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
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:124:7: (n= NUMBER )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:124:7: (n= NUMBER )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:124:8: n= NUMBER
					{
					_last = (LiefTree)input.LT(1);
					n=(LiefTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand751); 
					 
					if ( _first_0==null ) _first_0 = n;

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}


					        cf.checkOperandNumber(n);
					    
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:127:7: ^(r= LPAREN ex= expression )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					_last = (LiefTree)input.LT(1);
					r=(LiefTree)match(input,LPAREN,FOLLOW_LPAREN_in_operand765); 

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_operand769);
					ex=expression();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)ex.getTree();

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}



					        cf.checkOperandLparen(r, (ex!=null?((LiefTree)ex.getTree()):null));
					      
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 3 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:130:7: (id= VARIABLE )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:130:7: (id= VARIABLE )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:130:8: id= VARIABLE
					{
					_last = (LiefTree)input.LT(1);
					id=(LiefTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_operand782); 
					 
					if ( _first_0==null ) _first_0 = id;

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}


					        cf.checkOperandVariable(id); 
					    
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 4 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:133:7: (s= SMILEY )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:133:7: (s= SMILEY )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:133:8: s= SMILEY
					{
					_last = (LiefTree)input.LT(1);
					s=(LiefTree)match(input,SMILEY,FOLLOW_SMILEY_in_operand796); 
					 
					if ( _first_0==null ) _first_0 = s;

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}


					        cf.checkOperandSmiley(s);
					    
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 5 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:136:7: (c= CHARACTER )
					{
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:136:7: (c= CHARACTER )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:136:8: c= CHARACTER
					{
					_last = (LiefTree)input.LT(1);
					c=(LiefTree)match(input,CHARACTER,FOLLOW_CHARACTER_in_operand810); 
					 
					if ( _first_0==null ) _first_0 = c;

					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}


					        cf.checkOperandChar(c);
					    
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 6 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:139:9: ^(r= ZEG (op= operand ) (op= operand )* )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					_last = (LiefTree)input.LT(1);
					r=(LiefTree)match(input,ZEG,FOLLOW_ZEG_in_operand826); 

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:139:17: (op= operand )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:139:18: op= operand
					{
					_last = (LiefTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_operand831);
					op=operand();
					state._fsp--;

					 
					if ( _first_1==null ) _first_1 = (LiefTree)op.getTree();

					 cf.checkExprZegSingle(r, (op!=null?((LiefTree)op.getTree()):null));
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}

					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:140:17: (op= operand )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==CHARACTER||LA10_0==LPAREN||LA10_0==NUMBER||LA10_0==SMILEY||(LA10_0 >= VARIABLE && LA10_0 <= VRAAG)||LA10_0==ZEG) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:140:18: op= operand
							{
							_last = (LiefTree)input.LT(1);
							pushFollow(FOLLOW_operand_in_operand856);
							op=operand();
							state._fsp--;

							 
							if ( _first_1==null ) _first_1 = (LiefTree)op.getTree();

							 cf.checkExprZegMultiple(r, (op!=null?((LiefTree)op.getTree()):null));  
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (LiefTree)adaptor.getParent(retval.tree);

							}
							break;

						default :
							break loop10;
						}
					}

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}


					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;
				case 7 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:142:9: ^(r= VRAAG (id= VARIABLE ) (id= VARIABLE )* )
					{
					_last = (LiefTree)input.LT(1);
					{
					LiefTree _save_last_1 = _last;
					LiefTree _first_1 = null;
					_last = (LiefTree)input.LT(1);
					r=(LiefTree)match(input,VRAAG,FOLLOW_VRAAG_in_operand888); 

					if ( _first_0==null ) _first_0 = r;
					match(input, Token.DOWN, null); 
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:142:21: (id= VARIABLE )
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:142:22: id= VARIABLE
					{
					_last = (LiefTree)input.LT(1);
					id=(LiefTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_operand895); 
					 
					if ( _first_1==null ) _first_1 = id;

					 cf.checkExprVraagSingle(r, id); 
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}

					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:143:21: (id= VARIABLE )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==VARIABLE) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\LiefChecker.g:143:22: id= VARIABLE
							{
							_last = (LiefTree)input.LT(1);
							id=(LiefTree)match(input,VARIABLE,FOLLOW_VARIABLE_in_operand923); 
							 
							if ( _first_1==null ) _first_1 = id;

							 cf.checkExprVraagMultiple(r, id); 
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (LiefTree)adaptor.getParent(retval.tree);

							}
							break;

						default :
							break loop11;
						}
					}

					match(input, Token.UP, null); 
					_last = _save_last_1;
					}


					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (LiefTree)adaptor.getParent(retval.tree);

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program122 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sentence_in_program124 = new BitSet(new long[]{0x001DD8DFA9C5D178L});
	public static final BitSet FOLLOW_command_in_sentence149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_sentence159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_command183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCommand_in_command193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileCommand_in_command203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyCommand_in_command213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLIJE_in_ifCommand239 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifCommand256 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DAN_in_ifCommand272 = new BitSet(new long[]{0x001DD8DFA9C5D170L});
	public static final BitSet FOLLOW_sentence_in_ifCommand280 = new BitSet(new long[]{0x001DD8DFA9C5D170L});
	public static final BitSet FOLLOW_ANDERS_in_ifCommand298 = new BitSet(new long[]{0x001DD8DFA9C5D170L});
	public static final BitSet FOLLOW_sentence_in_ifCommand303 = new BitSet(new long[]{0x001DD8DFA9C5D178L});
	public static final BitSet FOLLOW_ZOLANG_in_whileCommand343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileCommand347 = new BitSet(new long[]{0x001DD8DFA9C5D170L});
	public static final BitSet FOLLOW_sentence_in_whileCommand351 = new BitSet(new long[]{0x001DD8DFA9C5D178L});
	public static final BitSet FOLLOW_LAAT_in_emptyCommand380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HARTJE_in_declaration411 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration415 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration419 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STEENTJE_in_declaration434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration438 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_declaration442 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WORDT_in_expression471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VARIABLE_in_expression475 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression479 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_compoundExpression_in_expression493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expression508 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression518 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NIET_in_expression533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expression552 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression574 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression578 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expression593 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression611 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expression629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression639 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression643 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expression657 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression667 = new BitSet(new long[]{0x000DC8DFA8C1D130L});
	public static final BitSet FOLLOW_expression_in_expression671 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expression683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_compoundExpression707 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sentence_in_compoundExpression714 = new BitSet(new long[]{0x001DD8DFA9C5D178L});
	public static final BitSet FOLLOW_NUMBER_in_operand751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand765 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operand769 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VARIABLE_in_operand782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SMILEY_in_operand796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_operand810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ZEG_in_operand826 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operand_in_operand831 = new BitSet(new long[]{0x0004C80808000108L});
	public static final BitSet FOLLOW_operand_in_operand856 = new BitSet(new long[]{0x0004C80808000108L});
	public static final BitSet FOLLOW_VRAAG_in_operand888 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VARIABLE_in_operand895 = new BitSet(new long[]{0x0000400000000008L});
	public static final BitSet FOLLOW_VARIABLE_in_operand923 = new BitSet(new long[]{0x0000400000000008L});
}
