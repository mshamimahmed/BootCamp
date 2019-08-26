package com.bridgelab.bootcamp.day5;
import java.lang.Math;
import java.util.Scanner;
public class sqrt
{
		static double sqt(double c)
		{
			double t=Math.sqrt(c);
			
			double epsilon = 1.0e-15;
			while(Math.abs(t-c/t)>epsilon*t)
			{
				t=(c/t + t)/2;
			}
			System.out.println("t value is:"+t);
			return epsilon;
			
		}
	
		static double sqt(double c,double epsilon)
		{
			double t=Math.sqrt(c);
			
			
			while(Math.abs(t-c/t)>epsilon*t)
			{
				t=(c/t + t)/2;
			}
			System.out.println("t value is:"+t);
			return epsilon;
			
		}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the c value");
		double c=sc.nextDouble();
		sqt(c);
		System.out.println("enter the epsilon value:");
		double epsilon=1;
		sqt(c,epsilon);
		sc.close();
	}
}
