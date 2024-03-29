package com.bridgelab.lib;
import java.util.Scanner;
public class StopWatch 
{
	private final long start;
	public StopWatch()
	{
		start=System.currentTimeMillis();
	}
	public double elapsedTime()
	{
		long now =System.currentTimeMillis();
		return (now -start)/1000.0;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		StopWatch timer1= new StopWatch();
		double sum1=0.0;
		for(int i=1;i<=n;i++)
		{
			sum1=sum1+Math.sqrt(i);
		}
		double time1 =timer1.elapsedTime();
		System.out.printf("seconds\n"+sum1,time1+"\n");
		StopWatch timer2 = new StopWatch();
		double sum2 = 0.0;
		for(int i=1; i<=n; i++)
		{
			sum2 +=Math.pow(i, 0.5);
		}
		double time2 = timer2.elapsedTime();
		System.out.printf("\n second\n"+sum2,time2);
		sc.close();
	}
}
