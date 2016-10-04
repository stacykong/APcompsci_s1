import java.util.Scanner;

public class circle
{
	static double r = 5;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a value for the radius:");
		r = kb.nextDouble();
		
		double area = calcArea(r);
		print(area);
	}
	
	public static double calcArea(double rad)
	{
		return (Math.pow(rad, 2))*3.14;
	}
	
	public static void print(double area)
	{
		System.out.printf("The area of a circle with radius " + r + " is %.5f.", area);
	}
}