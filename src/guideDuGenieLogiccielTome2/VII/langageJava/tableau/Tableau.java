package guideDuGenieLogiccielTome2.VII.langageJava.tableau;

public class Tableau {
	
	// Afficher les élément du tableau sur une ligne
	public static void affiche(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(" | " + tableau[i]);
		}
		System.out.println("");
	}
	
	// Effectuer la somme de tous les éléments du tableau
	public static int somme(int[] tableau) {
		int somme = 0;
		for (int i = 0; i < tableau.length; i++) {
			somme += tableau[i];
		}
		
		return somme;
	}
	
	public static int[] creeTableau(int t[]) {
		
		int i, j=0;
		int[] res = new int[t.length];
		
		for (i = 0; i < t.length; i++) {
			if (t[i]%2 == 0) {
				res[j] = t[i];
				j++;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		int tab[] = new int[10];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = i + 1;
		}
		
		System.out.println("Affichage du tableau apres initialisation des 10 premiers entiers : ");
		affiche(tab);
		
		int som = somme(tab);
		System.out.println("Somme tableau : " + som);
		
		System.out.println("Affichage du tableau d'élément paire : ");
		int[] resultat = creeTableau(tab);
		affiche(resultat);
	}
}
