package com.behavioral.observer;

public class RectangleObserver implements Observer {

	@Override
	public void update(Shape shape) {
		if (shape instanceof Rectangle) {
			shape.draw();
		}

	}
}
