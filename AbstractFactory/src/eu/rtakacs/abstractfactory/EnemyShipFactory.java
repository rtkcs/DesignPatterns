package eu.rtakacs.abstractfactory;

import eu.rtakacs.abstractfactory.engine.ESEngine;
import eu.rtakacs.abstractfactory.weapon.ESWeapon;

public interface EnemyShipFactory {
	public ESWeapon addESGun();
	public ESEngine addESEngine();
}
