package com.ArrayKodnest;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		int[][] arr1= {{1,2,3},{7,8,9}};
		int[][] arr2= {{2,1,3},{5,1,4}};
		int a=arr1.length;
		int b=arr1[0].length;

		int[][] arr3 = new int[a][b];
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Addition Array");
		for(int i=0; i<arr3.length; i++)
		{
			for(int j=0; j<arr3[i].length; j++)
			{
//				arr3[i][j]=arr1[i][j]+arr2[i][j];
				//arr3[i][j]=arr1[i][j]-arr2[i][j];
				//arr3[i][j]=arr1[i][j]*arr2[i][j];
				arr3[i][j]=arr1[i][j]/arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
