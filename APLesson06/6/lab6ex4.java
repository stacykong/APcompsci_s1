import java.util.Scanner;

public class lab6ex4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the initial integer:");
		int ini = kb.nextInt();
		System.out.println("Please enter the size of the table:");
		int tab = kb.nextInt();
		
		for(int i = 1; i <= tab; i++)
		{
			System.out.printf(i + "   " + i*ini + "\n");
		}
	}
}