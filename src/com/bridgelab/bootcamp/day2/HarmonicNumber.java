package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class HarmonicNumber
{
	public static void main(String args[])
	{
		double n,i;
		double sum=0;
		System.out.println("enter the number is:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum + (double)1/i;
			System.out.println(sum);
		}
		sc.close();
		
	}

}
