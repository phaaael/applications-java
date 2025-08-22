package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.println("Enter account number");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter account holder:");
		String accountHolder = sc.next();
		
		System.out.println("Is there na initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();

			account = new Account(accountNumber, accountHolder, initialDeposit);
		} else {
			account = new Account(accountNumber, accountHolder);
		}
		
		System.out.println("Account data:");
		System.out.printf("Account " 
							+ account.getAccountNumber()
							+ ", Holder: " 
							+ account.getAccountHolder()
							+ ", Balance: $ "
							+ String.format("%.2f", account.getBalance())
		);
		
		System.out.println("\nEnter a deposit value:");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
				
		System.out.printf("Account " 
							+ account.getAccountNumber()
							+ ", Holder: " 
							+ account.getAccountHolder()
							+ ", Balance: $ "
							+ String.format("%.2f", account.getBalance())
		);
		
		System.out.println("\nEnter a withdraw value:");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
				
		System.out.printf("Account " 
							+ account.getAccountNumber()
							+ ", Holder: " 
							+ account.getAccountHolder()
							+ ", Balance: $ "
							+ String.format("%.2f", account.getBalance())
		);
		
		sc.close();
	}

}
