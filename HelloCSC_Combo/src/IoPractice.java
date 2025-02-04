import java.util.Scanner;

public class IoPractice {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {		
		
		System.out.println("How many people are here in the classroom?");
		
		String name1 = getInput();
		
		int numInClass = input.nextInt();
		
		System.out.println("There are " + numInClass + " here today...");
		
		System.out.println("How many would 3 times more be?");
		
		int product = numInClass * 3;
		
		System.out.println(product);
		
		System.out.println(numInClass * 3);
		
		//System.out.println("What is your first name?");
		
		String fName = getInput();
		
		System.out.println("What is your last name?");
		
		String lName = input.next();
		
		System.out.println(fName + " " + lName);
		
	}
	public static String getInput()
	{
		System.out.printf("What is your %s %s %d %.4f", "Bob", "Wonch", 23, 23.34564);
		String name = input.next();
		return name;
		
	}
}
