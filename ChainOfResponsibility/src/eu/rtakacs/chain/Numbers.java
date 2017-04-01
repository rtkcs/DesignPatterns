package eu.rtakacs.chain;

/**
 * This object will contain 2 numbers and a calculation to perform in the form of an String
 * 
 * @author rtakacsux
 *
 */
public class Numbers {
	
	public int number1;
	public int number2;
	
	public String calculationWanted;
	
	public Numbers(int number1, int number2, String calculation){
		this.number1 = number1;
		this.number2 = number2;
		this.calculationWanted = calculation;
	}
}
