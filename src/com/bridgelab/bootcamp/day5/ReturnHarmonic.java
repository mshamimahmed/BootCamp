package com.bridgelab.bootcamp.day5;
import java.util.Scanner;
public class ReturnHarmonic 
{
	public static double harmonic(int n)
	{
        double sum = 0.0;
        for (int i = 1; i <= n; i++) 
        {
            sum += 1.0 / i;
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args)
    { 
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter the n number");
    	int n=sc.nextInt();
        harmonic(n);
        sc.close();
    }

}
