//need to import ArrayList first
import java.util.ArrayList;
//need to import to use array methods
import java.util.Arrays;

public class lesson10
{
	public static void main(String[]args)
	{
		//how to declare arraylists
		ArrayList<Integer> list1 = new ArrayList<Integer> ();
		ArrayList<String> list2 = new ArrayList<String> ();
		
		System.out.println("list1 size: " + list1);
		System.out.println("list2 size: " + list2);
		
		//.add(x)
		//add(x) adds x to the end of the array
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add("a");
		list2.add("b");
		list2.add("c");
		
		System.out.println("list1 with numbers...\n" + list1);
		System.out.println("list2 with strings...\n" + list2);
		
		//.get(x)
		//returens value at a given index x
		int number = list1.get(2);
		System.out.println(number);
		
		//.set(x, y)
		//overwrites value at index x with y
		list1.set(1, 8);
		System.out.println(list1);
		list2.set(2, "z");
		System.out.println(list2);
		
		//.remove(x)
		//deletes value at position x from list
		list1.remove(list1.indexOf(3));
		System.out.println(list1);
		list2.remove("a");
		System.out.println(list2);
		
		//.split(" ")
		//parses values from string into an array, ignoring value in parenteses called delimiter
		String letters = "a b c d e f g";
		String[] lets = letters.split(" ");
		
		//Arrays.toString()
		//parses array in parentheses into a string
		System.out.println(Arrays.toString(lets));
		
		//Arrays.asList()
		//converts array into arraylist
		Arrays.asList(lets);
		ArrayList<String> letterList = new ArrayList<String> (Arrays.asList(lets));
		System.out.println(letterList);
		
		//Integer.parseInt()
		//converts numbers in string to integer
		String nums = "1 2 3 4 5 6 7 8 9";
		System.out.println(Integer.parseInt(nums.substring(4,5)));
		
		//split() nums into an array
		String[] digits = nums.split(" ");
		//convert numbers to ints and add them to an arraylist
		ArrayList<Integer> numList = new ArrayList<Integer> ();
		for(int i = 0; i < digits.length; i++)
		{
			numList.add(Integer.parseInt(digits[i]));
		}
		//print arraylist
		System.out.println(numList);
	}
}