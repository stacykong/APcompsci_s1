import java.util.Scanner;

public class lab9ex2
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
		
		first(words);
	}
	
	public static String first(String[] words)
	{
		for(String w : words)
		{
			System.out.println(w.charAt(0));
		}
		return "";
	}
}