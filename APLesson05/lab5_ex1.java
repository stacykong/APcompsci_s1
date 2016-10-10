public class lab5_ex1
{
	
	public static void main(String[]args)
	{
		int proll = (int)((Math.random()*7) + 1);
		int croll = (int)((Math.random()*7) + 1);
		String win = rollDice(proll, croll);
		
		System.out.println("You rolled a " + proll);
		System.out.println("The computer rolled a " + croll);
		System.out.println("The winner is " + win);
	}
	
	public static String rollDice(int proll, int croll)
	{
		boolean roll = proll > croll;
		if(roll)
			return "you!";
		if(!roll)
			return "the computer!";
		return "you!";
	}
}