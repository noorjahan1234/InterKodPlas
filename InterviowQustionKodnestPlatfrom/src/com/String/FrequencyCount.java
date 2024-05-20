package com.String;

import java.util.Scanner;

public class FrequencyCount {

	private static void countFrequency(String st) {
		int[] freq=new int[256];
		for(int i=0; i<st.length(); i++)
		{
			char ch=st.charAt(i);
			freq[ch]++;
		}
		for(int i=0; i<256; i++)
		{
			//check condition freq>0
			if(freq[i]>0) {
				char ch=(char) i;
				System.out.println("Character: "+ch+" Frequency "+freq[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String st=sc.nextLine();
		countFrequency(st);
		//System.out.println("Charachter: "+ st +" Frequency:" +res);
	}
}