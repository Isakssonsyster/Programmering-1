import java.util.Scanner;

public class Spanavac {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int Hour = input.nextInt();
		
		int Minute = input.nextInt();
		
		int Hasminutes = Hour * 60;
		
		int Summinutes = Hasminutes + Minute - 45;
		
		int Rminutes = Summinutes % 60;
			if(Rminutes < 0) {
				Rminutes = 60 + (Rminutes);
			}
		int Rhour = ( Summinutes - Rminutes) /60;
			if(Rhour < 0) {
				Rhour = 24 + (Rhour);
			}
		if( Hour >= 0 && Hour <= 23 && Minute >= 0 && Minute <= 59) {
			System.out.println(Rhour + " " + Rminutes);
		}
	}

}
