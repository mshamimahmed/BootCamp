package com.bridgelab.bootcamp.day1;
import java.util.Scanner;
public class PrintW 
{
	private static void stars(int count)
	{
		for(int i=0;i<count; ++i)
		System.out.print("*");
	}
	private static void spaces(int count)
	{
		for(int i=0;i<count;++i) 
		System.out.print(" ");
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		//s.close();
		int n=s.nextInt();
		for(int i=0;i<n;++i)
		{
			stars(i+1);
			spaces(n-i-1);
			stars(n-i+1);
			spaces(2*i);
			stars(n-i);
			spaces(n-i-1);
			stars(i+2);
			System.out.println("*");
		}
		
	}
}
