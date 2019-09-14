package Collection;
import java.util.Scanner;
import java.util.ArrayList;
public class GetArrayList 
{
	public static void main(String args[])
	{
		ArrayList al =new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(40);
		System.out.println(al.get(1));
		int x=(int) al.get(2);
		System.out.println(x);
	}
}
