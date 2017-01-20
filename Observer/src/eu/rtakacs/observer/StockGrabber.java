package eu.rtakacs.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber(){
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer newObserver) {
		this.observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		this.observers.remove(deleteObserver);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer: this.observers)
			observer.update(this.ibmPrice, this.aaplPrice, this.googPrice);
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		this.notifyObserver();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		this.notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		this.notifyObserver();
	}
	
	

}
