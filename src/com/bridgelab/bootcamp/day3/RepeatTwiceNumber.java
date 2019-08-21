package com.bridgelab.bootcamp.day3;

public class RepeatTwiceNumber 
{
	void Num(int arr[],int size)
	{
		int j;
		System.out.println("repeated Elements are:");
		for(int i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				
				}
			}
		}
		
		
	}
	public static void main(String[] args)
	{
		RepeatTwiceNumber repeat=new RepeatTwiceNumber();
		int arr[]= {5,7,8,8,3,3};
		int size=arr.length;
		repeat.Num(arr, size);
		
	}
	
}
