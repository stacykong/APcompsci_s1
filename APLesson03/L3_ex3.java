import java.util.Scanner;

public class L3_ex3
{
	public static void main(String[]args)
	{
		Scanner calc = new Scanner(System.in);
		System.out.println("Pick a number for the radius.");
		int r = calc.nextInt();
		System.out.println("Pick a number for the velocity.");
		int v = calc.nextInt();
		System.out.println("Pick a number for the force.");
		int f = calc.nextInt();
		int m = (f * r) / (v * v);
		System.out.println("The mass is " + m + ".");
	}
}