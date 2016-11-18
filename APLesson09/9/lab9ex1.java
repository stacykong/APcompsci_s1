import java.util.Scanner;

public class lab9ex1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.println("Please enter 5 words:");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("In order...");
		for(String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println();
		System.out.println("Reversed...");
		
		reverse(words);
	}
	
	public static String reverse(String[] words)
	{
		for(int i = 4; i >= 0; i--)
		{
			System.out.println(words[i]);
		}
		return "";
	}
}