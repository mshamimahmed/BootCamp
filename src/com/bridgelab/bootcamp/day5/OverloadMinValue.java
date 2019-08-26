package com.bridgelab.bootcamp.day5;
import java.util.Scanner;
public class OverloadMinValue 
{
	static char overLoadMin(String str)
	{
		char array[]=str.toCharArray();
		int i;
		for(i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
		char small=array[0];
		for(i=0;i<array.length;i++)
		{
			if(small>array[i])
			{
				small=array[i];
			}
		}
		System.out.println("\n min value is:"+small);
		return 1;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String is:");
		String str=sc.nextLine();
		overLoadMin(str);
	}
}
