public class Lab2
{
	public static void main(String[]args)
	{
		int x = 8;
		int y = 6;
		int prdt = x * y;
		System.out.println(x + " multiplied by " + y + " equals " + prdt);
		
		System.out.println(" ");
		
		String name = "Stacy";
		int number = 1234;
		String address = "jnsdfasdf";
		String city1 = "San";
		String city2 = "Diego";
		int zip = 2389575;
		System.out.println(name + "\n" + number + " " + address + "\n" + city1 + " " + city2 + "\n" + zip);
		
		System.out.println(" ");
		
		int l = 6;
		int w = 2;
		int h = 9;
		int sa = (2 * l * w) + (2 * w * h) + (2 * h * l);
		System.out.println("The surface area of your rectangular prism is " + sa);
	}
}