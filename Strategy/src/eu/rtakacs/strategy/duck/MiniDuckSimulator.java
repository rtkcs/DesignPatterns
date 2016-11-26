package eu.rtakacs.strategy.duck;

public class MiniDuckSimulator {
	
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		DuckCall dCall = new DuckCallModern();
		dCall.performQuack();
		dCall.setQuackBehavior(new Squeak());
		dCall.performQuack();
		
	}

}
