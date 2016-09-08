import java.util.Scanner;

public class L3_ex1
{
	public static void main(String[]args)
	{
		Scanner RudeAI = new Scanner(System.in);
		System.out.println("Hey, I'm RudeAI, and I have some questions for you. \nWhat's your name?");
		String name = RudeAI.next();
		System.out.println("I didn't think anyone named their kids " + name + " anymore. \nHow old are you?");
		int age = RudeAI.nextInt();
		System.out.println(age + "? You must be a bag of bones. \nWhat do you do for fun?");
		String fun = RudeAI.next();
		System.out.println(fun + "? Really? No one does that anymore. \nWhat kind of music do you like?");
		String music = RudeAI.next();
		System.out.println("Seriously? " + music + " is terrible. \nHow many siblings do you have?");
		int sib = RudeAI.nextInt();
		System.out.println(sib + ", huh? Hope they're all smarter than you. \nWhat do you want to be when you grow up?");
		String work = RudeAI.next();
		System.out.println("You need to be much smarter to be a " + work + ".");
		System.out.println("So, " + name + ", at " + age + " you " + fun + " and listen to " + music + ", huh? Sounds pretty lame to me.\nGood luck being a " + work + ".");
	}
}