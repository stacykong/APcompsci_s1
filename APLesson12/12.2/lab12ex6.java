public class lab12ex6
{
	private String iman;
	private String iname;
	private String icat;
	private int upc;
	private double iprice;
	
	public lab12ex6()
	{
		iman = "";
		iname = "";
		icat = "";
		upc = 0;
		iprice = 0;
	}
	
	public lab12ex6(String im, String in)
	{
		iman = im;
		iname = in;
		upc = (int)(Math.random()*1000000000);
		icat = "N/A";
		iprice = "N/A";
	}
	
	public lab12ex6(String im, String in, String ic, double p)
	{
		iman = im;
		iname = in;
		upc = (int)(Math.random()*1000000000);
		icat = ic;
		iprice = p;
	}
	
	public String toString()
	{
		return "Item Manufacturer: " + iman + 
				"\nItem Name: " + iname + 
				"\nUPC: " + upc +
				"\nItem Category: " + icat + 
				"\nItem Price: " + iprice;
	}
}