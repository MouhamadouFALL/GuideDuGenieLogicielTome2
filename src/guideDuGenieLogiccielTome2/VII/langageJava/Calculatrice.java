package guideDuGenieLogiccielTome2.VII.langageJava;

import javax.swing.JOptionPane;

public class Calculatrice {

	public static void main(String[] args) {
		int A, B, choix;
		
		System.out.println("MENU CALCULATRICE");
		System.out.println("1- Addition");
		System.out.println("2- Soustraction");
		System.out.println("3- Multiplication");
		
		choix = Integer.parseInt(JOptionPane.showInputDialog("Entrer votre choix : "));
		
		switch (choix)
		{
			case 1:
				A = Integer.parseInt(JOptionPane.showInputDialog("Entrer la premiere valeur : "));
				B = Integer.parseInt(JOptionPane.showInputDialog("Entrer la dexieme valeur : "));
				System.out.println(A + " + " + B + " = " + (A+B));
				break;
			case 2:
				A = Integer.parseInt(JOptionPane.showInputDialog("Entrer la premiere valeur : "));
				B = Integer.parseInt(JOptionPane.showInputDialog("Entrer la dexieme valeur : "));
				System.out.println(A + " - " + B + " = " + (A-B));
				break;
			case 3:
				A = Integer.parseInt(JOptionPane.showInputDialog("Entrer la premiere valeur : "));
				B = Integer.parseInt(JOptionPane.showInputDialog("Entrer la dexieme valeur : "));
				System.out.println(A + " * " + B + " = " + (A*B));
				break;
			default:
				System.out.println("entrer de choix");
				System.out.println("Au revoir");
		}
		

	}

}
