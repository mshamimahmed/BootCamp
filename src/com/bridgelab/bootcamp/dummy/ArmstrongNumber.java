package com.bridgelab.bootcamp.dummy;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static double armstrong(double year)
	{
		double  temp=year;
		double digit=0;
		while(temp>0)
		{
			temp=temp/10;
			digit++;
//			temp/=10;
		}
		double temp2;
		double sum=0;
		double n=year;
		while(year>0)
		{
			temp2=n%10;
			sum=sum+ Math.pow(temp2, digit);
			n=n/10;
		}
		if(year==sum)
		{
			System.out.println("is armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
		return year;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the year:");
		double year=sc.nextInt();
		if(year%4==0 ||year%400==0)
		{
			System.out.println(year+" is leap year");
			System.out.println(armstrong(year));
		}
		else
		{
			System.out.println("not leap year");
		}
				
	}
}