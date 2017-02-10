import java.util.ArrayList;

public class gamerun
{
	public static void main(String[]args)
	{
		ArrayList<gamesystem> s = new ArrayList<gamesystem>();
		s.add(new xbox());
		s.add(new playstation());
		s.add(new pc());
		
		for(int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
		}
	}
}