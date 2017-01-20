import java.util.Scanner;

public class lab12ex3run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your choice of paint:");
		String paint = kb.nextLine();
		System.out.println("Please enter your choice of interior:");
		String interior = kb.nextLine();
		System.out.println("Please enter your choice of engine:");
		String engine = kb.nextLine();
		System.out.println("Please enter your choice of tires:");
		String tires = kb.nextLine();
		
		lab12ex3 car = new lab12ex3(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready:\nPaint: " + car.getPaint() + "\nInterior: "
			+ car.getInterior() + "\nEngine: " + car.getEngine() + "\nTires: " + car.getTires());
	}
}