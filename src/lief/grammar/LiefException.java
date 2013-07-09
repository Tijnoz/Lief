package lief.grammar;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.*;

public class LiefException extends RecognitionException {
    private String msg;
    public static final long serialVersionUID = 24162462L; // for Serializable
    
    /**
     * Construct a new LiefException and sets it's message to a message including the provided message.
     * @param msg the message to include in the message
     */
    public LiefException(String msg) {
        super();
        this.msg = "OEPSIE, "+msg+", jij dommie!";
    }

    /**
     * constructs a new LiefException and sets it's message to a message including the provided message and 
     * information about the provided tree node
     * @param tree the tree node that is included in the message
     * @param msg the message that is included in the message
     */
    public LiefException(Tree tree, String msg) {
        super();
        this.msg = "OEPSIE " +formatTree(tree) + msg+", jij dommie!";
    }

    public String getMessage() {
        return msg;
    }
    
    /**
     * @param tree the tree to get a nicely formatted String representation from
     * @return a nicely formatted representation of this tree, including the textual representation and the line and position it was declared
     */
    public static String formatTree(Tree tree){
    	return "'" + tree.getText() + 
                "' (" + tree.getLine() + 
                ":" + tree.getCharPositionInLine() + 
                ") ";
    }
}
