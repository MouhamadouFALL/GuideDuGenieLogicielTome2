package guideDuGenieLogiccielTome2.VII.langageJava;

import javax.swing.JOptionPane;

public class Produit {
	
	// Exercice 6.7

	public static void main(String[] args) {
		String code = JOptionPane.showInputDialog("Entrer le code du produit : ");
		String reference = JOptionPane.showInputDialog("Entrer la r�f�rence du produit : ");
		int pu = Integer.parseInt(JOptionPane.showInputDialog("Entrer le prix unitaire du produit : "));
		int qstock = Integer.parseInt(JOptionPane.showInputDialog("Entrer la quantit� en stock du produit : "));
		
		int vstock;
		vstock = qstock*pu;
		
		System.out.println("code : " + code + ", r�f�rence : " + reference + ", prix unitaire : " + pu + ", quantit� en stock : " + qstock + " .");
		System.out.println("La valeur en stock : " + vstock);
		
		
	}

}
