package Collection;
import java.util.ArrayList;
import java.util.Scanner;
public class DoWhile 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		ArrayList al =  new ArrayList<>();
		int data =0;
		do
		{
			System.out.println("enter the data:(-1 to exit):");
			data= sc.nextInt();
			if(data != -1)
			{
				al.add(data);
			}
		}while(data != -1);
		System.out.println(al);
		sc.close();
	}
}
