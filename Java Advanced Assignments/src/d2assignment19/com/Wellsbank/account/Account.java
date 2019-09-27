package d2assignment19.com.Wellsbank.account;

import d2assignment19.com.Wellsbank.customer.Customer;

public class Account{
	private int accontNo;
	private Customer customer;
	protected double balance;
	public Account() {
		System.out.println("From the Account constructor 1");
	}
	public Account(int accountNo, Customer customer, double balance) {
		
		this.accontNo = accountNo;
		this.customer = customer;
		this.balance = balance;
		System.out.println("From the Account constructor 2");
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public double balanceEnquiry() {
		return this.balance;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
}