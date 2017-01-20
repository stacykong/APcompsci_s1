public class lab12ex5
{
	private String firstname;
	private String lastname;
	private String avatar;
	private int userID;
	
	public lab12ex5()
	{
		firstname = "";
		lastname = "";
		avatar = "";
		userID = 0;
	}
	
	public lab12ex5(String fn, String ln)
	{
		firstname = fn;
		lastname = ln;
		avatar = "Undefined";
		userID = (int)(Math.random()*1000000)+1;
	}
	
	public lab12ex5(String fn, String ln, String av)
	{
		firstname = fn;
		lastname = ln;
		avatar = av;
		userID = (int)(Math.random()*1000000)+1;
	}
	
	public void setAvatar(String av)
	{
		avatar = av;
	}
	
	
	public String toString()
	{
		return "Customer Info:\nFirst Name: " + firstname + 
				"\nLast Name: " + lastname + 
				"\nAvatar: " + avatar +
				"\nUser ID: " + userID;
	}
}