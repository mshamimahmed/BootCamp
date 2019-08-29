package com.bridgelab.bootcamp.day8;

public class BinarySearchString 
{
	static int binarySearch(String[] arr, String key)
	{
		int low=0,high=arr.length-1;
		while(high>=low)
		{
			int mid=low + (high - low)/2;
			int com= key.compareTo(arr[mid]);
			if(com==0)
				return mid;
			if(com>0)
				low=mid + 1;
			else
				high=mid-1;
		}
		return -1;
	}
	public static void main(String args[])
	{
		String[] arr= {"word","hii","he","okey"};
		String key="hii";
		int a = binarySearch(arr,key);
		if(a==-1)
			System.out.println("element is not found");
		else
			System.out.println("Element is found at "+"index:"+a);
	}
}
