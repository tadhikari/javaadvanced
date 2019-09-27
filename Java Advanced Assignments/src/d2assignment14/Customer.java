package d2assignment14;


class Customer{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int pincode;
	
	public Customer() {
		System.out.println("From the Customer constructor 1");
	}
	public Customer(int customerId, String customerName,String customerAddress, int pincode) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.pincode = pincode;
		System.out.println("From the Customer constructor 2");
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
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}


class Account{
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
class SavingAccount extends Account{
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
class CurrentAccount extends Account{
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
