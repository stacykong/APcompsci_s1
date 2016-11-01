public class lab6ex8
{
	public static void main(String[]args)
	{
		sing("na", 4);
		sing("na", 4);
		sing("hey", 3);
		sing("goodbye", 1);
	}
	
	public static void sing(String word, int time)
	{
		for(int i = 1; i <= time; i++)
		{
			System.out.printf(word + " ");
		}
		System.out.println("");
	}
}