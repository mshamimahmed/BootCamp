package com.bridgelab.bootcamp.day1;
import java.lang.Math;
import java.util.Scanner;
public class Quadratic
{
	public static void main(String args[])
	{
		int a,b,c,delta;
		//double x;
		double root_2;
		double root_1;
		System.out.println("Enter the values:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt(); 
		//System.out.println("a*x*x + b*x + c"+(a*x*x + b*x + c));
		delta =b*b - 4*a*c;
		System.out.println("delta:"+delta);
		if(delta>0)
		{
			root_1= ((-b + Math.sqrt(delta))/(2*a));
			root_2=((-b - Math.sqrt(delta))/(2*a));
			System.out.println("root_1"+root_1);
			System.out.println("root_2"+root_2);
		}
		else if(delta==0)
		{
			root_1=root_2=-b/(2*a);
			System.out.println("root_1:"+root_1);
			System.out.println("root_2:"+root_2);
		}
		else
		{
			double real_part=-b/(2*a);
			double img_part=-delta/(2*a);
			System.out.println("real_part:"+real_part);
			System.out.println("img_part:"+img_part);
		}
		
		in.close();
	}
}
