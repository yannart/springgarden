package org.yannart.springgarden;

/**
 * Jardinier du jardin.
 */
public interface IJardinier {

	/**
	 * Obtient le nom du jardinier.
	 * @return le nom du jardinier.
	 */
	public abstract String getNom();
	
	/**
	 * Définit le nom du jardinier.
	 * @param nom nom du jardinier
	 */
	public void setNom(String nom);

}