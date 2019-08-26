package com.bridgelab.bootcamp.day5;

import java.util.Scanner;

public class MaxValue
{

	static int maxValue(int m)
	{
		int[] a= new int[m];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for max:");
		for(i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<m;i++)
		{
			System.out.print(a[i]+" ");
		}
		int large=a[0];
		for(i=0;i<m;i++)
		{
			if(large<a[i])
			{
				large=a[i];
			}
		}
		System.out.println("max value is:"+large);
		sc.close();
		return 1;
	}
	public static void main(String args[])
	{
		int m;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the m for max number:");
		m=sc.nextInt();
		maxValue(m);
		sc.close();
	}
}


