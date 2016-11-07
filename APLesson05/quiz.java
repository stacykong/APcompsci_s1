import java.util.Scanner;

public class quiz
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("PLease enter the first element");
		String e1 = kb.next();
		System.out.println("Enter electronegativity");
		double elec1 = kb.nextDouble();
		System.out.println("PLease enter the second element");
		String e2 = kb.next();
		System.out.println("Enter electronegativity");
		double elec2 = kb.nextDouble();
		
		String bond = calcBond(elec1, elec2);
		System.out.println("bond between " + e1 + " and " + e2 + " is " + bond);
		
		boolean a = true;
		boolean b = false;
		boolean c = false;
		System.out.println("!a && !(b && !c)" + (!a && !(b && !c)));
		System.out.println("!a || !b || !c" + (!a || !b || !c));
		System.out.println("!(a || b || c)" + (!(a || b || c)));
		System.out.println("!(a && b && c)" + (!(a && b && c)));
		System.out.println("!a || !(b || !c)" + (!a || !(b || !c)));
	}
	public static String calcBond(double one, double two)
	{
		if(one >= two)
		{
			if(one-two>=1.7)
				return "ionic";
			else
				return "covalent";
		}
		else
		{
			if(two-one>=1.7)
				return "ionic";
			else
				return "covalent";
		}
	}
}