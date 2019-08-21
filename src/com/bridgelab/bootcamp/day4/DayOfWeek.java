package com.bridgelab.bootcamp.day4;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class DayOfWeek
{
	static int method(int year,int month,int day)
	{
		int[] days= {31,28,31,30,31,30,31,31,30,31};
		if(year>0 && (month>0 &&month <=12))
		{
			if((year%4==0 || year%400==0)&& month ==2 &&(day>0 && day <=29))
			{
				Calendar calendar = new GregorianCalendar(year,month -1,day);
				return calendar.get(Calendar.DAY_OF_WEEK);
				
			}
			else
			{
				if(day>0 && day<=days[month -1])
				{
					Calendar calendar = new GregorianCalendar(year,month -1,day);
					return calendar.get(Calendar.DAY_OF_WEEK);
				}
				else
					return 0;
			}
		}
		else 
			return 0;
	}
	public static void main(String[] args)
	{
		String[] daysofweek= {"Invalid","Sun","Mon","tue","Wed","Thur","fri","Sat"};
		int y=2019,m=8,d=21;
		System.out.println(daysofweek[method(y,m,d)]);
	}
}
