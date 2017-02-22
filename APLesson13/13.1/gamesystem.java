public class gamesystem
{
	private String platform;
	private int serialNo;
	
	public gamesystem()
	{
		platform = "";
		serialNo = (int)(Math.random()*10000000);
	}
	
	public gamesystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random()*10000000);
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