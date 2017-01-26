package eu.rtakacs.factory3;

public class ProductTwo extends Product {
	
	static{
		ProductFactory.getInstance().registerProduct("2", new ProductTwo());
	}

	@Override
	public Product createProduct() {
		return new ProductTwo();
	}
	
}
