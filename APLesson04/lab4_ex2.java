import java.util.Scanner;

public class lab4_ex2
{
	public static void main(String[]args)
	{
		lab4_ex2 form = new lab4_ex2();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		//String n1 = kb.nextLine();
		String fn = kb.nextLine();
		System.out.println("Enter your last name:");
		String ln = kb.nextLine();
		System.out.println("Enter your title:");
		String t = kb.nextLine();
		System.out.println("Enter the school name:");
		//String nl = kb.nextLine();
		String sch = kb.nextLine();
		System.out.println("Enter the school year:");
		String yr = kb.nextLine();
		System.out.println("Enter your subject:");
		String sub = kb.nextLine();
		
		System.out.println("************************************");
		form.format(sch, yr);
		form.format(fn, ln);
		form.format(t, sub);
		System.out.println("************************************");
	}
	
	public void format(String s1, String s2)
	{
		System.out.printf("* %12s  %18s *\n", s1, s2);
	}
}