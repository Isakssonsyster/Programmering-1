package V39;

import java.util.Scanner;

public class R2 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
		    System.out.print("Skriv in två heltat: ");
		    
		int R1 = input.nextInt();
		int R2 = input.nextInt(); 
		
		double S = (R1+R2)/2.0;
		
		System.out.print("\nFörsta tal (R1):" + R1 );
		System.out.print("\nAndra tal (R2): " + R2);
		System.out.print("\nMedelvärdet (S): " + S);
		
		}
		}
