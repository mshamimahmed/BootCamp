package com.bridgelab.bootcamp.day10;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import com.bridgelab.bootcamp.utility.Utility;
public class GenericsPrime2d 
{
	
	public static void main(String[] args)
	throws ArrayIndexOutOfBoundsException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your limit:");
		int n =sc.nextInt();
		List<Integer>prime=Utility.primeNumber(n);
		int row =10;
		int col=100;
		int[][] prime2d = new int[row][col];
		int i=1;
		try 
		{
			while(i<=prime.size())
			{
				for(int j=0;j<col;j++)
				{
					if(prime.get(i)<100)
					{
						prime2d[0][j]=prime.get(i);
						i++;
					}
				}
				for(int j=0;j<col;j++)
				{
					if(prime.get(i)<200)
					{
						prime2d[1][j]=prime.get(i);
						i++;
					}
				}
				for(int j=0;j<col;j++)
				{
					if(prime.get(i)<300)
					{
						prime2d[2][j]=prime.get(i);
						i++;
					}
				}
				for(int j=0;j<col;j++)
				{
					if(prime.get(i)<400)
					{
						prime2d[3][j]=prime.get(i);
						i++;
					}
				}
				for(int j=0;j<col;j++)
				{
					if(prime.get(i)<500)
					{
						prime2d[4][j]=prime.get(i);
						i++;
					}
				}
				for(int j=0;j<col;j++)
				{
					if(prime.get(i)<600)
					{
						prime2d[5][j]=prime.get(i);
						i++;
					}
				}
				for(int j=0;j<col;j++)
				{
					if(prime.get(i)<700)
					{
						prime2d[6][j]=prime.get(i);
						i++;
					}
				}
				for(int j=0;j<col;j++)
				{
					if(prime.get(i)<800)
					{
						prime2d[7][j]=prime.get(i);
						i++;
					}
				}
				for(int j=0;j<col;j++)
				{
					if(prime.get(i)<900)
					{
						prime2d[8][j]=prime.get(i);
						i++;
					}
				}
				for(int j=0;j<col;j++)
				{					
					if(prime.get(i)<=1000)
					{
						prime2d[9][j]=prime.get(i);
						i++;
					}					
				}
			}
		}
		catch(Exception e)
		{	
			

			e.printStackTrace();
		}
		for(int k=0;k<row;k++)
		{			
			for(int j=0;j<col;j++)
			{
				if(prime2d[k][j]!=0)
				{
					System.out.println(prime2d[k][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
