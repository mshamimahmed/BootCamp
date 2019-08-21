package com.bridgelab.bootcamp.day2;
import java.util.Scanner;

public class Trig
{
	public static void main(String args[])
	{
		double deg,rad;
		System.out.println("enter the angle in degrees:");
		Scanner sc= new Scanner(System.in);
		deg=sc.nextDouble();
		 rad=Math.toRadians(deg);
		double sin=Math.sin(rad);
		double cos=Math.cos(rad);
		
		System.out.println("sin:"+sin);
		System.out.println("cos"+cos);
		System.out.println("rad:"+rad);
		sc.close();
	}
}
