public class lesson11
{
	public static void main(String[]args)
	{
		
		//filling the array
		int[][]values = new int [4][4]; //sets up 4x4 array
		//values [0][0] = 1;
		//values [1][1] = 2;
		//values [2][2] = 3;
		//values [3][3] = 4;
		
		/*
		int num = 1;
		for(int i i =0; i < values.length; i++)
		{
			for(int j = 0; j < values.length; j++)
			{
				values[i][j] = num;
				num++;
			}
		}
		*/
		
		/*
		int num = 1;
		//i is vertical, j horizontal
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				values[i][j] = num;
			}
			num++;
		}
		*/
		
		//can also do this
		int num = 1;
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				values[j][i] = num;
				num++;
			}
		}
		
		//print the array
		//goes through each row, then down
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
		
		//search the array
		int count = 0;
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				if(values[i][j] % 5 ==0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " multiples of 5 in the array");
		
		System.out.println();
		
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String [][] randLetters = new String[4][4];
		
		/*
		randLetters[0][0] = "a";
		randLetters[1][1] = "b";
		randLetters[2][2] = "c";
		randLetters[3][3] = "d";
		*/
		
		int spot = 0;
		for(int i = 0; i < randLetters.length; i++)
		{
			for(int j = 0; j < randLetters[i].length; j++)
			{
				randLetters[i][j] = letters.substring(spot, spot + 1);
				spot++;
			}
		}
		
		for(int i = 0; i < randLetters.length; i++)
		{
			for(int j = 0; j < randLetters[i].length; j++)
			{
				System.out.print(randLetters[j][i] + "\t");
				//goes down then across
			}
			System.out.println();
		}
		
	}
}