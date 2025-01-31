
public class HelloWorld {

	public static void main(String[] args) {
		String str = "It Worked!!!";
		int y = 1;
		
		int x = 10;
		if(x == 10) {
			System.out.println(str);
		}
		
		System.out.print(str + "Hello World\n");
		System.out.println(y + x + str + y);
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("!"));
	}

}
