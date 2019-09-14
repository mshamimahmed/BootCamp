package Collection;
import java.util.ArrayList;
import java.util.Scanner;
public class IinArrayList 
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
/*		Integer[] myArray  =  (Integer[]) al.toArray(new Integer[]);
		for(int i : myArray)
		{
			System.out.println(i+ " ");
		}
		*/
		System.out.println(al.contains(10));
		System.out.println(al.contains(15));
		System.out.println(al.contains(20));
	}
}
