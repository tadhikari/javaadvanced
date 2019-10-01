package advaced2.assignment7;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("Insufficient Balance in the account");
	}

}
