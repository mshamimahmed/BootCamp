package com.bridgelab.bootcamp.day12;

public class DeterminantOfMatrix
{
	public static void main(String[] args)
	{
		int[][] m= new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		}; 
		System.out.println("Matrix:");
		for(int[] array:m)
		{
			for(int i: array)
			{
				System.out.print(i);
			}
			System.out.println();
		 	
		}
		int a=m[0][0];
		int b=m[0][1];
		int c=m[0][2];
		int[][] aCross= {
				{m[1][1],m[1][2]},
				{m[2][1],m[2][2]}
				};
		int[][] bCross= {
				{m[1][0],m[1][2]},
				{m[2][0],m[2][2]}
				};
		int[][] cCross= { 
				{m[1][0],m[1][1]},
				{m[2][1],m[2][1]}
				};
		int determinant=a*crossMulti(aCross)-(b*crossMulti(bCross))+(c*crossMulti(cCross));
		System.out.println("Determinant of matrix is:"+determinant);
	}
	public static int crossMulti(int[][] bCross)
	{
		int res =bCross[0][0]*bCross[1][1]-bCross[0][1]-bCross[1][0];
		return res;
	}
}
