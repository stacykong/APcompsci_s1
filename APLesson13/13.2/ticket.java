public abstract class ticket
{
	public ticket()
	{
		
	}
	
	public int getserial()
	{
		return (int)(Math.random()*10000000);
	}
	
	public abstract double getprice();
	
	public String toString()
	{
		return "Serial: " + getserial() + 
				"\nPrice: " + getprice();
	}
}