package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class GamlingSimulator 
{
	public static void main(String args[])
	{
		int stake,goal,trails,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of stake:");
		stake=sc.nextInt();
		System.out.println("Enter the number of goal:");
		goal=sc.nextInt();
		System.out.println("enter the number of trails:");
		trails=sc.nextInt();
		int bet=0;
		int win=0;
		for(i=1;i<trails;i++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
				bet++;
				if(Math.random()<0.5) 
				{
					cash++;						
				}
				else
				{
					cash--;
				}
			}
			if(cash==goal)
			{
				win++;
			}
		}
		System.out.println(win+" win of"+trails);
		System.out.println("Percent of games won="+100.0*win/trails);
		System.out.println("avr bet is:"+1.0*bet/trails);
		sc.close();
	}
}
