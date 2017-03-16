public class rectangle implements cutshapes
{
	double sidea, sideb;
	
	public rectangle()
	{
		sidea = sideb = 0;
	}
	
	public rectangle(double a, double b)
	{
		sidea = a;
		sideb = b;
	}
	
	public double geta()
	{
		return sidea;
	}
	
	public double getb()
	{
		return sideb;
	}
	
	public double getarea()
	{
		return sidea*sideb;
	}
}