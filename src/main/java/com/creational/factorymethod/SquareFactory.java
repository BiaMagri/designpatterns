package com.creational.factorymethod;

public class SquareFactory extends ShapeFactory {

	@Override
	public Shape drawShape() {
		return new Square();
	}
}
