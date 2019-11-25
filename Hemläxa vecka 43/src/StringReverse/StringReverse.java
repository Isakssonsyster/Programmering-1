package StringReverse;

import java.util.Scanner;

public class StringReverse {
	
	private static void stringName(int name) {
		// TODO Auto-generated method stub
		int Name = 0;
		stringName(Name);
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
	}
	

	


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