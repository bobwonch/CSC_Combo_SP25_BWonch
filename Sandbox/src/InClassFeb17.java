import java.awt.im.InputContext;
import java.util.Scanner;

/**
 * This is the excercises we used to practice loops
 * in class on Feb 17, 2025
 * 
 *  @author Bob Wonch
 *  @date 2/17/25
 *
 */
public class InClassFeb17 {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Sum with for loop
		int sum = 0;
		for(int i = 1; i <=10; i++)
		{
			sum += i;
		}
		System.out.println("for sum is:" + sum);
		//Sum with while loop
		sum = 0;
		int a = 1;
		while(a <= 10)
		{
			sum += a;
			a++;
		}
		System.out.println("while sum is:" + sum);
		
		//Fibonacci
		int first = 0;
		int second = 1;
		int next = 0;
		int n = 1;
		System.out.println("Which number of the Fibonacci do you want to go to?");
		int num = input.nextInt();
		if(num < 1) {
			System.out.println(first);
		}
		if(num == 1)System.out.println(second);
		if(num > 1)System.out.println(first +"\n" + second);
		
		while(n < num && num > 1) {
			next = first + second;
			System.out.println(next);
			first = second;
			second = next;
			n++;
		}
		
		//right angle counting.
		

	}

}
