package com.bridgelab.bootcamp.day9;
import java.util.Scanner;
public class ReplaceString
{
	public static void main(String args[])
	{
	
		String str2 = new String("Old MacDonald had a farm,\nE-I-E-O And on his farm he had some %ANIMAL% "+",\nE-I-E-O");
		System.out.println(str2);

		String str3 = new String("With a %SOUND%"+","+"%SOUND% here");
		System.out.println(str3);
		String str4 = new String("And a %SOUND%"+","+"%SOUND% there");
		System.out.println(str4);
		String str5 = new String("Here a %SOUND%"+", there a"+"%SOUND% ");
		System.out.println(str5);
		String str6 = new String("Everywhere a %SOUND%"+","+"%SOUND% ");
		System.out.println(str6);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice:");
		int ch= sc.nextInt();
		sc.close();
		switch(ch)
		{
			case 1:
			{
				System.out.println("after replaement for chicks");
				System.out.println(str2.replaceAll("%ANIMSL%","chicks" ));
				System.out.println(str3.replace("%SOUND%","chick" ));
				System.out.println(str4.replace("%SOUND%","chick" ));
				System.out.println(str5.replace("%SOUND%","chick" ));
				System.out.println(str6.replace("%SOUND%","chick" ));
				break;
				
			}
			case 2:
			{
				System.out.println("after replaement for chicks");
				System.out.println(str2.replaceAll("%ANIMSL%","Duck" ));
				System.out.println(str3.replace("%SOUND%","quack" ));
				System.out.println(str4.replace("%SOUND%","quack" ));
				System.out.println(str5.replace("%SOUND%","quack" ));
				System.out.println(str6.replace("%SOUND%","quack" ));
				
			}
			
			case 3:
			{

				System.out.println("after replaement for chicks");
				System.out.println(str2.replaceAll("%ANIMSL%","Cat " ));
				System.out.println(str3.replace("%SOUND%","meow, meow" ));
				System.out.println(str4.replace("%SOUND%","meow, meow" ));
				System.out.println(str5.replace("%SOUND%","meow, meow" ));
				System.out.println(str6.replace("%SOUND%","meow, meow" ));
				
			}
			case 4:
			{

				System.out.println("after replaement for chicks");
				System.out.println(str2.replaceAll("%ANIMSL%","Dog" ));
				System.out.println(str3.replace("%SOUND%","bow wow" ));
				System.out.println(str4.replace("%SOUND%","bow wow" ));
				System.out.println(str5.replace("%SOUND%","bow wow" ));
				System.out.println(str6.replace("%SOUND%","bow wow" ));
				
				
				
			}
			default:
			{
				System.out.println("Invalid choice");
				
			}
		}
		

				
		
		
	}
}


































/*

*/

