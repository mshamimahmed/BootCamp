package com.bridgelab.bootcamp.day10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Prime2d 
{
	boolean isPrime(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return true;			
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
			throws IOException
	{
		Prime2d p= new Prime2d();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int m=sc.nextInt();
		System.out.println("enter the number of ccolums:");
		int n = sc.nextInt();
		int a[][] =  new int[m][n];
		int b[]= new int[m*n];
		int i=0,j;
		int k=1;
		while(i<m*n && k<=1000)
		{
			if(p.isPrime(k)==true )
			{
				b[i]=k;
				i++;
			}
			
			k++;
			
		}
		int x=0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=b[x];
				x++;
			}
		}
		System.out.println("The the 2d array is:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" \t");
			}
			System.out.println();
		}
		
	}
}
