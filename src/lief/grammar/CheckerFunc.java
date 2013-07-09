package lief.grammar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import lief.grammar.symboltable.CheckerIdEntry;
import lief.grammar.symboltable.SymbolTable;
import lief.grammar.symboltable.SymbolTableException;

import org.antlr.runtime.tree.CommonTree;

public class CheckerFunc {
	
	// idset - a set of declared identifiers.
	private SymbolTable<CheckerIdEntry> symtab = new SymbolTable<CheckerIdEntry>();
    
	/**
	 * @param s the identifier to check
	 * @return true if s is declared on the current scope, or accessible from the current scope, flase otherwise
	 */
    public boolean  isDeclared(String s)            { return symtab.retrieve(s) != null; 	}
    /**
     * Like isDeclared(s), but s here is expected to still have the 'hartje' character as first character in the 
     * string.
     * @param s the identifier to check, is expected to have an 'hartje'  as first character
     * @return true if s is declared on the current scope, or accessible from the current scope, flase otherwise
     */
    public boolean  isDeclaredH(String s)			{ return isDeclared(s.substring(1)); 	}
    
    /**
     * declares s with type type and declareing node node on the current scope
     * @param s the id to declare 
     * @param type the Lief type of the id
     * @param node the node where it is declared
     * @throws SymbolTableException when requires are not matched
     * @requires symtab.retrieve() == null || symtab.retrieve().getLevel() < symtab.currentLevel()
     * @ensures symtab.retrieve() != null
     */
    public void     declare(String s, String type, LiefTree node) throws SymbolTableException{
    	CheckerIdEntry e = new CheckerIdEntry();
    	e.setNode(node);
    	e.setType(type);
    	symtab.enter(s, e);
    }
    
    /**
     * @param s the rep (without heart symbol) of this var
     * @return the type of this var
     * @requires isDeclared(s)
     */
    public String   getType(String s)  				{ return symtab.retrieve(s).getType();  } 
    /**
     * @param s the rep (with heart symbol) of this var
     * @return the type of this var
     * @requires isDeclaredH(s)
     */
    public String   getTypeH(String s)				{ return getType(s.substring(1)); 		}
    
    /**
     * sets the type of this identifier to the type set at the declaration of this identifier. 
     * @param l the identifier to set the type of
     */
    public void		setTypeVar(LiefTree l)			{ l.setLiefType(getTypeH(l.getText()));	}
    
    private Set<String> types = new HashSet<String>(Arrays.asList(new String[] {GETALLETJE, SMILEY, LETTERTJE}));
    
    /**
     * @param t the type to check for validity
     * @return true if type t is a valid type, false otherwise.
     */
    public boolean  isValidType(String t)           { return types.contains(t); }
    /**
     * Check if two types match
     * @param t1 the type that should equal t1
     * @param t2 the type that should equals 2
     * @return true if t1 equals t2 and bith are non null
     */
    public boolean  typeMatch(String t1, String t2) { return t1 == null ? false : t1.equals(t2); }
    
    public static final String GETALLETJE = "getalletje";
    public static final String SMILEY = "smiley";
    public static final String LETTERTJE = "lettertje";
    public static final String NO_TYPE = "no_type";
    public static final String VOID_TYPE = "void";
    
    /**
	 * Sets that the tree specified by s should not have it's value popped at the end of a sentence. This is useful for the
	 * last sentence of a compound-expression
	 * @param s the sentence to leave it's value on the stack
	 */
	public void shouldReturn(LiefTree s){
		s.setShouldReturn(true);
	}
	
    ///////////////////////////////////////////////////////////
    // 	OPERAND
    ///////////////////////////////////////////////////////////
    /**
     * Checks operand tree of type Char. Performs the following actions:
     * 	- Sets the type of the provided tree to LETTERTJE
     * @param l the tree to check
     */
	public void checkOperandChar(LiefTree l){
		l.setLiefType(LETTERTJE);
	}
	/**
     * Checks operand tree of type Smiley. Performs the following actions:
     * 	- Sets the type of the provided tree to SMILEY
     * @param l the tree to check
     */
	public void checkOperandSmiley(LiefTree l){
		l.setLiefType(SMILEY);
	}
	/**
     * Checks operand tree of type number. Performs the following actions:
     * 	- Sets the type of the provided tree to GETALLETJE
     * @param l the tree to check
     */
	public void checkOperandNumber(LiefTree l){
		l.setLiefType(GETALLETJE);
	}
	/**
	 * Checks operand tree of the type identifier (ID). Performs the following actions:
	 * 	- Checks if the used ID is declared
	 * 	- Sets the declaring node of the ID to the node that declared this identifier on this level in the symboltable
	 * 	- Sets the type of this operand tree to the type declared for this ID in it's declaration.
	 * @param id the operand tree to check
	 * @throws LiefException when ID is not declared/accessible in this scope.
	 */
	public void checkOperandVariable(LiefTree id) throws LiefException{
		if (!isDeclaredH(id.getText()))
            throw new LiefException(id, "is hier niet gedefinieerd");
		id.setDeclaringNode(symtab.retrieve(id.getText().substring(1)).getNode());
		setTypeVar(id);
	}
	/**
     * Checks operand tree of type ( expression ). Performs the following actions:
     * 	- Sets the type of the provided operand tree to the type of the expression tree
     * @param l the tree to check
     */
	public void checkOperandLparen(LiefTree root, LiefTree e){
		root.setLiefType(e.getLiefType());
	}
	
	///////////////////////////////////////////////////////////
	//	COMPOUND_EXPRESSION
	///////////////////////////////////////////////////////////
	/**
	 * Checks compound expression tree. Performs the following actions:
	 * 	- sets the type of the compound expression tree to the type of the provided sentence.
	 * @param root the compound expression
	 * @param s the sentence
	 */
	public void checkCompoundExpr(LiefTree root, LiefTree s){
		root.setLiefType(s.getLiefType());
	}
	
	///////////////////////////////////////////////////////////
	//	EXPRESSION
	///////////////////////////////////////////////////////////
	/**
	 * Checks a binary expression tree. Makes sure that both the provided expression trees are of type SMILEY, if this is the 
	 * case the type of the provided binary expression tree is also set to SMILEY
	 * @param root the binary expression tree to check
	 * @param e1 the first expression tree in this binary expression
	 * @param e2 the second expression tree in this binary expression
	 * @throws LiefException when either e1 or e2 does not have type SMILEY
	 */
	public void checkExprBin(LiefTree root, LiefTree e1, LiefTree e2) throws LiefException{
		if(!typeMatch(e1.getLiefType(), SMILEY)){
			throw new LiefException(root, "een type probleempje, ("+LiefException.formatTree(e1)
					+") is geen 'smiley' maar een '"+e1.getLiefType()+"'");
		}
		if(!typeMatch(e2.getLiefType(), SMILEY)){
			throw new LiefException(root, "een type probleempje, ("+LiefException.formatTree(e2)
					+") is geen 'smiley' maar een '"+e2.getLiefType()+"'");
		}
		root.setLiefType(SMILEY);
	}
	/**
	 * Checks a comparison tree of two arbtitrary types being checked for equality or inequality. Checks that both the expression
	 * trees being checked for (in)equality are of the same type, if this is the case, the type of the comparison tree is set to SMILEY 
	 * @param root the comparison tree to check
	 * @param e1 the first expression tree in this comparison expression
	 * @param e2 the second expression tree in this comparison expression
	 * @throws LiefException when the types of e1 and e2 don't match
	 */
	public void checkExprCompThing(LiefTree root, LiefTree e1, LiefTree e2) throws LiefException{
		if(!typeMatch(e1.getLiefType(), e2.getLiefType()))
		    throw new LiefException(root, "een type probleempje, vergelijkingen werken alleen als beide expressies van hetzelfde type zijn, niet als "
		                              +"de ene een '"+e1.getLiefType()+"' is en de andere een '"+e2.getLiefType()+"'");
		root.setLiefType(SMILEY);
	}
	/**
	 * Checks a comparison tree of two numbers, being tested for inequality, i.e. one being larger or smaller then the other. Checks that both
	 * the expression trees are of type GETALLETJE, if this is the case, the type of the comparison tree is set to SMILEY
	 * @param root the comparison tree to check
	 * @param e1 the first expression tree in this comparison tree
	 * @param e2 the second expression tree in this comparison tree
	 * @throws LiefException when either e1 or e2 does not have type GETALLETJE
	 */
	public void checkExprCompNumber(LiefTree root, LiefTree e1, LiefTree e2) throws LiefException{
		if(!typeMatch(e1.getLiefType(), GETALLETJE))
			throw new LiefException(root, "een type probleempje: rekenkundige expressies werken alleen op getalletjes, niet op: '"+e1.getLiefType()+"'");
		if(!typeMatch(e2.getLiefType(), GETALLETJE))
			throw new LiefException(root, "een type probleempje: rekenkundige expressies werken alleen op getalletjes, niet op: '"+e2.getLiefType()+"'");
		root.setLiefType(SMILEY);
	}
	/**
	 * checks a mathematical expression tree. Checks that both the expression trees are of type GETALLETJE, if this is the case, the type of
	 * the mathematical expression is set to GETALLETJE
	 * @param root the mathematical expression tree to check
	 * @param e1 the first expression tree in this mathematical expression tree
	 * @param e2 the second expression tree in this mathematical expression tree
	 * @throws LiefException if either e1 or e2 does not have type GETALLETJE
	 */
	public void checkExprMath(LiefTree root, LiefTree e1, LiefTree e2) throws LiefException{
		if(!typeMatch(e1.getLiefType(), GETALLETJE))
		    throw new LiefException(root, "een type probleempje: rekenkundige expressies werken alleen op getalletjes, niet op: '"+e1.getLiefType()+"'");
		if(!typeMatch(e2.getLiefType(), GETALLETJE))
		    throw new LiefException(root, "een type probleempje: rekenkundige expressies werken alleen op getalletjes, niet op: '"+e2.getLiefType()+"'");
		root.setLiefType(GETALLETJE);
	}
	/**
	 * checks a not expression. Checks that the provided expression tree is of type SMILEY, if this is the case the type of the 
	 * not expression tree is set to SMILEY
	 * @param root the not expression tree to check
	 * @param e the expression tree in this not expression tree
	 * @throws LiefException when e is not of type SMILEY
	 */
	public void checkExprNot(LiefTree root, LiefTree e) throws LiefException{
		if(!typeMatch(e.getLiefType(), SMILEY))
            throw new LiefException(root, "een type probleempje: je kunt alleen smileys omkeren, niet op: '"+e.getLiefType()+"'");
		root.setLiefType(SMILEY);
	}
	/**
	 * Checks a negation expression tree. Check that the provided expression tree is of type GETALLETJE, if this is the case, the type of the
	 * negation expression tree is set to GETALLETJE
	 * @param root the negation expression tree to check
	 * @param e the expression tree in this negation expression tree
	 * @throws LiefException when e does not have type GETALLETJE
	 */
	public void checkExprNegate(LiefTree root, LiefTree e) throws LiefException{
		if(!typeMatch(e.getLiefType(), GETALLETJE))
            throw new LiefException(root, "een type probleempje: rekenkundige expressies werken alleen op getalletjes, niet op: '"+e.getLiefType()+"'");
		root.setLiefType(GETALLETJE);
	}
	/**
	 * Checks a compound expression tree. Checks that the return type of the compund expression is not NO_TYPE. Thus that the compound expression does
	 * not end in an declaration
	 * @param e the compound expression tree to check
	 * @throws LiefException if the compound expression does have type NO_TYPE
	 */
	public void checkExprCompound(LiefTree e) throws LiefException{
		if(typeMatch(e.getLiefType(), NO_TYPE))
            throw new LiefException(e, "een samengestelde expressie moet wel eindigen met een expressie die een waarde geeft");
	}
	/**
	 * checks an assign expression tree. Checks that the id tree that is assigned to is defined, is writable and that the types of the id tree and
	 * the expression tree match. If this is the case, the type of the assign expression tree is set to the type of the id tree
	 * @param root the assign expression tree to check
	 * @param id the id tree in this assign expression tree
	 * @param e the expression in this assign expression tree
	 * @throws LiefException when wither id is not declared, or id is not writable, or when the types of id and e don't match
	 */
	public void checkExprAssign(LiefTree root, LiefTree id, LiefTree e) throws LiefException{
		if (!isDeclaredH(id.getText()))
            throw new LiefException(id, "is hier niet gedefinieerd");
		if (!symtab.retrieve(id.getText().substring(1)).getNode().isWritable())
            throw new LiefException(id, "mag niet worden overschreven");
		setTypeVar(id);
		if (!typeMatch(id.getLiefType(), e.getLiefType()))
           throw new LiefException(root, "een type probleempje: je kunt aan de variabele '"+id.getText()+"' van het type '"+id.getLiefType()
                                     +"' geen expressie van het type '"+e.getLiefType()+"' toewijzen");
		id.setDeclaringNode(symtab.retrieve(id.getText().substring(1)).getNode()); 
		root.setLiefType(id.getLiefType());
	}
	/**
	 * check a vraag tree of a vraag asking for a single value. Checks that the id is defined and that it is writable. If this
	 * is the case then the type of the vraag tree is set to the type of the id tree.
	 * @param root the vraag tree to check
	 * @param id the id tree in this vraag tree
	 * @throws LiefException when id is not declared, or when it is not writable
	 */
	public void checkExprVraagSingle(LiefTree root, LiefTree id) throws LiefException{
		 if (!isDeclaredH(id.getText()))
             throw new LiefException(id, "is hier niet gedefinieerd");
		 if (!symtab.retrieve(id.getText().substring(1)).getNode().isWritable())
	            throw new LiefException(id, "mag niet worden overschreven");
			setTypeVar(id);
		 id.setDeclaringNode(symtab.retrieve(id.getText().substring(1)).getNode());
		 setTypeVar(id);
		 root.setLiefType(id.getLiefType());
	}
	/**
	 * check a vraag tree of a vraag asking for a multiple values. Checks that the id is defined and that it is writable. If this
	 * is the case then the type of the vraag tree is set to VOID_TYPE
	 * @param root the vraag tree to check
	 * @param id one of the id trees in this vraag tree
	 * @throws LiefException when id is not declared, or when it is not writable
	 */
	public void checkExprVraagMultiple(LiefTree root, LiefTree id) throws LiefException{
		 if (!isDeclaredH(id.getText()))
            throw new LiefException(id, "is hier niet gedefinieerd"); 
		 if (!symtab.retrieve(id.getText().substring(1)).getNode().isWritable())
	            throw new LiefException(id, "mag niet worden overschreven");
			setTypeVar(id);
		 id.setDeclaringNode(symtab.retrieve(id.getText().substring(1)).getNode());
		 setTypeVar(id);
		 root.setLiefType(VOID_TYPE);
	}
	/**
	 * Checks a zeg expression tree of a zeg that outputs a single operand. Checks that the operand has a valid type. If this is the case 
	 * the type of the zeg expression is set to the type of the operand tree
	 * @param root the zeg expression to check
	 * @param op the operand in this zeg expression
	 * @throws LiefException when the Operand is not of a valid type
	 */
	public void checkExprZegSingle(LiefTree root, LiefTree op) throws LiefException {
		if(!isValidType(op.getLiefType()))
			throw new LiefException(op, "kan ik niet zeggen!");
		root.setLiefType(op.getLiefType());
	}
	/**
	 * Checks a zeg expression tree of a zeg that outputs multiple operands. Checks that the operand has a valid type.
	 * If this is the case the type of the zeg expression is set to to VOID_TYPE
	 * @param root the zeg expression to check
	 * @param op one of the operands in this zeg expression
	 * @throws LiefException when the Operand is not of a valid type
	 */
	public void checkExprZegMultiple(LiefTree root, LiefTree op) throws LiefException {
		if(!isValidType(op.getLiefType()))
			throw new LiefException(op, "kan ik niet zeggen!");
		root.setLiefType(VOID_TYPE);
	}
	
	///////////////////////////////////////////////////////////
	//	COMMAND
	///////////////////////////////////////////////////////////
	/**
	 * Checks an if command tree, checks that the expression tree has type SMILEY. Sets the type of this if tree to NO_TYPE
	 * @param root the if command tree to check
	 * @param checkExpr the expression to check
	 * @throws LiefException when checkExpr does not have type SMILEY
	 */
	public void checkIf(LiefTree root, LiefTree checkExpr) throws LiefException{
		if(!typeMatch(checkExpr.getLiefType(), SMILEY))
			throw new LiefException(root, ". De conditie ("+LiefException.formatTree(checkExpr)+") is niet van het type smiley, alleen smiley's kunnen blij zijn");
		root.setLiefType(NO_TYPE);
	}
	/**
	 * Checks a while command tree, checks that the expression tree has type SMILEY. Sets the type of this while tree to NO_TYPE
	 * @param root the while command tree to check
	 * @param checkExpr the expression to check
	 * @throws LiefException when checkExpr does not have type SMILEY
	 */
	public void checkWhile(LiefTree root, LiefTree checkExpr) throws LiefException{
		if(!typeMatch(checkExpr.getLiefType(), SMILEY))
			throw new LiefException(root, ". De conditie ("+LiefException.formatTree(checkExpr)+") is niet van het type smiley");
		root.setLiefType(NO_TYPE);
	}
	/**
	 * Checks a tree for an Empty command. Sets the type of the Empty command tree to NO_TYPE
	 * @param root the empty comamnd tree to check
	 */
	public void checkEmptyCommand(LiefTree root){
		root.setLiefType(NO_TYPE);
	}
	
	
	///////////////////////////////////////////////////////////
	//	DECLARATION
	///////////////////////////////////////////////////////////
	/**
	 * Checks a declaration tree, checks if the id in the id tree is not declared yet, and if the type in the type tree is a valid type. If this
	 * is the case the type of the id is set to the type specified in the type tree, also the id is added to the current scope in the symboltable.
	 * @param root the declaration tree to check 
	 * @param id the id tree in this declaration tree 
	 * @param type the type tree in this declaration tree
	 * @throws LiefException if the type is not a valid type, or if the id is already declared on the current scope.
	 */
	public void checkDeclaration(LiefTree root, LiefTree id, CommonTree type) throws LiefException{
		if(!isValidType(type.getText()))
            throw new LiefException(type, "is geen valide type");
		else{
			try{
		     declare(id.getText(), type.getText(), id);
			} catch (SymbolTableException e){
				throw new LiefException(id, "heb je al gedefinieerd");
			}
		     id.setLiefType(type.getText());
		}
		root.setLiefType(NO_TYPE);
	}
	/**
	 * Checks a constant declaration tree. Checks if the id in the id tree is not declared yet and the expression in the expression tree 
	 * is of a valid type (i.e. not VOID_TYPE). If this is the case, the id is added to the
	 * symboltable on the current scope, and the type of the id tree is set to the type of the expression tree
	 * @param root the constant declaration tree to check
	 * @param id the id tree in this constant declaration tree
	 * @param ex the expression tree in this constant declaration tree
	 * @throws LiefException if either id is already declared, or if ex does not have valid type
	 */
	public void checkConstant(LiefTree root, LiefTree id, LiefTree ex) throws LiefException {
		try{
	     declare(id.getText(), ex.getLiefType(), id);
		} catch (SymbolTableException e){
			throw new LiefException(id, "heb je al gedefinieerd");
		}
		if(!isValidType(ex.getLiefType()))
			throw new LiefException(root, "expressie "+LiefException.formatTree(ex)+" niet van een valide type");
	    id.setLiefType(ex.getLiefType());
	    id.setWritable(false);
		root.setLiefType(NO_TYPE);
	}
	
	///////////////////////////////////////////////////////////
	//	SCOPING
	///////////////////////////////////////////////////////////
	/**
	 * Opens a new scope in the SymbolTable
	 */
	public void openScope(){
		symtab.openScope();
	}
	/**
	 * Closes a new scope in the SymbolTable, thereby removing any symbols declared in this scope
	 */
	public void closeScope(){
		symtab.closeScope();
	}
	
	
	
	
	
	
	
	
	
	
}
