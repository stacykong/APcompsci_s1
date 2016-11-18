import java.util.Scanner;

public class lab8ex2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the first word:");
		String w1 = kb.next();
		System.out.println("Please enter the sencond word:");
		String w2 = kb.next();
		System.out.println("Please enter the third word:");
		String w3 = kb.next();
		
		System.out.println(makeCenter(w1));
		System.out.println(makeCenter(w2));
		System.out.println(makeCenter(w3));
	}
	
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
			return word;
		return makeCenter(" " + word + " ");
	}
}