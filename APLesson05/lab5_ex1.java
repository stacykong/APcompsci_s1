//import java.util.Random;

public class lab5_ex1
{
	
	public static void main(String[]args)
	{
		//Random rand = new Random();
		
		int proll = (int)((Math.random()*6) + 1);
		int croll = (int)((Math.random()*6) + 1);
		
		System.out.println("You rolled a " + proll);
		System.out.println("The computer rolled a " + croll);
		
		if (rollDice(proll, croll))
		{
			System.out.println("The winner is you!");
		}
		if (!rollDice(proll, croll))
		{
			System.out.println("The winner is the computer!");
		}
	}
	
	public static boolean rollDice(int proll, int croll)
	{
		return proll > croll;
	}
}