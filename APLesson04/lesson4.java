public class lesson4
{
	public static void main(String[]args)
	{
		//System.out.printf("%10s  %10.2f", "test", 238472.2349);
		
		lesson4 form = new lesson4();
		
		String word1 = "blah";
		double number1 = 23954.3967;
		
		form.format(word1, number1);
		
		String word2 = "rlly";
		double number2 = 823438.234;
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
}