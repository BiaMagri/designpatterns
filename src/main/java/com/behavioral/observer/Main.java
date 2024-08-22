package com.behavioral.observer;

public class Main {

	public static void main (String[] args) {
		Publisher publisher = new Publisher();

		Observer circleObserver = new CircleObserver();
		Observer rectangleObserver = new RectangleObserver();

		publisher.notifyObservers(); // "Started notifying 0 observers for shape change: null" -> The observers exist but are not subscribed yet

		System.out.println();

		Shape circle = new Circle();
		Shape rectangle = new Rectangle();

		publisher.registerObserver(rectangleObserver);

		publisher.setShape(circle); // "Started notifying 1 observer for shape change: Circle" -> No circleObserver registered to be notified
		publisher.setShape(rectangle); // "Started notifying 1 observer for shape change: Rectangle" -> rectangleObserver notified

		System.out.println();

		publisher.registerObserver(circleObserver);
		publisher.setShape(circle); // "Started notifying 2 observers for shape change: Circle" -> circleObserver notified
		publisher.setShape(rectangle); // "Started notifying 2 observers for shape change: Rectangle" -> rectangleObserver notified

		System.out.println();

		publisher.removeObserver(rectangleObserver);
		publisher.setShape(circle); // "Started notifying 1 observer for shape change: Circle" -> circleObserver notified
		publisher.setShape(rectangle); // "Started notifying 1 observer for shape change: Rectangle" -> No rectangleObserver registered to be notified

	}

}
