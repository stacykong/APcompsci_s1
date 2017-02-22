public class sadvance extends advance
{
	private int daysleft;
	
	public sadvance()
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
			return 30.00/2;
		else
			return 40.00/2;
	}
	
	public String toString()
	{
		return super.toString() + "\n(STUDENT ID REQUIRED)";
	}
}