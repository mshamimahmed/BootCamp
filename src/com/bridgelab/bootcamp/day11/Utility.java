package com.bridgelab.bootcamp.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility
{
	public static List<Double> harmonic(double num)
	{
		List<Double> a= new ArrayList<Double>();
		double sum=0;
		double n=num;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(double)1/i;
			a.add(sum);
		}
		return a;
	}
	
}
