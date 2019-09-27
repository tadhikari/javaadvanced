package d2assignment8c;

class Loan {
	private static int loanNo=5;
	private static int loanCounter;
	private int accontNo;
	private int customerNo;
	private float loanAmount;
	private  int loanDuration;
	private float interest;
	static {
		loanCounter = 101;
	}
	private Loan() {
		loanCounter++;
		loanNo++;
	}
	private Loan(int accontNo,int customerNo,int loanDuration, float loanAmount,float interest) {
		this();
		this.accontNo = accontNo;
		this.customerNo = customerNo;
		this.loanDuration = loanDuration;
		this.loanAmount = loanAmount;
		this.interest = interest;
	}
	public static Loan getLoanInstance() {
		Loan loan = new Loan();
		return loan;
	}
	public int getNumberofObjects() {
		return loanCounter;
	}

	public int getAccontNo() {
		return accontNo;
	}

	public void setAccontNo(int accontNo) {
		this.accontNo = accontNo;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

}


public class TestLoan {

	public static void main(String[] args) {
		
		Loan loan = Loan.getLoanInstance();
		System.out.println("Number of instances : "+loan.getNumberofObjects());
	}
}