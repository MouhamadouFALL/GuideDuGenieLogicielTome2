package guideDuGenieLogiccielTome2.VII.langageJava;

import javax.swing.JOptionPane;

public class Calcul {

	// Exercice 6.2
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Entrer une valeur : "));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Entrer une valeur : "));
		
		int som = n + m;
		int dif = n - m;
		int prod = n * m;
		
		System.out.println("La somme de " + n + " + " + m + " = " + som );
		System.out.println("La difference de " + n + " - " + m + " = " + dif);
		System.out.println("Le produit de " + n + " * " + m + " = " + prod);
		
		System.exit(0);
		
	}

}
