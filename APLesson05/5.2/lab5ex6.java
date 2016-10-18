import java.util.Scanner;

public class lab5ex6
{
	public static void main(String[]args)
	{
		String user;
		String pass;
		
		passCheck();
	}
	
	public static void passCheck()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your username.");
		String user = kb.next();
		System.out.println("Please enter your password.");
		String pass = kb.next();
		
		if(user.equals("jojo6") && pass.equals("stoneocean"))
		{
			System.out.println("You are granted access.");
		}
		else
		{	
			if(user.equals("jojo6"))
			{
				System.out.println("You password is incorrect.");
				passCheck();
			}
			else if(pass.equals("stoneocean"))
			{
				System.out.println("You username is incorrect.");
				passCheck();
			}
			else
			{
				System.out.println("You username and password are incorrect.");
				passCheck();
			}
		}
	}
}