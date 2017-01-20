import java.util.Scanner;

public class lab12ex5run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String fn = kb.next();
		System.out.println("Please enter your last name:");
		String ln = kb.next();
		System.out.println("Do you want an avatar? (Y/N)");
		String choice = kb.next();
		
		if(choice.equals("N"))
		{
			lab12ex5 user = new lab12ex5(fn, ln);
			System.out.println(user);
		}
		else if(choice.equals("Y"))
		{
			System.out.println("Please enter your avatar name:");
			kb.nextLine();
			String av = kb.nextLine();
			lab12ex5 user2 = new lab12ex5(fn, ln, av);
			System.out.println(user2);
		}
	}
}