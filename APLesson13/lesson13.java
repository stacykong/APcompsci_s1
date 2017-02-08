public abstract class lesson13
{
	//factoring out is finding all common fields(?)
	private String name;
	private double value;
	private int count;
	
	public lesson13()
	{
		this.name = "";
		this.value = 0;
		this.count = 0;
	}
	
	public lesson13(String n, double v)
	{
		this.name = n;
		this.value = v;
		this.count = 0;
	}
	
	public abstract String scan();
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getValue()
	{
		return value;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return "Your " + name + " is worth $" + value + ".\n";
	}
}