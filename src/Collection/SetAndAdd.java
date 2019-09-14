package Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class SetAndAdd
{
	public static void main(String args[])
	{
		ArrayList  al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);	
		System.out.println(al);
		al.set(0, 45);
		System.out.println(al);
		al.add(0,90);
		System.out.println(al);
		System.out.println(al.indexOf(20));
		System.out.println(al.indexOf(40));
		
	}
}
