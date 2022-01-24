package guideDuGenieLogiccielTome2.VII.langageJava;

import javax.swing.JOptionPane;

public class Application1 {
	
	//Exercice 6.1

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Entrer une valeur entière : "));
		
		int c = n*n*n;
		
		System.out.println("le cube de " + n + " est : "+ c);
	}
}
