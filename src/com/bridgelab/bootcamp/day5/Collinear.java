package com.bridgelab.bootcamp.day5;
import java.util.Scanner;
public class Collinear
{
	static boolean checkCollinearUsingSlope(double x1,double x2,double x3,double y1,double y2,double y3)
	{
		double ab=(y2-y1)/(x2-x1);
		double bc=(y3-y2)/(x3-x2);
		double ac=(y1-y2)/(x1-x2);
		if(ab==bc && bc==ac && ac==ab)
		{
			System.out.println("this is collinear");
		}
		else 
		{
			System.out.println("this is  not collinear");
		}
		return true;
		
	}
	static boolean checkCollinearUsingArea(double x1,double x2,double x3,double y1,double y2,double y3)
	{
		double area_of_triangle=0.5*((x1-x2)*(y2-y3)-(x2-x3)*(y1-y2));
		System.out.println("area of the triangle is:"+area_of_triangle);
		if(area_of_triangle==0)
		{
			System.out.println("This is collinear");
		}
		else
		{
			System.out.println("This is no collinear");
		}
		
		return true;
	}
	
	public static void main(String args[])
	{
		int i;
		Scanner sc= new Scanner(System.in);
		for(i=1;i<=2;i++)
		{
			System.out.println("enter the value for x1:");
			double x1 =sc.nextDouble();
			System.out.println("enter the value for x2:");
			double x2=sc.nextDouble();
			System.out.println("enter the value for x3:");
			double x3=sc.nextDouble();
			System.out.println("enter the value for y1:");
			double y1=sc.nextDouble();
			System.out.println("enter the value for y2:");
			double y2=sc.nextDouble();
			System.out.println("enter the value for y3:");
			double y3=sc.nextDouble();
			if(i==1)
			{
				checkCollinearUsingSlope(x1,x2,x3,y1,y2,y3);
			}
			else
			{
				checkCollinearUsingArea( x1,x2,x3,y1,y2,y3);
			}
			
		}		
	}
}
