import java.util.Scanner;

public class Heltal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv två heltal: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int min = a;
		
		
		
			if(min > a) {
				min = a;
			} if(min > b) {
				min = b;
			}
			
		System.out.println( min );
	}
	
}
