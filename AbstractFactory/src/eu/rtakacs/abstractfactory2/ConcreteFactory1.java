package eu.rtakacs.abstractfactory2;

public class ConcreteFactory1 extends AbstractFactory {

	@Override
	AbstractProductA createProductA() {
		return new ProductA1("ProductA1");
	}

	@Override
	AbstractProductB createProductB() {
		return new ProductB1("ProductB1");
	}

}
