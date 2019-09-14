package com.bridgelab.bootcamp.dummy;

import java.util.Scanner;

public class Anagram
{
	public static int anagram(int i)
	{
		int num=i;
		int found=0,not_found=0;
		String str=Integer.toString(num);
		int len=str.length();
		
		for(int j=0;j<len;j++)
		{
			found=0;
			 for(int k=0;k<len;k++)
				 
			 {
				 if(str.charAt(j)==(str.charAt(k)))
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
			System.out.println("String are not Anagram to each other");
		}
		else
		{
			System.out.println("String are  Anagram to each other");
		}
		
		return num;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int i;
		i=sc.nextInt();
		anagram(i);
		
	}
}
