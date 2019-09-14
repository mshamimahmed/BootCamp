package com.bridgelab.bootcamp.dummy;

public class pattern_reversee 

{
	public static void main(String args[])
	{
		int i,j;
//		int n;
		for(i=5;i>0;i--)
		{
			for(j=0;j<=5;j++)
			{
				
				if(i<=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
						
			}
			System.out.println();
		}
	}
}
