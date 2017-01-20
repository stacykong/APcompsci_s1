public class lab12ex4
{
	private String hair, eyes, skin;
	
	public lab12ex4()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public lab12ex4(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}