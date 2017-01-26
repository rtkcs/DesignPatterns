package eu.rtakacs.factory;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String newShipType){
			
		EnemyShip ship = null;
		switch( newShipType ){
		case "U":
			ship = new UFOEnemyShip();
			break;
		case "B":
			ship = new BigUFOEnemyship();
			break;
		case "R":
			ship = new RocketEnemyShip();
			break;
		default:
			System.out.println("Only U, B, R can be used.");
//			throw new IllegalArgumentException("Only U, B, R can be used.");
			
		}
		return ship;
	}
}
