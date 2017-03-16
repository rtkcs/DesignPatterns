package eu.rtakacs.template2;

public abstract class Trip {
	public final void performTrip() {
		doComingTransport();
		doDayA();
		doDayB();
		doDayC();
		doDayX();
		doReturningTransport();
	}

	public abstract void doComingTransport();

	public void doDayA(){
		System.out.println("The hotel manager welcomes the turists..");
	}

	public abstract void doDayB();

	public abstract void doDayC();
	
	public abstract void preDayX();
	
	public void doDayX(){
		preDayX();
		System.out.println("The turist make dayX....");
		postDayX();
	}
	public abstract void postDayX();

	public abstract void doReturningTransport();
}
