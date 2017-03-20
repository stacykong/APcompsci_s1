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
		super.location = location = new double[]{lx, ly};
	}
}