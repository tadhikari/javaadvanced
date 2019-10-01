package advaced3.assignment2;

import advaced3.assignment2.Customer;

import java.io.*;
import advaced3.assignment2.Account;
import advaced3.assignment2.CustomerFileDB;
import advaced3.assignment2.ReadData;

public class CustomerTester {
	
	public void acceptCustomerInfo() {
		System.out.println("\n\n\tPleae enter the details of the customer");
		String custId = ReadData.acceptString();
		System.out.println("Customer Name: ");
		String custName = ReadData.acceptString();
		Customer customer = new Customer();
		customer.setCustomerId(Integer.parseInt(custId));
		customer.setCustomerName(custName);
		int status = new CustomerFileDB().saveCustomer(customer);
		if(status==0) {
			System.out.println("Your details are saved");
			ReadData.acceptString();
			System.out.print("\n\n\n\n\n\n\n");
		}else {
			System.out.println("Your details could not be saved. Please try later");
			System.out.println("\n\n\n\n\n\n\n");
		}
	}
	
	public void displayCustInfo() {
		System.out.println("\n\nPlease enter customer Id:");
		String custId = ReadData.acceptString();
		Customer customer = new CustomerFileDB().getCustomer(Integer.parseInt(custId));
		if(customer!=null) {
			System.out.println("\n Customer Id "+customer.getCustomerId());
			System.out.println("Customer Name "+customer.getCustomerName());
		}else {
			System.out.println("Invalid customer Id!!!");
			ReadData.acceptString();
			System.out.println("\n\n\n\n\n\n\n");
		}
	}
	/* ****************************************************** */
	
	public void acceptSerializedAccount() {
		try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial")))
		{
			Customer customer1 = new Customer(1,"Tara");
			Account account1 = new Account(101,customer1,1000);
			objOStrm.writeObject(account1);
			Customer customer2 = new Customer(2,"Bhattatrai");
			Account account2 = new Account(102,customer2,2000);
			objOStrm.writeObject(account2);
		}catch(IOException e) {
			System.out.println("Exception durring Serialization"+e.getMessage());
		}
	}
	public void displaySerializedAccount() {
		try(ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial")))
		{
			Account acc1 = (Account)objIStrm.readObject();
			System.out.println("Account details are"+acc1);
			Account acc2 = (Account)objIStrm.readObject();
			System.out.println("Account details are "+acc2);
		}
		catch(Exception e) {
			System.out.println("Exception in deserialization "+e.getMessage());
		}
	}
	
	public void customerMenu() {
		while(true) {
			System.out.println("\tCustomer Menu ");
			System.out.println("------------------------");
			System.out.println("1. Add Customer");
			System.out.println("2. Get Customer Info");
			System.out.println("3. Add Customer to Serialized Object");
			System.out.println("4. Get Customer Info form Serialized object");
			System.out.println("5. Exit");
			System.out.println("Enter option: ");
			String optedValue = ReadData.acceptString();
			int option = Integer.parseInt(optedValue);
			
			switch(option) {
			case 1: acceptCustomerInfo();break;
			case 2: displayCustInfo();break;
			case 3: acceptSerializedAccount(); break;
			case 4: displaySerializedAccount(); break;
			case 5: System.exit(0);break;
			default:System.out.println("Enter a valid option");
					ReadData.acceptString();
			}
		}
	}

}
