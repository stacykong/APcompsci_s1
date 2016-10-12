import java.util.Scanner;

public class lab5_1ex2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is yout height in inches?");
		double h = kb.nextInt();
		System.out.println("What is your weight in pounds?");
		double w = kb.nextInt();
		
		double bmi = 0;
		String cond = calcBMI(h, w);
		
		System.out.println("\nYour condition is " + cond);
	}
	
	public static String calcBMI(double h, double w)
	{
		double bmi = ((w*703)/(h*h));
		System.out.printf("Your BMI is: %.2f", bmi);
		
		if(bmi < 18.5)
			return "Underweight";
		else if(bmi <= 24.9)
			return "Normal";
		else if(bmi <= 29.9)
			return "Overweight";
		else if(bmi <= 34.9)
			return "Obese";
		else if(bmi <= 39.9)
			return "Very Obese";
		else
			return "Morbidly Obese";
	}
}