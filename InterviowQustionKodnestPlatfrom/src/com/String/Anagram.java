package com.String;

import java.util.Arrays;

public class Anagram {

	public boolean findAnagram(String name1, String name2) {
		//find the lower Case both string
		name1=name1.toLowerCase();
		name2=name2.toLowerCase();
		//check both String are not equal print false
		if(name1.length()!=name2.length())
		{
		return false;
		}
		//convert  string to char Array
		char[] ch1=name1.toCharArray();
		char[]ch2=name2.toCharArray();
		//sort the char array
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		//return char array are equal
		return Arrays.equals(ch1, ch2);
	}
	/*
	 * public static void main(String[] args) { // String str1="silent"; // String
	 * str2="lisent"; String str1="hello"; String str2="lisent";
	 * str1=str1.toLowerCase(); str2=str2.toLowerCase();
	 * 
	 * char[] ch1=str1.toCharArray(); char[] ch2=str2.toCharArray();
	 * 
	 * Arrays.sort(ch1); Arrays.sort(ch2);
	 * 
	 * if(Arrays.equals(ch1, ch2)) { System.out.println("Yes"); } else {
	 * System.out.println("No"); } }
	 */

}
