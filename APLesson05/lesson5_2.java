import java.util.Scanner;

public class lesson5_2
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Would you ike to..." +
							"\n1. Do a math problem" +
							"\n2. Answer a question");
		int morw = kb.nextInt();
		
		//nesting ifs
		if(morw == 1)
		{
			System.out.println("What is 2 x 2?");
			int mans = kb.nextInt();
			if(mans == 4)
			{
				System.out.println("Correct!");
			}
			
			else
			{
				System.out.println("No! Wrong!");
			}
		}
		
		else
		{
			System.out.println("Who said the phrase \"Whatever you are, be a good one.\"?");
			kb.nextLine();
			String w = kb.nextLine();
			if(w.equals("Abraham Lincoln"))
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("No! Wrong!");
			}
		}
		
		//relational operaters to net conditions
		//boolean a = true;
		//boolean b = false;
		
		//System.out.println(a && b); returns false
		//System.out.println(a || b); returns true
		//System.out.println(!(a && b)); returns true
		
		checknum();
	}
	
	public static void checknum()
	{
		System.out.println("Pick a number between 1 and 10");
		int guess = kb.nextInt();
		int number = (int)(Math.random()*10)+1;
		
		System.out.println("The number is " + number);
		
		if(guess >= 1 && guess <= 10)
		{
			if(guess == number)
				System.out.println("The number is right");
			else
				System.out.println("Wrong!");
		}
		else
		{
			System.out.println("Pls make it a number between 1 and 10!");
			checknum();
		}
	}
}