package advaced2.assignment7;

import advaced2.assignment7.Account;

public class DepositTransaction extends Thread {
	
	private int transactionId;
	private Account account;
	private double amount;
	private int customerId;
	
	public DepositTransaction(int transactionId, Account account, double amount, int customerId) {
		this.transactionId = transactionId;
		this.account = account;
		this.amount = amount;
		this.customerId = customerId;
	}
	public void deposit(Account account, double amount) {
		//synchronized(account) {
			account.setBalance((account.getBalance()+amount));
		//}
		
	}
	public void run() {
		synchronized(this.account) {
			deposit(account,amount);
			
			System.out.println(transactionId+" transaction "+"completed!!!"+customerId+" thank you for "
					+"depositing to the Account "+account.getAccountNo());

		}		
	}

}
