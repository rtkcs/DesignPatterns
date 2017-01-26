package eu.rtakacs.prototype;

public class Sheep implements Animal {

	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is copied");
		Sheep sheep = null;
		
		try {
			sheep = (Sheep)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return sheep;
	}

}
