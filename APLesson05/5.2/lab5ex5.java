import java.util.Scanner;

public class lab5ex5
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("You are walking home when you see path that you have never seen before." +
							"\nDo you take it? (Y or N)");
		String choice = kb.next();
		
		if(choice.equals("Y"))
		{
			System.out.println("You take the unknown path. As you go, the path doesn't seem to end and it gets darker and darker." +
								"\nDo you keep going?");
			String a = kb.next();
			
			if(a.equals("Y"))
			{
				System.out.println("A ghost appears before you and asks you to avenge her, as she has been wrongfully killed."+
									"\nDo you agree to do it?");
				String b = kb.next();
				
				if(b.equals("Y"))
				{
					System.out.println("She tells you the details of her murder and the serial killer that is still living in your town."+
										"\nRegardless of your fear, you agree to catch him.");
				}
				else
					System.out.println("She looks disappointed, but agrees that it is very dangerous and respects your decision."+
										"\nYou return home without further incident.");
			}
			else
			{
				System.out.println("As you are turn around, you see the path branch off."+
									"\nDo you take it?");
				String c = kb.next();
				
				if(c.equals("Y"))
				{
					System.out.println("Against your better judgement, you take it."+
										"\nIt takes you another two hours to get home, but you make it.");
				}
				else
					System.out.println("You ignore the branch and make it home in 10 minutes without incident.");
			}
		}
		
		else
		{
			System.out.println("You keep going. The path gradually gets covered in leaves. There is a five dollar bill lying on a pile of leaves."+
								"\nDo you take it?");
			String alta = kb.next();
			
			if(alta.equals("Y"))
			{
				System.out.println("as you reach out, the pile of leaves starts to rustle."+
									"\nDo you still want to take the money?");
				String altb = kb.next();
				
				if(altb.equals("Y"))
				{
					System.out.println("As your hand lands on the money, you are dragged into the leaves, the pile bigger than you imagined."+
										"\nYu struggle for a bit, then black out.");
				}
				else
					System.out.println("You withdraw your hand, deciding it is best to leave things alone." +
										"\nYou make it home shortly after.");
			}
			else
			{
				System.out.println("You keep walking. As you go, something catches your attention. It's a golden arrow lying on the ground, splattered with blood."+
									"\nDo you take it?");
				String altc = kb.next();
				
				if(altc.equals("Y"))
				{
					System.out.println("You decide that it looks valuable and needs to be returned to its owner. However, as you pick it up, you get pricked by the arrow."+
										"\nBefore you can move, you begin to feel faint and collapse to the ground. When you wake up, you have mysterious powers.");
				}
				else
				{
					System.out.println("You think all of these random items lying in the road are too suspicious, and walk around it carefully."+
										"The rest of your walk passes by, and you make it home safely.");
				}	
			}
		}
	}
}