import java.util.Scanner;

public class average
{
	static int num1 = 1;
	static int num2 = 2;
	static int num3 = 2;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		num1 = kb.nextInt();
		System.out.println("Please enter the second number:");
		num2 = kb.nextInt();
		System.out.println("Please enter the third number:");
		num3 = kb.nextInt();
		
		double avg = average(num1, num2, num3);
		print(avg);
	}
	
	public static double average(int one, int two, int three)
	{
		return (one + two + three)/3;
	}
	
	public static void print(double avg)
	{
		System.out.printf("The average of " + num1 +", " + num2 + ", and " + num3 + " is %.5f.", avg);
	}
}