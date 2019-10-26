import java.util.Scanner;
public class Radie {

	public static void main(String[] args) {
		
		Math doubleRadius = null;
		doubleVolume(doubleRadius);
	}

	public static void doubleVolume(Object radius) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in cirkelns radie: ");
		int radie = input.nextInt();
		Math pi;
		Math volym = 4*pi*radie^3/3;
		System.out.println("Cirkelns volym: " + volym);
	}
}
