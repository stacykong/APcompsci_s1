import java.util.Scanner;

public class lab4_ex3
{
	public static void main(String[]args)
	{
		lab4_ex3 loan = new lab4_ex3();
		lab4_ex3 cost = new lab4_ex3();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the interest rate:");
		double rate = kb.nextDouble();
		System.out.println("Please enter the principal:");
		double pr = kb.nextDouble();
		System.out.println("Please enter the number of times the loan is compounded per year:");
		int num = kb.nextInt();
		System.out.println("Please enter the life of the loan in years:");
		int yr = kb.nextInt();
		
		double l = loan.tloan(rate, pr, num, yr);
		System.out.printf("Your total monthly payment is $%10.2f\n", l);
		
		double c = cost.tcost(l, yr);
		System.out.printf("Your total loan cost is $%10.2f\n", c);
	}
	
	public double tloan (double r, double p, int n, int t)
	{
		return p*(Math.pow(1 + (r/n), n*t));
	}
	
	public double tcost(double co, int t)
	{
		return (co/t)*12;
	}
}