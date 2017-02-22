public class ticketdriver
{
	public static void main(String[]args)
	{
		walkup w = new walkup();
		advance a = new advance();
		sadvance s = new sadvance();
		
		System.out.println("RECEIPT\n\nWalkup");
		System.out.println(w);
		System.out.println("\nAdvance");
		System.out.println(a);
		System.out.println("\nStudent");
		System.out.println(s);
	}
}