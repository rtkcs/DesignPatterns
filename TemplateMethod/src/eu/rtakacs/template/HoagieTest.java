package eu.rtakacs.template;

public class HoagieTest {

	public static void main(String[] args) {
		
		Hoagie italianHoagie = new ItalianHoagie();
		italianHoagie.makeSandwich();

		System.out.println();

		Hoagie veggieHoagie = new VeggieHoagie();
		veggieHoagie.makeSandwich();
	}
}
