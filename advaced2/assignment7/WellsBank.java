package advaced2.assignment7;
import advaced2.assignment7.Account;
import advaced2.assignment7.Customer;
import advaced2.assignment7.DepositTransaction;
import advaced2.assignment7.WithdrawTransaction;

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
			
//			WithdrawTransaction firstWithdrawTransaction = new WithdrawTransaction(9003,secondAccount,secondCustomer,50);
//			Thread firstWithdrawal = new Thread(firstWithdrawTransaction);
//			firstWithdrawal.start();

		}
		/******************************************************************/
		
		/*
		 * Customer thirdCustomer = new Customer(1001,"Raj");
		 * 
		 * Customer forthCustomer = new Customer(1002,"Narayan");
		 * 
		 * DepositTransaction thirdDeposit = new
		 * DepositTransaction(9001,secondAccount,1000,400); thirdDeposit.start();
		 * 
		 * DepositTransaction forthDeposit = new
		 * DepositTransaction(9002,firstAccount,2000,700); forthDeposit.start();
		 * 
		 * WithdrawTransaction thirdWithdrawTransaction = new
		 * WithdrawTransaction(9004,secondAccount,secondCustomer,300); Thread
		 * thirdWithdraw = new Thread(thirdWithdrawTransaction); thirdWithdraw.start();
		 * 
		 * WithdrawTransaction forthWithdrawTransaction = new
		 * WithdrawTransaction(9003,firstAccount,firstCustomer,200); Thread
		 * forthWithdrawal = new Thread(forthWithdrawTransaction);
		 * forthWithdrawal.start();
		 * 
		 * //TimeUnit.SECONDS.sleep(2);
		 * 
		 * System.out.println("Balance at Account 1 is "+firstAccount.getBalance()); ///
		 * 26300
		 */	//	S
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Balance at Account 2 is "+secondAccount.getBalance());   //23200
	}

}
