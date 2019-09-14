package com.bridgelab.bootcamp.day10;

import java.util.Scanner;

public class Function2dArray
{
	public static int Array(int[][] a)
	{
		int i,j;
		
		System.out.println("element is:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}				
		return i;
	}
	
	public static double Array(double[][] a)
	{
		int i,j;
		
		System.out.println("element is:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}				
		return i;
	}

	public static boolean Array(boolean[][] a)
	{
		int i,j;
		
		System.out.println("element is:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}				
		return true;
	}

	public static void main(String args[])
	{
	
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.interger\n2.double\n3.boolean");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				System.out.println("enter the element is:");
				int[][] a= new int[3][3];
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						a[i][j]=sc.nextInt();
					}
				}
				
				System.out.println( Array( a) );break;

			}
			case 2:
			{
				System.out.println("enter the element is:");
				double[][] a= new double[3][3];
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						a[i][j]=sc.nextDouble();
					}
				}
				
				System.out.println( Array( a) );break;
			}
			case 3:
			{
				System.out.println("enter the element is:");
				boolean[][] a= new boolean[3][3];
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						a[i][j]=sc.nextBoolean();
					}
				}
				
				System.out.println( Array( a) );break;
			}
		}


		sc.close();
		
		
	}
}


