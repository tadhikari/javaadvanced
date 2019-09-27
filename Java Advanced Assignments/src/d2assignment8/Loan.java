package d2assignment8;

public class Loan {
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
	public Loan() {
		loanCounter++;
		loanNo++;
	}
	public Loan(int accontNo,int customerNo,int loanDuration, float loanAmount,float interest) {
		this();
		this.accontNo = accontNo;
		this.customerNo = customerNo;
		this.loanDuration = loanDuration;
		this.loanAmount = loanAmount;
		this.interest = interest;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan = new Loan();
		Loan loan1 = new Loan(2,5,12,3.45f,45.34f);
		Loan loan2 = new Loan(2,5,12,3.45f,45.34f);
		Loan loan3 = new Loan(2,5,12,3.45f,45.34f);
		Loan loan4 = new Loan(2,5,12,3.45f,45.34f);
		Loan loan5 = new Loan(2,5,12,3.45f,45.34f);
		System.out.println("Number of instances : "+loanCounter);

	}

}