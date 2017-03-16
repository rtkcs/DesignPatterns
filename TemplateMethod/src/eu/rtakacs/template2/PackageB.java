package eu.rtakacs.template2;

public class PackageB extends Trip {
	@Override
	public void doComingTransport() {
		System.out.println("The turists are comming by train ...");
	}

	@Override
	public void doDayA() {
		super.doDayA();
		System.out.println("The turists are visiting the mountain ...");
	}

	@Override
	public void doDayB() {
		System.out.println("The turists are going to the beach ...");
	}

	@Override
	public void doDayC() {
		System.out.println("The turists are going to zoo ...");
	}

	@Override
	public void preDayX() {
		System.out.println("The hotel staff makes preparation for DayX");
	}

	@Override
	public void postDayX() {
		System.out.println("The hotel staff makes cleaning after DayX");
	}

	@Override
	public void doReturningTransport() {
		System.out.println("The turists are going home by train ...");
	}

}