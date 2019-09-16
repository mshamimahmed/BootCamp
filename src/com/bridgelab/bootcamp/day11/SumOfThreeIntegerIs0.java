package com.bridgelab.bootcamp.day11;

import java.util.Scanner;

public class SumOfThreeIntegerIs0
{
	public static int sumOfInt(int[] a)
	{
		
		int i,j,k;
		int len=a.length;
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				for(k=j+1;k<len;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println("sum of 3 Integer is zero:"+a[i]+" "+a[j]+" "+a[k]);
					}
					
				}
			}
		}
		return len;
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n=sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter th Element is:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	
		sumOfInt(a);
	}
}
