import java.util.Scanner;

public class rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a value for the height of the rectangle:");
		int h = kb.nextInt();
		System.out.println("Please enter a value for the width of the rectangle:");
		int w = kb.nextInt();
		
		double perimeter = calcPerim(w, h);
		
		System.out.printf("Your perimeter is %.5f ft.", perimeter);
	}
	
	public static int calcPerim(int width, int height)
	{
		return 2*(width+height);
	}
}