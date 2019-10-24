import java.util.Scanner;

public class Medelvärden {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in heltal: ");
		
		int heltal = 0;
		int sum = 0; 
		
		boolean running = true;
		while(running) {
			int tempNumb = input.nextInt();
			
			if(tempNumb == 0) {
				running = false;
			}
			
			else {
				sum += tempNumb;
				heltal ++;
			}
		}
		
		double avg = (double) sum / heltal;
		
		System.out.println("Summa: " + sum);
		System.out.println("Medelvärde: " + avg);
	}
	

}
