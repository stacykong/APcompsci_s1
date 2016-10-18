import java.util.Scanner;

public class quiz
{
	
	static int num1 = 5;
	static int num2 = 7;
	static int num3 = 9;
	
	public static void main(String[]args)
	{
		numPrint(num1, num2, num3);
	}
	public static int calcAvg(int one, int two, int three)
	{
		return (one + two + three)/3;
	}
	
	public static void numPrint(int one, int two, int three)
	{
		double avg = calcAvg(one, two, three);
		System.out.println("The avg of " + one + two + three +"is" +avg);
	}
}