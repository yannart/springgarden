package org.yannart.springgarden;

/**
 * Plante de jardin.
 */
public interface IPlante {

	/**
	 * Nourri la plante en eau.
	 * 
	 * @param quantite
	 *            quantité d'eau.
	 */
	public abstract void nourriEau(int quantite);

	/**
	 * Nourri la plante en engrais.
	 * 
	 * @param quantite
	 *            quantité d'engrais.
	 */
	public abstract void nourriEngrais(int quantite);

	/**
	 * Affiche en détail la plante.
	 * 
	 * @return détail de la plante.
	 */
	public abstract String getDetail();

	/**
	 * Obtient le nom de la plante.
	 * 
	 * @return nom de la plante.
	 */
	public abstract String getNomPlante();

}