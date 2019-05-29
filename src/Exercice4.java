import java.util.Scanner;


public class Exercice4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre entre 1 et 10 ");
		int nb = scanner.nextInt();
		
		for(int nbUser=1; nbUser<=10; nbUser++ ) {
			int resultat = 0;
			resultat = nbUser * nb; 
			System.out.println(nb + "*" + nbUser + "=" +resultat);
		}
		scanner.close();
	}

}
