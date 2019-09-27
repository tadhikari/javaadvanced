package d2assignment17;

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
/*********************************************************/
abstract class Account{
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
	public abstract void withdraw(double amount);
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
public class WellsBank {
	public static void transaction(Account account, double amount) {
		account.deposit(amount);
		account.withdraw(100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer john = new Customer(12,"John Mack","Beaumont, Texas",1234);
		SavingAccount johnSA = new SavingAccount(101,john,1000);
		transaction(johnSA,1000);
		System.out.println(johnSA.balanceEnquiry());
		johnSA.withdraw(1600);
		System.out.println(johnSA.balanceEnquiry());
		Customer jenny = new Customer(34,"Jenney","Texas",546);
		CurrentAccount jennyCurrent = new CurrentAccount(201,jenny,500,2000);
		transaction(jennyCurrent,1500);
		System.out.println(jennyCurrent.balanceEnquiry());
		jennyCurrent.withdraw(1000);
		System.out.println(jennyCurrent.balanceEnquiry());
		jennyCurrent.withdraw(4000);
		System.out.println(jennyCurrent.balanceEnquiry());
		jennyCurrent.withdraw(3000);
		System.out.println(jennyCurrent.balanceEnquiry());
	}
}