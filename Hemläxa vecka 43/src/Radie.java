import java.util.Scanner;
public class Radie {

	public static void main(String[] args) {
		
	}
	
	
	public static void doubleVolume(Object radius) {
		
		Math doubleRadius = null; 
		
		//Omvandlar doubleRadius till en matematik variabel
		
		
		Scanner input = new Scanner(System.in); 	// G�r en Scanner
		
		
		System.out.println("Skriv in cirkelns radie: ");
		int radie = input.nextInt();
		// definierar vilken som �r radien man skriver in
		
		Math pi;
		int volym = 4 * pi * radie^3 /3;
		// definierar hur programmet ska r�kna ut cirkelns volym
		
		
		System.out.println("Cirkelns volym: " + volym); //Skriver ut cirkelns volym 
	}
//*
	
	
	
	
	
// Uppgift 2
private static void stringName(int name) {
	// TODO Auto-generated method stub
	int Name = 0;
	Scanner read = new Scanner(System.in);
	
	//Skapar en ny scanner vid namn read
	
	System.out.println("Skriv in en string: ");
	
	String str = read.nextLine();  // G�r en ny scanner d�r man kan skriva in sin String
	StringBuilder sb = new StringBuilder(str); // G�r s� att man kan �ndra p� stringen personen har skrivit in p� vilket s�tt som helst
	
	System.out.println("String Reversed: ");
	System.out.println(sb.reverse().toString()); // skriver ut stringen bakl�nges
}

//


// Uppgift 3
private static void stringCount(String str, char c) {
	// TODO Auto-generated method stub
	// G�r en method till uppgift 3 som visar att den ska r�kna ut antalet g�nger C �terkommer i en string
	Scanner input = new Scanner(System.in); // Skapar en Scanner f�r input
	int theWord = input.nextInt();
	//Skapar en variabel som man kan r�kna ut antal C
	
	
	int repeatsOfC = 0;
	
	
	if (str.charAt(theWord) == c) {
		repeatsOfC++;
	}
	
	// R�knar ut hur m�nga g�nger C skrivs i Stringen man skriver in
	
	return reopeatsOfC; //Ska visa hur m�nga g�nger som C anv�nds
}

