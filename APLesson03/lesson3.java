import java.util.Scanner; //import statement

public class lesson3
{
	public static void main(String[]args)
	{
		//instantiate new scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		//prompt for user input
		System.out.println("Who is your favorite teacher?");
		//search for next interger user enters
		String teach = keyboard.next();
		//print the results
		System.out.println("Cool, " + teach + " is great");
	}
}