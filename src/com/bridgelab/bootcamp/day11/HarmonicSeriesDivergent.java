package com.bridgelab.bootcamp.day11;

import java.util.Scanner;

public class HarmonicSeriesDivergent
{
	public static int harmonic(int n)
	{ 
		double i,sum=0;
		for(i=1;i<=n;i++)
		{
			sum=sum + (double)1/i;
			System.out.println(sum);
		}
	}
	public static void main(String args[])
	{
		double n,i;
		double sum=0;
		System.out.println("enter the number is:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		sc.close();
		
	}
}
