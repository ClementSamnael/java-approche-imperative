
public class Exercice1 {

	public static void main(String[] args) {
		int [] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
		
		System.out.println("--------------------------------------------------------");
		for (int j = array.length-1; j >= 0; j--) {
			System.out.println(array[j]+" ");
		}
		System.out.println("--------------------------------------------------------");
		for (int i = 0; i<array.length; i++) {
			if(array[i]>3) {
				System.out.println(array[i]+" ");
			}
		}
		System.out.println("--------------------------------------------------------");
		for(int i = 0; i<array.length;i++) {
			if(array[i]%2 == 0) {
				System.out.println(array[i]+" ");
			}
		}
		System.out.println("--------------------------------------------------------");
		for(int i = 0; i<array.length; i++) {
			if(i%2 == 0) {
				System.out.println(array[i]+" ");
			}
		}
		System.out.println("--------------------------------------------------------");
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==1 || array[i]%2==-1) {
				System.out.println(array[i]+" ");
			}
		}
		System.out.println("--------------------------------------------------------");
		int max = 0;
		for (int i=0;i<array.length; i++) {
			if(array[i] > max ) {
				max = array[i];
			}
		}
		System.out.println(max);
		System.out.println("--------------------------------------------------------");
		int min = 0;
		for (int i=0;i<array.length; i++) {
			if(array[i] < min ) {
				min = array[i];
			}
		}
		System.out.println(min);
	}

}
