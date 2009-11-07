package org.yannart.springgarden;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Classe que initialise l'application SpringGarden.
 */
public class SpringGardenApplication {

	/**
	 * Methode main ou commence le flux de l'application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Lit le fichier de configuration de Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Recupere l'objet Jardin a partir du Bean Spring */
		IJardin jardin = context.getBean("jardin", IJardin.class);
 
		// Montre le contenu du jardin */
		System.out.println("\nJARDIN DE DEPART");
		jardin.listerParcelles();
 
		// Arrose tout le jardin */
		System.out.println("\nON ARROSE LE JARDIN");
		jardin.arrose();

		// Met de l'engrais a tout le jardin */
		System.out.println("\nON MET DE L'ENGRAIS DANS LE JARDIN");
		jardin.mettreEngrais();

		// Montre le contenu du jardin */
		System.out.println("\nJARDIN A LA FIN");
		jardin.listerParcelles();
	}
}
