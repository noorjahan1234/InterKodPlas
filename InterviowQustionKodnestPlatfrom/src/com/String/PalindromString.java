package com.String;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
//		String str="madam";//madam:is a palindrom number
//		//String str="moham";          //mahom:is a not palindrom number
//		//Store the reverse String
//		String revstr="";
//		//Starting the counting char ending point to 0 index
//		for(int i=str.length()-1; i>=0; i--)
//		{
//			//counting the character stored the reverse string
//			revstr=revstr+str.charAt(i);
//		}
//		//str and revstr check both are equal or not
//		if(revstr.equals(str))
//		{
//			System.out.println(revstr+ ":is a palindrom number");
//		}
//		else {
//			System.out.println(revstr+ ":is a not palindrom number");
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name");
		String name=sc.nextLine();
		String re=findPalindrom(name);
		System.out.println(re);
	}

	public static String findPalindrom(String name) {
		String revrs="";
		String str[]=name.split("");
		for(int i=str.length-1; i>=0; i--)
		{
			revrs=revrs+str[i];
		}
		if(revrs.equals(name)) {
			return "yes";
		}
		return "No";
	}
}
