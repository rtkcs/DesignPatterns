package eu.rtakacs.template2;

public class TripTest {

	public static void main(String[] args) {
		System.out.println("---------------PackageA");
		Trip packageA = new PackageA();
		packageA.performTrip();
		
		System.out.println("---------------PackageB");
		
		Trip packageB = new PackageB();
		packageB.performTrip();
	}

}
