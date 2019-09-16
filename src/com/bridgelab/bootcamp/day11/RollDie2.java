package com.bridgelab.bootcamp.day11;

import java.util.Scanner;

public class RollDie2 
{
	public static void main(String[] args)
	throws ArrayIndexOutOfBoundsException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the rows:");
		int row=sc.nextInt();
		System.out.println("Enter the ccolums:");
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		int i,j;
		try
		{
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=(int)(Math.random()*6) +1;
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+ " ");
				
			}
			System.out.println();
		}
		int[] repeat= {1,2,3,4,5,6};
	    
	    for(int k=0;k<repeat.length;k++)
	    {
	    	
	    int count=0;
		for(i=0;i<row;i++)
		{
			 
			for(j=0;j<col;j++)
			{
				if(a[i][j]==repeat[k])
				{
					count++;
					
					
				}				
			}			
		}
		System.out.println("repeat elemenet is"+repeat[k]+" "+count);
			
		}
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}
	}
}

