import java.util.Scanner;

public class cube
{
	static double side = 5;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please select a value for the side of the cube:");
		side = kb.nextDouble();
		
		double sa = calcSurf(side);
		print(sa);
	}
	
	public static double calcSurf(double s)
	{
		return s*s*6;
	}
	
	public static void print(double sa)
	{
		System.out.printf("The surface area of a cube with side " + side + " is %.5f.", sa);
	}
}