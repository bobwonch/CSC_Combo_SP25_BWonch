import java.util.Scanner;

/******************************************************
 *                                                    *
 * This is a simple calculator program.               *
 * It demonstrate the switch statement and the        *
 * methods needed to perform addition, subtraction,   *
 * multiplication, and division.                      *
 * we need to take special care when creating the     *
 * division method.                                   *
 *                                                    *
 ******************************************************/

public class SimpleCalculator {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1;
		int num2;
		
		System.out.println(0/2);
		
		System.out.println("What type of calculation would you like me to perform?");
		System.out.println("Addition(add), Subtraction(sub), Multiplication(mult), or Division(div)");
		String calc = input.next();
		System.out.println("Enter the two numbers, the first will be operated on by the second");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		switch (calc)
		{
			case "add":
				add(num1, num2);
				break;
			case "sub":
				sub(num1, num2);
				break;
			case "mult":
				mult(num1, num2);
				break;
			case "div":
				div(num1, num2);
				break;
			default:
				System.out.println("Invalid Entry!");
		}
		input.close();
	}

	private static void div(int num1, int num2) {
		if(num2 == 0)
		{
			System.out.println("Can't divide by zero!");
			return;
		}
		System.out.printf("%d divided by %d = %d", num1, num2, num1/num2);
		
	}

	private static void mult(int num1, int num2) {
		System.out.println(num1 + " multiplied by " + num2 + " = " + num1*num2);		
	}

	private static void sub(int num1, int num2) {
		System.out.println(num1 + " subtracted by " + num2 + " = " + (num1-num2));
		
	}

	private static void add(int num1, int num2) {
		System.out.println(num1 + " added with " + num2 + " = " + (num1+num2));
		
	}

}
