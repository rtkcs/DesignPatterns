package eu.rtakacs.decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza pizza) {
		super(pizza);
		System.out.println("Adding tomato sauce");
	}
	
	public String getDescription(){
		return tempPizza.getDescription() + ", tomato sauce";
	}
	public double getCost(){
		System.out.println("Cost of tomato sauce: " + 0.35);
		return tempPizza.getCost() + 0.35;
	}
}
