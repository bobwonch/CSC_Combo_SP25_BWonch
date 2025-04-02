import java.util.Iterator;

public class IncrementalDesign_9_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTable(10, 5);
		
	}
	public static void printTable(int rows, int cols)
	{
		for (int i = 1; i <= rows; i++) {
			printRow(cols, i);
			System.out.println();
		}
	}
	public static void printRow(int cols, int n)
	{
		for (int i = 1; i <= cols; i++) {
			System.out.printf("%4d", i * n);			
		}
	}
}
