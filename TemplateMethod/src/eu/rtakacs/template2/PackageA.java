package eu.rtakacs.template2;

public class PackageA extends Trip {
	public void doComingTransport() {
		System.out.println("The turists are comming by air ...");
	}

	public void doDayA() {
		super.doDayA();
		System.out.println("The turists are visiting the aquarium ...");
	}

	public void doDayB() {
		System.out.println("The turists are going to the beach ...");
	}

	public void doDayC() {
		System.out.println("The turists are going to mountains ...");
	}

	public void preDayX(){
		System.out.println("The turist prepare for DayX.....");
	}
	public void postDayX(){
		System.out.println("The turist are happy DayX is over....");
	}
	
	public void doReturningTransport() {
		System.out.println("The turists are going home by air ...");
	}
}