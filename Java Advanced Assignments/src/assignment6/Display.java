package assignment6;

class Account{
	protected String userName;
	protected String emailId;
	protected String accountType;
	protected String birthDate;
	protected char gender;
	protected char maritalStatus;
	protected static int customerId=0;
	protected static int accountNumber=1000;
	public Account() {
		customerId++;
		accountNumber++;
	}
	public Account(String userName, String emailId, String accountType, String birthDate, char gender,char maritalStatus) { 
		this();
		this.userName = userName;
		this.emailId = emailId;
		this.accountType = accountType;
		this.birthDate = birthDate;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	public int getCustomerId() {
		return this.customerId;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
}
class SalaryAccount extends Account{

	private boolean chqueBook = false;
	private boolean shoppingWithDebit = false;
	private boolean atmCard = true;
	
	public SalaryAccount(String userName, String emailId, String accountType, String birthDate, char gender,char maritalStatus) {
		super(userName, emailId, accountType, birthDate, gender,maritalStatus);
	}
}
class NonSalaryAccount extends Account{
	private boolean chqueBook = false;
	private boolean shoppingWithDebit = false;
	private boolean atmCard = true;
	private int minBalance = 10000;
	public NonSalaryAccount(String userName, String emailId, String accountType, String birthDate, char gender,char maritalStatus) {
		super(userName, emailId, accountType, birthDate, gender,maritalStatus);
	}
}

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryAccount salary = new SalaryAccount("Paul J Anderson","Paul@wellsfargo.com","Salary","3rd Jan,1985",'M','M');
		System.out.println(salary.getAccountNumber());
		System.out.println(salary.getCustomerId());
		
		NonSalaryAccount nonsalary = new NonSalaryAccount("John Jacob","John@wellsfargo.com","Non Salary","6th March,1985",'M','M');
		System.out.println(nonsalary.getAccountNumber());
		System.out.println(nonsalary.getCustomerId());


	}

}