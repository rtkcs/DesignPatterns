package eu.rtakacs.visitor;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.##");
	
	public TaxHolidayVisitor(){}

	@Override
	public double visit(Liquor liquor) {
		double priceWithTax = Double.parseDouble( df.format(liquor.getPrice() * 0.15 + liquor.getPrice()) ); 
		System.out.println("Liquor \t\tItem: price with Tax: " + priceWithTax);
		return priceWithTax;
	}

	@Override
	public double visit(Tobacco tobacco) {
		double priceWithTax = Double.parseDouble( df.format(tobacco.getPrice() * 0.20 + tobacco.getPrice()) ); 
		System.out.println("Tobacco \tItem: price with Tax: " + priceWithTax);
		return priceWithTax;		
	}

	@Override
	public double visit(Necessity necessity) {
		double priceWithTax = Double.parseDouble( df.format(necessity.getPrice() * 0.10 + necessity.getPrice()) ); 
		System.out.println("Necessity \tItem: price with Tax: " + priceWithTax);
		return priceWithTax;		
	}
}
