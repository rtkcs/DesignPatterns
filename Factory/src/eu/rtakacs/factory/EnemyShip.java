package eu.rtakacs.factory;

public abstract class EnemyShip {
	
	protected String name;
	protected double amtDamage;
	
	public void followHeroShip(){
		System.out.println( getName() + " is following the hero");
	}
	public void displayEnemyShip(){
		System.out.println(getName() + " is of the screen");
	}
	public void enemyShipShoots(){
		System.out.println(getName() + " attacks and does " + getDamage());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return amtDamage;
	}
	public void setDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
}
