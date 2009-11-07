package org.yannart.springgarden;

/**
 * Jardinier qui s'occupe du jardin.
 */
public class Jardinier implements IJardinier {
	
	/**
	 * Nom du jardinier.
	 */
	private String nom;

	/**
	 * Construit un jardinier.
	 * @param nom nom du jardinier.
	 */
	public Jardinier(String nom) {
		this.nom = nom;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Monsieur " + nom;
	}
}
