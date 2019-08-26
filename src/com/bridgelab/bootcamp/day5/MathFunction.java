package com.bridgelab.bootcamp.day5;
import java.util.Scanner;
public class MathFunction 
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
	
	
	public static double sin()
	{
		double a=90;
		double sine=Math.sin(a);
		System.out.println(Math.round(sine));
		return sine;
	}

	
	static double cos()
	{
		double a=90;
		double cosine=Math.cos(a);
		System.out.println(Math.round(cosine));
		return cosine;
	}
	
	
	
	static int binaryNumber(int n)
	{
		int j=1,d,binary=0;
		while(n!=0)
		{
			d=n%2;
			binary=binary+(d*j);
			n=n/2;
			j=j*10;
			
		}
		System.out.println("binary number is:"+binary);
		return binary;
	}
	

    public static void main(String[] args)
    { 
    	System.out.println("harmonic number is");
        for (int i = 0; i < args.length; i++) 
        {
            int arg = Integer.parseInt(args[i]);
            double value = harmonic(arg);
            System.out.println(value);
            
            
        }
        System.out.println("sin value is");
    	sin();
    	System.out.println("cosine value is:");
        cos();
      
        
        
    	int n;
		System.out.println("enter the  binary number");
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		binaryNumber(n);
		sc.close();
    }
}
