package eu.rtakacs.observer;

public class TestObserverPattern {
	public static void main(String[] args){
		StockGrabber stockGrabber = new StockGrabber();
		
		Observer observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(10.10);
		stockGrabber.setGoogPrice(20.20);
		stockGrabber.setAaplPrice(30.30);
		
		Observer observer2 = new StockObserver(stockGrabber);	
		
		stockGrabber.setIbmPrice(11.10);
		stockGrabber.setGoogPrice(21.20);
		stockGrabber.setAaplPrice(31.30);
		
		stockGrabber.unregister(observer1);
		
		stockGrabber.setIbmPrice(12.10);
		stockGrabber.setGoogPrice(22.20);
		stockGrabber.setAaplPrice(32.30);
	}
	
}
