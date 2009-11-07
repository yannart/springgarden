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

		// On lit le fichier de configuration de Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// On recupere l'objet Jardin a partir du Bean Spring */
		IJardin jardin = context.getBean("jardin", IJardin.class);
 
		// On montre le contenu du jardin */
		System.out.println("\nJARDIN DE DEPART");
		jardin.listerParcelles();
 
		// On arrose tout le jardin */
		System.out.println("\nON ARROSE LE JARDIN");
		jardin.arrose();

		// On met de l'engrais a tout le jardin */
		System.out.println("\nON MET DE L'ENGRAIS DANS LE JARDIN");
		jardin.mettreEngrais();

		// On montre le contenu du jardin */
		System.out.println("\nJARDIN A LA FIN");
		jardin.listerParcelles();
	}
}
