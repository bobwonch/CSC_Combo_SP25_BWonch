
public class WarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card[] cards = new Card[52];
		
		int index = 0;		
		for (int suit = 0; suit < 4; suit++)
		{
			for(int rank = 1; rank <= 13; rank++)
			{
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		
		int highCard = cards[45].compareTo(cards[19]);
		
		System.out.println("Card 45 is " + cards[45]);
		System.out.println("Card 19 is " + cards[19]);
		if(highCard == -1) System.out.println(cards[45]);
		else if (highCard == 1 )System.out.println(cards[19]);
		//printDeck(cards);		
		
	}
	
	
	public static void printDeck(Card[] cards)
	{
		if(cards[0] == null) System.out.println("No cards yet!");
		
		for(Card card : cards)
		{
			System.out.println(card);
		}
	}
}
