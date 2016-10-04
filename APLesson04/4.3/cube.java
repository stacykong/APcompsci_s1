import java.util.Scanner;

public class cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an interger for the length of a side of a cube:");
		int side = kb.nextInt();
		
		double sa = calcSurf(side);
		System.out.printf("The surface area of a cube whose sides are " + side + " in length is %.5f.", sa);
	}
	
	public static int calcSurf(int s)
	{
		return 6*(s*s);
	}
}