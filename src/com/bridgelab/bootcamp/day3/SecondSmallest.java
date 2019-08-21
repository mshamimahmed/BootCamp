package com.bridgelab.bootcamp.day3;

public class SecondSmallest 
{
	static void secondSmallest(int arr[],int aar_size)
	{
		int i,first,second;
		if(aar_size<2)
		{
			System.out.print("invalid Input");
			return;
		}
		first =second=Integer.MAX_VALUE;
		for(i=0;i<aar_size;i++) 
		{
			if(arr[i]< first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]<second && arr[i]!=first)
			{
				second=arr[i];
			}
		}
		if(second==Integer.MAX_VALUE)
		{
			System.out.print("there is no second largest"+"element\n");
		}
		else
		{
			System.out.print("the second largest element"+"is:"+second);
		}
		
	}
	public static void main(String[] args)
	{
		int arr[]= {12,35,2,10,34,1};
		int n=arr.length;
		secondSmallest(arr,n);
	}
}
