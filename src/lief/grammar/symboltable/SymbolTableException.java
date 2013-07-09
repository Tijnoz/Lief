package lief.grammar.symboltable;

import lief.grammar.LiefException;

/** Exception class to signal problems with the SymbolTable */
public class SymbolTableException extends LiefException {
    /** {@link serialVersionUID} is required for Serializable */
    public static final long serialVersionUID = 24362462L;
    public SymbolTableException(String msg) { super(msg); }
}
