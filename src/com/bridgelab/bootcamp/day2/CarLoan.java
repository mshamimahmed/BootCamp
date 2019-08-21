package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class CarLoan
{
	public static void main(String args[])
	{
		double P,Y,R;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle:");
		P=sc.nextDouble();
		System.out.println("enter the year:");
		Y=sc.nextDouble();
		System.out.println("enter the rate:"); 
		R=sc.nextDouble();
		double r=R/(12*100);
		double n= 12*Y;
		double payment =(P*r)/(1- Math.pow(1+r, -n));
		double intrest= n*payment - P;
		System.out.println("the payment is:"+payment);
		System.out.println("intrest is:"+intrest);
		sc.close();
	}
}
