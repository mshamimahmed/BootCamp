package com.bridgelab.bootcamp.day5;
import java.util.Scanner;
public class IsPrime 
{
	static boolean isPrime(int n)
	{
		int i;
		for(i=2;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("the given number is  prime number:");
				return true;
			}
			else
			{
				System.out.println("the given number is not prime number:");
				return false;
			}
				
		}
		return  true;
	}	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		isPrime(n);
		sc.close();
	}
}
