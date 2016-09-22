public class lesson4_1
{
	public static void main(String[]args)
	{
		//lesson4_1 average = new lesson4_1();
		//int n1 = 3;
		//int n2 = 8;
		//int n3 = 15;
		//double avg = average.calcAvg(n1, n2, n3);
		//System.out.printf("The average is %10.2f\n", avg);
		
		lesson4_1 volCube = new lesson4_1();
		int side1 = 3;
		System.out.println(volCube.cube(side1));
	}
	
	//public double calcAvg(int one, int two, int three)
	//{
	//	return (one + two + three)/3.0;
	//}
	
	public int cube(int side)
	{
		return side*side*side;
	}
}