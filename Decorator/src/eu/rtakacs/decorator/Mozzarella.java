package eu.rtakacs.decorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza pizza) {
		super(pizza);
		System.out.println("Adding mozzarella");
	}
	
	public String getDescription(){
		return tempPizza.getDescription() + ", mozzarella";
	}
	public double getCost(){
		System.out.println("Cost of mozzarella: " + 0.50);
		return tempPizza.getCost() + 0.50;
	}
}
