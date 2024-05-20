package com.String;

import java.util.Scanner;

public class ReverseStrSpacePoti {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 String input = scanner.nextLine();
		 String r=isRevers(input);
		 System.out.println(r);
		 }
		 // Your code to reverse the string with intact space positions here
		 public static String isRevers(String str)
		 {
			 //convert to String to Array
		 char[] ch=str.toCharArray();
		 //left start point
		 int left=0;
		 //right ending point
		 int right=ch.length-1;
		 //
		 while(left<right)
		 {
	// left not equal to space and right not equal to
		 if(ch[left]!=' ' && ch[right]!=' ')
		 {
		 char temp=ch[right];
		 ch[right]=ch[left];
		 ch[left]=temp;
		 left++;
		 right--;
		 }
		 //
		 else if(ch[left]==' ')
		 {
		 left++;
		 }
		 else if(ch[right]==' ')
		 {
		 right--;
		 }
		 }
		 return new String (ch);
	}

}
