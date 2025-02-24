package conditionals;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = input.nextInt();
//		
//		if (x % 2 == 0) System.out.println("It's an even number.");
//		else System.out.println("It's an odd number.");
//		
//		if (x > 0) System.out.println("It's a positive number.");
//		else if (x < 0) System.out.println("It's a negative number.");
//		else System.out.println("It's zero.");
		
//		String word = input.next();
//		
//		if (word.length() >= 8) {
//			if (word.contains("!")) {
//				System.out.println("Good password");
//			}
//		}
//		
//		if (word.length() >= 8 && word.contains("!")) {
//			System.out.println("Good password 2");
//		}
		
		System.out.println(!(x > 10 || x < 1) == (x <= 10 && x >= 1));
		
		if (!(x > 10 || x < 1)) {
			System.out.println("meow");
		}
	}

}
