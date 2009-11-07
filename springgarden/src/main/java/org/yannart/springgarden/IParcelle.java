package org.yannart.springgarden;

/**
 * Parcelle du jardin.
 */
public interface IParcelle {

	/**
	 * Arrose les plantes de la parcelle du jardin.
	 * 
	 * @param quantite
	 *            quantité d'eau à verser sur chaque plante.
	 */
	public abstract void arroser(final int quantite);

	/**
	 * Met de l'engrais à chaque plante de la parcelle du jardin.
	 * 
	 * @param quantite
	 *            quantité d'engrais à mettre sous chaque plante.
	 */
	public abstract void mettreEngrais(final int quantite);

	/**
	 * Affiche les plantes de la parcelle.
	 */
	public abstract void listerPlantes();

	/**
	 * Positionne les plantes de façon aléatoire.
	 */
	public abstract void melanger();

	/**
	 * Obtient le nom de la parcelle.
	 * 
	 * @return nom de la parcelle.
	 */
	public abstract String getNom();

}