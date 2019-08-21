package com.bridgelab.bootcamp.day4;

import java.util.ArrayList;
import java.util.List;

public class IterativeStringPermutation
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
		
	public static void main(String[] args)
	{
		String s="ABC";
		IterativeStringPermutation(s);
		
	}
}

