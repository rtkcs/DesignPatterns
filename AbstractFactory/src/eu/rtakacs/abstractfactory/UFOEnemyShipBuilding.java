package eu.rtakacs.abstractfactory;

import eu.rtakacs.abstractfactory.ship.EnemyShip;
import eu.rtakacs.abstractfactory.ship.UFOBossEnemyShip;
import eu.rtakacs.abstractfactory.ship.UFOEnemyShip;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip theEnemyShip = null;
		EnemyShipFactory shipPartsFactory = null;
		
		switch(typeOfShip){
		case "UFO":
			shipPartsFactory = new UFOEnemyShipFactory();
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Ship");
			break;
		case "UFO BOSS":
			shipPartsFactory = new UFOBossEnemyShipFactory();
			theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Boss Ship");
			break;
		default:break;
		}
		
		return theEnemyShip;
	}

}
