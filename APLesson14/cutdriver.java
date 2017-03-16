import java.util.ArrayList;

public class cutdriver
{
	public static void main(String[]args)
	{
		ArrayList<cutshapes> cuts = new ArrayList<>();
		cuts.add(new square(9));
		cuts.add(new rectangle(10,12));
		cuts.add(new circle(5));
		
		double tarea = 0;
		
		for(cutshapes sh : cuts)
		{
			System.out.println(sh.getarea());
			tarea += sh.getarea();
		}
		
		System.out.println("total wood needed: " + tarea + " sq ft");
	}
}