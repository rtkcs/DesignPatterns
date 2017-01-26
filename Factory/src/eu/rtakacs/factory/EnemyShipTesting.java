package eu.rtakacs.factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShip ship = null;
		
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.println("What type of ship? ([U]fo / [B]igUfo / [R]ocket)");
		
		if(userInput.hasNextLine()){
			switch( userInput.nextLine() ){
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
				
			}
			doStuff(ship);
		}
	}
	
	public static void doStuff(EnemyShip ship){
		ship.displayEnemyShip();
		ship.followHeroShip();
		ship.enemyShipShoots();
	}
}
