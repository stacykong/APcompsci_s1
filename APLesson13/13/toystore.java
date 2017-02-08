import java.util.ArrayList;
import java.util.Arrays;

public class toystore
{
	private ArrayList<toy> toyList = new ArrayList<toy>();
	
	public toystore()
	{
		
	}
	
	public toystore(String t)
	{
		this.t = "Hotwheel, Car, G.I. Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		System.out.println(t);
		loadToys(t);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		System.out.println(toys);
		
		for(int i = 0; i < toys.size(); i++)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			toy t = new car(getThatToy(name).toString());
			
			if(getThatToy(name).equals(""))
			{
				if(type.equals("Car"))
				{
					toyList.add(new car(name));
					System.out.println(1);
				}
				else
					toyList.add(new afigure(name));
			}
			else
			{
				t.setCount(t.getCount() + 1);
				System.out.println(t.getCount());
			}
		}
	}
	
	public Object getThatToy(String nm)
	{
		for(toy t : toyList)
		{
			if(t.getName().equals(nm))
				return t;
			else
				return "";
		}
		return "";
	}
	
	public static void main(String[]args)
	{
		toystore g = new toystore();
		System.out.println(g.getMostFrequentToy());
		System.out.println(g.getMostFrequentType());
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(toy t : toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(toy t : toyList)
		{
			if(t.getType().equals("Car"))
				cars++;
			if(t.getType().equals("Action Figure"))
				figures++;
		}
		
		if(cars > figures)
			return "Cars";
		else if(figures < cars)
			return "Action Figures";
		else
		{
			System.out.println(cars + figures);
			return "Equals amounts of action figures and cars!";
		}
	}
	
	public String toString()
	{
		String toylist = "";
		for(int i = 0; i < toyList.size(); i++)
		{
			toylist += toyList.get(i);
			System.out.println(toylist);
		}
		return toylist;
	}
}