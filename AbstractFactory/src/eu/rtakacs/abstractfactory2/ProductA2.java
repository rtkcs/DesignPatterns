package eu.rtakacs.abstractfactory2;

public class ProductA2 extends AbstractProductA {

	public ProductA2(String s){
		System.out.println("Hello " + s);
	}
	
	@Override
	public void operationA1() {	}

	@Override
	public void operationA2() {	}

}
