package com.bridgelab.bootcamp.day5;
import java.lang.Math;

public class ReturnSin 
{
	public static double sin()
	{
		double a=30;
		double b = Math.toRadians(a); 
	
		System.out.println(Math.sin(b));
		return 1;
	}

	
	public  static void main(String args[])
	{
		sin();
	}
}
