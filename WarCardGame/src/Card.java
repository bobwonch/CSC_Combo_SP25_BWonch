
public class Card {
	private final int suit;
	private final int rank;
	
	private static final String [] suits = {"Clubs", "Diamonds", " Hearts", "Spades"};
	private static final String [] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
			"10", "Jack", "Queen", "King"};
	
	public Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	
	
	

	public boolean equals(Card that)
	{
		return this.rank == that.rank && this.suit == that.suit;
	}

	public int compareTo(Card that)
	{
		if(this.suit < that.suit)return -1;
		if(this.suit > that.suit)return 1;
		if(this.rank < that.rank)return -1;
		if(this.rank > that.rank)return 1;
		return 0;
	}
	
	public int getSuit() {
		return suit;
	}
	public int getRank() {
		return rank;
	}

	@Override
	public String toString() {	
		
		String s = ranks[this.rank] + " of " + suits[this.suit];
		
		return s;
	}
	
}
