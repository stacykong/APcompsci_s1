import java.util.Scanner;

public class lab12ex4run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter hair choice:");
		String hair = kb.nextLine();
		System.out.println("Please enter eyes choice:");
		String eyes = kb.nextLine();
		System.out.println("Please enter skin choice:");
		String skin = kb.nextLine();
		
		lab12ex4 human = new lab12ex4(hair, eyes, skin);
		
		System.out.println("My info:\nHair: " + human.getHair() + "\nEyes: " + human.getEyes() 
			+ "\nSkin: " + human.getSkin());
		
		System.out.println("Please enter hair choice:");
		String hair2 = kb.nextLine();
		System.out.println("Please enter eyes choice:");
		String eyes2 = kb.nextLine();
		System.out.println("Please enter skin choice:");
		String skin2 = kb.nextLine();
		
		human.setHES(hair, eyes, skin);
		
		System.out.println("Friend's info:\nHair: " + human.getHair() + "\nEyes: " + human.getEyes() 
			+ "\nSkin: " + human.getSkin());
	}
}