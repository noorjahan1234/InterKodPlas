package com.ArrayKodnest;

import java.util.Scanner;

public class StudentMarksArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int age[][]=new int[size][size];
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				age[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
			System.out.println("Collage: "+(i+1)+ " "+ "Student: "+(j+1)+" " +age[i][j]);
			}
		}
	}
}
