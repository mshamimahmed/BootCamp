package com.bridgelab.bootcamp.dummy;

public class BubbleSort 
{
	static void bubbleSort(int[] arr)
	{
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[]= {30,60,35,2,45,320,5};
		System.out.println("Array Before bubble sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		bubbleSort(arr);
		System.out.print("Array Before bubble sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
