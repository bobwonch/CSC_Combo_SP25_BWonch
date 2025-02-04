import java.util.Scanner;

public class cmConversion {

	public static void main(String[] args) {
		int inch;
		double cm;
		final double CM_PER_INCH = 2.54;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many inches?");
		inch = input.nextInt();
		
		cm = inch * CM_PER_INCH;
		System.out.printf("%d%s%.2f%s\n", inch, " inch = ", cm, "cm");
		System.out.println("How many cm?");
		cm = input.nextDouble();
		inch = (int) (cm / CM_PER_INCH);
		System.out.println(inch);
		
		System.out.println("Give a double digit number of inches:");
		inch = input.nextInt();
		
		int feet = inch / 12;
		int leftOverInches = inch % 12;
		
		System.out.printf("%d %s%d %s%d%s",inch, "inches is ", feet, "feet and ", leftOverInches," inches");
		                        // "feet and ", leftOverInches," inches");
		
		
		

	}

}
