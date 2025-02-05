import java.util.Scanner;

public class InputCheckSheet {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		
		String word;
		int intNum;
		float realNum;
		double biggerRealNum;
		char letter;
		
		System.out.println("The word goes here");
		word = input.next();		
		System.out.println("Here is your word: " + word);
		
		System.out.println("The whole number goes here");
		intNum = input.nextInt();		
		System.out.println("Here is your whole number: " + intNum);
		
		System.out.println("The real number goes here");
		realNum = input.nextFloat();		
		System.out.println("Here is your real number: " + realNum);
		
		System.out.println("The bigger real number goes here");
		biggerRealNum = input.nextDouble();		
		System.out.println("Here is your real number: " + biggerRealNum);
		
		System.out.println("A letter goes here");
		letter = input.next().charAt(0);
		System.out.println(letter + " was the letter.");
	

	}

}
