package d4assignment27;

import java.util.Calendar;

public class Employee {
	int employeeId;
	String employeeName;
	Calendar dateofBirth;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Calendar getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Calendar dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

}