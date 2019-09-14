package com.bridgelab.bootcamp.day10;

import java.util.Scanner;

public class PrimeNumberStoreIn2dArray 
{
	public static void main(String args[])
	{
	//	int[] a= new int[]
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit:");
		int n=sc.nextInt();
		int i,j;
		int row=10;
		int col=100;
		
		int a[]=new int [row*col];
		int b[][]=new int[row][col];
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
				//System.out.print(i+" ");
				a[j]=i;
				
				System.out.print(a[j]+" ");
			}
		
		}
		
		int k=0;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++) 
			{
				b[i][j]=a[k];
				k++;
			}			
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++) 
			{
				System.out.print(b[i][j]+" ");				
			}
			System.out.println();
			 
		}
	
	}
}
