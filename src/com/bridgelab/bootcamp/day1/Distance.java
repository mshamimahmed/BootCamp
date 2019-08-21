package com.bridgelab.bootcamp.day1;
import java.util.Scanner;
import java.lang.Math;

public class Distance 
{
	public static void main(String args[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the distance :");
		x=sc.nextInt();
		y=sc.nextInt();
		//System.out.println("eucliden distance is"+Euclidean_distance);
		double distance=Math.sqrt(x*x + y*y);
		System.out.println("distance is:"+distance);
		sc.close();
	}
}
