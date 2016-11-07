import java.util.Scanner;

public class lab7ex1
{
	static int num;
	static int sum = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		num = kb.nextInt();
		
		sumDigits();
		
		System.out.println("The sum of the digits in " + num + " is " + sum);
	}
	
	public static void sumDigits()
	{
		int number = num;
		while(number > 0)
		{
			sum = sum + (number % 10);
			number /= 10;
		}
	}
}