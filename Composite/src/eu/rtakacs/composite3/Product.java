package eu.rtakacs.composite3;

public class Product extends Entity {

	private int value;

	public Product(int val) {
		value = val;
	}
	
	@Override
	public void traverse( int[] levels ) {
        if (printThisLevel( levels ))
            System.out.println( indent.toString() + value + " product" );
	}

}
