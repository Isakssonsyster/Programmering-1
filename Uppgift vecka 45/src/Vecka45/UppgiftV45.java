package Vecka45;

import java.util.Scanner;

public class UppgiftV45 {
	
	public static void main(String[] args) {
		System.out.println("Method 1: ");
		CtoFH();
	}
	
	public static void CtoFH() {
		Scanner input = new Scanner(System.in); // Gör en ny scanner
		
		
		System.out.println("Skriv in grader i fahrenheit: ");
		
		double grader = input.nextInt(); // Fahrenheiten man ska skriva in
		double celsius = grader / 33.8; // Räknar ut från fahrenheit till celsius

		System.out.println("Graderna i celsius: " + celsius);
		
	}

}
