package com.bridgelab.bootcamp.day2;
import java.util.Scanner;
public class Sqrt 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the c value:");
		double c = sc.nextDouble();
		

		double epsilon = 1.0e-15;
		double t=c;
		while(Math.abs(t-c/t)>epsilon*t)
			{
				t=(c/t + t)/2;
			}
		System.out.println("square root of non-negative number is:"+t);
		sc.close();
	
	}
}

