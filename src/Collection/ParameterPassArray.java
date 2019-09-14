package Collection;
import java.util.ArrayList;
import java.util.Scanner;
public class ParameterPassArray
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList<>();
		add(al);
		System.out.println(al);
	}
	public static void add(ArrayList al)
	{
		al.add(10);
		al.add(30);
		al.add(40);
	}
}
