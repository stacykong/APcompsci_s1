public class toystorerun
{
	public static void main(String[]args)
	{
		toystore t = new toystore("Hotwheel, Car, G.I. Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(t);
		System.out.println("Most Frequent Toy: " + t.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + t.getMostFrequentType());
	}
}