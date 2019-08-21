package com.bridgelab.bootcamp.day3;

import java.util.Scanner;

public class Binary
{
	public static void main(String[] args) 
	{
		int n,d,binary=0,j=1;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	
		while(n!=0)
		{
			d=n%2;
			binary=binary +(d*j);
			n=n/2;
			j=j*10;
		}
		System.out.println("binary number is:"+binary);
		sc.close();
		
		
	}
}
