package eu.rtakacs.chain;

public class MultipleNumbers implements Chain {
	
	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.calculationWanted.equals("mult")){
			System.out.println( request.number1 + " * " + request.number2 + " = " + (request.number1*request.number2) );
		} else{
			nextChain.calculate(request);
		}
	}

}
