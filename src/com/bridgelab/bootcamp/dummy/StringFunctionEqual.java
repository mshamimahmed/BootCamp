package com.bridgelab.bootcamp.dummy;

import java.util.ArrayList;
import java.util.List;

public class StringFunctionEqual
{
	public static void IterativeStringPermutation(String s)
	{
		
		List<String> partial = new ArrayList<>();//creating arraylist
		partial.add(String.valueOf(s.charAt(0))); //initialize the list
		for(int i=1;i<s.length();i++) //do for every charater with the first character of str
		{
			for(int j=partial.size()-1;j>=0;j--) 
			{
				String str=partial.remove(j);  //remove current permutation for arraylist
				for(int k=0;k<=str.length();k++)
				{
					partial.add(str.substring(0,k)+s.charAt(i)+str.substring(k));  //use Stringbuilder for conatenation
				}
			}
		}
		System.out.println(partial);
	}
	private static void RecursiveStringPermutation(String candidate,String remaining)
	{
		if(remaining.length()==0)
		{
			System.out.println(candidate);
		}
		for(int i=0;i<remaining.length();i++)
		{
			String newCandidate= candidate + remaining.charAt(i);
			String newRemaining = remaining.substring(0,i)+ remaining.substring(i+1);
			RecursiveStringPermutation(newCandidate,newRemaining);
		}
	}
	
	public static void main(String[] args)
	{
		String s="ABC";
		System.out.println("permutation of string using iterative method is:");
		IterativeStringPermutation(s);
		System.out.println("permutation of string using recursive method is:");
		RecursiveStringPermutation("",s);
		
	}
}



