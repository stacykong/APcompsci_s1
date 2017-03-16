import java.util.Arrays;

public class gmc implements location
{
	double lx, ly;
	
	public gmc()
	{
		lx = ly = 0;
	}
	
	public gmc(double x, double y)
	{
		lx = x;
		ly = y;
	}
	
	public int getid()
	{
		return (int)(Math.random()*1000000);
	}
	
	public void move(double x, double y)
	{
		getloc();
	}
	
	public double[] getloc()
	{
		double[] loc = {lx, ly};
		return loc;
	}
}