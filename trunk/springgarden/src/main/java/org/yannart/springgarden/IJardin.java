package org.yannart.springgarden;

/**
 * Jardin Spring Garden.
 */
public interface IJardin {

	/**
	 * Arrose chaque zone du jardin.
	 */
	public abstract void arrose();

	/**
	 * Met de l'engrais dans chaque zone du jardin.
	 */
	public abstract void mettreEngrais();

	/**
	 * Affiche les plantes de chaque parcelle.
	 */
	public abstract void listerParcelles();

}