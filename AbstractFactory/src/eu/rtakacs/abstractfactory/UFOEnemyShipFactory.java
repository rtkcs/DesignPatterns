package eu.rtakacs.abstractfactory;

import eu.rtakacs.abstractfactory.engine.ESEngine;
import eu.rtakacs.abstractfactory.engine.ESUFOEngine;
import eu.rtakacs.abstractfactory.weapon.ESUFOGun;
import eu.rtakacs.abstractfactory.weapon.ESWeapon;

public class UFOEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESUFOGun();
	}

	@Override
	public ESEngine addESEngine() {
		return new ESUFOEngine();
	}

}
