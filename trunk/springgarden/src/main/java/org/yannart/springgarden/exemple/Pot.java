package org.yannart.springgarden.exemple;

import org.yannart.springgarden.Plante;

/**
 * Pot qui contient une plante.
 */
public class Pot {

	/** Plante dans le pot */
	private Plante plante;

	/** Constructeur sans plante */
	public Pot() {
		plante = new Tomate();
	}

	/** Constructeur avec plante */
	public Pot(Plante plante) {
		this.plante = plante;
	}
}

/**
 * Plante spécifique.
 */
class Tomate extends Plante {

}
