/**
 * This program will print up a 10 X 10 multiplication
 * table using nested for loops.
 * The loop iterates from 1 to 10 and at every number 
 * the inner loop loops 10 times multiplying i * j
 * @author Bob Wonch
 * @Date 2/17/25
 *  
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {//i = 1 then i is 2
			for (int j = 1; j <= i; j++) {//j = 1-10 j is 1 to 10 again
				System.out.printf("%3d", j);//one row
			}
			System.out.println();//new row
		}

	}

}
