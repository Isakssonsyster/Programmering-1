package �vningar;

import java.util.Scanner;

public class Lektions�vningar {

	public static void main(String[] args) {
		
		System.out.println("Uppgift1: ");
		Uppgift1();
		

		}
		
	public static void Uppgift1() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv tv� heltal: ");
		
		int lowest = 0;
		int highest = 0;
		
		for(int i = 0; i < 2; i++) {
			
			int heltal = input.nextInt();
			
			if(i == 0) {
				
				lowest = heltal;
				highest = heltal;
				
			}
			
			else if(heltal > highest) {
				
				highest = heltal;
				
			}
			
			else if(heltal < lowest) {
				
				lowest = heltal;
			}
			
		System.out.println("L�gsta: " + lowest);
		}
	}
	
	public static void Uppgift2() {
		
		Scanner input = new Scanner((Readable) System.out);	
		
		int heltal = input.nextInt();
		
	}

}
