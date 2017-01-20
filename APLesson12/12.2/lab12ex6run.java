import java.util.Scanner;

public class lab12ex6run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item manufacturer:");
		String man = kb.nextLine();
		System.out.println("Please enter item name:");
		String name = kb.nextLine();
		System.out.println("Do you want to enter category and price information? (Y/N)");
		String choice = kb.next();
		if(choice.equals("N"))
		{
			lab12ex6 item = new lab12ex6(man, name);
			System.out.println(item);
		}
		else if(choice.equals("Y"))
		{
			System.out.println("Please enter item category:");
			kb.nextLine();
			String cat = kb.nextLine();
			System.out.println("Please enter item price:");
			double price = kb.nextDouble();
			lab12ex6 item2 = new lab12ex6(man, name, cat, price);
			System.out.println(item2);
		}
	}
}