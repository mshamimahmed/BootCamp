package com.bridgelab.bootcamp.day10;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import com.bridgelab.bootcamp.utility.Utility;
public class PrimeToPalindrome 
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit for the n:");
		int n =  sc.nextInt();
		
		List<Integer> primes = Utility.primeNumber(n);
		for(int i=0;i<primes.size();i++)
		{
			System.out.print(primes.get(i)+" ");
		}
		List<Integer> palimd = palindrome(primes);
	}
	static  palindrome(List<Integer> primes)
	{
		
	}
}
	
		