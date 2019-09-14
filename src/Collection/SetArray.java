package Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class SetArray
{
	public static void main(String args[])
	{
		ArrayList  al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.set(0, 45);
		System.out.println(al);
	}
}
