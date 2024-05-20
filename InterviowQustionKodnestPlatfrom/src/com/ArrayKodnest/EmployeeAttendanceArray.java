package com.ArrayKodnest;

import java.util.Scanner;

public class EmployeeAttendanceArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		String arr[][]=new String[sc.nextInt()][];
		System.out.println("Storing the Array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=new String[sc.nextInt()];
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				
				System.out.println("Employe team: "+(i+1)+"Employee branch: "+(j+1));
		//cheack the status true or false
		boolean status=sc.nextBoolean();
			if(status==true)
				{
					arr[i][j]="yes";
				}
				else {
				arr[i][j]="No";
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print("Employee branch :"+(i+1) +"Employee team: "+(j+1)+" "+ arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
