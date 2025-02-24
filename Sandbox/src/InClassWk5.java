import java.util.Scanner;
/**
 * These are the excercises from D2L:
 * Write a program to calculate the sum of the first 10 natural numbers.
 *     Use a for loop (Call the class SumOfForNumbers)
 *     Use a while loop (Call the class SumOfWhileNumbers)
 *     
 * Write a program to print Fibonacci series of n terms where n is input by user:
 *     0 1 1 2 3 5 8 13 24 .....
 *     Use a for loop 
 *     Use a while loop 
 *     
 * Write a program (class name RightAngleLoop) to accept a number from the user 
 * and display the pattern like right angle triangle with a number like this:
 *     1
 *     12
 *     123
 *     1234
 *     12345
 *     123456
 *     1234567
 *     12345678
 *     123456789
 *     12345678910
 *          
 *     @author Bob Wonch
 *     @date 2/18/25
 */
public class InClassWk5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// while sum
		int sum = 0;
		int count = 1;
		while(count <= 10)
		{
			sum += count++;
		}
		System.out.printf("The sum of the first 10 numbers using 'while' is %d\n\n", sum);
		
		//for sum
		sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			sum += i;
		}
		System.out.printf("The sum of the first 10 numbers using 'for' is %d\n\n", sum);
		
		//while fib
		long first = 0;
		long second = 1;
		long next = 0;
		int n;
		count = 1;
		System.out.println("What level of the Fibonacci sequence would you like?");
		n = input.nextInt();
		if(n == 0)
		{
			System.out.printf("The %d level of the Fibonacci is %d\n", n, n);
			count++;
		}else if (n==1)
		{
			System.out.printf("The %d level of the Fibonacci is %d\n", 0, 0);
			System.out.printf("The %d level of the Fibonacci is %d\n", n, n);
			count+=2;
		}else
		{         //0     //5
			while(count <= n)
			{
				System.out.printf("The %d level of the Fibonacci is %d\n", count, first);
				next = first + second;
				first = second;
				second = next;
				count++;				
			}
		}
		System.out.println();
		//for fib
		first = 0;
		second = 1;
		next = 0;
		n=0;
		System.out.println("What level of the Fibonacci sequence would you like?");
		n = input.nextInt();
		if(n == 0)
		{
			System.out.printf("The %d level of the Fibonacci is %d\n", n, n);
			count++;
		}else if (n == 1)
		{
			System.out.printf("The %d level of the Fibonacci is %d\n", 0, 0);
			System.out.printf("The %d level of the Fibonacci is %d\n", n, n);
			count+=2;
		}else
		{
			for(int i = 1; i <= n; i++)
			{
				System.out.printf("The %d level of the Fibonacci is %d\n", i, first);
				next = first + second;
				first = second;
				second = next;
					
			}
		}
		System.out.println();
		//rt angle
		System.out.println("How tall would you like your triangle?");
		int height = input.nextInt();
		for(int i = 1; i <= height; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
