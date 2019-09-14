package com.bridgelab.bootcamp.dummy;
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
	
	public static void main(String args[])
	{
	
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element is:");
		int[][] a= new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println( Array( a) );
		sc.close();
	}
}
