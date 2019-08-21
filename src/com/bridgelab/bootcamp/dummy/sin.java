package com.bridgelab.bootcamp.dummy;
import java.util.Scanner;
public class sin 
{
	static double value()
	{
		int a=45;
		double sin =Math.asin(a);
		return value();
	}
	public static void main(String args[])
	{
		
		value();
		
		System.out.println(value());
	}
}
