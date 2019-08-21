package com.bridgelab.bootcamp.day3;

public class SecondLargestAndSmallest 
{
	public static void SecondLargest(int arr[],int aar_size)
	{
		int i,first,second;
		if(aar_size<2)
		{
			System.out.print("invalid Input");
			return;
		}
		first =second=Integer.MIN_VALUE;
		for(i=0;i<aar_size;i++) 
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]!=first)
			{
				second=arr[i];
			}
		}
		if(second==Integer.MIN_VALUE)
		{
			System.out.print("there is no second largest"+"element\n");
		}
		else
		{
			System.out.println("the second largest element"+"is:"+second);
		}
		
	}
	 static void SecondSmallest(int arr[],int aar_size)
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
			System.out.print("there is no second smallest"+"element\n");
		}
		else
		{
			System.out.print("the second smallest element"+"is:"+second);
		}
	}

	public static void main(String[] args)
	{
		int arr[]= {12,35,2,10,34,1};
		int n=arr.length;
		SecondLargest(arr,n);
		SecondSmallest(arr,n);
		
		
	}
	
}
