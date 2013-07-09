package lief.grammar.symboltable;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable<Entry extends IdEntry> {
	
	private int level;
	private Map<String,Stack<Entry>> tbl;

    /** 
     * Constructor. 
     * @ensures  this.currentLevel() == -1 
     */
    public SymbolTable() { 
        level = -1;
        tbl = new HashMap<String,Stack<Entry>>();
    }

    /** 
     * Opens a new scope. 
     * @ensures this.currentLevel() == old.currentLevel()+1;
     */
    public void openScope()  {
        level++;
    }

    /** 
     * Closes the current scope. All identifiers in 
     * the current scope will be removed from the SymbolTable.
     * @requires old.currentLevel() > -1;
     * @ensures  this.currentLevel() == old.currentLevel()-1;
     */
    public void closeScope() {
        level--;
        for(Stack<Entry> e : tbl.values()){
        	Entry top = e.empty() ? null : e.peek();
        	if(top != null && top.getLevel() > level)
        		e.pop();
        }
    }

    /** Returns the current scope level. */
    public int currentLevel() {
        return level;
    }    

    /** 
     * Enters an id together with an entry into this SymbolTable 
     * using the current scope level. The entry's level is set to 
     * currentLevel().
     * @requires id != null && id.length() > 0 && entry != null;
     * @ensures  this.retrieve(id).getLevel() == currentLevel();
     * @throws SymbolTableException when there is no valid 
     *    current scope level, or when the id is already declared 
     *    on the current level. 
     */
    public void enter(String id, Entry entry) throws SymbolTableException { 
        entry.setLevel(level);
        if(level < 0 ) 
        	throw new SymbolTableException("Wrong level.");
        Entry existing = retrieve(id);
        if(existing != null && existing.getLevel()==level)
        	throw new SymbolTableException("Variable "+id+" already declared on the current level.");
        if(!tbl.containsKey(id))
        	tbl.put(id, new Stack<Entry>());
        tbl.get(id).push(entry);        	
    }

    /** 
     * Get the Entry corresponding with id whose level is
     * the highest; in other words, that is defined last.
     * @return  Entry of this id on the highest level
     *          null if this SymbolTable does not contain id 
     */
    public Entry retrieve(String id) {
        return tbl.get(id) == null || tbl.get(id).empty() ? null : tbl.get(id).peek();
    }    
}

