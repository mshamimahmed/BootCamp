package com.bridgelab.bootcamp.day4;

import java.util.Scanner;

public class AnagramString 
{
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
	public static void main(String args[])
	{
		String str1,str2;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the str1:");
		str1=sc.nextLine();
		System.out.println("enter the str2:");
		str2=sc.nextLine();
		anagram(str1,str2);
		sc.close();
	}
}
