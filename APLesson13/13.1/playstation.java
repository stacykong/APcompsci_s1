public class playstation extends console
{
	private String platform;
	private int serialNo;
	
	public playstation()
	{
		super();
	}
	
	public playstation(String p)
	{
		super(p);
	}
	
	public String getplatform()
	{
		return "PlayStation";
	}
	
	public int getserial()
	{
		return serialNo;
	}
	
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	public String toString()
	{
		return "Platform: " + getplatform() +
				"\nSerial #: " + super.getserial() +
				"\nController: " + getController() + "\n";
	}
}