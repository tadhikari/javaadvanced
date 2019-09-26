package assignment11;

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
		System.out.println("Employee details of "+this.employeeName+" are: ");
		System.out.println("Employee No : "+this.employeeNo);
		System.out.println("Employee name : "+this.employeeName);
		System.out.println("Employee average feedback : "+this.averageFeedback);
		System.out.println("Employee Grade : "+this.grade);
	}
}


public class Wells {

	public static void main(String[] args) {
		EmployeeGrade [] employee = new EmployeeGrade[5];
		EmployeeGrade emp1 = new EmployeeGrade(1, "Elvis", 2.0f, 2.4f, 3.9f);
		EmployeeGrade emp2 = new EmployeeGrade(2, "Harry", 3.0f, 3.4f, 2.9f);
		EmployeeGrade emp3 = new EmployeeGrade(3, "Rahil", 3.5f, 1.4f, 3.0f);
		EmployeeGrade emp4 = new EmployeeGrade(4, "James", 3.0f, 2.4f, 3.9f);
		EmployeeGrade emp5 = new EmployeeGrade(5, "Jack", 3.0f, 2.0f, 3.5f);
		employee[0]=emp1;
		employee[1]=emp2;
		employee[2]=emp3;
		employee[3]=emp4;
		employee[4]=emp5;
		for(int i = 0; i<employee.length;i++) {
			employee[i].calculateAverageGeedback();
			employee[i].calculateGrade();
			employee[i].dispaly();
			System.out.println();
		}

	}

}