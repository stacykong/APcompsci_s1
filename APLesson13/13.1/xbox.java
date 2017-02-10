public class xbox extends console
{
	private String platform;
	private int serialNo;
	
	public xbox()
	{
		platform = "";
	}
	
	public xbox(String p)
	{
		platform = p;
		serialNo = (int)(Math.random()*10000000);
	}
	
	public String getplatform()
	{
		return "XBox";
	}
	
	public int getserial()
	{
		return serialNo;
	}
	
	public String getController()
	{
		return "XBox Wireless Controller";
	}
	
	public String toString()
	{
		return "Platform: " + getplatform() +
				"\nSerial #: " + super.getserial() +
				"\nController: " + getController() + "\n";
	}
}