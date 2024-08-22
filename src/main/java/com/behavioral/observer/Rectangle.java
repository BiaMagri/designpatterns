package com.behavioral.observer;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle ▊ ");
	}

	@Override
	public String getName() {
		return "Rectangle";
	}

}
