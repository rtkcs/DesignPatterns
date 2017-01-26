package eu.rtakacs.factory3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;


public class ProductFactory {
	
	private ProductFactory(){}
	
	private Map<String,Product> m_registeredProducts = new HashMap<String,Product>();
	private static ProductFactory factory = new ProductFactory();
	
	public static ProductFactory getInstance(){
		return factory;
	} 
	
	public void registerProduct(String productId, Product product){
		m_registeredProducts.put(productId, product);
	}
	
	/**
	 * Creates Product from object method createProduct()
	 * 
	 * @param productId
	 * @return
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public Product createProduct(String productId) {
		Product productClass = m_registeredProducts.get(productId);
		return productClass.createProduct();
	}
}
