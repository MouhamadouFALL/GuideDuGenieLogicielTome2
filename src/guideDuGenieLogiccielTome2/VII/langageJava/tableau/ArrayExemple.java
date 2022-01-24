package guideDuGenieLogiccielTome2.VII.langageJava.tableau;

import java.util.Scanner;

public class ArrayExemple {
	
	static Scanner input = new Scanner(System.in);

	public static int getInt(String prompt) {
		System.out.print(prompt +" ");
		int entier = input.nextInt();
		input.nextLine();
		return entier;
		//return  input.nextInt();
	}
	
	public static String getString(String prompt) {
		System.out.print(prompt + " ");
		return input.nextLine();
	}
	
	public static void main(String[] args) {
		int numNoms = getInt("Nombre d'entrées du tableau ?");
		String[] noms = new String[numNoms];
		
		for (int i = 0; i < noms.length; i++) {
			noms[i] = getString("Entrée n " + (i+1));
		}
		
		//Affichage du tableau des noms
		for (int i = 0; i < noms.length; ++i) {
			System.out.println(noms[i]);
		}
	}

}
