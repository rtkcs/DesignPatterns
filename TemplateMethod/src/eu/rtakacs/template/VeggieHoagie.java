package eu.rtakacs.template;

public class VeggieHoagie extends Hoagie {
	
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };
	{
		super.customerWantsMeat = false;
		super.customerWantsCheese = false;
	}

	@Override
	void addMeat() { }

	@Override
	void addCheese() { }

	@Override
	void addVegetables() {
		System.out.print("Adding the Vegetables: ");
		for(String vegetable : veggiesUsed)
			System.out.print(vegetable + " ");
		
		System.out.println();
	}

	@Override
	void addCondiments() {
		System.out.print("Adding the Condiments: ");
		for(String condiment: condimentsUsed)
			System.out.print(condiment + " ");
		
		System.out.println();
	}



}
