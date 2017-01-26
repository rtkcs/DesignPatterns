package eu.rtakacs.abstractfactory.building;

import eu.rtakacs.abstractfactory.ship.EnemyShip;

public abstract class EneymyShipBuilding {

	protected abstract EnemyShip makeEnemyShip(String typeOfShip);
	
	public EnemyShip orderTheShip(String typeOfShip){
		EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
		
		theEnemyShip.makeShip();
		theEnemyShip.displayEnemyShip();
		theEnemyShip.followHeroShip();
		theEnemyShip.enemyShipShoots();
		
		return theEnemyShip;
	}
}
