package eu.rtakacs.visitor;

public class Liquor implements Visitable {
	
	private double price;
	
	Liquor(double price){
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
