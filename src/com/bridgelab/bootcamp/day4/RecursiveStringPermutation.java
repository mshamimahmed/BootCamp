package com.bridgelab.bootcamp.day4;

public class RecursiveStringPermutation
{
	private static String RecursivePermutation(String c,String remaining)
	{
		
		if(remaining.length()==0)
		{
			System.out.println(c);
		}
		for(int i=0;i<remaining.length();i++)
		{
			String newC= c + remaining.charAt(i);
			System.out.println("value is"+newC);
			String newRemaining = remaining.substring(0,i)+ remaining.substring(i+1);
			System.out.println("new value is"+newRemaining);
			RecursivePermutation(newC,newRemaining);
		}
		return remaining;
	}
	public static void main(String[] args)
	{
		String s= "ABC";
		RecursivePermutation("",s);
	} 
}
