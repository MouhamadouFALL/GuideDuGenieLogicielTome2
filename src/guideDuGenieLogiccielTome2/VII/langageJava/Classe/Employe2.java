package guideDuGenieLogiccielTome2.VII.langageJava.Classe;

public class Employe2 {

	private String nom, prenom;
	private Date daten;
	
	public Employe2(String nom, String prenom, int jn, int mn, int an) {
		this.nom = nom;
		this.prenom = prenom;
		this.daten = new Date(jn, mn, an);
	}
	
	public void affiche() {
		System.out.println("Prenom : " + prenom + " Nom : " + nom + " Date naissance : " + daten.getDate());
		System.out.println("La date de naissance est : " + daten.getDate());
	}
	
}
