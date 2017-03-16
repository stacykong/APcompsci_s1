import java.util.Arrays;

public class toyota implements location
{
	double[] locate;
	double lx, ly;
	
	public toyota()
	{
		locate = new double[]{0, 0};
		lx = ly = 0;
	}
	
	public toyota(String c)
	{
		lx = Double.parseDouble((c.split(", ")[0]));
		ly = Double.parseDouble((c.split(", ")[0]));
		locate = new double[]{lx, ly};
	}
	
	public int getid()
	{
		return (int)(Math.random()*1000000);
	}
	
	public void move(double[] loc)
	{
		double x = loc[0];
		double y = loc[1];
	}
	
	public double[] getloc()
	{
		return locate;
	}
}