import java.util.Scanner;

public class recursion
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		
		recursion();
	}
	
	public static void recursion()
	{
		System.out.println("Would you like to do some recursion?");
		
		String choice = kb.next();
		if(choice.equals("Y") || choice.equals("N"))
		{
			if(choice.equals("Y"))
				System.out.println("Lets do some recursion");
			else
				System.out.println("Boo you");
		}
		else
		{
			System.out.println("Please enter Y or N");
			recursion();
		}
	}
}