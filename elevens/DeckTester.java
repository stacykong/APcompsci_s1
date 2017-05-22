/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] r = {"king", "queen", "jack"};
		String[] s = {"hearts", "spades", "hearts"};
		int[] v = {13, 12, 11};
		
		//Deck d1 = new Deck(r, s, v);
		//System.out.println(d1.size());
		//System.out.println(d1.deal());
		//System.out.println(d1.toString());
		
		String[] rank = {"ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king",
					"ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king",
					"ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king",
					"ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] suit = {"spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades",
					"clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs",
					"hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts",
					"diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds"};
		int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 
					1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 
					1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
					1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		Deck full = new Deck(rank, suit, value);
		System.out.println(full);
	}
}