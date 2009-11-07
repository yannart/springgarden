package org.yannart.springgarden;

import java.util.List;

/**
 * Jardin qui contient differentes zones.
 */
public class Jardin implements IJardin {

	/**
	 * Parcelles du jardin.
	 */
	List<IParcelle> parcelles;

	/**
	 * Jardinier du jardin.
	 */
	IJardinier jardinier;

	/**
	 * Dose d'engrais par plante.
	 */
	int doseEngrais;

	/**
	 * Dose d'eau par plante.
	 */
	int doseEau;

	/**
	 * {@inheritDoc}
	 */
	public void jardiner(){

		// Montre le contenu du jardin */
		System.out.println("\nJARDIN DE DEPART");
		this.listerParcelles();
 
		// Arrose tout le jardin */
		System.out.println("\nON ARROSE LE JARDIN");
		this.arroser();

		// Met de l'engrais a tout le jardin */
		System.out.println("\nON MET DE L'ENGRAIS DANS LE JARDIN");
		this.mettreEngrais();

		// Montre le contenu du jardin */
		System.out.println("\nJARDIN A LA FIN");
		this.listerParcelles();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void arroser() {
		System.out.println(jardinier + " arrose le Jardin");
		for (IParcelle zone : parcelles) {
			zone.arroser(doseEau);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void mettreEngrais() {
		System.out.println(jardinier + " met de l'engrais");
		for (IParcelle zone : parcelles) {
			zone.mettreEngrais(doseEngrais);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void listerParcelles() {
		System.out.println("Le Jardin de " + jardinier + " contient:");
		for (IParcelle zone : parcelles) {
			zone.listerPlantes();
		}
	}

	/**
	 * Définit le jardinier du jardin.
	 * @param jardinier le jardinier du jardin.
	 */
	public void setJardinier(IJardinier jardinier) {
		this.jardinier = jardinier;
	}

	/**
	 * Définit la dose d'engrais en grammes à mettre sous chaque plante.
	 * @param doseEngrais dose d'engrais en grammes.
	 */
	public void setDoseEngrais(int doseEngrais) {
		this.doseEngrais = doseEngrais;
	}

	/**
	 * Définit la dose d'eau en ml à arroser sur chaque plante.
	 * @param doseEau dose d'eau en ml.
	 */
	public void setDoseEau(int doseEau) {
		this.doseEau = doseEau;
	}

	/**
	 * Définit les parcelles du jardin.
	 * @param parcelles liste de parcelles du jardin.
	 */
	public void setParcelles(List<IParcelle> parcelles) {
		this.parcelles = parcelles;
	}
}
