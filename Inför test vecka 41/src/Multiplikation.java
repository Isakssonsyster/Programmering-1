import java.util.Scanner;

public class Multiplikation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Skriv in 10 heltal: ");
		
		int sum = 1;
		int AON= 0;
		
		while(AON < 10 && sum <= 10000) {
			
			int tempnumb = input.nextInt();
			sum *= tempnumb;
			AON++;
		}
		System.out.println("Summa: " + sum);
		System.out.println("Antal inlästa: " + AON);
		
	}
}
