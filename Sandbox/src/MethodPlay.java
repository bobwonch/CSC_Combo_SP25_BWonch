
public class MethodPlay {
	public static void main(String[] args) {
		
		int x = 2;
		int doubled = dblIt(x);
		
		System.out.println("x = " + x + "\ndoubled is "+ doubled);
	
		System.out.println("Added together:" + add(x, doubled));
		
		System.out.println("Subtracted = " + subtract(x, doubled));

	}
	
	public static int dblIt(int z)
	{
//		int doubled = z * 2;
		
		return z * 2;
	}
	public static int add(int num1, int num2)
	{
		return num1 + num2;
		
	}
	public static int subtract(int num1, int num2)
	{
		return num1 - num2;
		
	}
}
