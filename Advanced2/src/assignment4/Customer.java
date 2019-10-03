package assignment4;

public class Customer {
	
	private int customerId;
	
	private String customerName;
	
	private boolean loanAvailed;
	
	public Customer(int customerId, String customerName, boolean loanAvailed) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.loanAvailed = loanAvailed;
	}
	
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId() {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomername(String customerName) {
		this.customerName = customerName;
	}
	
	public boolean isLoanAvailed() {
		return loanAvailed;
	}
	
	public void setLoanAvailed(boolean loanAvailed) {
		this.loanAvailed = loanAvailed;
	}
}
