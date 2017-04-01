package eu.rtakacs.chain2;

public class SubtractNumbers implements Chain {
	
	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.calculation.equals(Calculation.Subtract)){
			System.out.println( request.number1 + " - " + request.number2 + " = " + (request.number1-request.number2) );
		} else{
			nextChain.calculate(request);
		}
	}

}
