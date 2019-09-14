package Collection;
import java.util.ArrayList;
import java.util.Scanner;
public class InsertingAtLocation

{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		ArrayList al =  new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		al.add(3, 23);
		al.add(4,28);
		System.out.println(al);
		al.add(0, 56);
		al.add(3, 100);
		System.out.println(al);
	}
}
