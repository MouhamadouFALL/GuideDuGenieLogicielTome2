package guideDuGenieLogiccielTome2.VII.langageJava;

import javax.swing.JOptionPane;

public class Produit {
	
	// Exercice 6.7

	public static void main(String[] args) {
		String code = JOptionPane.showInputDialog("Entrer le code du produit : ");
		String reference = JOptionPane.showInputDialog("Entrer la référence du produit : ");
		int pu = Integer.parseInt(JOptionPane.showInputDialog("Entrer le prix unitaire du produit : "));
		int qstock = Integer.parseInt(JOptionPane.showInputDialog("Entrer la quantité en stock du produit : "));
		
		int vstock;
		vstock = qstock*pu;
		
		System.out.println("code : " + code + ", référence : " + reference + ", prix unitaire : " + pu + ", quantité en stock : " + qstock + " .");
		System.out.println("La valeur en stock : " + vstock);
		
		
	}

}
