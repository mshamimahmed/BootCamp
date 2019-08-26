package com.bridgelab.bootcamp.day5;

import java.util.Scanner;

public class RetunBinary
{
	static int binaryNumber(int n)
	{
		int j=1,d,binary=0;
		while(n!=0)
		{
			d=n%2;
			binary=binary+(d*j);
			n=n/2;
			j=j*10;
			
		}
		System.out.println("binary number is:"+binary);
		return binary;
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("enter the  number");
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		binaryNumber(n);
		sc.close();
	}
}
