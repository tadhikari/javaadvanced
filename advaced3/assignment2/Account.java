package advaced3.assignment2;

import java.io.*;
import advaced3.assignment2.Customer;

public class Account implements Serializable{
	
	private int accountNo;
	private Customer customer;
	protected double balance;
	
	public Account(int accountNo, Customer customer, double balance) {
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
	}
	public Account() {}
	public String toString() {
		return "Account No="+accountNo+" Customer = "+customer+" Balance = "+balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public synchronized double getBalance() {
		return balance;
	}
	public synchronized void setBalance(double balance) {
		this.balance = balance;
	}
	
}
