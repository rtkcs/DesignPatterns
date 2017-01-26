package eu.rtakacs.factory2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;


public class ProductFactory {
	
	private ProductFactory(){}
	
	private Map<String,Class<? extends Product>> m_registeredProducts = new HashMap<String,Class<? extends Product>>();
	private static ProductFactory factory = new ProductFactory();
	
	public static ProductFactory getInstance(){
		return factory;
	}
	
	public void registerProduct(String productId, Class<? extends Product> productClass){
		m_registeredProducts.put(productId, productClass);
	}
	
	/**
	 * Uses reflection to create Product object.
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
	public Product createProductReflection(String productId) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<? extends Product> productClass = m_registeredProducts.get(productId);
		Constructor<? extends Product> productContructor = productClass.getDeclaredConstructor(new Class[]{});
		return productContructor.newInstance(new Object[]{});
	}
}
