import java.util.Arrays;

public class gmc extends car
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
		return super.getid();
	}
	
	public double[] getloc()
	{
		double[] location = {lx, ly};
		location[0] += super.location[0];
		location[1] += super.location[1];
		return location;
	}
}