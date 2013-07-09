// $ANTLR 3.5 C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g 2013-06-30 19:47:08

package lief.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LiefLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LiefLexer() {} 
	public LiefLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LiefLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g"; }

	// $ANTLR start "ANDERS"
	public final void mANDERS() throws RecognitionException {
		try {
			int _type = ANDERS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:11:8: ( 'anders' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:11:10: 'anders'
			{
			match("anders"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANDERS"

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:12:7: ( 'begin' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:12:9: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEGIN"

	// $ANTLR start "BLIJE"
	public final void mBLIJE() throws RecognitionException {
		try {
			int _type = BLIJE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:13:7: ( 'blije' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:13:9: 'blije'
			{
			match("blije"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BLIJE"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:14:4: ( 'door' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:14:6: 'door'
			{
			match("door"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "DAN"
	public final void mDAN() throws RecognitionException {
		try {
			int _type = DAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:15:5: ( 'dan' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:15:7: 'dan'
			{
			match("dan"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DAN"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:16:8: ( 'delen' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:16:10: 'delen'
			{
			match("delen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "EEN"
	public final void mEEN() throws RecognitionException {
		try {
			int _type = EEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:17:5: ( 'een' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:17:7: 'een'
			{
			match("een"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EEN"

	// $ANTLR start "EN"
	public final void mEN() throws RecognitionException {
		try {
			int _type = EN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:18:4: ( 'en' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:18:6: 'en'
			{
			match("en"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EN"

	// $ANTLR start "GROOTST"
	public final void mGROOTST() throws RecognitionException {
		try {
			int _type = GROOTST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:19:9: ( 'grootst' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:19:11: 'grootst'
			{
			match("grootst"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROOTST"

	// $ANTLR start "GROTER"
	public final void mGROTER() throws RecognitionException {
		try {
			int _type = GROTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:20:8: ( 'groter' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:20:10: 'groter'
			{
			match("groter"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROTER"

	// $ANTLR start "HARTJE"
	public final void mHARTJE() throws RecognitionException {
		try {
			int _type = HARTJE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:21:8: ( 'hartje' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:21:10: 'hartje'
			{
			match("hartje"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HARTJE"

	// $ANTLR start "IS"
	public final void mIS() throws RecognitionException {
		try {
			int _type = IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:22:4: ( 'is' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:22:6: 'is'
			{
			match("is"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IS"

	// $ANTLR start "KLAAR"
	public final void mKLAAR() throws RecognitionException {
		try {
			int _type = KLAAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:23:7: ( 'klaar' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:23:9: 'klaar'
			{
			match("klaar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KLAAR"

	// $ANTLR start "KLEINER"
	public final void mKLEINER() throws RecognitionException {
		try {
			int _type = KLEINER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:24:9: ( 'kleiner' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:24:11: 'kleiner'
			{
			match("kleiner"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KLEINER"

	// $ANTLR start "KLEINST"
	public final void mKLEINST() throws RecognitionException {
		try {
			int _type = KLEINST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:25:9: ( 'kleinst' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:25:11: 'kleinst'
			{
			match("kleinst"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KLEINST"

	// $ANTLR start "LAAT"
	public final void mLAAT() throws RecognitionException {
		try {
			int _type = LAAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:26:6: ( 'laat' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:26:8: 'laat'
			{
			match("laat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAAT"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:27:8: ( '(' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:27:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "MAAR"
	public final void mMAAR() throws RecognitionException {
		try {
			int _type = MAAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:28:6: ( 'maar' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:28:8: 'maar'
			{
			match("maar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAAR"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			int _type = MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:29:5: ( 'min' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:29:7: 'min'
			{
			match("min"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN"

	// $ANTLR start "MODULO"
	public final void mMODULO() throws RecognitionException {
		try {
			int _type = MODULO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:30:8: ( 'modulo' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:30:10: 'modulo'
			{
			match("modulo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODULO"

	// $ANTLR start "MULTIPLY"
	public final void mMULTIPLY() throws RecognitionException {
		try {
			int _type = MULTIPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:31:10: ( 'maal' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:31:12: 'maal'
			{
			match("maal"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTIPLY"

	// $ANTLR start "NEGATIEF"
	public final void mNEGATIEF() throws RecognitionException {
		try {
			int _type = NEGATIEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:32:10: ( 'negatief' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:32:12: 'negatief'
			{
			match("negatief"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEGATIEF"

	// $ANTLR start "NIET"
	public final void mNIET() throws RecognitionException {
		try {
			int _type = NIET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:33:6: ( 'niet' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:33:8: 'niet'
			{
			match("niet"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NIET"

	// $ANTLR start "OF"
	public final void mOF() throws RecognitionException {
		try {
			int _type = OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:34:4: ( 'of' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:34:6: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OF"

	// $ANTLR start "PERIOD"
	public final void mPERIOD() throws RecognitionException {
		try {
			int _type = PERIOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:35:8: ( '.' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:35:10: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERIOD"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:36:6: ( 'plus' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:36:8: 'plus'
			{
			match("plus"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "POSITIEF"
	public final void mPOSITIEF() throws RecognitionException {
		try {
			int _type = POSITIEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:37:10: ( 'positief' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:37:12: 'positief'
			{
			match("positief"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POSITIEF"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:38:9: ( 'program' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:38:11: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:39:8: ( ')' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:39:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "STEENTJE"
	public final void mSTEENTJE() throws RecognitionException {
		try {
			int _type = STEENTJE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:40:10: ( 'steentje' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:40:12: 'steentje'
			{
			match("steentje"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STEENTJE"

	// $ANTLR start "VRAAG"
	public final void mVRAAG() throws RecognitionException {
		try {
			int _type = VRAAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:41:7: ( 'vraag' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:41:9: 'vraag'
			{
			match("vraag"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VRAAG"

	// $ANTLR start "WORDT"
	public final void mWORDT() throws RecognitionException {
		try {
			int _type = WORDT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:42:7: ( 'wordt' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:42:9: 'wordt'
			{
			match("wordt"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORDT"

	// $ANTLR start "ZEG"
	public final void mZEG() throws RecognitionException {
		try {
			int _type = ZEG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:43:5: ( 'zeg' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:43:7: 'zeg'
			{
			match("zeg"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZEG"

	// $ANTLR start "ZOALS"
	public final void mZOALS() throws RecognitionException {
		try {
			int _type = ZOALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:44:7: ( 'zoals' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:44:9: 'zoals'
			{
			match("zoals"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZOALS"

	// $ANTLR start "ZOLANG"
	public final void mZOLANG() throws RecognitionException {
		try {
			int _type = ZOLANG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:45:8: ( 'zolang' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:45:10: 'zolang'
			{
			match("zolang"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZOLANG"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:163:13: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:163:15: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:163:22: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:165:13: ( H IDENTIFIER )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:165:15: H IDENTIFIER
			{
			mH(); 

			mIDENTIFIER(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:167:13: ( ( DIGIT )+ )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:167:15: ( DIGIT )+
			{
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:167:15: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "SMILEY"
	public final void mSMILEY() throws RecognitionException {
		try {
			int _type = SMILEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:169:13: ( ':)' | ':(' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==':') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==')') ) {
					alt3=1;
				}
				else if ( (LA3_1=='(') ) {
					alt3=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:169:15: ':)'
					{
					match(":)"); 

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:170:15: ':('
					{
					match(":("); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SMILEY"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:173:13: ( QUOT ( '!' .. '~' ) QUOT | QUOT WS QUOT )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\'') ) {
				int LA4_1 = input.LA(2);
				if ( ((LA4_1 >= '!' && LA4_1 <= '~')) ) {
					alt4=1;
				}
				else if ( ((LA4_1 >= '\t' && LA4_1 <= '\n')||(LA4_1 >= '\f' && LA4_1 <= '\r')||LA4_1==' ') ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:173:15: QUOT ( '!' .. '~' ) QUOT
					{
					mQUOT(); 

					if ( (input.LA(1) >= '!' && input.LA(1) <= '~') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					mQUOT(); 

					}
					break;
				case 2 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:174:15: QUOT WS QUOT
					{
					mQUOT(); 

					mWS(); 

					mQUOT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:177:13: ( '@#%' ( . )* '\\n' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:177:15: '@#%' ( . )* '\\n'
			{
			match("@#%"); 

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:177:21: ( . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\n') ) {
					alt5=2;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:177:21: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
				}
			}

			match('\n'); 
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "ML_COMMENT"
	public final void mML_COMMENT() throws RecognitionException {
		try {
			int _type = ML_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:181:13: ( 'mama' ( options {greedy=false; } : . )* 'onee grapje' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:181:15: 'mama' ( options {greedy=false; } : . )* 'onee grapje'
			{
			match("mama"); 

			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:181:22: ( options {greedy=false; } : . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='o') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='n') ) {
						int LA6_3 = input.LA(3);
						if ( (LA6_3=='e') ) {
							int LA6_4 = input.LA(4);
							if ( (LA6_4=='e') ) {
								int LA6_5 = input.LA(5);
								if ( (LA6_5==' ') ) {
									int LA6_6 = input.LA(6);
									if ( (LA6_6=='g') ) {
										int LA6_7 = input.LA(7);
										if ( (LA6_7=='r') ) {
											int LA6_8 = input.LA(8);
											if ( (LA6_8=='a') ) {
												int LA6_9 = input.LA(9);
												if ( (LA6_9=='p') ) {
													int LA6_10 = input.LA(10);
													if ( (LA6_10=='j') ) {
														int LA6_11 = input.LA(11);
														if ( (LA6_11=='e') ) {
															alt6=2;
														}
														else if ( ((LA6_11 >= '\u0000' && LA6_11 <= 'd')||(LA6_11 >= 'f' && LA6_11 <= '\uFFFF')) ) {
															alt6=1;
														}

													}
													else if ( ((LA6_10 >= '\u0000' && LA6_10 <= 'i')||(LA6_10 >= 'k' && LA6_10 <= '\uFFFF')) ) {
														alt6=1;
													}

												}
												else if ( ((LA6_9 >= '\u0000' && LA6_9 <= 'o')||(LA6_9 >= 'q' && LA6_9 <= '\uFFFF')) ) {
													alt6=1;
												}

											}
											else if ( ((LA6_8 >= '\u0000' && LA6_8 <= '`')||(LA6_8 >= 'b' && LA6_8 <= '\uFFFF')) ) {
												alt6=1;
											}

										}
										else if ( ((LA6_7 >= '\u0000' && LA6_7 <= 'q')||(LA6_7 >= 's' && LA6_7 <= '\uFFFF')) ) {
											alt6=1;
										}

									}
									else if ( ((LA6_6 >= '\u0000' && LA6_6 <= 'f')||(LA6_6 >= 'h' && LA6_6 <= '\uFFFF')) ) {
										alt6=1;
									}

								}
								else if ( ((LA6_5 >= '\u0000' && LA6_5 <= '\u001F')||(LA6_5 >= '!' && LA6_5 <= '\uFFFF')) ) {
									alt6=1;
								}

							}
							else if ( ((LA6_4 >= '\u0000' && LA6_4 <= 'd')||(LA6_4 >= 'f' && LA6_4 <= '\uFFFF')) ) {
								alt6=1;
							}

						}
						else if ( ((LA6_3 >= '\u0000' && LA6_3 <= 'd')||(LA6_3 >= 'f' && LA6_3 <= '\uFFFF')) ) {
							alt6=1;
						}

					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= 'm')||(LA6_1 >= 'o' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= 'n')||(LA6_0 >= 'p' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:181:49: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("onee grapje"); 

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ML_COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:185:13: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:185:15: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:185:15: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||(LA7_0 >= '\f' && LA7_0 <= '\r')||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:189:17: ( ( '0' .. '9' ) )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:190:17: ( ( 'a' .. 'z' ) )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:191:17: ( ( 'A' .. 'Z' ) )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPPER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:192:17: ( LOWER | UPPER | '_' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:193:17: ( '\\u2665' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:193:21: '\\u2665'
			{
			match('\u2665'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "H"

	// $ANTLR start "QUOT"
	public final void mQUOT() throws RecognitionException {
		try {
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:194:17: ( '\\u0027' )
			// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:194:21: '\\u0027'
			{
			match('\''); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOT"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:8: ( ANDERS | BEGIN | BLIJE | BY | DAN | DIVIDE | EEN | EN | GROOTST | GROTER | HARTJE | IS | KLAAR | KLEINER | KLEINST | LAAT | LPAREN | MAAR | MIN | MODULO | MULTIPLY | NEGATIEF | NIET | OF | PERIOD | PLUS | POSITIEF | PROGRAM | RPAREN | STEENTJE | VRAAG | WORDT | ZEG | ZOALS | ZOLANG | IDENTIFIER | VARIABLE | NUMBER | SMILEY | CHARACTER | COMMENT | ML_COMMENT | WS )
		int alt8=43;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:10: ANDERS
				{
				mANDERS(); 

				}
				break;
			case 2 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:17: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 3 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:23: BLIJE
				{
				mBLIJE(); 

				}
				break;
			case 4 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:29: BY
				{
				mBY(); 

				}
				break;
			case 5 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:32: DAN
				{
				mDAN(); 

				}
				break;
			case 6 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:36: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 7 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:43: EEN
				{
				mEEN(); 

				}
				break;
			case 8 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:47: EN
				{
				mEN(); 

				}
				break;
			case 9 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:50: GROOTST
				{
				mGROOTST(); 

				}
				break;
			case 10 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:58: GROTER
				{
				mGROTER(); 

				}
				break;
			case 11 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:65: HARTJE
				{
				mHARTJE(); 

				}
				break;
			case 12 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:72: IS
				{
				mIS(); 

				}
				break;
			case 13 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:75: KLAAR
				{
				mKLAAR(); 

				}
				break;
			case 14 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:81: KLEINER
				{
				mKLEINER(); 

				}
				break;
			case 15 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:89: KLEINST
				{
				mKLEINST(); 

				}
				break;
			case 16 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:97: LAAT
				{
				mLAAT(); 

				}
				break;
			case 17 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:102: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 18 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:109: MAAR
				{
				mMAAR(); 

				}
				break;
			case 19 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:114: MIN
				{
				mMIN(); 

				}
				break;
			case 20 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:118: MODULO
				{
				mMODULO(); 

				}
				break;
			case 21 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:125: MULTIPLY
				{
				mMULTIPLY(); 

				}
				break;
			case 22 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:134: NEGATIEF
				{
				mNEGATIEF(); 

				}
				break;
			case 23 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:143: NIET
				{
				mNIET(); 

				}
				break;
			case 24 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:148: OF
				{
				mOF(); 

				}
				break;
			case 25 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:151: PERIOD
				{
				mPERIOD(); 

				}
				break;
			case 26 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:158: PLUS
				{
				mPLUS(); 

				}
				break;
			case 27 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:163: POSITIEF
				{
				mPOSITIEF(); 

				}
				break;
			case 28 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:172: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 29 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:180: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 30 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:187: STEENTJE
				{
				mSTEENTJE(); 

				}
				break;
			case 31 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:196: VRAAG
				{
				mVRAAG(); 

				}
				break;
			case 32 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:202: WORDT
				{
				mWORDT(); 

				}
				break;
			case 33 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:208: ZEG
				{
				mZEG(); 

				}
				break;
			case 34 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:212: ZOALS
				{
				mZOALS(); 

				}
				break;
			case 35 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:218: ZOLANG
				{
				mZOLANG(); 

				}
				break;
			case 36 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:225: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 37 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:236: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 38 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:245: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 39 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:252: SMILEY
				{
				mSMILEY(); 

				}
				break;
			case 40 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:259: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 41 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:269: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 42 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:277: ML_COMMENT
				{
				mML_COMMENT(); 

				}
				break;
			case 43 :
				// C:\\Users\\Tijnoz\\Dropbox\\VB\\_eind\\Lief\\src\\lief\\grammar\\Lief.g:1:288: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\1\uffff\11\25\1\uffff\3\25\1\uffff\1\25\1\uffff\4\25\7\uffff\7\25\1\76"+
		"\2\25\1\101\7\25\1\113\14\25\1\131\1\25\1\133\1\uffff\2\25\1\uffff\5\25"+
		"\1\145\3\25\1\uffff\6\25\1\157\5\25\1\165\1\uffff\1\25\1\uffff\5\25\1"+
		"\174\1\175\1\176\1\25\1\uffff\2\25\1\u0084\1\u0085\5\25\1\uffff\3\25\1"+
		"\u008e\1\u008f\1\uffff\1\u0090\3\25\1\u0094\1\25\3\uffff\2\25\1\uffff"+
		"\2\25\2\uffff\3\25\1\u009d\1\u009e\1\u009f\1\25\1\u00a1\3\uffff\1\25\1"+
		"\u00a3\1\u00a4\1\uffff\3\25\1\u00a8\4\25\3\uffff\1\u00ad\1\uffff\1\u00ae"+
		"\2\uffff\1\u00af\1\u00b0\1\25\1\uffff\2\25\1\u00b4\1\25\4\uffff\1\25\1"+
		"\u00b6\1\u00b7\1\uffff\1\u00b8\3\uffff";
	static final String DFA8_eofS =
		"\u00b9\uffff";
	static final String DFA8_minS =
		"\1\11\1\156\1\145\1\141\1\145\1\162\1\141\1\163\1\154\1\141\1\uffff\1"+
		"\141\1\145\1\146\1\uffff\1\154\1\uffff\1\164\1\162\1\157\1\145\7\uffff"+
		"\1\144\1\147\1\151\1\157\1\156\1\154\1\156\1\60\1\157\1\162\1\60\3\141"+
		"\1\156\1\144\1\147\1\145\1\60\1\165\1\163\1\157\1\145\1\141\1\162\1\147"+
		"\1\141\1\145\1\151\1\152\1\162\1\60\1\145\1\60\1\uffff\1\157\1\164\1\uffff"+
		"\1\141\1\151\1\164\1\154\1\141\1\60\1\165\1\141\1\164\1\uffff\1\163\1"+
		"\151\1\147\1\145\1\141\1\144\1\60\1\154\1\141\1\162\1\156\1\145\1\60\1"+
		"\uffff\1\156\1\uffff\1\164\1\145\1\152\1\162\1\156\3\60\1\0\1\uffff\1"+
		"\154\1\164\2\60\1\164\1\162\1\156\1\147\1\164\1\uffff\1\163\1\156\1\163"+
		"\2\60\1\uffff\1\60\1\163\1\162\1\145\1\60\1\145\3\uffff\2\0\1\uffff\1"+
		"\157\1\151\2\uffff\1\151\1\141\1\164\3\60\1\147\1\60\3\uffff\1\164\2\60"+
		"\1\uffff\1\162\1\164\1\0\1\60\2\145\1\155\1\152\3\uffff\1\60\1\uffff\1"+
		"\60\2\uffff\2\60\1\0\1\uffff\2\146\1\60\1\145\4\uffff\1\0\2\60\1\uffff"+
		"\1\60\3\uffff";
	static final String DFA8_maxS =
		"\1\u2665\1\156\1\154\1\157\1\156\1\162\1\141\1\163\1\154\1\141\1\uffff"+
		"\1\157\1\151\1\146\1\uffff\1\162\1\uffff\1\164\1\162\2\157\7\uffff\1\144"+
		"\1\147\1\151\1\157\1\156\1\154\1\156\1\172\1\157\1\162\1\172\1\145\1\141"+
		"\1\155\1\156\1\144\1\147\1\145\1\172\1\165\1\163\1\157\1\145\1\141\1\162"+
		"\1\147\1\154\1\145\1\151\1\152\1\162\1\172\1\145\1\172\1\uffff\2\164\1"+
		"\uffff\1\141\1\151\1\164\1\162\1\141\1\172\1\165\1\141\1\164\1\uffff\1"+
		"\163\1\151\1\147\1\145\1\141\1\144\1\172\1\154\1\141\1\162\1\156\1\145"+
		"\1\172\1\uffff\1\156\1\uffff\1\164\1\145\1\152\1\162\1\156\3\172\1\uffff"+
		"\1\uffff\1\154\1\164\2\172\1\164\1\162\1\156\1\147\1\164\1\uffff\1\163"+
		"\1\156\1\163\2\172\1\uffff\1\172\1\163\1\162\1\145\1\172\1\163\3\uffff"+
		"\2\uffff\1\uffff\1\157\1\151\2\uffff\1\151\1\141\1\164\3\172\1\147\1\172"+
		"\3\uffff\1\164\2\172\1\uffff\1\162\1\164\1\uffff\1\172\2\145\1\155\1\152"+
		"\3\uffff\1\172\1\uffff\1\172\2\uffff\2\172\1\uffff\1\uffff\2\146\1\172"+
		"\1\145\4\uffff\1\uffff\2\172\1\uffff\1\172\3\uffff";
	static final String DFA8_acceptS =
		"\12\uffff\1\21\3\uffff\1\31\1\uffff\1\35\4\uffff\1\44\1\45\1\46\1\47\1"+
		"\50\1\51\1\53\42\uffff\1\10\2\uffff\1\14\11\uffff\1\30\15\uffff\1\5\1"+
		"\uffff\1\7\11\uffff\1\23\11\uffff\1\41\5\uffff\1\4\6\uffff\1\20\1\22\1"+
		"\25\2\uffff\1\52\2\uffff\1\27\1\32\10\uffff\1\2\1\3\1\6\3\uffff\1\15\10"+
		"\uffff\1\37\1\40\1\42\1\uffff\1\1\1\uffff\1\12\1\13\3\uffff\1\24\4\uffff"+
		"\1\43\1\11\1\16\1\17\3\uffff\1\34\1\uffff\1\26\1\33\1\36";
	static final String DFA8_specialS =
		"\144\uffff\1\5\32\uffff\1\3\1\2\26\uffff\1\4\17\uffff\1\1\11\uffff\1\0"+
		"\7\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\33\1\uffff\2\33\22\uffff\1\33\6\uffff\1\31\1\12\1\20\4\uffff\1\16"+
			"\1\uffff\12\27\1\30\5\uffff\1\32\32\25\4\uffff\1\25\1\uffff\1\1\1\2\1"+
			"\25\1\3\1\4\1\25\1\5\1\6\1\7\1\25\1\10\1\11\1\13\1\14\1\15\1\17\2\25"+
			"\1\21\2\25\1\22\1\23\2\25\1\24\u25ea\uffff\1\26",
			"\1\34",
			"\1\35\6\uffff\1\36",
			"\1\40\3\uffff\1\41\11\uffff\1\37",
			"\1\42\10\uffff\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"",
			"\1\51\7\uffff\1\52\5\uffff\1\53",
			"\1\54\3\uffff\1\55",
			"\1\56",
			"",
			"\1\57\2\uffff\1\60\2\uffff\1\61",
			"",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65\11\uffff\1\66",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\77",
			"\1\100",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\102\3\uffff\1\103",
			"\1\104",
			"\1\105\13\uffff\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123\12\uffff\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\132",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\1\134\4\uffff\1\135",
			"\1\136",
			"",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\143\5\uffff\1\142",
			"\1\144",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\146",
			"\1\147",
			"\1\150",
			"",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\1\166",
			"",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\60\u0081\12\u0080\7\u0081\32\u0080\4\u0081\1\u0080\1\u0081\16\u0080"+
			"\1\177\13\u0080\uff85\u0081",
			"",
			"\1\u0082",
			"\1\u0083",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\u0095\15\uffff\1\u0096",
			"",
			"",
			"",
			"\60\u0081\12\u0080\7\u0081\32\u0080\4\u0081\1\u0080\1\u0081\15\u0080"+
			"\1\u0097\1\177\13\u0080\uff85\u0081",
			"\60\u0081\12\u0080\7\u0081\32\u0080\4\u0081\1\u0080\1\u0081\16\u0080"+
			"\1\177\13\u0080\uff85\u0081",
			"",
			"\1\u0098",
			"\1\u0099",
			"",
			"",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\u00a0",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"",
			"",
			"\1\u00a2",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\1\u00a5",
			"\1\u00a6",
			"\60\u0081\12\u0080\7\u0081\32\u0080\4\u0081\1\u0080\1\u0081\4\u0080"+
			"\1\u00a7\11\u0080\1\177\13\u0080\uff85\u0081",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\60\u0081\12\u0080\7\u0081\32\u0080\4\u0081\1\u0080\1\u0081\4\u0080"+
			"\1\u00b1\11\u0080\1\177\13\u0080\uff85\u0081",
			"",
			"\1\u00b2",
			"\1\u00b3",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\u00b5",
			"",
			"",
			"",
			"",
			"\60\u0081\12\u0080\7\u0081\32\u0080\4\u0081\1\u0080\1\u0081\16\u0080"+
			"\1\177\13\u0080\uff85\u0081",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ANDERS | BEGIN | BLIJE | BY | DAN | DIVIDE | EEN | EN | GROOTST | GROTER | HARTJE | IS | KLAAR | KLEINER | KLEINST | LAAT | LPAREN | MAAR | MIN | MODULO | MULTIPLY | NEGATIEF | NIET | OF | PERIOD | PLUS | POSITIEF | PROGRAM | RPAREN | STEENTJE | VRAAG | WORDT | ZEG | ZOALS | ZOLANG | IDENTIFIER | VARIABLE | NUMBER | SMILEY | CHARACTER | COMMENT | ML_COMMENT | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA8_177 = input.LA(1);
						s = -1;
						if ( ((LA8_177 >= '\u0000' && LA8_177 <= '/')||(LA8_177 >= ':' && LA8_177 <= '@')||(LA8_177 >= '[' && LA8_177 <= '^')||LA8_177=='`'||(LA8_177 >= '{' && LA8_177 <= '\uFFFF')) ) {s = 129;}
						else if ( (LA8_177=='o') ) {s = 127;}
						else if ( ((LA8_177 >= '0' && LA8_177 <= '9')||(LA8_177 >= 'A' && LA8_177 <= 'Z')||LA8_177=='_'||(LA8_177 >= 'a' && LA8_177 <= 'n')||(LA8_177 >= 'p' && LA8_177 <= 'z')) ) {s = 128;}
						else s = 21;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA8_167 = input.LA(1);
						s = -1;
						if ( (LA8_167=='e') ) {s = 177;}
						else if ( (LA8_167=='o') ) {s = 127;}
						else if ( ((LA8_167 >= '0' && LA8_167 <= '9')||(LA8_167 >= 'A' && LA8_167 <= 'Z')||LA8_167=='_'||(LA8_167 >= 'a' && LA8_167 <= 'd')||(LA8_167 >= 'f' && LA8_167 <= 'n')||(LA8_167 >= 'p' && LA8_167 <= 'z')) ) {s = 128;}
						else if ( ((LA8_167 >= '\u0000' && LA8_167 <= '/')||(LA8_167 >= ':' && LA8_167 <= '@')||(LA8_167 >= '[' && LA8_167 <= '^')||LA8_167=='`'||(LA8_167 >= '{' && LA8_167 <= '\uFFFF')) ) {s = 129;}
						else s = 21;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA8_128 = input.LA(1);
						s = -1;
						if ( (LA8_128=='o') ) {s = 127;}
						else if ( ((LA8_128 >= '0' && LA8_128 <= '9')||(LA8_128 >= 'A' && LA8_128 <= 'Z')||LA8_128=='_'||(LA8_128 >= 'a' && LA8_128 <= 'n')||(LA8_128 >= 'p' && LA8_128 <= 'z')) ) {s = 128;}
						else if ( ((LA8_128 >= '\u0000' && LA8_128 <= '/')||(LA8_128 >= ':' && LA8_128 <= '@')||(LA8_128 >= '[' && LA8_128 <= '^')||LA8_128=='`'||(LA8_128 >= '{' && LA8_128 <= '\uFFFF')) ) {s = 129;}
						else s = 21;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA8_127 = input.LA(1);
						s = -1;
						if ( (LA8_127=='n') ) {s = 151;}
						else if ( (LA8_127=='o') ) {s = 127;}
						else if ( ((LA8_127 >= '0' && LA8_127 <= '9')||(LA8_127 >= 'A' && LA8_127 <= 'Z')||LA8_127=='_'||(LA8_127 >= 'a' && LA8_127 <= 'm')||(LA8_127 >= 'p' && LA8_127 <= 'z')) ) {s = 128;}
						else if ( ((LA8_127 >= '\u0000' && LA8_127 <= '/')||(LA8_127 >= ':' && LA8_127 <= '@')||(LA8_127 >= '[' && LA8_127 <= '^')||LA8_127=='`'||(LA8_127 >= '{' && LA8_127 <= '\uFFFF')) ) {s = 129;}
						else s = 21;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA8_151 = input.LA(1);
						s = -1;
						if ( (LA8_151=='e') ) {s = 167;}
						else if ( (LA8_151=='o') ) {s = 127;}
						else if ( ((LA8_151 >= '0' && LA8_151 <= '9')||(LA8_151 >= 'A' && LA8_151 <= 'Z')||LA8_151=='_'||(LA8_151 >= 'a' && LA8_151 <= 'd')||(LA8_151 >= 'f' && LA8_151 <= 'n')||(LA8_151 >= 'p' && LA8_151 <= 'z')) ) {s = 128;}
						else if ( ((LA8_151 >= '\u0000' && LA8_151 <= '/')||(LA8_151 >= ':' && LA8_151 <= '@')||(LA8_151 >= '[' && LA8_151 <= '^')||LA8_151=='`'||(LA8_151 >= '{' && LA8_151 <= '\uFFFF')) ) {s = 129;}
						else s = 21;
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA8_100 = input.LA(1);
						s = -1;
						if ( (LA8_100=='o') ) {s = 127;}
						else if ( ((LA8_100 >= '0' && LA8_100 <= '9')||(LA8_100 >= 'A' && LA8_100 <= 'Z')||LA8_100=='_'||(LA8_100 >= 'a' && LA8_100 <= 'n')||(LA8_100 >= 'p' && LA8_100 <= 'z')) ) {s = 128;}
						else if ( ((LA8_100 >= '\u0000' && LA8_100 <= '/')||(LA8_100 >= ':' && LA8_100 <= '@')||(LA8_100 >= '[' && LA8_100 <= '^')||LA8_100=='`'||(LA8_100 >= '{' && LA8_100 <= '\uFFFF')) ) {s = 129;}
						else s = 21;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 8, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
