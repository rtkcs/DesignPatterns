package eu.rtakacs.abstractfactory;

import eu.rtakacs.abstractfactory.ship.EnemyShip;

public class EnemyShipTesting {
	public static void main(String[] args){
		EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();
		EnemyShip grunt = makeUFOs.orderTheShip("UFO");
		System.out.println(grunt);
		EnemyShip boss = makeUFOs.orderTheShip("UFO BOSS");
		System.out.println(boss);
	}
}
