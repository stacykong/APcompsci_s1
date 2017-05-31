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
		
		Deck d1 = new Deck(r, s, v);
		System.out.println(d1.size());
		System.out.println(d1.deal());
		System.out.println(d1.toString());
		
		String[] r2 = {"king", "10", "ace"};
		String[] s2 = {"diamonds", "diamonds", "hearts"};
		int[] v2 = {13, 10, 1};
		
		Deck d2 = new Deck(r2, s2, v2);
		System.out.println(d2.size());
		System.out.println(d2.deal());
		System.out.println(d2.toString());
		
		String[] r3 = {"2", "8", "queen"};
		String[] s3 = {"hearts", "clubs", "spades"};
		int[] v3 = {2, 8, 12};
		
		Deck d3 = new Deck(r3, s3, v3);
		System.out.println(d3.size());
		System.out.println(d3.deal());
		System.out.println(d3.toString());
		
		String[] rank = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king",
					"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king",
					"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king",
					"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
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
		full.shuffle();
		System.out.println(full);
	}
}