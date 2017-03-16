import java.util.Arrays;

public class honda implements location
{
	double[] locate;
	
	public honda()
	{
		locate = new double[]{0, 0};
	}
	
	public honda(double[] loc)
	{
		locate = loc;
	}
	
	public int getid()
	{
		return (int)(Math.random()*1000000);
	}
	
	public void move(double[] loc)
	{
		double x = loc[0];
		double y = loc[1];
		getloc();
	}
	
	public double[] getloc()
	{
		return locate;
	}
}