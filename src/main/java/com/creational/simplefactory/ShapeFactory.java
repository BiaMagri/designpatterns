package com.creational.simplefactory;

public class ShapeFactory {

	public Shape drawShape (ShapeType shapeType) {
		return switch (shapeType) {
			case CIRCLE -> new Circle();
			case RECTANGLE -> new Rectangle();
			case SQUARE -> new Square();
		};
	}

}
