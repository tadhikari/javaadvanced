package advaced2.assignment6;
import advaced2.assignment6.Account;
import advaced2.assignment6.Customer;
import advaced2.assignment6.InsufficientBalanceException;
import advaced2.assignment6.UnAuthorizedWithdrawTransactionException;
import advaced2.assignment6.Security;

public class WithdrawTransaction extends Security implements Runnable{
	
	private int transactionId;
	private Account account;
	private Customer customer;
	private double amount;
	
	public WithdrawTransaction(int transactionId, Account account, Customer customer, double amount) {
		this.transactionId = transactionId;
		this.account = account;
		this.customer = customer;
		this.amount = amount;
	}
	public double withdraw(Account account, double amount) throws InsufficientBalanceException{
		if(account.getBalance()>=amount) {
			account.setBalance(account.getBalance()-amount);
		}
		else {
			throw new InsufficientBalanceException();
		}
		return account.getBalance();
	}
	public void run() {
		try {
			authorization(account,customer);
			double balance = withdraw(account,amount);
			System.out.println(transactionId+" transaction"+"completed!!! and the balance amount is "+balance);
		}catch(UnAuthorizedWithdrawTransactionException unAuthorizedWithdrawTransactionException) {
			System.out.println(transactionId+" transaction failed!!"+unAuthorizedWithdrawTransactionException.getMessage());
		}catch(InsufficientBalanceException insufficientBalanceException) {
			System.out.println(transactionId+" transaction failed!!! and your account has insufficient "+"balance");
		}
	}
	
}
