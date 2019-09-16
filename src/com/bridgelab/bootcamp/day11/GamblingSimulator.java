package com.bridgelab.bootcamp.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamblingSimulator
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		List<Integer> wins= new ArrayList<Integer>();
		List<Integer> losses= new ArrayList<Integer>();
		System.out.println("Enter the trails:");
		int trails=sc.nextInt();
		System.out.println("Enter the goals:");
		int goal=sc.nextInt();
		System.out.println("Enter the stake:");
		int stake=sc.nextInt();
		int bet=0,win=0,loss=0,i,j,cash;
		int len1=wins.size();
		int len2=losses.size();
		int[][] wonloss=new int[len1][len2];
		try 
		{
				for(i=0;i<trails;i++)
				{
					cash=stake;			
					while(cash>0 && cash<goal)
					{
						bet++;
						if(Math.random()>0.5)
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
						wins.add(win);
					}
					else
					{
						loss++;
						losses.add(loss);
					}			
				}
				System.out.println("No of Win times is:"+win);
				System.out.println("No of Loss is:"+loss);
				System.out.println("wins is:"+wins);
				System.out.println("Losses is:"+losses);
		
				for(i=0;i<2;i++)
				{
					for(j=0;j<len2;j++)
					{
						wonloss[1][j]=wins.get(j);				
					}	
					
				}
				for(i=0;i<3;i++)
				{				
					for(j=0;j<len2;j++)
					{
						wonloss[2][j]=losses.get(j);
					}
				}
				for(i=0;i<3;i++)
				{
					for(j=0;j<len2;j++)
					{
						System.out.print("store in 2d Arrays is:"+wonloss[i][j]);
					}
					System.out.println();
				}
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.fillInStackTrace();
			}
		
			
	}

}
