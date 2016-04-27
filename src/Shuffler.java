import java.util.List;
import java.util.ArrayList;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
//		System.out.println("Results of " + SHUFFLE_COUNT +
//								 " consecutive perfect shuffles:");
//		int[] values1 = {0, 1, 2, 3};
//		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
//			perfectShuffle(values1);
//			System.out.print("  " + j + ":");
//			for (int k = 0; k < values1.length; k++) {
//				System.out.print(" " + values1[k]);
//			}
//			System.out.println();
//		}
//		System.out.println();
//
//		System.out.println("Results of " + SHUFFLE_COUNT +
//								 " consecutive efficient selection shuffles:");
//		int[] values2 = {0, 1, 2, 3};
//		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
//			selectionShuffle(values2);
//			System.out.print("  " + j + ":");
//			for (int k = 0; k < values2.length; k++) {
//				System.out.print(" " + values2[k]);
//			}
//			System.out.println();
//		}
//		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] fir = new int[values.length/2];
		int[] sec = new int[values.length/2];
	
		for(int i = 0; i < values.length/2; i++){
			fir[i] = values[i];
		}
		for(int i = values.length/2; i < values.length; i++){
			sec[i - values.length/2] = values[i];
		}
		for(int i = 0; i < values.length;i ++){
			if(i % 2 == 0){
				values[i] = fir[i/2];
			}
			else{
				values[i] = sec[(i-1)/2];
			}
			
			
		}
		
		
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static List<Card> selectionShuffle(List<Card> cards) {
		int rand;
		List<Card> thingy = new ArrayList<Card>();
		
		for(int i = 0; i < cards.size(); i++){
			rand = (int) ((cards.size()) * Math.random());
			thingy.add(cards.get(rand));
			
			
		}
		cards = thingy;
		return cards;

	}

	
	public static int[] remove(int[] values, int index){
		int[] returned = new int[values.length - 1];
		for(int i = 0; i < index; i++){
			returned[i] = values[i];
		}
		if (values.length - 1 > index){
			for(int i = index + 1; i < values.length; i++){
				returned[i-1] = values[i];
			}
		}
		return returned;
	}
}
