package com.bridgelab.bootcamp.day3;
import java.util.Random;
import java.util.Scanner;
public class RollDie
{
	public static void main(String[] args)
	{	
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
		//int sides =6;
		//int roll=(int)(Math.random()*sides)+1;
		//System.out.println(roll);
		Random r= new Random();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		int i=0;
		
		while(n>i)
		{
		
			int sides=r.nextInt(6)+1;
			if(sides>=1 && sides<=6)
			{
				
				if(sides==1)
					count1++;
				else if(sides==2)
					count2++;
				else if(sides==3)
					count3++;
				else if(sides==4)
					count4++;
				else if(sides==5)
					count5++;
				else if(sides==6)
					count6++;
			
			}
			System.out.println(sides);
		
			
			i++;
			
		}
		

		sc.close();
		System.out.println("the value of count1 is:"+count1);
		System.out.println("the value of count2 is:"+count2);
		System.out.println("the value of count3 is:"+count3);
		System.out.println("the value of count4 is:"+count4);
		System.out.println("the value of count5 is:"+count5);
		System.out.println("the value of count6 is:"+count6);
		int a=Math.max(count1,count2);
		int b=Math.max(count3, count4);
		int c=Math.max(count5, count6);
		int d=Math.max(a, b);
		int e=Math.max(b, c);
		System.out.println("maximum time value is"+e);
		if(count1==e)
			System.out.println("1 is max");
		else if(count2==e)
			System.out.println("2 is max");
		else if(count3==e)
			System.out.println("3 is max");
		else if(count4==e)
			System.out.println("4 is max");
		else if(count5==e)
			System.out.println("5 is max");
		else if(count6==e)
			System.out.println("6 is max");
		
	}
		
}


 

















































