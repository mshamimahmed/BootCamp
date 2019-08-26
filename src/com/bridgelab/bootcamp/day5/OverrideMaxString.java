package com.bridgelab.bootcamp.day5;
import java.util.Scanner;
public class OverrideMaxString
{
	
	static char overloadMaxValue(String str) 
	{
		int i;

		char array[]=str.toCharArray();
		for( i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
		char length=array[0];
		for(i=0;i<array.length;i++)
		{
			if(length<array[i])
			{
				length=array[i];
			}
			
		}
		System.out.println("\nmax value is:"+length);
		return 1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		overloadMaxValue(str);
		
		String str1="sine value is max y";
		overloadMaxValue(str1);
	}
}
