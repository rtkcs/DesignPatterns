package eu.rtakacs.abstractfactory2;

public class ProductB2 extends AbstractProductB {

	public ProductB2(String s){
		System.out.println("Hello " + s);
	}
	
	@Override
	public void operationB1() {	}

	@Override
	public void operationB2() {	}

}
