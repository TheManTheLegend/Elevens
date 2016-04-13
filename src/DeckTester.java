/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] suits = new String[4];
		suits[0] = "diamonds";
		suits[1] = "spades";
		suits[2] = "hearts";
		suits[3] = "clubs";
		String[] ranks = new String[13];
		ranks[0] = "Ace";
		ranks[1] = "Two";
		ranks[2] = "Three";
		ranks[3] = "Four";
		ranks[4] = "Five";
		ranks[5] = "Six";
		ranks[6] = "Seven";
		ranks[7] = "Eight";
		ranks[8] = "Nine";
		ranks[9] = "Ten";
		ranks[10] = "Jack";
		ranks[11] = "Queen";
		ranks[12] = "King";
		int[] points = new int[10];
		points[0] = 1;
		points[1] = 2;
		points[2] = 3;
		points[3] = 4;
		points[4] = 5;
		points[5] = 6;
		points[6] = 7;
		points[7] = 8;
		points[8] = 9;
		points[9] = 10;
		Card flse = new Card("0","0",0);
		
		Deck deck = new Deck(ranks, suits, points);
		Card returned = deck.deal();
		if (returned.matches(flse)){
			System.out.println("There are no cards left");
		}
		else{
			System.out.println(deck.deal().toString());
			System.out.println(deck.size() + " cards left");
		}
		
		
		
	}
}
