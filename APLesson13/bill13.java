public class bill13 extends lesson13
{
	private String name;
	private String face;
	private double value;
	
	public bill13()
	{
		super();
		this.face = "";
	}
	
	public bill13(String n, String f, double v)
	{
		super(n, v);
		this.face = f;
	}
	
	public String scan()
	{
		return face;
	}
	
	public String toString()
	{
		return "Face: " + face + "\n" + 
				super.toString();
	}
}