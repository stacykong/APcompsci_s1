public class xbox extends console
{
	private String platform;
	private int serialNo;
	
	public xbox()
	{
		super();
	}
	
	public xbox(String p)
	{
		super(p);
	}
	
	public String getplatform()
	{
		return "XBox";
	}
	
	public int getserial()
	{
		return super.getserial();
	}
	
	public String getController()
	{
		return "XBox Wireless Controller";
	}
	
	public String toString()
	{
		return "Platform: " + getplatform() +
				"\nSerial #: " + getserial() +
				"\nController: " + getController();
	}
}