public class lab9ex5
{
	static int[] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		
		fillArray();
		System.out.println("For all the following numbers...");
		printArray();
		System.out.println("The" + getArray() + " are odd numbers");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100) + 1;
		}
	}
	
	public static void printArray()
	{
		for(int n : numbers)
		{
			System.out.println(n);
		}
	}
	
	public static String getArray()
	{
		String odds = "";
		
		for(int n : numbers)
		{
			if(!(n % 2 == 0))
				odds = odds + " " + n;
		}
		return odds;
	}
}