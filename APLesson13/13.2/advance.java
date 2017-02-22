public class advance extends ticket
{
	private int daysleft;
	
	public advance()
	{
		super();
	}
	
	public int getserial()
	{
		return super.getserial();
	}
	
	public double getprice()
	{
		if(daysleft >= 10)
			return 30.00;
		else
			return 40.00;
	}
	
	public String toString()
	{
		return "Serial: " + getserial() + 
				"\nPrice: " + getprice();
	}
}