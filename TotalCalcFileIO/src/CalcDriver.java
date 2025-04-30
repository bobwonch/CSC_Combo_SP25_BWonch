import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CalcDriver {

	public static void main(String[] args) {
		File myFile = new File("items.txt");
		Double subTotal = 0.0;
		try {
			Scanner myReader = new Scanner(myFile);
			System.out.println("Reading file.");
			while (myReader.hasNextDouble()) {
				subTotal += myReader.nextDouble();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Subtotal:" + subTotal);
		double tax = subTotal * 0.053;
		System.out.println("Tax:" + tax);
		double total = subTotal + tax;
		System.out.printf("Total: $%.2f", total);
		File myWriteFile = createFile("total");
		try {
			FileWriter myWriter = new FileWriter("total.txt");
			myWriter.write("Subtotal:" + subTotal);
			myWriter.write("\nTax:" + tax);
			myWriter.write("\nTotal:" + total);
			myWriter.close();
			System.out.println("\nSuccessfully writen to file.");
		} catch (IOException e) {
			System.out.println("An eror occured while writing to your file.");
			e.printStackTrace();
		}
		
	}
	private static File createFile(String name) {
		File myFile = new File(name + ".txt");
		try {
			if (myFile.createNewFile()) {
				System.out.println("File created:" + myFile.getName());
			} else {
				System.out.println("\nFile already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occured while creating your file.");
			e.printStackTrace();
		}
		return myFile;
	}

}
