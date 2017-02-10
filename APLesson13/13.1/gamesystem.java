public class gamesystem
{
	private String platform;
	private int serialNo;
	
	public gamesystem()
	{
		this.platform = "";
	}
	
	public gamesystem(String p)
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
}