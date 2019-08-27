package com.bridgelab.lib;

public class BLStdOut
{
	public static void print(String s)
	{
		System.out.print(s);
	}
	
	public static void println(String s)
	{
		System.out.println(s);
	}
	
	public static void println()
	{
		System.out.println();
		System.out.println("This is empty println");
	}
	public static void printf(String format)
	{
		System.out.printf(format);
	}
	public static void main(String args[])
	{
		String s="print statement";
		String format="format statement";
		print(s);
		println(s);
		println();
		printf(format);
	}
}
