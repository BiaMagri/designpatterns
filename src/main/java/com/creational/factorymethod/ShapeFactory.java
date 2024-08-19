package com.creational.factorymethod;

public abstract class ShapeFactory {

	public void logShapeDrawn() {
		System.out.println("-> Factory of " + drawShape().getClass().getSimpleName());
	}

	public abstract Shape drawShape();

}
