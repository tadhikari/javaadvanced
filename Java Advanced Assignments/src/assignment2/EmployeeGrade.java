package assignment2;

public class EmployeeGrade {


	public static void main(String[] args) {
		int employeeId[]= {1001,1002,1003,1004,1005};
		float customer1Feedback[]= {4.1f,3.8f,2.5f,4.9f,3.9f};
		float customer2Feedback[]= {3.1f,4.8f,2.5f,3.9f,4.1f};
		float customer3Feedback[]= {3.8f,3.48f,2.5f,4.1f,3.2f};
		float averageFeedback[]= new float[5];
		char grade[]=new char[5];
		for(int i = 0;i<customer1Feedback.length;i++) {
			averageFeedback[i]=(float) ((customer1Feedback[i]+customer2Feedback[i]+customer3Feedback[i])/3.0);
			if(averageFeedback[i]>=4.0) {
				grade[i]='A';
			}
			else if(averageFeedback[i]>3.5) {
				grade[i]='B';
			}
			else if(averageFeedback[i]>3.0) {
				grade[i]='C';
			}
			else {
				grade[i]='D';
			}
			System.out.println("Average feedback of employee number "+employeeId[i]+" is "+averageFeedback[i]+" and grade is "+grade[i]);
		}
		

	}

}
