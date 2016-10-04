import java.util.Scanner;

public class circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a value for the radius of a circle:");
		int r = kb.nextInt();
		
		double a = calcArea(r);
		System.out.printf("The area of a circle with radius " + r + " is %.5f.", a);
	}
	
	public static double calcArea(int rad)
	{
		return (Math.pow(rad, 2))*3.14;
	}
}