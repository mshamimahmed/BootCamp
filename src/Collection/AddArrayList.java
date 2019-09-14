package Collection;
import java.util.ArrayList;
public class AddArrayList
{
	public static void main(String args[])
	{
		ArrayList al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.print("the array element is"+al);
		al.remove(1);
		System.out.println();
		System.out.println(al);
	}
}
