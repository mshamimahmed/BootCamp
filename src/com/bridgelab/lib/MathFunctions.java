package com.bridgelab.lib;
import java.util.Scanner;
public class MathFunctions 
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
	
	
	
	static int binaryNumber(int m)
	{
		int j=1,d,binary=0;
		while(m!=0)
		{
			d=m%2;
			binary=binary+(d*j);
			m=m/2;
			j=j*10;
			
		}
		System.out.println("binary number is:"+binary);
		return binary;
	}
	

    public static void main(String[] args)
    { 
    	System.out.println("harmonic number is");
    	Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
    	harmonic(n);
        System.out.println("sin value is");
    	sin();
    	System.out.println("cosine value is:");
        cos();
      
        
        
    	 int m;
		System.out.println("enter the  binary number");
		m= sc.nextInt();
		binaryNumber(m);
		sc.close();
    }
}