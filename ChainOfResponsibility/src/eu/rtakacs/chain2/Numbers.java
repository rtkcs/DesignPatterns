package eu.rtakacs.chain2;

/**
 * This object will contain 2 numbers and a calculation to perform in the form of an String
 * 
 * @author rtakacsux
 *
 */
public class Numbers {
	
	public int number1;
	public int number2;
	
	public Calculation calculation;
	
	public Numbers(int number1, int number2, Calculation calculation){
		this.number1 = number1;
		this.number2 = number2;
		this.calculation = calculation;
	}
}
