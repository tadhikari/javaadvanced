package d2assignment19.com.Wellsbank.account;

import d2assignment19.com.Wellsbank.customer.Customer;

public class CurrentAccount extends Account{
	private double currentAmount;
	private double eligibilityAmount;
	public CurrentAccount() {
		super();
	}
	public CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount){
		super(accountNo,customer,balance);
		this.currentAmount = currentAmount;
	}
	public void withdraw(double amount) {
		if((balance-amount)>=-currentAmount) {
			balance -= amount;
			System.out.println(amount+" has been withdrawn");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	public double getEligiblityAmount() {
		return this.eligibilityAmount;
	}
	public double balanceEnquiry() {
		return balance+currentAmount;
	}
}