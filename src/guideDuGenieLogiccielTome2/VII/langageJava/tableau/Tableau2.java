package guideDuGenieLogiccielTome2.VII.langageJava.tableau;

public class Tableau2 {

	public static void affiche(int t[][]) {
		for (int[] ligne : t) {
			for (int cell : ligne) {
				System.out.print(" | " + cell);
			}
			System.out.print(" |");
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
		// tableau r�gulier
		int[][] tabR = new int[4][6];
		for (int i = 0; i < tabR.length; i++) {
			for (int j = 0; j < tabR[i].length; j++) {
				tabR[i][j] = i + j;
			}
		}
		// Afficher Tableau R�gulier
		System.out.println("Affichage du tableau r�gulier ");
		affiche(tabR);
		System.out.println("   ");
		
		// Tableau Irr�gulier
		int[][] tabIR = {
				{12, 13, 14, 15},
				{98, 97, 96, 95, 89, 54},
				{10, 20, 30},
				{54, 47, 53, 23, 41}
		};
		System.out.println("Affichage du tableau irr�gulier ");
		affiche(tabIR);
	}

}
