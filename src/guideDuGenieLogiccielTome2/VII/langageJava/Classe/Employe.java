package guideDuGenieLogiccielTome2.VII.langageJava.Classe;

public class Employe {

	private String nom;
	private String prenom;
	private int age;
	
	private static int cpt;
	
	public Employe(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		cpt++;
	}
	
	public void affiche() {
		System.out.println("personne : " + nom + " " + prenom + " " + age + " .");
	}
	
	public static int getNombre() {
		return cpt;
	}
}
