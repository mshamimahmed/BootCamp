package com.bridgelab.bootcamp.dummy;
import java.util.Scanner;
public class patternsrt 
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit for n to print sare");
		int n = sc.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n;j++)
			{
				if( i==0 || i==n || j==0 || j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n;j++)
			{
				if( i==0 || i==n || j==0 || j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

