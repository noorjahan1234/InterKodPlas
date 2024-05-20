package com.ArrayKodnest;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("stosred array");
		int arr[][][]=new int[sc.nextInt()][][];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the Class");
			arr[i]=new int [sc.nextInt()][];
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Enter the student");
				arr[i][j]=new int [sc.nextInt()];
			}
			}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.println("Student collage: "+(i+1)+" "+" Student class: "+(j+1)+" "+" Student number: "+(k+1));
				arr[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
				}
		}
	}

}
