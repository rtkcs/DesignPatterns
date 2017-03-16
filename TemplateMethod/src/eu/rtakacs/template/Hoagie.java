package eu.rtakacs.template;

public abstract class Hoagie {
	
	boolean afterFirstCondiment = false;
	protected boolean customerWantsMeat = true;
	protected boolean customerWantsCheese = true;
	protected boolean customerWantsVegetables = true;
	protected boolean customerWantsCondiments = true;
	
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();
	
	public void cutBun(){
		System.out.println("The Hoagie is cut");
	}
	public void wrapTheHoagie(){
		System.out.println("Wrap the Hoagie");
	}
	public void afterFirstCondiment(){
		System.out.println("");
	}
	final void makeSandwich(){
		cutBun();
		
		if(this.customerWantsMeat){
			addMeat();
			afterFirstCondiment = true;
		}
		if(this.customerWantsCheese){
			addCheese();
			afterFirstCondiment = true;
		}
		if(this.customerWantsVegetables){
			addVegetables();
			afterFirstCondiment = true;
		}
		if(this.customerWantsCondiments){
			addCondiments();
			afterFirstCondiment = true;
		}
		wrapTheHoagie();
	}
	
}
