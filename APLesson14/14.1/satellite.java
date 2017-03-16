import java.util.ArrayList;

public class satellite
{
	public static void main(String[]args)
	{
		ArrayList<location> locate = new ArrayList<>();
		double[] honloc = {5, 6};
		car h = new honda(honloc);
		car t = new toyota("8, 9");
		car g = new gmc(3, 8);
		locate.add(h);
		locate.add(t);
		locate.add(g);
		
		double[] home = {0, 0};
		
		String printout = "\n\n" + "=========================" + "\nStarting locations...";
		
		for(location l : locate)
		{
			printout += "\nLocation for " + l.getid() + ": (" + getlocation(l.getloc()) + ")";
		}
		
		printout += "\n\n" + "=========================";
		
		for(location l : locate)
		{
			double one = Double.format(%.2f, (double)(Math.random()*100));
			double two = (double)(Math.random()*100);
			
			((car)l).move(one, two);
			
			printout += "\nAfter " + l.getid() + " moved (" + one + ", " + two + ")" + 
				"\nNew Location: (" + getlocation(l.getloc()) + ")";
		}
		
		printout += "\n\n" + "=========================" + "\nDistance from home...";
		
		for(location l : locate)
		{
			printout += "\nDistance for " + l.getid() + ": (" + getdistance(l.getloc(), home) + ")";
		}
		
		System.out.println(printout);
	}
	
	public static String getdistance(double[] car, double[] home)
	{
		return String.format("%.2f", Math.sqrt((Math.pow(car[0]-home[0], 2) + Math.pow(car[1]-home[1], 2))));
	}
	
	public static String getlocation(double[] loc)
	{
		return String.format("%.2f, %.2f", loc[0], loc[1]);
	}
}