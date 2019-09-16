package com.bridgelab.bootcamp.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerOf2
{
	public static List<Integer> powerOf2(int num)
	
	{
		List<Integer> a=new ArrayList<Integer>();
		int b;
		for(int i=1;i<num;i++)
		{
			b= (int)Math.pow(2, i);
			a.add(b);
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for power:");
		int num=sc.nextInt();
		List<Integer> power=powerOf2(num);
		int x=10,y=20;
		int[][] a=new int[x][y];
		System.out.println(power);
		int i=1,j;
		try 
		{
		while(i<power.size())
		{
			for(j=0;j<y;j++)
			{
				if(power.get(i)<10)
				{
					a[0][j]=power.get(i);
					i++;
				}				
			}
			for(j=0;j<y;j++)
			{
				if(power.get(i)<100)
				{
					a[1][j]=power.get(i);
					i++;
				}				
			}
			for(j=0;j<y;j++)
			{
				if(power.get(i)<1000)
				{
					a[2][j]=power.get(i);
					i++;
				}				
			}
			for(j=0;j<y;j++)
			{
				if(power.get(i)<10000)
				{
					a[3][j]=power.get(i);
					i++;
				}				
			}	
		}
		
		}
		catch(Exception e)
		{
			e.fillInStackTrace();
		}
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				if(a[i][j]!=0)
				{
					System.out.print(a[i][j]+" "); 
				}
			}
			System.out.println();
		}
	}
}
