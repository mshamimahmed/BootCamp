package com.bridgelab.bootcamp.day9;

public class RegixReplace
{
	public static void main(String args[])
	{
		String str = new String("Hello <<name>>,\n We have your full name as <<full name>>\n"
				+ "in our System. your contact number is 91-xxxxxxxx.\n Please,let us know in case of any clarification thank you Bridgelab 01/10/2016."
				+ "");		
		System.out.println(str);		
		System.out.println("\n");
		String a=str.replaceAll("<<name>>","Samir" );
		String b=a.replaceAll("<<full name>>","Samir Mallick" );
		String c= b.replaceAll("91-xxxxxxxx","91-12345678" );
		String d= c.replaceAll("01/10/2016", "30/08/2019");
		System.out.println(d);
	
	}
}
