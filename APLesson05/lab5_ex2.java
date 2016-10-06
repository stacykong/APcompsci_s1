import java.util.Scanner;

public class lab5_ex2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		lab5_ex2 form = new lab5_ex2();
		
		System.out.println("Please enter in item 1:");
		String i1 = kb.next();
		System.out.println("Please enter the price for item 1:");
		double p1 = kb.nextInt();
		
		System.out.println("Please enter in item 2:");
		String i2 = kb.next();
		System.out.println("Please enter the price for item 2:");
		double p2 = kb.nextInt();
		
		System.out.println("Please enter in item 3:");
		String i3 = kb.next();
		System.out.println("Please enter the price for item 3:");
		double p3 = kb.nextInt();
		
		System.out.println("Please enter in item 4:");
		String i4 = kb.next();
		System.out.println("Please enter the price for item 4:");
		double p4 = kb.nextInt();
	
		double sub = p1 + p2 + p3 + p4;
		double dis = 0;
		if (discount(sub))
			dis = sub * .15;
		if (!discount(sub))
			dis = 0;
		double tax = sub * .08;
		double total = sub - dis + tax;
		
		System.out.println("<<<<<<<<<<<<Receipt>>>>>>>>>>>>");
		form.format(i1, p1);
		form.format(i2, p2);
		form.format(i3, p3);
		form.format(i4, p4);
		form.format("Subtotal:", sub);
		form.format("Discount:", dis);
		form.format("Tax:", tax);
		form.format("Total:", total);
		System.out.println("_______________________________\n           Thank you!");
	}
	
	public static boolean discount(double sub)
	{
		return sub >=2000;
	}
	
	public void format(String i, double p)
	{
		System.out.printf("* %12s ........ %7.2f\n", i, p);
	}
}