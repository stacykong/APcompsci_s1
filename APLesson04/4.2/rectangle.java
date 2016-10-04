import java.util.Scanner;

public class rectangle
{
	static String s = "Your rectangle is ";
	static int l = 2;
	static int w = 2;
	static String ss = " sq feet.";
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the rectangle length:");
		l = kb.nextInt();
		System.out.println("Please enter the rectangle width:");
		w = kb.nextInt();
		
		double peri = calcPerim(l, w);
		print(peri);
	}
	
	public static int calcPerim(int length, int width)
	{
		return length*width;
	}
	
	public static void print(double peri)
	{
		System.out.printf(s + "%.5f" + ss, peri);
	}
}