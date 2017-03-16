public class circle implements cutshapes
{
	private double radius;
	private double number;
	
	public circle()
	{
		radius = 0;
	}
	
	public circle(double r)
	{
		radius = r;
		number = 47;
	}
	
	public double getradius()
	{
		return radius;
	}
	
	public double getarea()
	{
		return pi*(Math.pow(radius, 2));
	}
}