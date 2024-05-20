package com.ArrayKodnest;

import java.util.Scanner;

public class EmployeeNamesArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee name");
		int size=sc.nextInt();
		String name[][]=new String[size][size];
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				name[i][j]=sc.next();
			}
		}
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
	}

}
