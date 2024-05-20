package com.String;

import java.util.Scanner;

public class CountFrqConsVolDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		//Default capacity 16
		
		int v = 0,c = 0,digit = 0,spacialChar=0,u=0,l=0;
		//Assuming ASCII character
		int[] freq=new int[256];
		//0 index to last
		for(int i=0; i<str.length(); i++)
		{
			//convert character
			char ch=str.charAt(i);
			//count character to frequency
			freq[ch]++;
			//check condition uppercase to lowercase
			if(ch=='a' && ch=='z' ||ch=='A' || ch=='Z')
			{
				//count uppercase
				u++;
			}
			//other wise count lowercase
			else {
				l++;
			}
				//check a character vowel or constant
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
				{
					v++;
				}
				else {
					c++;
				}
			//chech a digit 
			if(ch>='0'&&ch<='9')
				{
				//count the digit
					digit++;
				}
			//other wise count spacial character
				else {
					spacialChar++;
				}
		}
		//
		for(int i=0; i<256; i++)
		{
			if(freq[i]>0)
			{
				char ch=(char) i;
				System.out.println("Charachter: "+ch +" Frequency: "+freq[i]);
			}
		}
		System.out.println(sb.capacity());
		System.out.println("UpperCase: "+u);
		System.out.println("LowerCase: "+l);
		System.out.println("Vowale: "+v);
		System.out.println("Constant: "+c);
		System.out.println("Digit: "+digit);
		System.out.println("Spacial Character: "+spacialChar);
		
		}
}