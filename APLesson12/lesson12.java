public class lesson12
{
	//instance variables
	private String username;
	private String first;
	private String last;
	
	//default constructor
	public lesson12()
	{
		//default values in case nothing is entered
		username = "";
		first = "";
		last = "";
	}
	
	//param constructor
	public lesson12(String uname, String fname, String lname)
	{
		//overloads above
		username = uname;
		first = fname;
		last = lname;
	}
	
	//modifiers/"setters"
	public void setusername(String uname)
	{
		username = uname;
	}
	
	//accessors/"getters"
	public String getusename()
	{
		return username;
	}
	
	public String getfirstname()
	{
		return first;
	}
	
	public String getlastname()
	{
		return last;
	}
	
	public static void main(String[]args)
	{
		//instantiate objectr without parameters
		lesson12 object = new lesson12();
		
		System.out.println("<<<<<<< USER INFO >>>>>>>");
		System.out.println("Name: " + object.getfirstname() + "\t" + object.getlastname() + "\n" +
			"User Name: " + object.getusename() + "\n\n");
		
		//again with params
		lesson12 object2 = new lesson12("golden88", "the", "best");
		
		System.out.println("<<<<<<< USER INFO >>>>>>>");
		System.out.println("Name: " + object2.getfirstname() + "\t" + object2.getlastname() + "\n" +
			"User Name: " + object2.getusename() + "\n\n");
		
		object2.setusername("gboy");
		
		System.out.println("<<<<<<< USER INFO >>>>>>>");
		System.out.println("Name: " + object2.getfirstname() + "\t" + object2.getlastname() + "\n" +
			"User Name: " + object2.getusename() + "\n\n");
	}
}