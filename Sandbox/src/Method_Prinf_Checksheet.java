import java.util.Random;
import java.util.Scanner;

public class Method_Prinf_Checksheet {

	static Random random = new Random();
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many random numbers do you want?");
		int num = input.nextInt();
		
		makeRandTable(num);
	}

	private static void makeRandTable(int num) {
System.out.printf("%35s%n", "Random Table");
		
		for(int i = 1; i <= num; i++)
		{
			int randNum = random.nextInt(994) + 9;
			System.out.printf("%5d", randNum);
			if(i % 7 == 0)System.out.println();
		}	
		
	}

}
