package com.bridgelab.bootcamp.day10;
import com.bridgelab.bootcamp.utility.Utility;
import java.util.List;
import java.util.Scanner;
import com.bridgelab.bootcamp.utility.StackLinkedList;

public class PrimeToAnagram 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit of prime number:");
		int n=sc.nextInt();
		List<Integer> primes = Utility.primeNumber(n);
		List<Integer> anagrams=Utility.primeAnagrams(primes);
		System.out.println(anagrams.size());
		anagramsStored(anagrams);
		StackLinkedList<Integer> anagramsStack =  new StackLinkedList<Integer>();
		for(Integer i :anagrams)
		{
			try
			{
				anagramsStack.push(i);
				System.out.println(i+ " ");
				
			}
			catch(Exception i1)
			{
				i1.printStackTrace();
			}
		}
	}
	public static void anagramsStored(List<Integer> anagrams)
	{
		for(int i=0;i<anagrams.size();i++)
		{
			for(int j=1;j<anagrams.size();j++)
			{
				if(anagrams.get(i) == anagrams.get(j))
				{
					anagrams.remove(j);
				}
			}
		}
		System.out.println(anagrams.size());
	}
}
