import java.util.Scanner;

public class lab4_ex4
{
	public static void main(String[]args)
	{
		lab4_ex4 convol = new lab4_ex4();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the height in inches:");
		int he = kb.nextInt();
		System.out.println("Please enter the length in inches:");
		int le = kb.nextInt();
		System.out.println("Please enter the width in inches:");
		int wi = kb.nextInt();
		
		double vol = convol.calcVol(he, le, wi);
		System.out.printf("The volume in cubic feet is %10.2f\n", vol);
	}
	
	public double calcVol(int h, int l, int w)
	{
		return (h*l*w)/1728;
	}
}