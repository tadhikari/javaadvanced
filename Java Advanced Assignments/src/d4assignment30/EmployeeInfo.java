package d4assignment30;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		List list = new ArrayList();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Object element  = itr.next();
			System.out.println(element+" ");
		}
	}

}