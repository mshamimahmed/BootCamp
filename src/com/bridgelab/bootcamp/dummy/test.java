package com.bridgelab.bootcamp.dummy;
public class test{

public static void main(String[] args){
String[] arr ={"Atlanta","New York","Dallas","Omaha","San Francisco"};
int count = 0;
String sortedArray[] = sort_sub(arr, arr.length); 
for(int i=0;i<sortedArray.length;i++){
System.out.println(sortedArray[i]);
}
}

public static String[] sort_sub(String array[], int len){
String temp="";
for(int i=0;i<len;i++){
for(int j=i+1;j<len;j++){
if(array[i].compareToIgnoreCase(array[j])>0){
temp = array[i];
array[i]=array[j];
array[j]=temp;
}
}
}
return array;
}
}