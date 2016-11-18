import java.util.Scanner;

public class lesson9
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//String [] names = new String[5];
		//System.out.println("Please enter 5 names");
		int[] numbers = new int[10];
		
		//fills array
		//for(int i = 0; i < names.length; i++)
		//{
		//	names[i] = kb.next();
		//}
		
		//print array
		//for(String name : names)
		//{
		//	System.out.print("\"" + name.length() + "\", ");
		//}
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100) + 1;
		}
		
		for(int num : numbers)
		{
			System.out.println(num);
		}
		System.out.println();
		System.out.println(sumArray(numbers));
	}
	
	public static int sumArray(int[] n)
	{
		int sum = 0;
		for(int num : n)
		{
			sum += num;
		}
		return sum;
	}
}
