package com.bridgelab.bootcamp.day1;
public class PrintK
{
	public static void main(String args[])
	{
		int i,j,k,count=6;
		for(i=0;i<12;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print("*");
			}
			for(k=0;k<=6;k++)
			{
				if(k==count)
				{
					System.out.print("***");
				}
				else
				{
					System.out.print("  ");
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
			System.out.print("\n");
		}
	}
}
