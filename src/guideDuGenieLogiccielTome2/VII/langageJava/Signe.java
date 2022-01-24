package guideDuGenieLogiccielTome2.VII.langageJava;

import javax.swing.JOptionPane;

public class Signe {

	// Exercice 6.3
	
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter une valeur entiere : "));
		
		if (n < 0)
			System.out.println(n + " est negatif.");
		if (n > 0)
			System.out.println(n + " est positif.");
		if ( n == 0)
			System.out.println(n + " est nul");

	}

}
