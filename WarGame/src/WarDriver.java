public class WarDriver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();

		deck.print();
		System.out.println("\n\n");
		deck.selectionSort();
		deck.print();
		
		
//		Pile p1 = new Pile();
//		p1.addDeck(deck.subDeck(0, 25));
//
//		Pile p2 = new Pile();
//		p2.addDeck(deck.subDeck(26, 51));
//
//		Pile center = new Pile();
//
//		while (!p1.isEmpty() && !p2.isEmpty()) {
//			Card c1 = p1.popCard();
//			Card c2 = p2.popCard();
//
//			int diff = c1.getRank() - c2.getRank();
//
//			if (diff > 0) {
//				p1.addCard(c1);
//				p1.addCard(c2);
//				for (int i = 0; i < 5; i++) {
//					if (!p2.isEmpty()) {
//						p1.addCard(p2.popCard());
//					}
//				}
//
//			} else if (diff < 0) {
//				p2.addCard(c1);
//				p2.addCard(c2);
//				for (int i = 0; i < 5; i++) {
//					if (!p1.isEmpty()) {
//						p2.addCard(p1.popCard());
//					}
//				}
//			} else {
//				p1.addCard(c1);
//				p2.addCard(c2);
//			}
//		} // end while
//		if (p2.isEmpty()) {
//			System.out.println("Player 1 wins!!");
//		} else {
//			System.out.println("Player 2 wins!!");
//		}

	}

	// Performs a linear search for a target Card in an array of Cards.
	public static int search(Card[] cards, Card target) {
		// Iterate through each Card in the array.
		for (int i = 0; i < cards.length; i++) {
			// Print the current card being examined.
			System.out.println(cards[i]);

			// Check if the current Card is equal to the target Card.
			if (cards[i].equals(target)) {
				// If found, return the index of the Card.
				return i;
			}
		}
		// If the target Card is not found, return -1.
		return -1;
	}

	// Performs a binary search for a target Card in a sorted array of Cards.
	public static int binarySearch(Card[] cards, Card target) {
		// Initialize the low and high indices for the search range.
		int low = 0;
		int high = cards.length - 1;

		// Continue searching as long as the low index is less than or equal to the high
		// index.
		while (low <= high) {
			// Print the current low and high indices for debugging purposes.
			System.out.println(low + ", " + high);

			// Calculate the middle index.
			int mid = (low + high) / 2;

			// Compare the Card at the middle index with the target Card.
			int comp = cards[mid].compareTo(target);

			// If the Card at the middle index is equal to the target Card, return the
			// middle index.
			if (comp == 0) {
				return mid;
			}
			// If the Card at the middle index is less than the target Card, update the low
			// index.
			else if (comp < 0) {
				low = mid + 1;
			}
			// If the Card at the middle index is greater than the target Card, update the
			// high index.
			else {
				high = mid - 1;
			}
		}
		// If the target Card is not found, return -1.
		return -1;
	}

	// Prints the contents of an array of Cards.
	public static void printDeck(Card[] cards) {
		// Check if the array is empty (first card is null).
		if (cards[0] == null) {
			System.out.println("There are no cards yet!");
		}

		// Iterate through each Card in the array and print it.
		for (Card card : cards) {
			System.out.println(card);
		}
	}

}