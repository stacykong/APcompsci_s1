import java.util.Scanner;

public class L3_ex2
{
	public static void main(String[]args)
	{
		Scanner bmi = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		int h = bmi.nextInt();
		System.out.println("What's your weight in pounds?");
		int w = bmi.nextInt();
		int b = ((w * 703)/ (h * h));
		System.out.println("Your BMI is " + b + ".");
	}
}