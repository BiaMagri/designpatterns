package com.creational.factorymethod;

public class CircleFactory extends ShapeFactory {

	@Override
	public Shape drawShape() {
		return new Circle();
	}
}
