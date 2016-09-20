import java.util.Scanner;

public class lab4
{
	public static void main(String[]args)
	{
		lab4 form = new lab4();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble(); 
		
		
		System.out.println("Please enter item 2:");
		String sajdf = kb.nextLine();
		String item2 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble(); 
		
		
		System.out.println("Please enter item 3:");
		String sdfk = kb.nextLine();
		String item3 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();

		double st = price1 + price2 + price3;
		double tax = st * .08;
		double t = tax + st;
		
		System.out.println("<<<<<<<<<<<<_Reciept_>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("\n");
		form.format("Subtotal:", st);
		form.format("Tax:", tax);
		form.format("Total:", t);
		System.out.println("\n___________________________\n* Thank you very much *");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n* %15s ........ %6.2f", item, price);
	}
}