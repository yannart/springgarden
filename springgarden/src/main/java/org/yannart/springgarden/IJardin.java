package org.yannart.springgarden;

/**
 * Jardin Spring Garden.
 */
public interface IJardin {

	/**
	 * S'occuper du jardin en nourrissant ses plantes.
	 */
	public abstract void jardiner();
	
	/**
	 * Arrose chaque zone du jardin.
	 */
	public abstract void arroser();

	/**
	 * Met de l'engrais dans chaque zone du jardin.
	 */
	public abstract void mettreEngrais();

	/**
	 * Affiche les plantes de chaque parcelle.
	 */
	public abstract void listerParcelles();

}