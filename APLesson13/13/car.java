public class car extends toy
{
	private String name;
	private int count;
	
	public car()
	{
		super();
		this.name = "";
		this.count = 1;
	}
	
	public car(String n)
	{
		super();
		this.name = n;
		this.count = 1;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String getType()
	{
		return "Car";
	}
	
	public String toString()
	{
		return name + ": " + count;
	}
}