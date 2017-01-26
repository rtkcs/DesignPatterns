package eu.rtakacs.abstractfactory2;

public class Client {
	public static void main(String[] args){
		//
		//AbstractFactory1
		//
		AbstractFactory factory1 = FactoryMaker.getFactory(1);
		useFactory(factory1);

		//
		// -- AbstractFactory2
		//
		AbstractFactory factory2 = FactoryMaker.getFactory(2);
		useFactory(factory2);
	}
	
	private static void useFactory(AbstractFactory af){
		AbstractProductA productA = af.createProductA();
		AbstractProductB productB = af.createProductB();
		productA.operationA1();
		productB.operationB1();
	}
}
