package eu.rtakacs.abstractfactory.ship;

import eu.rtakacs.abstractfactory.engine.ESEngine;
import eu.rtakacs.abstractfactory.weapon.ESWeapon;

public abstract class EnemyShip {
	
	private String name;
	public ESWeapon weapon;
	public ESEngine engine;
	
	public abstract void makeShip();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void followHeroShip(){
		System.out.println(getName() + " is following the hero at " + engine);
	}
	public void displayEnemyShip(){
		System.out.println(getName() + " is on the screen");
	}
	public void enemyShipShoots(){
		System.out.println(getName() + " attacks and does " + weapon);
	}
	public String toString(){
		return "The " + name + " has top speed of " + engine + " and an attack power of " + weapon;
	}
	
}
