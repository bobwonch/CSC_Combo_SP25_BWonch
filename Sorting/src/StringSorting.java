import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// First, ask the user how many strings they will enter.
		System.out.println("How many strings need sorting?");
		int numStrings = input.nextInt();
		// create an array to hold the strings.
		String[] strings = new String[numStrings];
		// fills the array of strings input by the user
		for (int i = 0; i < numStrings; i++) {
			System.out.println("Enter string:");
			strings[i] = input.next();
		}
		sSort(strings, false);
		print(strings);
		sSort(strings, true);
		print(strings);

	}

	public static void print(String[] strings)
	{
		for(String string : strings)
		{
			System.out.println(string);
		}
	}
	
	public static void sSort(String[] strings, boolean reverse) {
		if (reverse) {
			for (int i = 0; i < strings.length - 1; i++) // Insert i'th record
			{
				for (int j = 1; j < strings.length - i; j++) {
					if (strings[j - 1].compareTo(strings[j]) < 0) {
						swap(j - 1, j, strings);
					}
				}
			}
		} else {
			for (int i = 0; i < strings.length - 1; i++) // Insert i'th record
			{
				for (int j = 1; j < strings.length - i; j++) {
					if (strings[j - 1].compareTo(strings[j]) > 0) {
						swap(j - 1, j, strings);
					}
				}
			}
		}
	}

	public static void swap(int str1, int str2, String[] strings) {
		String temp = strings[str1];
		strings[str1] = strings[str2];
		strings[str2] = temp;
	}
}
