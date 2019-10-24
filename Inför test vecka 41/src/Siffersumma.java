import java.util.Scanner;

public class Siffersumma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in ett heltal: ");
		
		int heltal = input.nextInt();
		int svar = 0;
		
			while(heltal != 0) {
				svar += heltal % 10;
				heltal /= 10;
			}
		System.out.println(svar);
		
		
	}
}
