package d2assignment19.com.Wellsbank.account;

import d2assignment19.com.Wellsbank.customer.Customer;

public class SavingAccount extends Account{
	private double minimumBalance = 500;
	private int interestRate = 12;
	
	public SavingAccount() {
		super();
		System.out.println("From the Saving Account constructor 1 ");
	}
	public SavingAccount(int accountNo, Customer customer, double balance) {
		super(accountNo,customer,balance);
		System.out.println("From the Saving Account constructor 2 ");
	}
	public void withdraw(double amount) {
		if(this.balance>=amount+minimumBalance) {
			this.balance-=amount;
			System.out.println("Please take your $"+amount);
		}
		else {
			System.out.println("Balance is not sufficient to withdraw "+amount);
		}
	}
	public double calculateInterest() {
		return this.balance*interestRate/100;
	}
}