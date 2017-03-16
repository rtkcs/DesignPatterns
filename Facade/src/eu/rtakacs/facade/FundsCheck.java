package eu.rtakacs.facade;

public class FundsCheck {
	private double cashInAccount = 1000.0;

	public double getCashInAccount() {
		return cashInAccount;
	}

	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}

	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
	}

	public boolean haveEnoughMoney(double cashToWithdrawal) {
		if (cashToWithdrawal > getCashInAccount()) {
			System.out.println("Error: You do not have enough money");
			System.out.println("Current Balance: " + getCashInAccount());
			return false;
		} else {
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("Withdrawal complete, current balance is: " + getCashInAccount());
			return true;
		}
	}

	public void makeDeposit(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit complete, current balanse is: " + getCashInAccount());
	}
}
