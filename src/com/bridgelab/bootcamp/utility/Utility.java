package com.bridgelab.bootcamp.utility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class Utility 
{

	static Scanner sc = new Scanner(System.in);
	
	public static int scanInterger() 
	{
		return sc.nextInt();
	}
	public static List<Integer> primeNumber(int n)
	{
		List<Integer> a = new ArrayList<>();
		int i, j, k;
		for (i = 2; i <= n; i++) 
		{
			k = 0;
			for (j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					k = 1;
					break;
				}
			}

			if (k == 0)
			{
				a.add(i);
			}

		}
		return a;
	}
	public static List<Integer> palindrome(List<Integer> primes)
	{
		List<Integer> palindromeNumber= new ArrayList<Integer>();
		int temp,sum=0,i;
		while(primes.size() > 0)
		{
			temp=primes.get(i)%10;
			sum= sum*10 +temp;
			
		}
	}

	public static List<Integer> primeAnagrams(List<Integer> primes)
	{
		List<Integer> anagram= new ArrayList<Integer>();
		for (int i = 0; i < primes.size(); i++) 
		{
			for (int j = i + 1; j < primes.size(); j++)
			{

				if (isAnagram(primes.get(i), primes.get(j)))
				{
					System.out.println(primes.get(i) + " " + primes.get(j));
					anagram.add(primes.get(i));
					anagram.add(primes.get(j));
				}
			}
		}
		return anagram;
	}
	
	public static boolean isAnagram(int n1, int n2) 
	{
		int[] num1 = intArray(n1);
		int[] num2 = intArray(n2);
		if (num1.length != num2.length)
			return false;
		else {
			for (int i = 0; i < num1.length; i++)
			{
				if (num1[i] != num2[i])
					return false;
			}
		}
		return true;
	}
	public static int[] intArray(int n1) {
		int[] count = new int[10];
		int temp = n1;
		while (temp != 0) {
			int r = temp % 10;

			count[r]++;
			temp = temp / 10;
		}

		return count;
	}
}
