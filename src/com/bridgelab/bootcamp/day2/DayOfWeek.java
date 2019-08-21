package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class DayOfWeek
{
	public static void main(String args[])
	{
		int d,m,y;
		int d0,m0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the day:");
		d=sc.nextInt();
		System.out.println("enter the month");
		m=sc.nextInt();
		System.out.println("enter the year");
		y=sc.nextInt();
		
		int y0 = y-(14-m)/12;
		int x = y0 + y0 /100 + y0/400;
		m0 = m + 12*((14 - m)/12) - 2;
		d0 = (d + x + 31*m0/12)%7;
		System.out.println("the gregorian year is:"+y0);
		System.out.println("the month of year is:"+m0);
		System.out.println("the day is week is:"+d0);
		System.out.print("the day is ");
		switch(d0)
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thrusday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
			System.out.println(" wrong");
			break;
		}
		System.out.print("the month is ");
		switch(m0)
		{
			case 1:
				System.out.println("january");
				break;
			case 2:
				System.out.println("february");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("april");
				break;
			case 5:
				System.out.println("may");
				break;
			case 6:
				System.out.println("june");
				break;
			case 7:
				System.out.println("july");
				break;
			case 8:
				System.out.println("august");
				break;
			case 9:
				System.out.println("september");
				break;
			case 10:
				System.out.println("octuber");
				break;
			case 11:
				System.out.println("novemver");
				break;
			case 12:
				System.out.println("december");
				break;
			default:
				System.out.println("wrong");
				break;		
		}
		sc.close();
	}
}
