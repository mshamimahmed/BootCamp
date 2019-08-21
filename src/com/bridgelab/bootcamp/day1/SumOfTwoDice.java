package com.bridgelab.bootcamp.day1;
import java.util.Random;

public class SumOfTwoDice
{
	public static void main(String args[])
	{
		int dice1,dice2,sum;
		Random r=new Random();
		dice1=r.nextInt(6);
		dice2=r.nextInt(6);
		sum=dice1+dice2;
		System.out.println("the sum of two random number is sum:"+sum);
		
	}
}
