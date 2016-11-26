package eu.rtakacs.strategy.duck;

public abstract class DuckCall {
	
	protected QuackBehavior quackBehavior;
	
	public void setQuackBehavior(QuackBehavior qb){
		this.quackBehavior = qb;
	}
	public void performQuack(){
		this.quackBehavior.quack();
	}
}
