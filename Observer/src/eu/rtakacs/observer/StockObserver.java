package eu.rtakacs.observer;

public class StockObserver implements Observer {
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIdTracker = 0;
	
	private int observerId;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerIdTracker;
		System.out.println("New Observer " + this.observerId);
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		this.printThePrices();
	}
	
	public void printThePrices(){
		System.out.println(observerId);
		System.out.println("IBM: " + this.ibmPrice);
		System.out.println("AAPL: " + this.aaplPrice);
		System.out.println("GOOG: " + this.googPrice);
	}
}
