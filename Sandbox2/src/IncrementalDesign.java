import java.util.Iterator;

public class IncrementalDesign {

	public static void main(String[] args) {
		int cols = 10;
		
		printTable(cols);
		printTable(cols);

	}
	public static void printTable(int cols)
	{
		for (int i = 0; i < 10; i++) {
			printRow(i);
		}
	}
	public static void printRow(int cols)
	{
		for (int i = 0; i < cols; i++) {
			System.out.printf("%4d", i);			
		}
		System.out.println();
	}
}
