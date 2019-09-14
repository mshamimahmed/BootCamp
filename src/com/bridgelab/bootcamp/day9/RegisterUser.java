package com.bridgelab.bootcamp.day9;
import java.util.regex.*;
import java.util.Scanner;
public class RegisterUser
{
	public static boolean validateFname(String fname)
	{
		return fname.matches("[A-Z][a-zA-Z]*");
	}
	public static boolean validateLname(String lname)
	{
		return lname.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
	}
	public static boolean validateAddress(String address)
	{
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	public static boolean validateEmail(String email)
	{
		String format="^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
		return email.matches(format);
	}
	public static boolean validatePnumber(String pnumber)
	{
		String valid="(0/91)?[7-9][0-9]{9}";
		return pnumber.matches(valid);
	}
	public static boolean validateCompany(String company)
	{
		String valid="()?[a-zA-Z]+(['-][a-zA-Z]+)*";
		return (company==null) || company.matches(valid);
	}
	public static boolean validateUser(String username)
	{		 
		
			String valid="[a-zA-Z0-9]+";
			
		return (username!=null) && username.matches(valid);
	}
	public static boolean validatePassword(String password)
	{
		String valid ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})";
		return password.matches(valid);
	}
	public static void main(String args[])
	{
		String fname,lname;
//		String address;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		fname=sc.next();
		System.out.println("Enter the last name:");
		lname=sc.next();
		System.out.println("first name is valid:"+validateFname(fname));
		System.out.println("last name is valid:"+validateFname(lname));
//		System.out.println("Enter your address:");
//		address=sc.next();
//		System.out.println("Address is valid:"+validateAddress(address));
		
		System.out.println("Enter your email id:");
		String email=sc.next();
		System.out.println("your Email is valid:"+validateEmail(email));
		System.out.println("Enter your phone number:");
		String pnumber =sc.next();
		System.out.println("your phone number is valid:"+validatePnumber(pnumber));
		System.out.println("Enter your conpany name:");
		String company=sc.next();
		System.out.println("company name is valid:"+validateCompany(company));
		System.out.println("Enter your username is:");
		String username=sc.next();
		System.out.println("your user name is valid:"+validateUser(username));
		System.out.println("Enter your password:");
		String password=sc.next();
		System.out.println("Your password is:"+validatePassword(password));
		sc.close();
		
	}
}
