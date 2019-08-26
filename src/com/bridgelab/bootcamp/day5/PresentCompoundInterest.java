package com.bridgelab.bootcamp.day5;
import java.util.Scanner;
public class PresentCompoundInterest 
{
	static double compound(double C,double r,double T)
	{
		double presentValue=C/Math.pow((1+r), T);
		System.out.println(presentValue);
		return presentValue;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the principle value:");
		double C=sc.nextDouble();
		System.out.println("enter the rate:");
		double r=sc.nextDouble();
		System.out.println("enter the year:");
		double T=sc.nextDouble();
		compound(C,r,T);
		sc.close();
	}
}
