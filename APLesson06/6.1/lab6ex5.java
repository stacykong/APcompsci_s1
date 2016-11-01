import java.util.Scanner;

public class lab6ex5
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the final number:");
		int fi = kb.nextInt();
		System.out.println("Please enter the initial number:");
		int ini = kb.nextInt();
		
		for(int i = ini; i <= fi; i+=ini)
		{
			System.out.printf(i + "\t");
		}
	}
}