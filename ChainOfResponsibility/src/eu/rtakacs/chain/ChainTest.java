package eu.rtakacs.chain;

public class ChainTest {

	public static void main(String[] args) {
		Chain chainAdd = new AddNumbers();
		Chain chainSub = new SubtractNumbers();
		Chain chainMult = new MultipleNumbers();
		Chain chainDiv = new DivideNumbers();
		
		chainAdd.setNextChain(chainSub);
		chainSub.setNextChain(chainMult);
		chainMult.setNextChain(chainDiv);
		
		Numbers numbers = new Numbers(10, 5, "add");
		chainAdd.calculate(numbers);
		
		numbers = new Numbers(10, 5, "sub");
		chainAdd.calculate(numbers);
		
		numbers = new Numbers(10, 5, "mult");
		chainAdd.calculate(numbers);
		
		numbers = new Numbers(10, 5, "div");
		chainAdd.calculate(numbers);
	}

}
