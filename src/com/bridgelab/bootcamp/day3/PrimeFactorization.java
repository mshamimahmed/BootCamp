package com.bridgelab.bootcamp.day3;

public class PrimeFactorization 
{
	public static void PrimeFactors(int n)
	{
		while(n%2==0)
		{
			System.out.print(2+" ");
			n=n/2;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
		if(n>2)
		{
			System.out.print(n);
		}
	}
	public static void main(String[] args)
	{
		int n=90;
		PrimeFactors(n);
	}
}
