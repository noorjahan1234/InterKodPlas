package com.String;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String s="";
		//replaceAll=> all space b/w character
		//toLowerCase=> method which convert all character lower case
		str=str.toLowerCase();
		// chacking character all(a-z to A-Z)
		for(char i='a'; i<='z'; i++)
		{
			//indexOf char i--> this method returns -1 substring not found if the position of substrings i int str 
			if(str.indexOf(i)!=-1)
			{
				//String+character
			s=s+i;
			}
		}
		//returns number or character of a string
		if(s.length()==26)
		{
			System.out.println(str+" :Panagram");
		}
		else {
			System.out.println(str+" :Not Panagram");
		}
	}
	
}
