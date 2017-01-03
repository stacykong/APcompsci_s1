public class quiz
{
	public static void main(String[]args)
	{
		int[] arr = {0, 0, 1, 2};
		
		int sum = arr[0], i = 0;
		while(i < arr.length)
		{
			i++;
			sum += arr[i];
		}
	}
}