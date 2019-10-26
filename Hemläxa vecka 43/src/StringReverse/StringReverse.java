package StringReverse;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		int Name = 0;
		stringName(Name);
	}

	private static void stringName(int name) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
	}
	
}
