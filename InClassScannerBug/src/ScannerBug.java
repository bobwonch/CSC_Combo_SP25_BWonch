import java.util.Scanner;

public class ScannerBug {
	
	public static void main(String args[]) {
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.println("enter a whole number");
		int x = input.nextInt();//leaves a new line in the buffer
		input.nextLine();
		System.out.println("Now enter a sentence.");
		String str = input.nextLine();//scanner bug
		
		System.out.printf("Your number was %d\n and your sentence was %s", x, str);
		
		input.close();
	}
}
