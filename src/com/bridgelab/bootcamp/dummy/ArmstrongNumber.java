package com.bridgelab.bootcamp.dummy;


import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int t1=n;
int rem;
int length=0;
while(t1!=0) {
t1=t1/10;
length=length+1;
}
int arm=0;
int t2=n;
while(t2!=0) {
int multi=1;
rem=t2%10;
for(int i=0;i<length;i++) {
multi=rem*multi;
}
arm=arm+multi;
t2=t2/10;
}
if(n==arm) {
System.out.println(n+"armstrong");
}
else {
System.out.println("ramstrong number"+n);
}
}
}