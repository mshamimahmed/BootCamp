package com.bridgelab.bootcamp.day5;
import java.util.Scanner;
public class MinMaxValue
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
		
		return 1;
	}
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
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n for min number:");
		n=sc.nextInt();
		minValue(n);
		
		System.out.println("enter the m for max number:");
		int m=sc.nextInt();
		maxValue(m);
		sc.close();
	}
}
 