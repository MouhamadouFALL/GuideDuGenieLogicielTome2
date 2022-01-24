package guideDuGenieLogiccielTome2.VII.langageJava.Chaine;

import javax.swing.JOptionPane;

public class TraiteChaine {
	
	public static int compteMots(String str) {
		
		boolean trouvemots = false;
		int n, i, cpt = 0;
		n = str.length();
		for (i = 0; i < n; i++) {
			if (str.charAt(i) != ' ') {
				trouvemots = true;
			}
			else {
				if (trouvemots) {
					cpt++;
					trouvemots = false;
				}
			}
		}
		if (trouvemots) cpt++;
		
		return cpt;
	}

	public static void main(String[] args) {
		
		int nbmots;
		String str = JOptionPane.showInputDialog("Entrer une chaine ");
		
		nbmots = compteMots(str);
		JOptionPane.showMessageDialog(null, "La chaine a " + nbmots + " mots");
		
		System.exit(0);
	}

}
