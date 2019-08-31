package com.bridgelab.bootcamp.day9;
import java.util.Scanner;
public class StringReplace 
{
	public static void main(String args[])
	{
		String str= new String("Old MacDonald had a farm,\n E-I-E-O \n And on his farm he had some "
			+ "%ANIMAL%, \nE-I-E-O. \nWith  a %SOUND%, %SOUND% here,\n"
			+ "And a %SOUND%,%SOUND% there,\nHere a %SOUND%,there a %SOUND%,\n"
			+ "Everywhere a %SOUND%,%SOUND%,");
		System.out.println(str);
		System.out.println("1.Chicks\n2.Duck\n3.Trukey\n4.Cat\n5.Mule"
				+ "\n6.Turkey\n7.Dog\n8.Dog\n9.Pig\n10.Turtle\n11.Cow");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice for the poem");
		int ch=sc.nextInt();
		String str1;
		switch(ch)
		{
		case 1:
			str1=str.replaceAll("%ANIMAL%", "Chicks");
			System.out.println(str1.replaceAll("%SOUND%","chick"));break;
		case 2:
			str1=str.replaceAll("%ANIMAL%", "Duck");
			System.out.println(str1.replaceAll("%SOUND%","quack"));break;
		case 3:
			str1=str.replaceAll("%ANIMAL%", "Turkey");
			System.out.println(str1.replaceAll("%SOUND%","gobble"));break;
		case 4:
			str1=str.replaceAll("%ANIMAL%", "Cat");
			System.out.println(str1.replaceAll("%SOUND%","meow,meow"));break;
		case 5:
			str1=str.replaceAll("%ANIMAL%", "Mule");
			System.out.println(str1.replaceAll("%SOUND%","Heehaw"));break;
		case 6:
			str1=str.replaceAll("%ANIMAL%", "Turkey");
			System.out.println(str1.replaceAll("%SOUND%","gobble"));break;
		case 7:
			str1=str.replaceAll("%ANIMAL%", "Dog");
			System.out.println(str1.replaceAll("%SOUND%","bow wow"));break;
		case 8:
			str1=str.replaceAll("%ANIMAL%", "pig");
			System.out.println(str1.replaceAll("%SOUND%","Oink,oink"));break;
		case 9:
			str1=str.replaceAll("%ANIMAL%", "Turtle");
			System.out.println(str1.replaceAll("%SOUND%","nerp,nerp"));break;
		case 10:
			str1=str.replaceAll("%ANIMAL%", "Cow");
			System.out.println(str1.replaceAll("%SOUND%","moo,moo"));break;
		default:
			System.out.println("Wrong Choice");
		}
		sc.close();		
	}
}
