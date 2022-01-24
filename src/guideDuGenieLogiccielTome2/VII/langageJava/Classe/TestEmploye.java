package guideDuGenieLogiccielTome2.VII.langageJava.Classe;

public class TestEmploye {

	public static void main(String[] args) {
		
		Employe e = new Employe("FALL", "Mouhamadou", 27);
		e.affiche();
		System.out.println("Nombre d\'objet crés : " + e.getNombre());
		
		Employe f = new Employe("DER", "Fatou", 22);
		f.affiche();
		System.out.println("Nombre d\'objet crés : " + f.getNombre());

	}

}
