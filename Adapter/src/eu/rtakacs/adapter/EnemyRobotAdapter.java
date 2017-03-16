package eu.rtakacs.adapter;

public class EnemyRobotAdapter implements EnemyAtacker {
	
	EnemyRobot robot = null;
	
	public EnemyRobotAdapter(EnemyRobot robot){
		this.robot = robot;
	}
	
	@Override
	public void fireWeapon() {
		robot.samshWithHands();
	}

	@Override
	public void driveForward() {
		robot.walkForward();
	}

	@Override
	public void assignDriver(String driverName) {
		robot.reactToHuman(driverName);
	}

}
