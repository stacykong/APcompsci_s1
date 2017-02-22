public class toystorerun
{
	public static void main(String[]args)
	{
		toystore t = new toystore("Hotwheel, Car, G.I. Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(t);
		System.out.println(t.test());
		System.out.println(t.loadToys("Hotwheel, Car, G.I. Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF"));
		System.out.println(t.getMostFrequentToy());
		System.out.println(t.getMostFrequentType());
	}
}