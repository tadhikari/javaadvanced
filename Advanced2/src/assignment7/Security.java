package assignment7;

import assignment7.Customer;
import assignment7.Account;
import assignment7.UnAuthorizedWithdrawTransactionException;

public class Security {
	
	public void authorization(Account account, Customer customer) throws UnAuthorizedWithdrawTransactionException {
		
		if(account.getCustomer().getCustomerId()!=customer.getCustomerId()) {
			throw new UnAuthorizedWithdrawTransactionException();
		}
	}

}