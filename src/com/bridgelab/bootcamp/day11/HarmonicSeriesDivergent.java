package com.bridgelab.bootcamp.day11;

import java.util.List;
import java.util.Scanner;

public class HarmonicSeriesDivergent
{
	public static void main(String[] main)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for harmonic:");
		double num=sc.nextDouble();
		List<Double> harNumber=Utility.harmonic(num);
		System.out.println(harNumber);
		int row=harNumber.size();
		int col=harNumber.size();
		double[][] harmonic= new double[row][col];
		int i=1,j;
		try
		{
			while(i<harNumber.size())
			{
				for(j=0;j<harNumber.size();j++)
				{
					if(harNumber.get(i)<2)
					{
						harmonic[1][j]=harNumber.get(i);
						i++;
					}
				}
				for(j=0;j<harNumber.size();j++)
				{
					if(harNumber.get(i)<3)
					{
						harmonic[2][j]=harNumber.get(i);
						i++;
					}
				}
				for(j=0;j<harNumber.size();j++)
				{
					if(harNumber.size()<4)
					{
						harmonic[3][j]=harNumber.get(i);
						i++;
					}
				}
				for(j=0;j<harNumber.size();j++)
				{
					if(harNumber.size()<5)
					{
						harmonic[4][j]=harNumber.get(i);
						i++;
					}
				}
				for(j=0;j<harNumber.size();j++)
				{
					if(harNumber.size()<6)
					{
						harmonic[4][j]=harNumber.get(i);
						i++;
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(j=0;j<row;j++)
		{
			for(int k=0;k<col;k++)
			{
				if(harmonic[j][k]!=0)
				{
					System.out.print(harmonic[j][k]+ " ");
				}
			
			}
			System.out.println();
		}
	}
}
