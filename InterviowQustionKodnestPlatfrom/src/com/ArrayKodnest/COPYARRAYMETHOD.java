package com.ArrayKodnest;

import java.util.Arrays;
import java.util.Scanner;

public class COPYARRAYMETHOD {

	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("stored Array");
		int arr[]=new int[sc.nextInt()];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		int[] a=Arrays.copyOf(arr, sc.nextInt());
		for(int z : a)
		System.out.print(z+" ");
	}

}
