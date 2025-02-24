import java.util.Scanner;
/*********************************************************************************
 * This is a simple calculator app. It will add, subtract, multiply              *
 * or divide two numbers. The first number will be operated on by the second.    *
 *                                                                               *
 *  There will be a method for each operation.                                   *
 *                                                                               *
 *  @author Bob Wonch                                                            *
 *                                                                               *
 ********************************************************************************/
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the calculator!");
		System.out.println("Enter what operation you would like to perform");
		System.out.println("Addition (add), Subtraction (sub), \nMultiplication"
				+ " (mult), and Division (div)");
		
		String operation = input.next();
		
		System.out.println("Enter the two whole numbers:");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		//switch on operation to find out which method to use
		switch(operation) {
		case "add"://this is an instance where "add" was selected
			add(num1, num2);
			break;//break means no other cases will run
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
			System.out.println("invalid entry");
			
		}
		
		

	}

	private static void div(int num1, int num2) {
		if(num2 == 0)
		{
			System.out.println("You can't divide by zero!!!");
			return;
		}
		System.out.printf("%d divided by %d = %d", num1, num2, num1/num2);
		
	}

	private static void mult(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	private static void sub(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	private static void add(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

}
