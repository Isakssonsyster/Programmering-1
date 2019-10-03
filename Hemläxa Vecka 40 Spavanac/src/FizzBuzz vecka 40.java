import java.util.Scanner;

public class FizzBuzz {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		int Y = input.nextInt();
		int N = input.nextInt();
		
		for(int i = 1; i <= N; ++i) {
			
			if((i % X == 0 && i % Y == 0)) {
				System.out.print("FizzBuzz ");
			} 
			
			else if((i % X == 0)) {
				System.out.print("Fizz ");
			} 
			
			else if((i % Y == 0)) {
				System.out.print("Buzz ");
			}
			else {
				System.out.print(i);
			}
		}
	}

		
		
	}
}
