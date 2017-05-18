/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card heartsqueen = new Card("queen", "hearts", 12);
		Card spadesace = new Card("ace", "spades", 1);
		Card clubs10 = new Card("10", "clubs", 10);
		
		System.out.println(heartsqueen);
		System.out.println(spadesace);
		System.out.println(clubs10);
	}
}
