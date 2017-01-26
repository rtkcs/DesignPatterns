package eu.rtakacs.factory;

import java.util.Scanner;

public class EnemyShipFactoryTesting {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.println("What type of ship? ([U]fo / [B]igUfo / [R]ocket)");
		if(userInput.hasNextLine()){
		
			EnemyShipFactory factory = new EnemyShipFactory();
			EnemyShip ship = factory.makeEnemyShip(userInput.nextLine());
			doStuff(ship);
		}
	}
	
	public static void doStuff(EnemyShip ship){
		ship.displayEnemyShip();
		ship.followHeroShip();
		ship.enemyShipShoots();
	}
}
