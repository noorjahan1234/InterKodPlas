package com.ArrayKodnest;

import java.util.Scanner;

public class SumofArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int arr[]= new int[n];
		int sum=0;
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("Print the sum");
		for(int a : arr)
		{
		sum+=a;
		}
		System.out.println(sum);
	}

}
