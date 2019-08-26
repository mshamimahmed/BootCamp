package com.bridgelab.bootcamp.day5;

import java.util.Scanner;

public class MinValue
{
	static int minValue(int n)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int[] a=new int[n];
		System.out.println("enter the element is:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		int small=a[0];
		for(i=0;i<n;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println("min value is:"+small);
		sc.close();
		return 1;
	}	
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n for min number:");
		n=sc.nextInt();
		minValue(n);
		sc.close();
	}
}
