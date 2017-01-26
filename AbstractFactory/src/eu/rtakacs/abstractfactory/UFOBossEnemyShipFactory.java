package eu.rtakacs.abstractfactory;

import eu.rtakacs.abstractfactory.engine.ESEngine;
import eu.rtakacs.abstractfactory.engine.ESUFOBossEngine;
import eu.rtakacs.abstractfactory.weapon.ESUFOBossGun;
import eu.rtakacs.abstractfactory.weapon.ESWeapon;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESUFOBossGun();
	}

	@Override
	public ESEngine addESEngine() {
		return new ESUFOBossEngine();
	}

}
