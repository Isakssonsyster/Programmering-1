// Uppgift 1

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
}



// Uppgift 4

public static String sjorovarSpr�ket(String str) {
	String Result = " ";
	
	Scanner input = new Scanner(System.in);
	int aWord = input.nextInt();
	// Skapar en scanner f�r input och en variabel f�r det man ska skriva in
	
	for(int i = 0; i < str.length(); i++) {
		Object theResult;
		if (str.charAt(i) == ' ') {
			
			theResult = theResult + ' ';
			
		} else if (str.charAt(i) == 'x') {
			
			theResult = theResult + "koksos";
			
		} else if (str.charAt(i) == 'c')
		
			theResult = theResult + "kok";
		
		} int i;
		 if (str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == '�'
				 
				|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'y' || str.charAt(i) == '�'
				
				|| str.charAt(i) == '�' || str.charAt(i) == 'A' || str.charAt(i) == 'O' || str.charAt(i) == 'U'
				
				|| str.charAt(i) == '�' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'Y'
				
				|| str.charAt(i) == '�' || str.charAt(i) == '�') {
			 
			 	String theResult = theResult + str.charAt(i);
			
		 } else {
			 
			 String theResult = theResult + str.charAt(i) + "o" + str.charAt(i);
			 
		}
}
} // Jag f�rst�r inte den sista

