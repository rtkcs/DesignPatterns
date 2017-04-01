package eu.rtakacs.chain2;

/**
 * The chain of responsibility pattern has a group of objects that are expected to between them be able to solve a
 * problem. 
 * If the first Object can't solve it, it passes the data to the next Object in the chain
 * 
 * 
 * @author rtakacsux
 *
 */
public interface Chain {
	/**
	 * Defines the next Object to receive the data if this Object can't process it
	 * @param nextChain
	 */
	public void setNextChain(Chain nextChain);
	
	/**
	 * Either solves the problem or passes the data to the next Object in the chain
	 * 
	 * @param request
	 */
	public void calculate(Numbers request);
}
