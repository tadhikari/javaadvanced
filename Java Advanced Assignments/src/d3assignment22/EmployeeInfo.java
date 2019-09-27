package d3assignment22;

import java.util.Vector;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> empList = new Vector<Integer>();
		int empNo = 1000;
		for (int count = 0; count<5;count++) {
			empNo++;
			Integer emp = empNo;
			empList.add(emp);
		}
//		for(int i  = 0; i<empList.size();i++) {
//			System.out.println(empList.elementAt(i));
//		}
		for(Integer ele: empList) System.out.println(ele);
	}

}