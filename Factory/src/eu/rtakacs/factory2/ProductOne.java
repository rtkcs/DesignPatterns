package eu.rtakacs.factory2;

public class ProductOne extends Product {
	
	static{
		ProductFactory.getInstance().registerProduct("1", ProductOne.class);
	}
}
