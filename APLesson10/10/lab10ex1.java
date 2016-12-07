import java.util.ArrayList;
import java.util.Arrays;

public class lab10ex1
{
	public static void main(String[]args)
	{
		Integer [] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> nums = new ArrayList<> (Arrays.asList(numbers));
		
		System.out.println(removePrimes(nums));
	}
	
	public static int gFactor(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
				return 1;
		}
		return 0;
	}
	
	public static ArrayList<Integer> removePrimes(ArrayList<Integer> nums)
	{
		for(int i = 0; i < nums.size(); i++)
		{
			if(gFactor(nums.get(i)) == 0)
			{
				if(i == 0)
				{
					nums.remove(i);
				}
				else
				{
					nums.remove(i);
					i--;
				}
			}
		}
		return nums;
	}
}