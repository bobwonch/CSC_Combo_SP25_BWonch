import java.util.Random;

public class Deck {
	private Card[] cards;
	private static Random rand = new Random();

	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				this.cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}

	public Deck(int n) {
		this.cards = new Card[n];
	}

	public Deck subDeck(int low, int high) {
		Deck sub = new Deck(high - low + 1);
		for (int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}

	private static Deck merge(Deck d1, Deck d2) { 
		Card[] c1 = d1.getCards();
		Card[] c2 = d2.getCards();
		
		int l1 = c1.length;
		int l2 = c2.length;
		
		Card[] c3 = new Card[l1+l2];
		
		int i = 0; // c1 iterator
		int j = 0; // c2 iterator
		
		if(l1 == 0)
		{
			c3 = c2;
		}
		else if(l2 == 0)
		{
			c3 = c1;
		}
		else {
			for(int k = 0; k < c3.length; k++)
			{
				if(j >= c2.length || i < c1.length && c1[i].compareTo(c2[j])<= 0)
				{
					c3[k] = c1[i];
					i++;
				}
				else
				{
					c3[k] = c2[j];
					j++;
				}
			}
		}
		Deck deck = new Deck(l1+l2);
		deck.cards = c3;
		return deck;
	}

	public Deck almostMergeSort() {
		// divide the deck into two subdecks
		int mid = cards.length / 2;
		Deck d1 = new Deck(mid);
		Deck d2 = new Deck(cards.length - mid);

		for (int i = 0; i < mid; i++) {
			d1.cards[i] = cards[i];
		}
		for (int i = mid; i < cards.length; i++) {
			d2.cards[i - mid] = cards[i];
		}
		// sort the subdecks using selectionSort
		d1.selectionSort();
		d2.selectionSort();
		// merge the subdecks, return the result
		return merge(d1, d2);
	}
	
	public Deck mergeSort()
	{
		int len = cards.length;
		if(len == 0 || len == 1) 
		{
			return this;
		}else
		{
			int mid = len / 2;
			Deck d1 = subDeck(0, mid - 1).mergeSort();
			Deck d2 = subDeck(mid, len -1).mergeSort();
			return merge(d1, d2);
		}
	}

	public void selectionSort() {
		for (int i = 0; i < cards.length; i++) 
		{
			int lowest = indexLowest(i, cards.length - 1);
			swap(i, lowest);
		}
	}

	private int indexLowest(int low, int high) {
		int lowest = low;
		for (int i = low; i <= high; i++) {
			if (cards[i].compareTo(cards[lowest]) < 0) {
				lowest = i;
			}
		}
		return lowest;
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int rand = randomInt(i, cards.length);

			swap(i, rand);
		}

	}

	private void swap(int i, int other) {
		Card temp = this.cards[i];
		this.cards[i] = this.cards[other];
		this.cards[other] = temp;

	}

	private static int randomInt(int low, int high) {
		return rand.nextInt(high - low) + low;
	}

	public Card[] getCards() {
		return cards;
	}

	public void print() {
		for (Card card : this.cards) {
			System.out.println(card);
		}
	}

}
