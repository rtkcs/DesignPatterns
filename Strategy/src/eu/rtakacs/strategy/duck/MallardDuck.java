package eu.rtakacs.strategy.duck;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I am a Mallard duck.");
	}

}
