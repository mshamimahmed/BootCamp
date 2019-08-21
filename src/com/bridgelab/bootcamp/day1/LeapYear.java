package com.bridgelab.bootcamp.day1;
import java.util.Scanner;
public class LeapYear 
{
	public static void main(String[] args)
	{
		int year;
		System.out.println("enter the year:");
		Scanner in=new Scanner(System.in);
		year=in.nextInt();
		if(year>=1582)
		{
			
				if(year%4==0 && year%400==0 && year!=1800 )
				{
					System.out.println("the given year is leap year:");
				}
				else
				{
					System.out.println("the given number is not leap year");
				}
			
		}
		else
		{
			System.out.println("the given number is less than 1582 ");
		}
	in.close();
	}
}
