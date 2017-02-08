import java.util.ArrayList;
import java.util.Scanner;

public class count13
{
	public static void main(String[]args)
	{
		//can't instantiate new lesson13 object since abstract
		double total = 0;
		ArrayList<lesson13> inventory = new ArrayList<lesson13>();
		inventory.add(new coin13("Penny", "2.5g", .01));
		//etc.
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter bills/coins:");
		String cash = kb.nextLine();
		Scanner scan = new Scanner(cash);
		
		while(scan.hasNext())
		{
			String x = scan.next();
			
			for(lesson13 b : inventory)
			{
				if(b.scan().equals(x) || b.getName().equals(x))
				{
					b.setCount(b.getCount() + 1);
				}
			}
		}
		
		for(lesson13 x : inventory)
		{
			total += x.getValue() * x.getCount();
		}
		
		System.out.println(total);
	}
}