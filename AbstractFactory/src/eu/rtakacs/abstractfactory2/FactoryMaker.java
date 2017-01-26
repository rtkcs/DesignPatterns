package eu.rtakacs.abstractfactory2;

public class FactoryMaker {
	private static AbstractFactory af = null;
	
	static AbstractFactory getFactory(int choice){
		switch(choice){
		case 1:
			af = new ConcreteFactory1();
			break;
		case 2:
			af = new ConcreteFactory2();
			break;
		}
		
		return af;
	}
}
