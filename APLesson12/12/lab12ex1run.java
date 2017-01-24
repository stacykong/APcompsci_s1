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
		
		System.out.println("Please enter the distance:");
		int distance2 = kb.nextInt();
		System.out.println("Please enter the hours:");
		int hours2 = kb.nextInt();
		System.out.println("Please enter the minutes:");
		int minutes2 = kb.nextInt();
		miphr.setValues(distance2, hours2, minutes2);
		
		System.out.println(distance2 + " miles in " + hours2 + " hours and " + minutes2 + " minutes = " + miphr.getmph() + " mph");
	}
}