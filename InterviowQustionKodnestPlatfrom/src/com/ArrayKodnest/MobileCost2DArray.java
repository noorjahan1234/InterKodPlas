package com.ArrayKodnest;

import java.util.Scanner;

public class MobileCost2DArray {
	
	 static void findArray(int[][] arr, int size) {
			System.out.println("Mobile Cost:");
			for(int i=0; i<size; i++)
				{
				for(int j=0; j<size; j++)
				{
					//System.out.print(arr[i][j]+" ");
					if(arr[i][j]%2==0)
					{
						arr[i][j]=-1;
					}
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				}
	
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		for(int i=0; i<size; i++)
			{
			for(int j=0; j<size; j++)
			{
				arr[i][j]=sc.nextInt();
			}
			}
		findArray(arr,size);

	}
}
