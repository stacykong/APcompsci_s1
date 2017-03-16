import java.util.Arrays;

public class toyota extends car
{
	double[] location;
	double lx, ly;
	
	public toyota()
	{
		location = new double[]{0, 0};
		lx = ly = 0;
	}
	
	public toyota(String c)
	{
		lx = Double.parseDouble((c.split(", ")[0]));
		ly = Double.parseDouble((c.split(", ")[1]));
		location = new double[]{lx, ly};
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