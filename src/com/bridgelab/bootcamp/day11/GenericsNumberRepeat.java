package com.bridgelab.bootcamp.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericsNumberRepeat
{
	public static List<Integer> repeat(int num)
	{
		List<Integer> a= new ArrayList<Integer>();
		for(int i=1;i<num;i++)
		{
			a.add(i);
		}	
		a.add(45,20);
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number is:");
		int num=sc.nextInt();
		List<Integer> number=repeat(num);
		List<Integer> duplicate=new ArrayList<Integer>();
		System.out.print(number+ " ");
		System.out.println();
		int b;
		for(int i=0;i<number.size();i++)
		{
			for(int j=i+1;j<number.size();j++)
			{
				if(number.get(i)==number.get(j))
				{
					System.out.println("douplicate value is found at:"+number.get(j));
					 b=number.get(j);
					 duplicate.add(b);
				}
			}
		}
		sc.close();
		System.out.println("duplicate value is store in:"+duplicate);
	}
}
