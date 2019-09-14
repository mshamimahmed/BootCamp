package SimpleBasicProgram;
import java.util.Scanner;
public class StringPalindrome 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		int i;
		String rev ="";
		for(i= str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))		
		{
			System.out.println("palindrome string:"+rev);
		}
		else
		{
			System.out.println("is not palindrome string");
		}
		sc.close();
	}
}
