package Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ForLoopArrayList 
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	/*	for(Integer i : al)
		{
			System.out.println(i);
		}
	*/
	}
}
