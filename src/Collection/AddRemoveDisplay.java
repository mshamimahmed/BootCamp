package Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class AddRemoveDisplay
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		ArrayList al = new ArrayList<>();
		int choice =0;
		do
		{
			System.out.println("1.Add\n2.Remove\n3.Display\n4.Exit");
			System.out.println("enter your choice:");
			choice=sc.nextInt();
			if(choice==1)
				add(al);
			else if(choice == 2)
				remove(al);
			else if(choice == 3)
				System.out.println(al);
			else if(choice == 4)
				break;
			else
				System.out.println("your choice is invalid choice");
		}while(choice!=4);
		sc.close();
		
	}
	public static void add(ArrayList al)
	{
		int data=0;
		do
		{
			System.out.println("enter the data and -1 to exit:");
			data=sc.nextInt();
			if(data!=-1)
				al.add(data);
			
		}while(data!=-1);
		System.out.println();
	}
	public static void remove(ArrayList al)
	{
		int index =0;
		System.out.println("delete value at index:");
		index=sc.nextInt();
		
		al.remove(index);
		System.out.println();
	}
} 
