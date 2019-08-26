package com.bridgelab.bootcamp.day5;
import java.util.Scanner;
public class CompoundInterest 
{
	static double compound(double c,double r,double T)
	{
		double CI=c*(Math.pow((1 +r/100),T));
		System.out.println("Compound Intrest is:"+CI);
		return CI;
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the principle:");
		double c=sc.nextDouble();
		System.out.println("enter the rate:");
		double r=sc.nextDouble();
		System.out.println("enter the enter the time:");
		double T=sc.nextDouble();
		compound(c,r,T);
		sc.close();
	}
}
