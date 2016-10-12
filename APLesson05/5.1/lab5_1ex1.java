import java.util.Scanner;

public class lab5_1ex1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your math letter grade:");
		String m = kb.next();
		System.out.println("Please enter your science letter grade:");
		String s = kb.next();
		System.out.println("Please enter your english letter grade:");
		String e = kb.next();
		System.out.println("Please enter your history letter grade:");
		String h = kb.next();
		System.out.println("Please enter your language letter grade:");
		String l = kb.next();
		System.out.println("Please enter your first elective letter grade:");
		String e1 = kb.next();
		System.out.println("Please enter your second elective letter grade:");
		String e2 = kb.next();
		
		double gp = calcPoints(m) + calcPoints(s) + calcPoints(e) + calcPoints(h) + calcPoints(l) + calcPoints(e1) + calcPoints(e2);
		
		System.out.printf("Your GPA is %.2f", gp/7);
	}
	
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		else if(grade.equals("B"))
			return 3.0;
		else if(grade.equals("C"))
			return 2.0;
		else if(grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}