public abstract class console extends gamesystem
{
	private String platform;
	private int serialNo;
	
	public console()
	{
		this.platform = "";
	}
	
	public console(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random()*10000000);
	}
	
	public String getplatform()
	{
		return platform;
	}
	
	public int getserial()
	{
		return serialNo;
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + super.getplatform() +
				"\nSerial #: " + super.getserial() +
				"\nController: " + getController() + "\n";
	}
}