package advaced3.assignment3;

import advaced3.assignment3.Account;
import advaced3.assignment3.Customer;

public class SavingsAccount extends Account{
	
	private float rateofInterest;
	private double minimumBalance;
	public SavingsAccount(int accountNo, Customer customer, double balance, float rateofInterest,
			double minimumBalance) {
		super(accountNo, customer, balance);
		this.rateofInterest = rateofInterest;
		this.minimumBalance = minimumBalance;
	}
	public float getRateofInterest() {
		return rateofInterest;
	}
	public void setRateofInterest(float rateofInterest) {
		this.rateofInterest = rateofInterest;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public String toString() {
		return "Rate or interest "+rateofInterest+" minumbalance "+minimumBalance;
	}
	
	

}
