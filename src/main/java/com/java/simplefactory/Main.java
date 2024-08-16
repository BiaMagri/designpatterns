package com.java.simplefactory;

public class Main {

	public static void main (String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circle = shapeFactory.drawShape(ShapeType.CIRCLE);
		circle.draw();

		Shape rectangle = shapeFactory.drawShape(ShapeType.RECTANGLE);
		rectangle.draw();

		Shape square = shapeFactory.drawShape(ShapeType.SQUARE);
		square.draw();
	}

}
