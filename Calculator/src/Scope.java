
public class Scope {
	//can't use x
	public static void main(String[] args) {
		// we can't use x here
		
		{// this is a block of code
			
			int x = 73;
			
			//we CAN use x here
			
			
			System.out.println(myMethod(x));
			int w = myMethod(x, x);
			System.out.println(w);
			System.out.println(myMethod(x));
		}//block of code ends
		
		//x can NOT be used
		
		//System.out.println(x);
		
		//Can NOT use y
		
	}//block of code ends

	private static int myMethod(int y) {
		//x can NOT be used
		
		return (y*y);
	}	
	//overloaded method
	private static int myMethod(int y, int z) {
		//x can NOT be used
		
		return (y+z);
	}	
	
	private static String myMethod(double x)
	{
		return ""+ (x*12);
		
	}

}
