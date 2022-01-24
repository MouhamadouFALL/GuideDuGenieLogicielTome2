package guideDuGenieLogiccielTome2.VII.langageJava;

import javax.swing.JOptionPane;

public class Categorie {

	// Exercie 6.6
	
	public static void main(String[] args) {
		
		String nom = JOptionPane.showInputDialog("Entrer le nom de la personne : ");
		String prenom = JOptionPane.showInputDialog("Entrer le prenom de la personne : ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Entrer l'age de la personne : "));
		int poids = Integer.parseInt(JOptionPane.showInputDialog("Entrer le poids de la personne : "));
		
		System.out.print(prenom + "  " + nom + " agé de " + age + " ans est de ");
		
		if (poids < 10)
			System.out.println("catégorie poussin.");
		if ((poids <= 25)&&(poids >= 10))
			System.out.println("catégorie pupille.");
		if (poids > 25)
			System.out.println("catégorie normale.");
		
		
	}

}
