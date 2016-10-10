import java.util.Scanner;

public class quiz4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("first int");
		int num1 = kb.nextInt();
		System.out.println("second int");
		int num2 = kb.nextInt();
		
		sumPrint(num1, num2);
	}
	
	public static double calcSum(int one, int two)
	{
		return one + two;
	}
	
	public static void sumPrint(int one, int two)
	{
		double sum = calcSum(one, two);
		System.out.printf("The sum of "+one+" and " + two +" is %.2f", sum);
	}
}