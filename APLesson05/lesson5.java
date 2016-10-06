import java.util.Random;
import java.util.Scanner;

public class lesson5
{
	public static void main(String[]args)
	{
		int num = 3;
		if(num == 3)
		{
			System.out.println("num equals 3!");
		}
		
		if(num == 5)
		{
			System.out.println("num equals 5!");
		}
		
		//boolean tOrF = false;
		if(tOrF())
		{
			System.out.println("it is true!");
		}
		if(!tOrF())
		{
			System.out.println("no! untrue!");
		}
		
		int num1 = 1 + (int)((Math.random()*100));
		System.out.println(num1);
		
		Random rand = new Random();
		int num2 = rand.nextInt(101);
		System.out.println(num2);
		
		int num3 = 8 % 6;
		System.out.println(num);
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter number 1:");
		int one = kb.nextInt();
		System.out.println("Please enter number 2:");
		int two = kb.nextInt();
		
		boolean even = (one + two) % 2 == 0;
		if (even)
			System.out.println("your number " + (one + two) + " is even!");
		if (!even)
			System.out.println("your number " + (one + two) + " is odd!");
	}
	
	public static boolean tOrF()
		{
			return 8 <= 5;
		}
}