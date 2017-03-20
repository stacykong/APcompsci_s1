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
		super.location = location = loc;
	}
}