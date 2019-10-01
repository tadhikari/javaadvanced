package advaced2.assignment4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import advaced2.assignment4.CustomerDB;
import advaced2.assignment4.Customer;
import advaced2.assignment4.Login;

public class WellsBank {
	
	private static final CustomerDB customerDB = new CustomerDB();
	private static final Login login = new Login();
	public static void printCustomerList(List<Customer> customerList) {
		Iterator<Customer> custIterator = customerList.iterator();
		System.out.println("         Customer Details");
		System.out.println("***********************");
		System.out.println("cust Id\tcustomer Name\tLoan"+"Availed");
		while(custIterator.hasNext()) {
			Customer customer = custIterator.next();
			System.out.print(customer.getCustomerId()+"\t");
			System.out.print(customer.getCustomerName()+"\t"+"\t\t");
			String displayString = "No";
			if(customer.isLoanAvailed()) {
				displayString = "Yes";
			}
			System.out.println(displayString);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust1 = new Customer(1001,"Tan",false);
		customerDB.saveCustomer(cust1);
		login.addLogin(1001, "Wells123");
		
		Customer cust2 = new Customer(1002,"John",true);
		customerDB.saveCustomer(cust2);
		login.addLogin(1002, "Wells123");
		
		Customer cust3 = new Customer(1003,"Sam",true);
		customerDB.saveCustomer(cust3);
		login.addLogin(1003, "Mys@123");
		
		Customer cust4 = new Customer(1004,"Raj",false);
		customerDB.saveCustomer(cust4);
		login.addLogin(1001, "Wells123");

		List<Customer> customerList = customerDB.getAllCustomers();
		if(customerList.isEmpty()) {
			System.out.println("No Customer in the bank");
		}
		else {
			printCustomerList(customerList);
		}
		Set<Integer> loanAvailedCustomers = customerDB.getLoanAvailedcustomers();
		System.out.println("Customers who have availed the loan ");
		System.out.println("*****************");
		for(int custId:loanAvailedCustomers) {
			System.out.println(custId);
		}
	}

}
