package eu.rtakacs.adapter;

public class EnemyAtackerTest {
	public static void main(String[] args){
		EnemyTank tank = new EnemyTank();
		EnemyRobot robot = new EnemyRobot();
		EnemyAtacker robotAdapter = new EnemyRobotAdapter(robot);
		
		System.out.println("------------ The Robot ------------");
		robot.reactToHuman("Joe");
		robot.walkForward();
		robot.samshWithHands();
		System.out.println();
		
		System.out.println("------------ The Tank ------------");
		tank.assignDriver("Jane");
		tank.driveForward();
		tank.fireWeapon();
		System.out.println();
		
		System.out.println("------------ The Robot with Adapter ------------");
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}
}
