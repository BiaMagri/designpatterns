package com.behavioral.observer;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a circle ⬤");
	}

	@Override
	public String getName() {
		return "Circle";
	}
}
