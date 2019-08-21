package com.bridgelab.bootcamp.day4;
import java.util.Scanner;
public class StringPalindrome
{
	public static void main(String args[])
	{
		String str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the main String:");
		str=sc.nextLine();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev + str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("the given string is palindrome string:"+rev);
		}
		else
		{
			System.out.println("the given string is not palindrome string");
		}
		sc.close();
		
	}
}
