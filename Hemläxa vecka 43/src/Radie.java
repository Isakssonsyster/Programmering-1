import java.util.Scanner;
public class Radie {

	public static void main(String[] args) {
		
		Math doubleRadius = null;
		doubleVolume(doubleRadius); 
		// Skapar en ny method
	}

	public static void doubleVolume(Object radius) {
		
		Scanner input = new Scanner(System.in); 	// G�r en Scanner
		System.out.println("Skriv in cirkelns radie: ");
		int radie = input.nextInt();
		// definierar vilken som �r radien man skriver in
		Math pi;
		int volym = 4 * pi * radie^3 /3;
		// definierar hur programmet ska r�kna ut cirkelns volym
		System.out.println("Cirkelns volym: " + volym);
	}
	

public static void String(String[] args) {
	int Name = 0;
	stringName(Name);
}
// G�r en ny method till uppgift 2
private static void stringName(int name) {
	// TODO Auto-generated method stub
	Scanner read = new Scanner(System.in);
	
	System.out.println("Skriv in en string: ");
	
	String str = read.nextLine(); // G�r en ny scanner d�r man kan skriva in sin String
	StringBuilder sb = new StringBuilder(str); // G�r s� att man kan �ndra p� stringen personen har skrivit in p� vilket s�tt som helst
	
	System.out.println("String Reversed: ");
	System.out.println(sb.reverse().toString()); // skriver ut stringen bakl�nges
}

}
