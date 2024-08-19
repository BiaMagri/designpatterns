package com.creational.factorymethod;

public class Main {

	public static void main (String[] args) {
		ShapeFactory circleFactory = new CircleFactory();
		circleFactory.logShapeDrawn();
		Shape circle = circleFactory.drawShape();
		circle.draw();

		ShapeFactory rectangleFactory = new RectangleFactory();
		rectangleFactory.logShapeDrawn();
		Shape rectangle = rectangleFactory.drawShape();
		rectangle.draw();

		ShapeFactory squareFactory = new SquareFactory();
		squareFactory.logShapeDrawn();
		Shape square = squareFactory.drawShape();
		square.draw();
	}

}
