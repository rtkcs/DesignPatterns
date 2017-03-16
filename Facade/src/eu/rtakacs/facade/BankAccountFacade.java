package eu.rtakacs.facade;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;

	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;

	public BankAccountFacade(int accountNumber, int securityCode) {
		this.accountNumber = accountNumber;
		this.securityCode = securityCode;

		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public int getSecurityCode() {
		return this.securityCode;
	}

	public void withdrawCash(double cashToWithdrawal) {
		if (acctChecker.accountActive(getAccountNumber()) && codeChecker.isSecutityCodeCorrect(getSecurityCode())
				&& fundChecker.haveEnoughMoney(cashToWithdrawal)) {
			System.out.println("Transaction Complete");
			System.out.println("--------------------");
		} else {
			System.out.println("Transaction Failed");
			System.out.println("--------------------");
		}
	}

	public void depositCash(double cashToDeposit) {
		if (acctChecker.accountActive(getAccountNumber()) && codeChecker.isSecutityCodeCorrect(getSecurityCode())) {
			fundChecker.makeDeposit(cashToDeposit);
			System.out.println("Transaction Complete");
			System.out.println("--------------------");
		} else {
			System.out.println("Transaction Failed");
			System.out.println("--------------------");
		}
	}
}
