import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] arr = { '0', '1', '2', '3', '4', '5', '6', '7', '8' };
		int player = 1;
		int count = 0;
		while (checkWinner(arr) == 0) {
			if (count >= 8) {
				break;
			}

			board(arr);

			System.out.println("Player " + player + " make you move!");
			char choice = input.next().charAt(0);
			move(arr, player, choice);
			count++;

			player = player % 2 + 1;// switch players
		}

		if (checkWinner(arr) == 1) {
			System.out.println("Player 1 wins!");
		} else if (checkWinner(arr) == 2) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("Tie!");
		}
	}

	public static void board(char[] arr) {

		System.out.println(arr[0] + "|" + arr[1] + "|" + arr[2]);

		System.out.println("_ " + "_ " + "_");

		System.out.println(arr[3] + "|" + arr[4] + "|" + arr[5]);

		System.out.println("_ " + "_ " + "_");

		System.out.println(arr[6] + "|" + arr[7] + "|" + arr[8]);

	}

	public static void move(char[] arr, int player, char choice) {

		char tile = 'X';

		if (player == 2)

			tile = 'O';

		if (Character.isDigit(arr[Integer.parseInt(""+ choice)]))

			arr[Integer.parseInt(""+ choice)] = tile;

		else
			System.out.println("lost your turn");
	}
	public static int checkWinner(char[] arr) {
		String line = "";

		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0:
				line = "" + arr[0] + arr[1] + arr[2];
				break;
			case 1:
				line = "" + arr[3] + arr[4] + arr[5];
				break;
			case 2:
				line = "" + arr[6] + arr[7] + arr[8];
				break;
			case 3:
				line = "" + arr[0] + arr[3] + arr[6];
				break;
			case 4:
				line = "" + arr[1] + arr[4] + arr[7];
				break;
			case 5:
				line = "" + arr[2] + arr[5] + arr[8];
				break;
			case 6:
				line = "" + arr[0] + arr[4] + arr[8];
				break;
			case 7:
				line = "" + arr[2] + arr[4] + arr[6];
				break;
			} // end of switch

			line = line.toLowerCase();
			if (line.equals("xxx")) {
				return 1;
			}
			if (line.equals("ooo")) {
				return 2;
			}
		} // end of for loop
		return 0;
	}// end checkWinner
}
