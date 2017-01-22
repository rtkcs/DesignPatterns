package eu.rtakacs.builder;

public class Robot implements RobotPlan{

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	@Override
	public void setRobotHead(String head) {
		this.robotHead = head;
		System.out.println();
		
	}

	@Override
	public void setRobotTorso(String torso) {
		this.robotTorso = torso;
	}

	@Override
	public void setRobotArms(String arms) {
		this.robotArms = arms;
	}

	@Override
	public void setRobotLegs(String legs) {
		this.robotLegs = legs;
	}

	public String getRobotHead() {
		return robotHead;
	}

	public String getRobotTorso() {
		return robotTorso;
	}

	public String getRobotArms() {
		return robotArms;
	}

	public String getRobotLegs() {
		return robotLegs;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robot [robotHead=");
		builder.append(robotHead);
		builder.append(", robotTorso=");
		builder.append(robotTorso);
		builder.append(", robotArms=");
		builder.append(robotArms);
		builder.append(", robotLegs=");
		builder.append(robotLegs);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
