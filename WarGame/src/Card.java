public class Card {
	
	/**
	 * @author Robert Wonch
	 */
    // Instance variables to store the rank and suit of the card.
    private final int rank;
    private final int suit;

    // Static arrays to map integer suit and rank values to their string representations.
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    // Constructor to initialize a Card object with a given rank and suit.
    public Card(int rank, int suit) {
        super(); // Calls the constructor of the superclass (Object), which is implicit here.
        this.rank = rank;
        this.suit = suit;
    }

    // Method to check if two Card objects are equal based on their rank and suit.
    public boolean equals(Card that) {
        // Returns true if both the rank and suit of the current card are equal to the other card.
        return this.rank == that.rank & this.suit == that.suit;
    }

    // Method to compare two Card objects for sorting purposes.
    // Returns a negative integer, zero, or a positive integer as this Card is less than, equal to, or greater than the specified Card.
    public int compareTo(Card that) {
        // Compare suits first.
        if (this.suit < that.suit) return -1; // Current card has a lower suit.
        if (this.suit > that.suit) return 1;  // Current card has a higher suit.

        // If suits are equal, compare ranks.
        if (this.rank < that.rank) return -1; // Current card has a lower rank.
        if (this.rank > that.rank) return 1;  // Current card has a higher rank.

        // If both suits and ranks are equal, the cards are equal.
        return 0;
    }

    // Getter method to retrieve the rank of the card.
    public int getRank() {
        return rank;
    }

    // Getter method to retrieve the suit of the card.
    public int getSuit() {
        return suit;
    }

    // Override the toString() method to provide a string representation of the Card object.
    @Override
    public String toString() {
        // Constructs and returns a string in the format "Rank of Suit".
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
}