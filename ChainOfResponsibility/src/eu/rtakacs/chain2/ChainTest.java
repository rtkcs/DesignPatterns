package eu.rtakacs.chain2;

public class ChainTest {

	public static void main(String[] args) {
		Chain chainAdd = new AddNumbers();
		Chain chainSub = new SubtractNumbers();
		Chain chainMult = new MultipleNumbers();
		Chain chainDiv = new DivideNumbers();
		
		chainAdd.setNextChain(chainSub);
		chainSub.setNextChain(chainMult);
		chainMult.setNextChain(chainDiv);
		
		Numbers numbers = new Numbers(10, 5, Calculation.Add);
		chainAdd.calculate(numbers);
		
		numbers = new Numbers(10, 5, Calculation.Subtract);
		chainAdd.calculate(numbers);
		
		numbers = new Numbers(10, 5, Calculation.Multiple);
		chainAdd.calculate(numbers);
		
		numbers = new Numbers(10, 5, Calculation.Divide);
		chainAdd.calculate(numbers);
	}

}
