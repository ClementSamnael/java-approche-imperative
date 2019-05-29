import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		boolean correct=false;
		
		while(!correct) {
			System.out.println("Entrez un nombre entre 1 et 10 ");
			nb = scanner.nextInt();
			if(nb>1 && nb<10) {
				correct = true;
				
			}else{
				correct = false;
				
			}
		}
		
		System.out.println(nb);
		scanner.close();
	}
}
