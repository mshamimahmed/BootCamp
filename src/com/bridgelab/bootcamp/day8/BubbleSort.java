package com.bridgelab.bootcamp.day8;

public class BubbleSort
{
	static int bubblesort(int arr[])
	{
		int n=arr.length,temp,i;
		for( i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		for(i=0;i<n-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
			return i;
	}
	public static void main(String args[])
	{
		int arr[]= {64,36,45,22,35,42};
		bubblesort(arr);
	}
}
