package assignment10;

class EmployeeGrade {
	private int employeeNo;
	private String employeeName;
	private float customer1Feedback;
	private float customer2Feedback;
	private float customer3Feedback;
	private float averageFeedback;
	private char grade;
	
	public EmployeeGrade(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback,
			float customer3Feedback) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.customer1Feedback = customer1Feedback;
		this.customer2Feedback = customer2Feedback;
		this.customer3Feedback = customer3Feedback;
	}

	public void calculateAverageGeedback() {
		 this.averageFeedback =(float)(customer1Feedback+customer2Feedback+customer3Feedback)/3.0f;
	}
	public void calculateGrade() {
		if(this.averageFeedback>3.6) {
			this.grade = 'A';
		}
		else if(this.averageFeedback>3.0){
			this.grade = 'B';
		}
		else {
			this.grade = 'C';
		}
	}
	public void dispaly() {
		System.out.println("Employee details are: ");
		System.out.println("Employee No : "+this.employeeNo);
		System.out.println("Employee name : "+this.employeeName);
		System.out.println("Employee average feedback : "+this.averageFeedback);
		System.out.println("Employee Grade : "+this.grade);
	}
}


public class Wells {

	public static void main(String[] args) {
		//EmployeeGrade def = new EmployeeGrade();
		EmployeeGrade elvis = new EmployeeGrade(12, "Elvis", 3.0f, 2.4f, 3.9f);
		elvis.calculateAverageGeedback();
		elvis.calculateGrade();
		elvis.dispaly();

	}

}