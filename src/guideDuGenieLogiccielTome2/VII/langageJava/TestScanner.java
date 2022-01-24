package guideDuGenieLogiccielTome2.VII.langageJava;

//import java.io.IOExcepton;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TestScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Saisissez une chaine de caracteres :");
		String chaine = scan.nextLine();
		
		Integer nombre = null;
		do {
			try {
				System.out.print("Saisissez un nombre :  ");
				nombre = scan.nextInt();
			}
			catch (InputMismatchException e) {
				scan.next();
				System.err.println("Ceci n'est pqs un nombre valide");
			}
		} while(nombre == null);
		
		String identifiant = null;
		do {
			System.out.print("Saisissez les 8 caractères de votre Identifiant :  ");
			// on utilise une expressin régulière pour vérifeir le prochain token
			if(scan.hasNext(".{8}")) {
				identifiant = scan.next();
			} else {
				scan.next();
				System.err.println("ceci n'est pas un identifiant valide");
			}
		} while (identifiant == null);
		
		System.out.println("Vous avez saisi : ");
		System.out.println(chaine);
		System.out.println(nombre);
		System.out.println(identifiant);
		

	}

}
