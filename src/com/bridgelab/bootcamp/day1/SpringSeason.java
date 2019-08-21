package com.bridgelab.bootcamp.day1;
import java.util.Scanner;
public class SpringSeason
{
	public static void main(String args[])
	
	{
		int m,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month:");
		m=sc.nextInt();
		if(m>=1 &&m<=12)
		{
			System.out.println("month");
		}
		else
		{
			System.out.println("wrong input month");
		}
		System.out.println("enter the day:");
		d=sc.nextInt();
		if(d>=1 && d<=31)
		{
			System.out.println("day");
		}
		else
		{
			System.out.println("wrong input day");
		}
	
		
		if(m>=3 && m<6 && d>=20  &&d<=31 )
		{
			System.out.println("this is in spring season");
		}
		else if( m>3 && m<=6 && d>=1 &&d<=20)
		{
			System.out.println("this is in the Spring season");
		}
		else
			System.out.println("out of the spring season");
		sc.close();
	}
}
		
		