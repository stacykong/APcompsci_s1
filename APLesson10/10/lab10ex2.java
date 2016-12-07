import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class lab10ex2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation:");
		String eq = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(eq.split(" ")));
		
		System.out.println(doEquation(equation));
	}
	
	public static ArrayList<String> doEquation(ArrayList<String> eq)
	{
		int i = 0;
		while(i < eq.size())
		{
			if((eq.get(i).equals("*") || eq.get(i).equals("/")))
			{
				if(eq.get(i).equals("*"))
					eq.set(i, "" + (Integer.parseInt(eq.get(i-1)) * Integer.parseInt(eq.get(i+1))));
				else
					eq.set(i, "" + (Integer.parseInt(eq.get(i-1)) / Integer.parseInt(eq.get(i+1))));
				eq.remove(i-1);
				eq.remove(i);
			}
			else
				i++;
		}
		
		i = 0;
		while(i < eq.size())
		{
			if((eq.get(i).equals("+") || eq.get(i).equals("-")))
			{
				if(eq.get(i).equals("+"))
					eq.set(i, "" + (Integer.parseInt(eq.get(i-1)) + Integer.parseInt(eq.get(i+1))));
				else
					eq.set(i, "" + (Integer.parseInt(eq.get(i-1)) - Integer.parseInt(eq.get(i+1))));
				eq.remove(i-1);
				eq.remove(i);
			}
			else
				i++;
		}
		return(eq);
	}
}