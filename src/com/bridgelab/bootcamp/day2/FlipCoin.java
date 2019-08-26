 package com.bridgelab.bootcamp.day2;

import java.util.Random;
import java.util.Scanner;
 
public class FlipCoin 
{
	public static void main(String args[])
	{
		int toss;
		int counter;
		int heads,tails;
		counter =0;
		heads=0;
		tails = 0;
 		Scanner sc= new Scanner(System.in);
		System.out.println("enter amount of times you want to coin to be tossed:");
		toss=sc.nextInt();
		Random coinToss = new Random();
		int random = coinToss.nextInt(1);
		while(counter <toss)
		{
			if(random>0.5)
			{
				heads=heads+1;
				System.out.println("head");
			}
			else
			{
				tails =tails+1;
				System.out.println("Tail");
			}
			counter++;
			random=coinToss.nextInt(2);
		}
		System.out.println("");
		System.out.println("For your tosses you got\n"+"----------\n"+"Heads:"+heads+"\nTails:"+tails);
		System.out.println("the  percentage of head is:"+(heads*100)/toss);
		System.out.println("the  percentage of tails is:"+(tails*100)/toss);
		sc.close();
	}
}
