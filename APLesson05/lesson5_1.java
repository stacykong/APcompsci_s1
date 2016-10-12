import java.util.Scanner;

public class lesson5_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//use of else
		System.out.println("Enter your target:");
		int tar = kb.nextInt();
		int eloc = (int)(Math.random()*100)+1;
		
		if (tar == eloc)
			System.out.println("It's a hit!");
		else
			System.out.println("Keep trying!");
		
		String name = "James Brown";
		int uni = 1500000;
		String cat = "";
		
		//use of else if
		if(uni >=1000000)
			cat = "Top Seller";
		else if(uni >= 500000)
			cat = "Good Seller";
		else if (uni >= 100000)
			cat = "Average Seller";
		else
			cat = "Needs Review";
		
		System.out.println(name + " = " + cat);
		
		//use of .equals()
		System.out.println("Enter a word:");
		String w1 = kb.next();
		String w2 = "word";
		if(w1.equals(w2))
			System.out.println("The words are equal");
		else
			System.ut.println("THe words are not equal");
	}
}