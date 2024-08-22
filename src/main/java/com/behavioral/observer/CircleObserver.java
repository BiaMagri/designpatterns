package com.behavioral.observer;

public class CircleObserver implements Observer {

	@Override
	public void update(Shape shape) {
		if (shape instanceof Circle) {
			shape.draw();
		}
	}
}
