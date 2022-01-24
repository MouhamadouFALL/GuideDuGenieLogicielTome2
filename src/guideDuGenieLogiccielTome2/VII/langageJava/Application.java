package guideDuGenieLogiccielTome2.VII.langageJava;

import javax.swing.JOptionPane;

public class Application {
	
	// Exercice 6.4

	public static void main(String[] args) {
		
		String nom = JOptionPane.showInputDialog("Entrer le nom de la personne :  ");
		String prenom = JOptionPane.showInputDialog("Entrer le nom de la personne :  ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Entrer l'age de la personne :  "));
		
		if (age < 18)
			System.out.println(prenom + "  " + nom + " agé de " + age + " ans est mineur");
		else
			System.out.println(prenom + "  " + nom + " agé de " + age + " ans est majeur");
		
		

	}

}
