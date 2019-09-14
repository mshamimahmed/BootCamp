package SimpleBasicProgram;
import java.util.Scanner;
public class StringLength 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first String:");
		String str1=sc.next();
		System.out.println("Enter your Second String");
		String str2=sc.next();
		System.out.println("the lenght of first string is:"+str1.length());
		System.out.println("the lenght of second string is:"+str2.length());
		sc.close();
	}
}
