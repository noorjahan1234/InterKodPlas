package com.OOPInharitence;

import java.util.Scanner;

public class LengthAndWidth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=sc.nextInt();
		System.out.println("Enterthe width");
		int width=sc.nextInt();
		Width w=new Width(length,width);
		System.out.println("Area: "+w.claculateArea());
		System.out.println("Perimeter: "+w.claculatePerimeter());
	}

}
