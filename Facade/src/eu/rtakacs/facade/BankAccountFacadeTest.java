package eu.rtakacs.facade;

public class BankAccountFacadeTest {

	public static void main(String[] args) {
		BankAccountFacade bankFacade = new BankAccountFacade(12345678, 1234);
		bankFacade.withdrawCash(50.00);
		bankFacade.withdrawCash(990.0);
		bankFacade.depositCash(110.0);
	}

}
