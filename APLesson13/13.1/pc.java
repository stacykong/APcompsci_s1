public class pc extends gamesystem
{
	private String platform;
	private int serialNo;
	
	public pc()
	{
		super();
	}
	
	public pc(String p)
	{
		super(p);
	}
	
	public String getplatform()
	{
		return "PC";
	}
	
	public int getserial()
	{
		return super.getserial();
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + getplatform() +
				"\nSerial #: " + getserial() +
				"\nSystem Input: " + systemInput();
	}
}