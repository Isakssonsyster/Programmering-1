import java.util.Scanner;
public class Radie {

	public static void main(String[] args) {
		
		Math doubleRadius = null;
		doubleVolume(doubleRadius); 
		// Skapar en ny method
	}

	public static void doubleVolume(Object radius) {
		
		Scanner input = new Scanner(System.in); 	// Gör en Scanner
		System.out.println("Skriv in cirkelns radie: ");
		int radie = input.nextInt();
		// definierar vilken som är radien man skriver in
		Math pi;
		int volym = 4 * pi * radie^3 /3;
		// definierar hur programmet ska räkna ut cirkelns volym
		System.out.println("Cirkelns volym: " + volym);
	}
	

public static void String(String[] args) {
	int Name = 0;
	stringName(Name);
}
// Gör en ny method till uppgift 2
private static void stringName(int name) {
	// TODO Auto-generated method stub
	Scanner read = new Scanner(System.in);
	
	System.out.println("Skriv in en string: ");
	
	String str = read.nextLine(); // Gör en ny scanner där man kan skriva in sin String
	StringBuilder sb = new StringBuilder(str); // Gör så att man kan ändra på stringen personen har skrivit in på vilket sätt som helst
	
	System.out.println("String Reversed: ");
	System.out.println(sb.reverse().toString()); // skriver ut stringen baklänges
}

}
