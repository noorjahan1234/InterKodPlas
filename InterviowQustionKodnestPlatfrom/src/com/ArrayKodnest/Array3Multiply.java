package com.ArrayKodnest;

import java.util.Scanner;

public class Array3Multiply {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Stored the Element each array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i : arr)
		{
			System.out.print(3*i+" ");
		}
	}

}
