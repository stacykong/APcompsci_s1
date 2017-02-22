public abstract class console extends gamesystem
{
	private String platform;
	private int serialNo;
	
	public console()
	{
		super();
	}
	
	public console(String p)
	{
		super(p);
	}
	
	public String getplatform()
	{
		return platform;
	}
	
	public int getserial()
	{
		return super.getserial();
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getplatform() +
				"\nSerial #: " + getserial() +
				"\nController: " + getController();
	}
}