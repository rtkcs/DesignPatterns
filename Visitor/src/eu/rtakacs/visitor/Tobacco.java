package eu.rtakacs.visitor;

public class Tobacco implements Visitable {

	private double price;
	
	Tobacco(double price){
		this.price = price;
	}
	
	@Override
	public double accept(Visitor visitor) {
		double taxPrice = visitor.visit(this);
		return taxPrice;
	}
	
	public double getPrice(){
		return this.price;
	}
}
