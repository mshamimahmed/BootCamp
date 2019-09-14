package Collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ClearArrayList
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		ArrayList al2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(al2);
	}
}
