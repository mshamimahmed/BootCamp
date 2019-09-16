package com.bridgelab.bootcamp.day11;

public class ArrayRepeated 
{
	public static void main(String[] args) 
	{
		int[] a= new int[101];
		int i;
		int[] b=new int[5];
		for(i=1;i<45;i++)
		{
			a[i]=i;			
		}		
		int k=20;
		for(i=45;i<46;i++)
		{
			a[i]=k;
		}		
		for(i=46;i<=100;i++)
		{
			a[i]=i;
		}
		for(i=1;i<=100;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		int m=1;
		for(i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("repeated element is found "+a[j]+" ");
					b[m]=a[j];
					m++;
				}
			}
		}
		for(int j=0;j<b.length;j++)
		{
			if(b[j]!=0)
			{
				System.out.println("The element of duplicate is store:"+b[j]);
			}
		}
	}
}
