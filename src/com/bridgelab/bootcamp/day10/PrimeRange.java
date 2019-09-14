package com.bridgelab.bootcamp.day10;
import java.util.Scanner;
public class PrimeRange
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int range[];
		int prime[];
		int temp[]=new int[n];
		for(i=1;i<=n;i++)
		{
			int count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		
			if(count==2)
			{
				temp[i]=i;
			
			}
		}
		for(i=1;i<n;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
}
				
		