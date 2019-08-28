package com.bridgelab.lib;

import java.util.Scanner;
import java.util.Random;
public class BLRandom 
{
	private static Random random;    // pseudo-random number generator
    private static long seed;        // pseudo-random number generator seed

	public static void setSeed(long seed)
	{
		random =new Random(seed);
	}
	public static long getSeed()
	{
		return seed;
	}
	public static int uniform(int n)
	{
		System.out.println("uniform");
		return 1;
	}

	public static	boolean bernoulli(double p)
	{
		if((p>=0.0) && (p<=1.0))
			return  true;
		return  true;

	}

	public static int discrete(double[] probabilities)
	{
		if(probabilities ==null)
			throw new IllegalArgumentException("argument array is null");
		double sum=0.0;
		for(int i=0;i<probabilities.length;i++)
		{
			sum+=probabilities[i];
		}
		return 1;
					
	}
	public static void shuffle(int[] a)
	{
		
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int r = i+ uniform(n-i);
			int temp = a[i];
			a[i]=a[r];
			a[r]=temp;
		}
	}
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("enter the number is:");
		int n=sc.nextInt();
		
		BLRandom.setSeed(131660);
		double[] probabilities = {0.5,0.3,0.1,0.1};
		String[] a = "A B C D E F G".split(" ");
		for(int i=0;i<n;i++)
		{
			System.out.println(uniform(100));
		//	System.out.println(uniform(10.0, 99.0));
			System.out.println(bernoulli(0.5));
			System.out.println(gaussian());
		//	System.out.println(gaussian(9.0,0.2));
		
			System.out.println(discrete( probabilities));
			System.out.println();
		//	BLRandom.shuffle(a);
            for (String s : a)
                System.out.print(s);
            System.out.println();
		}
	}
	
}

 