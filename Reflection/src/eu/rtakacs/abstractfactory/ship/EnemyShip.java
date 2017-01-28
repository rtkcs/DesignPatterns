package eu.rtakacs.abstractfactory.ship;

public abstract class EnemyShip {
	
	private String name;
//	public ESWeapon weapon;
//	public ESEngine engine;
	
	public abstract void makeShip();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void followHeroShip(){
		System.out.println(getName() + " is following the hero");
	}
	public void displayEnemyShip(){
		System.out.println(getName() + " is on the screen");
	}
	public void enemyShipShoots(){
		System.out.println(getName() + " attacks");
	}
	public String toString(){
		return "The ship has a name " + name;
	}
	
}
