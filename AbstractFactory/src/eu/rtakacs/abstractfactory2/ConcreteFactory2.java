package eu.rtakacs.abstractfactory2;

public class ConcreteFactory2 extends AbstractFactory {

	@Override
	AbstractProductA createProductA() {
		return new ProductA2("ProductA2");
	}

	@Override
	AbstractProductB createProductB() {
		return new ProductB2("ProductB2");
	}

}
