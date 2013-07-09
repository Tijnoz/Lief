package lief.grammar;

import jas.jasError;
import jasmin.ClassFile;
import java.io.*;

import org.antlr.runtime.*;             // ANTLR runtime library
import org.antlr.runtime.tree.*;        // For ANTLR's Tree classes
import org.antlr.stringtemplate.*;      // For the DOTTreeGenerator

/** 
 * Program that creates and starts the Lief lexer, parser, etc.
 * @author  Martijn Hoogesteger, Pim Jager
 * @version 7-8-2012
 */
public class Lief {
    /**
     * Option boolean to generate the (checker's) AST
     */
    private static boolean  opt_ast             = false;
    
    /**
     * Option boolean to generate the (checker's) DOT tree
     */
    private static boolean  opt_dot             = false;
    
    /**
     * Option boolean to disable the checker (no generation possible)
     */
    private static boolean  opt_no_checker      = false;

    /**
     * Option boolean generate the java .class file
     */
    private static boolean	opt_generator		= true;
    
    /**
     * Option boolean to generate the intermittent jasmin file
     */
    private static boolean 	opt_jasmin			= false;
    
    /**
     * Container for the source file
     */
    private static File file;
    
    /**
     * TreeAdaptor for Lief. Makes sure that treeparsers are able to use LiefTree instead of CommonTree
     */
    private static TreeAdaptor liefTreeAdaptor = new CommonTreeAdaptor(){
    	 public Object create(Token token) { return new LiefTree(token); }
         public Object dupNode(Object t) {
             if ( t==null ) return null;
             return create(((LiefTree)t).token);
         }
    };
    
    /**
     * @return the source filename 
     */
    public static String getFilename() {
    	return file.getName();
    }
    
    /**
     * @return the source parent folder name
     */
    public static String getFolder() {
    	return file.getParent();
    }
    
    /**
     * @return the source's filename as classname (No extension, first letter capitalised)
     */
    public static String getClassname() {
    	String fn = getFilename();
    	String[] ex = fn.split("\\.");
    	String result = ex[0].substring(0,1).toUpperCase()+ex[0].toLowerCase().substring(1);
    	return result;
    }
    
    /**
     * Main method that calls all other subroutines to execute the full translation of the source file
     */
    public static void main(String[] args) {
        parseOptions(args);
        CommonTree tree = null;
        ANTLRInputStream antlrinput = null;
        
		try {
			antlrinput = new ANTLRInputStream(new FileInputStream(file),"UTF8");
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: Lief file not found:\n"+e.getMessage());
			exit();
		} catch (IOException e) {
			System.err.println("ERROR: IOException on opening Lief file:\n"+e.getMessage());
			exit();
		}
  	
        try {
        	tree = parseInput(antlrinput);
        }	catch (RecognitionException e) {
            System.err.println("ERROR: recognition exception thrown by parser:\n"+e.getMessage());
            exit();
        }
        
        try {
        	if (! opt_no_checker) tree = checkAST(tree);
        } catch (RecognitionException e) {
            System.err.println("ERROR: recognition exception thrown by checker:\n"+e.getMessage());
            exit();
        }	
        String jasmin = "";
    	try {
    		if( opt_generator && !opt_no_checker) {
        		//generate jasmin code from (checked) AST
        		jasmin = generateCode(tree,"jasmin");
        		if(opt_jasmin) writeJasminFile(jasmin, getFolder(), getClassname());
        		//We have jasmin code. Now call Jasmin to convert it to actual byte code.
        		writeJVMFile(new StringReader(jasmin), getFolder(), getClassname());
        		System.out.println("Compiled successfully. Files have been written to: "+getFolder());
    		}
    	} catch (RecognitionException e) {
            System.err.println("ERROR: recognition exception thrown by codegenerator:\n"+e.getMessage());
            System.exit(1);
        } catch(Exception e) { //Jasmin throws Exception, no better specification of the Exception is possible
        	System.err.println("ERROR: generating JVM Bytecode failed:\n"+e.getMessage());
        	e.printStackTrace();
        	System.err.print(jasmin);
        	exit();
        }
                
        //Extra output options
        try {
        	PrintStream out = new PrintStream(System.out, true, "UTF-8");
	        if (opt_ast) out.println(tree.toStringTree()); 
	        else if (opt_dot) out.println(new DOTTreeGenerator().toDOT(tree, liefTreeAdaptor));
		} catch (UnsupportedEncodingException e) {
			System.err.println("ERROR: outputting AST failed:\n"+e.getMessage());
		}

    }

    /**
     * Parses the given arguments and sets the global boolean option variables
     * @param args The main arguments given to the main function
     */
	public static void parseOptions(String[] args) {
		if(args.length==0) {
            System.err.println("No arguments given.");
            exit();
        }
    	file = new File(args[0]);
        for (int i=1; i<args.length; i++) {
            if 		(args[i].equals("-ast")) opt_ast = true;
            else if (args[i].equals("-dot")) opt_dot = true;
            else if (args[i].equals("-no_checker")) opt_no_checker = true;
            else if (args[i].equals("-createjasmin")) opt_jasmin = true;
            else if (args[i].equals("-no_jvm")) opt_generator = false;
            else {
            	System.err.println("error: unknown option '" + args[i] + "'");
            	System.err.print("In arguments:");
            	for(int x=0;x<args.length;x++) System.err.print(args[x]+", ");
            	System.err.println();	
                exit();
            }
        }
    }
	
	private static void exit() {
		System.err.println("Usage: <source filename> [-ast] [-dot] [-no_checker] [-no_jvm] [-createjasmin]");
		System.exit(1);
	}
      
	
	/**
	 * Uses the inputstream to parse the given tokens, also sets the treeadaptor of the tree to the liefTreeAdaptor
	 * @param antlrinput The antlr inputstream
     * @return the AST that is generated from the input
     */
    private static CommonTree parseInput(ANTLRInputStream antlrinput) throws RecognitionException {
    	LiefLexer lexer = new LiefLexer(antlrinput);
        TokenStream tokens = new CommonTokenStream(lexer);
        LiefParser parser = new LiefParser(tokens);
        parser.setTreeAdaptor(liefTreeAdaptor);
        return (CommonTree) parser.program().getTree();
		
	}

	/**
	 * Uses the given AST to check syntactical, contextual and semantic bounds. 
	 * @param tree The undecorated AST
     * @return a new decorated AST (identifier information, etc)
     */    
	private static CommonTree checkAST(CommonTree tree) throws RecognitionException {
		TreeNodeStream nodes = new CommonTreeNodeStream(tree);
        LiefChecker checker = new LiefChecker(nodes);
        checker.setTreeAdaptor(liefTreeAdaptor);
        return (LiefTree) (checker.program()).getTree();
	}

	/**
	 * Generates code as a String from a decorated AST
	 * @param language String representation of the folder to use for stringTemplates
     * @return The generated code

     */
	private static String generateCode(CommonTree tree, String language) throws RecognitionException, IOException {
		TreeNodeStream nodes = new BufferedTreeNodeStream(tree);
        LiefCodeGenerator generator = new LiefCodeGenerator(nodes);
        StringTemplateGroup stg = new StringTemplateGroup("GenTemplates",new File(".").getCanonicalPath()+"/stringTemplates/"+language);
        generator.setTemplateLib(stg);
        StringTemplate st = generator.program().st;
        return st.toString();
	}
	
	/**
	 * Writes a Jasmin file
	 * @param jasmin The code to put in the file
	 * @param folder The folder to put the file in
	 * @param name The name to use for the file
     */
	private static void writeJasminFile(String jasmin, String folder, String name) throws IOException {
		File out_file = new File(folder, name + ".j");
    	//Check folder
        File dest = new File(folder);
        if (!dest.exists()) dest.mkdirs();
        if (!dest.isDirectory()) throw new IOException("Cannot create directory: "+dest.toString());
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out_file)));
        out.write(jasmin);
        out.flush();
        out.close();
	}

	/**
	 * Writes a JVM .class file
	 * @param jasminCode The Reader from where to read the jasminCode from
	 * @param folder The folder to put the file in
	 * @param name The name to use for the file
     */
	private static void writeJVMFile(StringReader jasminCode, String folder, String name) throws IOException, jasError, Exception {
        ClassFile jasmin = new jasmin.ClassFile();
        jasmin.readJasmin(jasminCode, name, false);
        //Only parse output bytecode if Jasmin successfully compiled
        if (jasmin.errorCount() > 0) {
        	System.err.println("Jasmin Error: Found "+ jasmin.errorCount() + " errors");
        	return; //Do not generate file
        }
    	File out_file = new File(folder, name + ".class");
    	//Check folder
        File dest = new File(folder);
        if (!dest.exists()) dest.mkdirs();
        if (!dest.isDirectory()) throw new IOException("Cannot create directory: "+dest.toString());
        FileOutputStream out = new FileOutputStream(out_file);
        jasmin.write(out);
        out.close();
	}
}
