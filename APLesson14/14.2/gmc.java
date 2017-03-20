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
		super.location[0] = lx = x;
		super.location[1] = ly = y;
	}
}