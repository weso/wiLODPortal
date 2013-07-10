package es.weso.model;

/**
 * Representation of a rank for the web index project
 * 
 * @author Alejandro Montes García
 * @since 01/07/2013
 * @version 1.0
 */
public class Rank {

	private int position, outOf;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getOutOf() {
		return outOf;
	}

	public void setOutOf(int outOf) {
		this.outOf = outOf;
	}

}
