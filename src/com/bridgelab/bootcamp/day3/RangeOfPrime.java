package com.bridgelab.bootcamp.day3;

import java.util.Scanner;

public class RangeOfPrime 
{
	public static void main(String args[])
	{
		int n,i,j,count=0;
		System.out.println("enter the range:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("the prime number is");
		for(i=1;i<=n;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{	
		
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
				
			}
		}
		sc.close();
	}
}
