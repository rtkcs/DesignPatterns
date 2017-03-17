package eu.rtakacs.visitor;

public class VisitorTest {
	
	public static void main(String[] args){
		TaxVisitor taxVisitor = new TaxVisitor();
		TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();
		
		Necessity milk = new Necessity(0.80);
		Liquor vodka = new Liquor(11.99);
		Tobacco cigars = new Tobacco(19.99);
		
		System.out.println("TAX NORMAL PRICES");
		milk.accept(taxVisitor);
		vodka.accept(taxVisitor);
		cigars.accept(taxVisitor);
		
		System.out.println("----------------------------------------------");
		System.out.println("TAX HOLIDAY PRICES");
		milk.accept(taxHolidayVisitor);
		vodka.accept(taxHolidayVisitor);
		cigars.accept(taxHolidayVisitor);
	}
}
