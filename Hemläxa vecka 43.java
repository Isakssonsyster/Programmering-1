// Uppgift 1

import java.util.Scanner;
public class Radie {

	public static void main(String[] args) {
		
	}
	
	
	public static void doubleVolume(Object radius) {
		
		Math doubleRadius = null; 
		
		//Omvandlar doubleRadius till en matematik variabel
		
		
		Scanner input = new Scanner(System.in); 	// Gör en Scanner
		
		
		System.out.println("Skriv in cirkelns radie: ");
		int radie = input.nextInt();
		// definierar vilken som är radien man skriver in
		
		Math pi;
		int volym = 4 * pi * radie^3 /3;
		// definierar hur programmet ska räkna ut cirkelns volym
		
		
		System.out.println("Cirkelns volym: " + volym); //Skriver ut cirkelns volym 
	}
//*
	
	
	
	
	
// Uppgift 2
	
private static void stringName(int name) {
	// TODO Auto-generated method stub
	Scanner read = new Scanner(System.in);
	
	//Skapar en ny scanner vid namn read
	
	System.out.println("Skriv in en string: ");
	
	String str = read.nextLine();  // Gör en ny scanner där man kan skriva in sin String
	StringBuilder sb = new StringBuilder(str); // Gör så att man kan ändra på stringen personen har skrivit in på vilket sätt som helst
	
	System.out.println("String Reversed: ");
	System.out.println(sb.reverse().toString()); // skriver ut stringen baklänges
}

//


// Uppgift 3

private static void stringCount(String str, char c) {
	// TODO Auto-generated method stub
	// Gör en method till uppgift 3 som visar att den ska räkna ut antalet gånger C återkommer i en string
	Scanner input = new Scanner(System.in); // Skapar en Scanner för input
	int theWord = input.nextInt();
	//Skapar en variabel som man kan räkna ut antal C
	
	
	int repeatsOfC = 0;
	
	
	if (str.charAt(theWord) == c) {
		repeatsOfC++;
	}
	
	// Räknar ut hur många gånger C skrivs i Stringen man skriver in
	
	return reopeatsOfC; //Ska visa hur många gånger som C används
} 
}



// Uppgift 4

public static String sjorovarSpråket(String str) {
	String Result = " ";
	
	Scanner input = new Scanner(System.in);
	int aWord = input.nextInt();
	// Skapar en scanner för input och en variabel för det man ska skriva in
	
	for(int i = 0; i < str.length(); i++) {
		Object theResult;
		if (str.charAt(i) == ' ') {
			
			theResult = theResult + ' ';
			
		} else if (str.charAt(i) == 'x') {
			
			theResult = theResult + "koksos";
			
		} else if (str.charAt(i) == 'c')
		
			theResult = theResult + "kok";
		
		} int i;
		 if (str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'å'
				 
				|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'y' || str.charAt(i) == 'ä'
				
				|| str.charAt(i) == 'ö' || str.charAt(i) == 'A' || str.charAt(i) == 'O' || str.charAt(i) == 'U'
				
				|| str.charAt(i) == 'Å' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'Y'
				
				|| str.charAt(i) == 'Ä' || str.charAt(i) == 'Ö') {
			 
			 	String theResult = theResult + str.charAt(i);
			
		 } else {
			 
			 String theResult = theResult + str.charAt(i) + "o" + str.charAt(i);
			 
		}
}
} // Jag förstår inte den sista

