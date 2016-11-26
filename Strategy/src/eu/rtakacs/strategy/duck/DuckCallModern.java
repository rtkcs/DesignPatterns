package eu.rtakacs.strategy.duck;

public class DuckCallModern extends DuckCall {
	public DuckCallModern(){
		this.quackBehavior = new Quack();
	}
}
