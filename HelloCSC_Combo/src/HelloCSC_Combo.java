import java.util.Scanner;

public class HelloCSC_Combo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Hello Combo Class, how are ya?");
//		
//		String answer = input.nextLine();		
//		System.out.println("You said:" + answer + "!");
//		
//		System.out.println("Enter two numbers to be added together:");
//		
//		int num1 = input.nextInt();
//		int num2 = input.nextInt();
//		
//		int sum = num1 + num2;
		
		double[]fNums = new double[13];
		for(int i = 0; i < 13; i++) {
			fNums[i]= i;
		}
//		for(double num : fNums) {
//			System.out.println(num);
//		}
		System.out.println(fNums.length);
		System.out.println(fNums[12]);
		//double fNum2 = 23.90182739487120394;
		
		//System.out.println("the sum is " + (fNum * fNum2 * 999999999));
			
		
	}

}
