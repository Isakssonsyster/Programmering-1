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