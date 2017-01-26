package eu.rtakacs.factory2;

import java.lang.reflect.InvocationTargetException;

public class ProductFactoryTest {
	
	
	static{
		try {
			Class.forName("eu.rtakacs.factory2.ProductOne");
			Class.forName("eu.rtakacs.factory2.ProductTwo");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Product productOne = ProductFactory.getInstance().createProductReflection("1");
		System.out.println("ProductOne: " +  productOne.toString() );
		
		Product productTwo = ProductFactory.getInstance().createProductReflection("2");
		System.out.println("ProductTwo: " +  productTwo.toString() );

	}

}
