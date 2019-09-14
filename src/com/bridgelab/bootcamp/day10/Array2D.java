package com.bridgelab.bootcamp.day10;
import java.util.Scanner;
public class Array2D
{
	
	public static void main(String args[])
	{
	
		int i,j;
		Scanner sc = new Scanner(System.in);
		int[][] a= new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("element is:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}	
		sc.close();
	}
}
