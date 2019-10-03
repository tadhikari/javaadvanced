package assignment7;

import assignment7.Account;
import assignment7.Customer;
import assignment7.DepositTransaction;
import assignment7.WithdrawTransaction;

import java.util.concurrent.TimeUnit;

public class WellsBank {

	public static void main(String[] args) throws InterruptedException {

		Customer firstCustomer = new Customer(1001,"Raj");
		Account firstAccount = new Account(2001,firstCustomer,20000);
		
		Customer secondCustomer = new Customer(1002,"Narayan");
		Account secondAccount = new Account(2001,secondCustomer,20000);
		
		DepositTransaction firstDeposit = new DepositTransaction(9001,secondAccount,3000,4000);
		firstDeposit.start();
		
		DepositTransaction secondDeposit = new DepositTransaction(9002,firstAccount,5000,7000);
		secondDeposit.start();
		
		for(int i = 0;i<100;i++) {

			WithdrawTransaction secondWithdrawTransaction = new WithdrawTransaction(9004,secondAccount,secondCustomer,50);
			Thread secondWithdraw = new Thread(secondWithdrawTransaction);
			secondWithdraw.start();
		
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Balance at Account 2 is "+secondAccount.getBalance());   //23200
	}

}}