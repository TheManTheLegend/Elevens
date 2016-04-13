/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card king = new Card("King", "Diamonds", 13);
		Card king1 = new Card("King", "Spades", 13);
		Card poserKing = new Card("King", "Diamonds", 13);
		System.out.println(king.matches(poserKing));
	}
}
