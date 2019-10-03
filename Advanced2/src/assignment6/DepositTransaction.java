package assignment6;

public class DepositTransaction extends Thread{

	private int transactionId;
	
	
	private Account account;
	
	private double amount;
	
	private int customerId;
	
	public DepositTransaction(int transactionId,Account account,int customerId, double amount) {
		this.transactionId = transactionId;
		this.account = account;
		this.customerId = customerId;
		this.amount = amount;
	}
	
	public void deposit(Account account, double amount) {
		account.setBalance((account.getBalance()+amount));
	}
	
	public void run() {
		
		deposit(account, amount);
		
		
		System.out.println(transactionId+" transaction "+"completed!!!"+customerId+" thank you for "+
		"depositing to the account "+account.getAccountNo());
		
	}

}



