import static java.lang.Math.*;
import java.util.Scanner;

public class lab12ex1
{
	private int dis;
	private int hrs;
	private int min;
	private double mph;
	
	public lab12ex1()
	{
		dis = 0;
		hrs = 0;
		min = 0;
		mph = 0;
	}
	
	public lab12ex1(int d, int h, int m)
	{
		dis = d;
		hrs = h;
		min = m;
		mph = 0;
	}
	
	public void setValues(int d, int h, int m)
	{
		dis = d;
		hrs = h;
		min = m;
		mph = 0;
	}
	
	public double getmph()
	{
		mph = Math.round(dis/(hrs + (min/60.0)));
		return mph;
	}
	
	/*public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance:");
		int distance = kb.nextInt();
		System.out.println("Please enter the hours:");
		int hours = kb.nextInt();
		System.out.println("Please enter the minutes:");
		int minutes = kb.nextInt();
		
		lab12ex1 miphr = new lab12ex1(distance, hours, minutes, miph);
		
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " = " + MilesPerHour.getmph + " mph");
		
		MilesPerHour.setValues(10, 1, 30);
		
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " = " + MilesPerHour.getmph + " mph");
	}*/
}