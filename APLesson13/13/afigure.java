public class afigure extends toy
{
	private String name;
	private int count;
	
	public afigure()
	{
		super();
		this.name = "";
		this.count = 1;
	}
	
	public afigure(String n)
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
		return "Action Figure";
	}
	
	public String toString()
	{
		return name + ": " + count;
	}
}