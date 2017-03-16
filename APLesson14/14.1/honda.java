import java.util.Arrays;

public class honda extends car
{
	double[] location;
	
	public honda()
	{
		location = new double[]{0, 0};
	}
	
	public honda(double[] loc)
	{
		location = loc;
	}
	
	public int getid()
	{
		return super.getid();
	}
	
	public double[] getloc()
	{
		location[0] += super.location[0];
		location[1] += super.location[1];
		return location;
	}
}