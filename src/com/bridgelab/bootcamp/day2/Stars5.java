package com.bridgelab.bootcamp.day2;
import java.lang.Math;


public class Stars5 
{
	public static void main(String args[])
	{
		double a,b,c,d,e;
		
		a=Math.random();
		b=Math.random();
		c=Math.random();
		d=Math.random();
		e=Math.random();
		
		System.out.println("the random value is a:"+a);
		System.out.println("the random value is b:"+b);
		System.out.println("the random value is c:"+c);
		System.out.println("the random value is d:"+d);
		System.out.println("the random value is e:"+e);
		double avg=(a+b+c+d+e)/5;
		System.out.println("average"+avg);
		 double x=Math.min(a,b);
		 double y=Math.min(c,d);
		 double z=Math.min(x,y);
		 double s=Math.min(e,z);
		System.out.println("min:"+s);
		
		 double g=Math.max(a,b);
		 double h=Math.max(c,d);
		 double j=Math.max(g,h);
		 double k=Math.max(j,e);
		System.out.println("max:"+k);
		
	}

}


