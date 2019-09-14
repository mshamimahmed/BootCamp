package SimpleBasicProgram;
import java.util.Scanner;
public class RemoveVowel 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your String:");
		String str  = sc.nextLine();
		String str1=str.replaceAll("[aeiouAEIOU]", "");
		System.out.println("repalce of the vowel:"+str1+" ");
		sc.close();
	}
}
