package guideDuGenieLogiccielTome2.VII.langageJava.tableau;

import javax.swing.JOptionPane;

public class Table {

	// Excercie 6.8
	
	public static void main(String[] args) {
		String staille = JOptionPane.showInputDialog("Entrer la taille du vecteur : ");
		
		int taille = Integer.parseInt(staille);
		int tab[] = new int[taille];
		int i;
		String sval;
		
		// Remplir le tableau
		for (i = 0; i < tab.length; i++) {
			sval = JOptionPane.showInputDialog("Entrer la valeur de la cellule " + i + " : ");
			tab[i] = Integer.parseInt(sval);
		}
		
		// Affichage du tableau
		System.out.println("Affichage des valeurs du vecteur");
		for (i = 0; i < tab.length; i++) {
			System.out.print(" | " +tab[i]);
		}
	}

}
