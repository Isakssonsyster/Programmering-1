import java.util.Scanner;

public class Abracadabra {

	private static Scanner input;
	public static void main(String[]args) {
		
		input = new Scanner(System.in);
		
		int Användaren = input.nextInt();
		


		for(int index = 1; index <= Användaren; index++) {
			System.out.print("\n" + index + " Abracadraba");
			
		}
		}
}


