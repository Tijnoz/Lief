package lief.grammar;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class LiefTree extends CommonTree {

	private String liefType;
	private LiefTree declarePoint = null;
	private int memAddress = -1;
	private boolean shouldReturn = false; //should this command leave something on the stack
	private boolean writable = true; 
	
	public LiefTree() { super(); }
	public LiefTree(Token t) { super(t); }
	
	/**
	 * @param varType the lief type of the node represented by this LiefTree
	 */
	public void setLiefType(String varType){ this.liefType = varType; }
	
	/**
	 * @return the type of the node respresented by this LiefTree
	 */
	public String getLiefType() { return liefType; }
	
	public String toString(){
		return super.toString() + " type: " + liefType;
	}
	
	/**
	 * the LiefTree where this variable was declared. Note that for
	 * non-variable tree nodes this function returns null. The LiefTree where
	 * this is declared is the matching node if this variable 
	 * @return the LiefTree wehere this variable was declared
	 */
	public LiefTree getDeclaringNode(){
		return declarePoint;
	}
	
	/**
	 * Set the node that declared this variable node. Only useful if this tree actually represents a variable node 
	 * @param node the node where this variable was declared.
	 */
	public void setDeclaringNode(LiefTree node){
		declarePoint = node;
	}
	/**
	 * @return the memAdress, -1 if there is no memAdress for this value, the memadress
	 * 	of the getDeclaringNode() if this != null
	 * @ensures getDeclaringNode() != null ? getDeclaringNode().getMemAdress() : memAdress
	 */
	public int getAddress() {
		return  getDeclaringNode() != null ? getDeclaringNode().getAddress() : memAddress;
	}
	/**
	 * @param memAdress the memAdress to set
	 * @requires 0<=memAdress<=255
	 */
	public void setAddress(int memAdress) {
		if(getDeclaringNode() != null)
			getDeclaringNode().setAddress(memAdress);
		else
			this.memAddress = memAdress;
	}
	/**
	 * @return the shouldReturn
	 */
	public boolean shouldReturn() {
		return shouldReturn;
	}
	/**
	 * @param shouldReturn the shouldReturn to set
	 */
	public void setShouldReturn(boolean shouldReturn) {
		this.shouldReturn = shouldReturn;
	}
	
	/**
	 * @return true if the assigned value can be changed
	 */
	public boolean isWritable() {
		return writable;
	}
	
	/**
	 * @param set if the assigned value is allowed to be changed
	 */
	public void setWritable(boolean writeable) {
		this.writable = writeable;
	}
	
	
}
