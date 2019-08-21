package com.bridgelab.bootcamp.day4;

import java.lang.reflect.Array;

public class StringFunctionEqual 
{
	public static boolean checkEqualily(String[] s1,String[] s2)
	{
		if(s1==s2)
			return true;
		if(s1== null || s2==null)
			return false;
		int n=s1.length;
		if(n!=s2.length)
			return false;
		for(int i=0;i<n;i++)
		{
			if(!s1[i].equals(s2[i]))
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		String[] s1= {"abc","bcd","cde"};
		String[] s2= {"abc","bcd","cde"};
		if(checkEqualily(s1,s2))
		{
			System.out.println("Both arrays are equal");
		}
		else
			System.out.println("Both arrays are not equal");
	}
	
}




