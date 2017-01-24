import java.util.Scanner;

public class lab12ex2run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the x value of the first coordinate:");
		int x1 = kb.nextInt();
		System.out.println("Please enter the y value of the first coordinate:");
		int y1 = kb.nextInt();
		System.out.println("Please enter the x value of the second coordinate:");
		int x2 = kb.nextInt();
		System.out.println("Please enter the y value of the second coordinate:");
		int y2 = kb.nextInt();
		
		lab12ex2 dis = new lab12ex2(x1, y1, x2, y2);
		
		System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + dis.getDist());
		
		System.out.println("Please enter the x value of the first coordinate:");
		int x1a = kb.nextInt();
		System.out.println("Please enter the y value of the first coordinate:");
		int y1a = kb.nextInt();
		System.out.println("Please enter the x value of the second coordinate:");
		int x2a = kb.nextInt();
		System.out.println("Please enter the y value of the second coordinate:");
		int y2a = kb.nextInt();
		dis.setValues(x1a, y1a, x2a, y2a);
		
		System.out.println("The distance between (" + x1a + ", " + y1a + ") and (" + x2a + ", " + y2a + ") is " + dis.getDist());
	}
}