public class walkup extends ticket
{
	public walkup()
	{
		
	}
	
	public int getserial()
	{
		return (int)(Math.random()*10000000);
	}
	
	public double getprice()
	{
		return 50.00;
	}
	
	public String toString()
	{
		return "Serial: " + getserial() + 
				"\nPrice: " + getprice();
	}
}