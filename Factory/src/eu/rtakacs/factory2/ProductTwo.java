package eu.rtakacs.factory2;

public class ProductTwo extends Product {
	
	static{
		ProductFactory.getInstance().registerProduct("2", ProductTwo.class);
	}
}
