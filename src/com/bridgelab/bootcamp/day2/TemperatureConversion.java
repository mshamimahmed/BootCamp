package com.bridgelab.bootcamp.day2;
import java.util.Scanner;

public class TemperatureConversion 
{
	public static void main(String args[])
	{
		int f,c,a;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your choice");
		
		a=sc.nextInt();
		if(a<=2 && a>=0)
		{
			switch(a)
			{
				case 1:
				{
					System.out.println("convert fehrenheit to censius");
					System.out.println("enter the fahrenheit values:");
			
					f=sc.nextInt();
					double celsius_value=(f-32)*5/9;
					System.out.println("celsius value is:"+celsius_value);
					break;
				}
				case 2:
				{
					System.out.println("conver celcius to fehrenheit");
					System.out.println("enter the celsius");
					c=sc.nextInt();
					double  fehrenheit_value= (c*9/5) +32;
				
					System.out.println("fehrenheit value is:"+fehrenheit_value);
					break;
			
				}
			}
		}
		else 
		{
			System.out.println("wrong choice");
		}
		
		
		
	sc.close();	
	}
}

