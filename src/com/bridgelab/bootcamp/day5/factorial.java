package com.bridgelab.bootcamp.day5;
import java.util.Scanner;
public class factorial
{
	public static long fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		
		}
		System.out.println("factorial of a given number is:"+fact);
		return n;
	}
	public static void main(String args[])
	{
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n value:");
		n=sc.nextInt();
		fact(n);
		sc.close();
	}
	
}
