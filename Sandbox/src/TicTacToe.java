import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		int player = 1;
		int continues = 1;
		char[] arr = { '0', '1', '2', '3', '4', '5', '6', '7', '8' };

		while (checkWinner(player, arr) == 0 ) {
			board(arr);
			move(arr, player);
			player = player % 2 + 1;
		}
		if (checkWinner(player, arr) == 0) {
			System.out.println("Tie.");
		} else {
			System.out.println("Player " + checkWinner(player, arr) + " is the winner.");
		}

	}

	private static int checkWinner(int player, char[] arr) {

		if (arr[0] == arr[4] && arr[0] == arr[8])
			return player;// checks first diagonal

		if (arr[2] == arr[4] && arr[2] == arr[6])
			return player;// checks second diagonal

		for (int i = 0; i < 3; i++)
			if (arr[i] == arr[i + 6] && arr[i + 3] == arr[i + 6])
				return player;

		// itterates over each row checks each position in the row for equality

		for (int i = 0; i < 9; i += 3)
			if (arr[i] == arr[i + 2] && arr[i + 1] == arr[i + 2])
				return player;

		// ^itterates over each collum ^checks each position in the collum for equqlity

		return 0;

	}

	private static int checkDiag(int player, char[] arr) {

		// TODO Auto-generated method stub

		return 0;

	}

	private static int checkCols(int player, char[] arr) {

		// TODO Auto-generated method stub

		int i = 1;

		for (i = 1; i < 4; i++) {

			if (arr[i] == arr[i + 6] && arr[i + 3] == arr[i + 6])
				return player;

		}

		return 0;

	}

	private static int checkRows(int player, char[] arr) {

		int i = 1;

		for (i = 0; i < 9; i += 3) {

			if (arr[i] == arr[i + 2] && arr[i + 1] == arr[i + 2])
				return player;

		}

		return 0;

	}

	public static void board(char[] arr) {

		//move(arr, player);

		// Initial board

		System.out.println(arr[0] + "|" + arr[1] + "|" + arr[2]);

		System.out.println("_ _ _");

		System.out.println(arr[3] + "|" + arr[4] + "|" + arr[5]);

		System.out.println("_ _ _");

		System.out.println(arr[6] + "|" + arr[7] + "|" + arr[8]);

	}

	public static void move(char[] arr, int player)

	{

		Scanner input = new Scanner(System.in);

		if (player == 1) {

			System.out.println("In order to place your x on the board, pick a number between 0 and 8");

			int num = input.nextInt();

			if (Character.isDigit(arr[num]))

			{
				arr[num] = 'x';
				

			} else {

				System.out.println("Cannot have two characters on the same space. Skipping move.");

			}

		}

		if (player == 2) {

			System.out.println("In order to place your o on the board, pick a number between 1 and 9");

			int num = input.nextInt();

			if (Character.isDigit(arr[num]))

			{
				arr[num] = 'o';
				

			} else {

				System.out.println("Cannot have two characters on the same space. Skipping move.");

			}

		}

	}
}
//	private static int checkWinner(char[] arr) {
//		String line = "";
//		for(int i = 0; i < 8; i++)
//		{
//			switch (i)
//			{
//				case 0:
//					line = "" + arr[0] + arr[1] + arr[2];
//					break;
//				case 1:
//					line = "" + arr[3] + arr[4] + arr[5];
//					break;
//				case 2:
//					line = "" + arr[6] + arr[7] + arr[8];
//					break;
//				case 3:
//					line = "" + arr[0] + arr[3] + arr[6];
//					break;
//				case 4:
//					line = "" + arr[1] + arr[4] + arr[7];
//					break;
//				case 5:
//					line = "" + arr[2] + arr[5] + arr[8];
//					break;
//				case 6:
//					line = "" + arr[0] + arr[4] + arr[8];
//					break;
//				case 7:
//					line = "" + arr[2] + arr[4] + arr[6];
//					break;
//			}
//			if (line.equals("XXX"))return 1;
//			if (line.equals("OOO"))return 2;
//			
//		}
//		return 0;
//	}
//
//}
