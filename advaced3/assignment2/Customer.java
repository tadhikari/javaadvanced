package advaced3.assignment2;

import java.io.Serializable;

public class Customer implements Serializable {
	private int customerId;
	private String customerName;
	private boolean loanAvailed;
	public Customer() {
		
	}
	public Customer(int customerId, String customerName, boolean loanAvailed) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.loanAvailed = loanAvailed;
	}
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public String Customer() {
		return "Customer Name = "+customerName+" Customer Id "+customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public boolean isLoanAvailed() {
		return loanAvailed;
	}
	public void setLoanAvailed(boolean loanAvailed) {
		this.loanAvailed = loanAvailed;
	}
	

}
