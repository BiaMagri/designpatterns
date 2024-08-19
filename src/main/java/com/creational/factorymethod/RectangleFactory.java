package com.creational.factorymethod;

public class RectangleFactory extends ShapeFactory {

	@Override
	public Shape drawShape() {
		return new Rectangle();
	}

}
