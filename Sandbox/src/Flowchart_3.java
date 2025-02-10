import java.util.Scanner;

public class Flowchart_3 {

//access mod - keyword static - return type - name - arguments
	public static void main(String[] args) {
		//variables and input
		Scanner input = new Scanner(System.in);
		int carCode, days, miles, pPD;
		double pPM, total;
		
		System.out.println("What is the Car Code?");
		carCode = input.nextInt();
		
		System.out.println("How many miles where driven?");
		miles = input.nextInt();
		
		System.out.println("How many days?");
		days = input.nextInt();
		
		if(carCode == 1)
		{
			pPD = 75;
			pPM = 1.5;
		}else if(carCode == 2)
		{
			pPD = 45;
			pPM = .85;
		}else
		{
			pPD = 35;
			pPM = .45;
		}
		total = (pPD * days)+(pPM * miles);
		System.out.printf("Your total is: $%.2f\n", total);
		
		System.out.println(.1 + .2);
		
	}

}
