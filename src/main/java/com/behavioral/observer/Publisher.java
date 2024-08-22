package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher { // also known as Subject

	private List<Observer> observers = new ArrayList<>();
	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
		notifyObservers();
	}

	void registerObserver(Observer observer){
		System.out.println("✅ Registering observer: " + observer.getClass().getSimpleName());
		observers.add(observer);
	}

	void removeObserver(Observer observer){
		System.out.println("❌ Removing observer: " + observer.getClass().getSimpleName());
		observers.remove(observer);
	}

	void notifyObservers(){
		String shapeName = shape != null ? shape.getName() : null;
//		System.out.println("Start notifying " + observers.size() + " observers for shape change: " + shapeName);
		for (Observer observer : observers) {
//			System.out.println("Notifying observer " + observer.getClass().getSimpleName() + " for shape change: " + shape.getName());
			if(shape != null){
				observer.update(shape);
			}

		}
	}

}
