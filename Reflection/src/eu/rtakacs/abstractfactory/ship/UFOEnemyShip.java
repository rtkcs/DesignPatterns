package eu.rtakacs.abstractfactory.ship;

public class UFOEnemyShip extends EnemyShip {
	
	private String idCode = "100";
	
	private String getPrivateString(){return "How did you get this?";}
	
	private String getOtherPrivateString(int i, String s){
		return "Return another " + i + " " + s;
	}
	
	public UFOEnemyShip(int number, String randString){
		System.out.println("You sent: " + number + " " +randString);
		getPrivateString();
		getOtherPrivateString(10, "string from constructor");
	}
	
	@Override
	public void makeShip() {
		System.out.println("Making enemy ship " + getName());
	}

}
