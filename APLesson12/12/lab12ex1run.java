import java.util.Scanner;

public class lab12ex1run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance:");
		int distance = kb.nextInt();
		System.out.println("Please enter the hours:");
		int hours = kb.nextInt();
		System.out.println("Please enter the minutes:");
		int minutes = kb.nextInt();
		
		lab12ex1 miphr = new lab12ex1(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + miphr.getmph() + " mph");
		
		miphr.setValues(10, 1, 30);
		
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + miphr.getmph() + " mph");
	}
}