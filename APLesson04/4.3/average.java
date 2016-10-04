import java.util.Scanner;

public class average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a integer for the first number:");
		int num1 = kb.nextInt();
		System.out.println("Please enter a integer for the second number:");
		int num2 = kb.nextInt();
		System.out.println("Please enter a integer for the third number:");
		int num3 = kb.nextInt();
		
		double avg = average(num1, num2, num3);
		
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %.5f.", avg);
	}
	
	public static double average(int one, int two, int three)
	{
		return (one + two + three)/3;
	}
}