package entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/*public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}*/
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	/*(public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}*/ 
	
	public void accountDeposit(double value) { //Depósito
		accountBalance += value;
	}
	
	public void accountWithDrawal(double value) { //Saque
		double taxa = 5.0;
		if (value <= accountBalance) {
			accountBalance = (accountBalance - value) - taxa;
		}
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", "
				+ "Holder: "
				+ accountHolder
				+ ", "
				+ "Balance: $ "
				+ String.format("%.2f ", accountBalance);
	}
}
