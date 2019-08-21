package com.bridgelab.bootcamp.day1;
public class PrintK
{
	public static void main(String args[])
	{
		int i,j,k,count=6;
		for(i=0;i<13;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.printf("*");
			}
			for(k=0;k<=6;k++)
			{
				if(k==count)
				{
					System.out.printf("***");
				}
				else
				{
					System.out.printf("   ");
				}
			}
			if(i<=5)
			{
				count--;
			}
			else if(i<=11)
			{
				count++;
			}
			System.out.printf("\n");
		}
	}
}
