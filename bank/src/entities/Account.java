package entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double balance, rate = 5;
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		this.balance = this.balance + deposit;
	}
	
	public void withdraw(double withdraw) {
		this.balance = (this.balance - withdraw) - rate;
	}
	
}
