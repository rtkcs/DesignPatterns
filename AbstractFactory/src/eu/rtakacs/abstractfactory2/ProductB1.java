package eu.rtakacs.abstractfactory2;

public class ProductB1 extends AbstractProductB {

	public ProductB1(String s){
		System.out.println("Hello " + s);
	}
	
	@Override
	public void operationB1() {	}

	@Override
	public void operationB2() {	}

}
