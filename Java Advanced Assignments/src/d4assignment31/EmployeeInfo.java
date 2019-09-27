package d4assignment31;

import java.util.ArrayList;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> employeeId  = new ArrayList<Integer>();
		employeeId.add(1001);
		employeeId.add(1002);
		//employeeId.add("1003");
		for(int count = 0; count<employeeId.size();count++) {
			System.out.println(employeeId.get(count));
			employeeId.set(count, (int)(employeeId.get(count)));
			System.out.println(employeeId.get(count));
		}
	}

}