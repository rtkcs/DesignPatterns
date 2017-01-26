package eu.rtakacs.abstractfactory;

import eu.rtakacs.abstractfactory.ship.EnemyShip;

public abstract class EnemyShipBuilding {
	
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
