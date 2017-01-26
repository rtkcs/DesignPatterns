package eu.rtakacs.factory3;

public class ProductOne extends Product {
	
	static{
		ProductFactory.getInstance().registerProduct("1", new ProductOne());
	}

	@Override
	public Product createProduct() {
		return new ProductOne();
	}
	
	
}
