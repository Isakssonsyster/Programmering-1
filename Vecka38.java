import java.util.Scanner;

public class Vecka38 {

	private static Scanner input10;
	private static Scanner input9;
	private static Scanner input8;
	private static Scanner input7;
	private static Scanner input6;
	private static Scanner input5;
	private static Scanner input4;
	private static Scanner input3;
	private static Scanner input2;
	private static Scanner input;

	public static void main(String[] args) {
		
	input = new Scanner(System.in);
	System.out.println("Skriv en siffra");
	int heltal1 = input.nextInt();
	     
		int max = heltal1;
		int min = heltal1;
	
	input2 = new Scanner(System.in);
	System.out.println("Skriv en siffra");
	int heltal2 = input2.nextInt();
	
	if(max < heltal2) {
	max = heltal2;
	} 
	if(min > heltal2) {
		min = heltal2;
	}

			
	
	input3 = new Scanner(System.in);
	System.out.println("Skriv en siffra");
	int heltal3 = input3.nextInt();
	
	if(max < heltal3) {
	max = heltal3;
	} 
	if(min > heltal3) {
	min = heltal3;
		}

	
	input4 = new Scanner(System.in);
	System.out.println("Skriv en siffra");
	int heltal4 = input4.nextInt();
	
	if(max < heltal4) {
	max = heltal4;
	} 
	if(min > heltal4) {
		min = heltal4;
	}

	
	input5 = new Scanner(System.in);
	System.out.println("Skriv en siffra");
	int heltal5 = input5.nextInt();

	if(max < heltal5) {
	max = heltal5;
	} 
	if(min > heltal5) {
		min = heltal5;
	}

	
	input6 = new Scanner(System.in);
	System.out.println("Skriv en siffra");
	int heltal6 = input6.nextInt();
	
	if(max < heltal6) {
	max = heltal6;
	} 
	if(min > heltal6) {
	min = heltal6;
	}
		
	input7 = new Scanner(System.in);
	System.out.println("Skriv en siffra");
	int heltal7 = input7.nextInt();
	
	if(max < heltal7) {
	max = heltal7;
	} 
	if(min > heltal7) {
		min = heltal7;
	}

	
	input8 = new Scanner(System.in);
	System.out.println("Skriv en siffra");
	int heltal8 = input8.nextInt();
	
	if(max < heltal8) {
	max = heltal8;
	} 
	if(min > heltal8) {
		min = heltal8;
	}

	
	input9 = new Scanner(System.in);
	System.out.println("Skriv en siffra");
	int heltal9 = input9.nextInt();
	
	if(max < heltal9) {
	max = heltal9;
	} 
	if(min > heltal9) {
		min = heltal9;
	}

	
	input10 = new Scanner(System.in);
	System.out.println("Skriv en siffra");
	int heltal10 = input10.nextInt();
	
	if(max < heltal10) {
	max = heltal10;
	} 
	if(min > heltal10) {
		min = heltal10;
	}

	System.out.print("\nSkriv 10 heltal:" + heltal1 + heltal2 + heltal3 + heltal4 + heltal5 + heltal6 + heltal7 + heltal8 + heltal9 + heltal10);
	System.out.print("\n\nMedelvärdet:\t"+(heltal1+heltal2+heltal3+heltal4+heltal5+heltal6+heltal7+heltal8+heltal9+heltal10)/10);
	System.out.print("\nMinsta värdet:\t" + min);
	System.out.print("\nStörsta värdet:\t" + max );
	}
}
