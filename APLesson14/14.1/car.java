public class car implements location
{
	double[] location;
	public final int id = (int)(Math.random()*1000000);
	
	public car()
	{
		location = new double[]{0, 0};
	}
	
	public int getid()
	{
		return id;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getloc()
	{
		return location;
	}
}