package com.String;

import java.util.Scanner;

public class REVERSESTRING {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String str="HelloWorld";
		String s="";
//		for(int i=str.length()-1; i>=0; i--) {
//		s=s+str.charAt(i);
//		}
//		System.out.println(s);	
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
