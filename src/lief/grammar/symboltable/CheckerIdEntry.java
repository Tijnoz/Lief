package lief.grammar.symboltable;

import lief.grammar.LiefTree;



public class CheckerIdEntry extends IdEntry {

	/**
	 * the node where this id entry is declared
	 */
	private LiefTree node;
	
	/**
	 * the Lief type of this entry
	 */
	private String type;

	/**
	 * @return the node where this id entry was declared
	 */
	public LiefTree getNode() {
		return node;
	}

	/**
	 * @param node the CommonTree node where this entry is declared
	 */
	public void setNode(LiefTree node) {
		this.node = node;
	}

	/**
	 * @return the Lief type of this entry
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the Lief type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
}
