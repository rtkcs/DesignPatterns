package eu.rtakacs.visitor;

public class Necessity implements Visitable{
	
	private double price;
	
	Necessity(double price){
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
