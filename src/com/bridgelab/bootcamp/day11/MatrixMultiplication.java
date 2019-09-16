package com.bridgelab.bootcamp.day11;

import java.util.Scanner;

public class MatrixMultiplication 
{
	public static int[][] matrixMultiplication(int[][] a,int[][] b,int row1,int row2,int col1,int col2)
	{
		int[][] c=new int[row1][col1];
		int i,j,k,sum;
		try {
		
//		if(col1==row2)
//		{
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col2;j++)
				{
					c[i][j]=0;
					for(k=0;k<row2;k++)
					{
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}					
				}
			}			
//		}
//		else
//		{
//			System.out.println("col1!=row2, must be the number of column of first matrix is equal to row2 of matrix2");
//		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.fillInStackTrace();
		}
		System.out.println("The multiplication of 2d array is:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row of matrix1:");
		int row1=sc.nextInt();
		System.out.println("Enter the col of matrix1:");
		int col1=sc.nextInt();
		System.out.println("Enter the row of matrix2:");
		int row2=sc.nextInt();
		System.out.println("Enter the col of matrix2:");
		int col2=sc.nextInt();
		
		int i,j;
		int[][] a= new int[row1][col1];
		int[][] b= new int[row2][col2];
		System.out.println("Enter the element of matrix1:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("your matrix1 element is:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter the element of matrix2:");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		matrixMultiplication(a,b,row1,row2,col1,col2);
	}
}
