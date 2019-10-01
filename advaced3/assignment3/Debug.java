package advaced3.assignment3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import advaced3.assignment2.Account;
import advaced3.assignment3.Customer;
import advaced3.assignment3.SavingsAccount;

public class Debug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectOutputStream objStream = new ObjectOutputStream(new FileOutputStream("data.ser"));){
			Customer customer = new Customer(1001,"Tan");
			SavingsAccount sb1 = new SavingsAccount(9001,customer,2000,5,1000);
			objStream.writeObject(sb1);
			objStream.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try(ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("data.ser"))){
			SavingsAccount acc1 = (SavingsAccount)objIStrm.readObject();
			System.out.println("Account details are"+acc1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
