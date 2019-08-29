package com.bridgelab.bootcamp.dummy;
import java.util.Scanner;
public class ArrayDeclaration 
{
	public static void main(String args[])
	{
		int	i;
	    int n;
	    System.out.println("enter the n number");
	    Scanner sc =new Scanner(System.in);
	    n =sc.nextInt();
		int[] a=new int[n];
	    
	    
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			
		}
		for(i=0;i<n;i++)
		{
			System.out.println("the array element is:"+a[i]);
		}
		sc.close();
	}
}
