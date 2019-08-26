package com.bridgelab.bootcamp.dummy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StringFunction 
{
	public static String parindrome(String str,String rev)
	{
		
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
		return rev;
	}
	public static String anagram(String str1 ,String str2)
	{
		int len1,len2,len,found=0,not_found=0,i,j;
		len1=str1.length();
		len2=str2.length();
		if(len1==len2)
		{
			len=len1;
			for(i=0;i<len;i++)
			{
				found=0;
				for(j=0;j<len;j++)
				{
					if(str1.charAt(i)==str2.charAt(j))
					{
						found=1;
						break;
					}
				}
				if(found==0)
				{
					not_found=1;
					break;
				}
			}
			if(not_found==1)
			{
				System.out.print("String are not Anagram to each other");
			}
			else
			{
				
				System.out.print("String are Anagram");
			}
		}
		else
		{
			System.out.print("Both String Must havae the same number of Cahracter to an Anagram");
		}
		return str1;
	}
	
	
	public static String IterativePermutation(String s)
	{
		
		List<String> partial = new ArrayList<>();//creating arraylist
		partial.add(String.valueOf(s.charAt(0))); //initialize the list
		for(int i=1;i<s.length();i++) //do for every charater with the first character of str
		{
			for(int j=partial.size()-1;j>=0;j--) 
			{
				String str=partial.remove(j);  //remove current permutation for arraylist
				for(int k=0;k<=str.length();k++)
				{
					partial.add(str.substring(0,k)+s.charAt(i)+str.substring(k));  //use Stringbuilder for conatenation
				}
			}
		}
		System.out.println(partial);
		return s;
	}
	
	
	
	
	
	
	
	
	private static String RecursivePermutation(String c,String remaining)
	{
		
		if(remaining.length()==0)
		{
			System.out.println(c);
		}
		for(int i=0;i<remaining.length();i++)
		{
			String newC= c + remaining.charAt(i);
			String newRemaining = remaining.substring(0,i)+ remaining.substring(i+1);
			RecursivePermutation(newC,newRemaining);
		}
		return remaining;
	}

		public static void main(String args[])
		{
			String str,rev="";
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the main String for palindrome:");
			str=sc.nextLine();
			parindrome(str, rev);
			
			
			
			String str1,str2;
			System.out.println("enter the str1 for anagram:");
			str1=sc.nextLine();
			System.out.println("enter the str2 for anagram:");
			str2=sc.nextLine();
			anagram(str1,str2);
			
			
			
			String s="ABC";
			System.out.println("String permutaton of iteration method is:");
			IterativePermutation(s);
			System.out.println("String permutaton of iteration method is:");
			RecursivePermutation("",s);
			
			
			
			
			
			
			
			
			
			
			sc.close();
			
			
		}

}
