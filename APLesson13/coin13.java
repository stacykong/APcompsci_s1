public class coin13 extends lesson13
{
	private String name, weight;
	private double value;
	
	public coin13()
	{
		super();
		this.weight = "";
	}
	
	public coin13(String n, String w, double v)
	{
		super(n, v);
		this.weight = w;
	}
	
	public String scan()
	{
		return weight;
	}
	
	public String toString()
	{
		return "Weight: " + weight + "\n" + 
				super.toString();
	}
}