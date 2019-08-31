package String;
import java.util.Scanner;
public class WordCount 
{
	public static void main(String args[])
	{
		String str;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) ==' ')
			{
				count++;
			}
		}
		System.out.println("The number of Words is:"+(count + 1));
		
		sc.close();
	}
}
