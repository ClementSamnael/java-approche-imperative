import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre entre 1 et 10 ");
		int nb = scanner.nextInt();
		
		for(int i=nb; i<=nb+10; i++) {
			System.out.println(i);
		}
		scanner.close();
	}

}
