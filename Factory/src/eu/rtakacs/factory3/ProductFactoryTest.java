package eu.rtakacs.factory3;

import java.lang.reflect.InvocationTargetException;

public class ProductFactoryTest {
	
	
	static{
		try {
			Class.forName("eu.rtakacs.factory3.ProductOne");
			Class.forName("eu.rtakacs.factory3.ProductTwo");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Product productOne = ProductFactory.getInstance().createProduct("1");
		System.out.println("ProductOne: " +  productOne.toString() );
		
		Product productTwo = ProductFactory.getInstance().createProduct("2");
		System.out.println("ProductTwo: " +  productTwo.toString() );

	}

}
