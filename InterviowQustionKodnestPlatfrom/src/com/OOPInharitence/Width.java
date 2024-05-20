package com.OOPInharitence;

public class Width extends Lenght{
	
	int width;
	public Width(int width, int length) {
		super(length);
		this.width=width;
	}
	 int claculateArea() {
		return length*width;
		
	}
	 int claculatePerimeter() {
		return 2*(length+width);
	}

}
