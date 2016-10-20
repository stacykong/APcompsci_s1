import java.util.Scanner;

public class lesson6
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("PLease enter the number of cookies:");
		
		int c = kb.nextInt();
		int b = 1;
		
		for(int needed = c; needed >= 0; needed-=25)
		{
			System.out.println("Cookies needed: " + needed);
			System.out.println("Batch #: " + b);
			b++;
		}
		System.out.println("Order Up!");
		
		System.out.println("Please enter a word:");
		String word = kb.next();
		
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word.substring(0, i));
		}
	}
}