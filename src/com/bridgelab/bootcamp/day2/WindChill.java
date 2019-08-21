package com.bridgelab.bootcamp.day2;
import java.util.Scanner;
public class WindChill 
{
	public static void main(String args[])
	{
		double t,v;
		System.out.println("enter the temprature:");
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		
		if(t<=50)
		{
			System.out.println("enter the wind speed:");
			v= sc.nextInt();
		
			if(v>=3 && v<=120)
			{
				System.out.println(v+" wind speed");
				double w=35074 + 0.6215*t + (0.4275*t -35.75)*Math.pow(v,0.16);
				System.out.println("wind chill is:"+w);
			}
			else
			{
				System.out.println("invalid wind speed");
			
			}
		}
		else
		{
			System.out.println(" invalid temprature ");
		
		}
		
		sc.close();		
	}
}
