package com.bridgelab.bootcamp.day11;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BirthdayIndividuals 
{
	public static String randomDateOfBirth()
	{
		
		int year=random(92,93);
		int month=random(1,12);
		int dd=0;
		switch(month)
		{
		case 2:
			if(isLeapYear(year))
			{
				dd=random(1,29);
			}
			else
			{
				dd=random(1,28);
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dd=random(1,31);
			break;
		default:
			dd=random(1,30);
			break;
		}
		String year1=Integer.toString(year);
		String month1=Integer.toString(month);
		String day1=Integer.toString(dd);
		if(month<10)
		{
	
			month1="0"+month;
		}
		if(dd<10)
		{
			day1="0"+day1;
		}
		
		
		System.out.println(day1 +'/' +month1+'/'+year1);
		return month1;
	}
	public static int random(int low,int high)
	{
		return (low + (int)Math.round(Math.random()*(high -low)));
	}
	public static boolean isLeapYear(int year)
	{
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		int noOfDays=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		if(noOfDays>365)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		List<String> month=new ArrayList<String>();
		String b;
		for(int i=0;i<50;i++)
		{
			b=randomDateOfBirth();
			month.add(b);
		}
		System.out.println(month);
		int len=month.size();
		String[] a=new String[len];
		int i,j;
		for( i=0;i<len;i++)
		{
			a[i]=month.get(i);
		}
		System.out.println("Month in array is:");
		for(i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
		String[] compareMonth= {"01","02","03","04","05","06","07","08","09","10","11","12"};
			
		for(i=0;i<compareMonth.length;i++)
		{
			int count=0;
			for(j=0;j<a.length;j++)
			{
				if(compareMonth[i].compareTo(a[j])==0)
				{
					count++;
				}
			}
			System.out.println("repeated month of "+compareMonth[i]+" is :"+count);
		}
	}
}
