package advaced2.assignment7;

import advaced2.assignment7.Customer;
import advaced2.assignment7.Account;
import advaced2.assignment7.UnAuthorizedWithdrawTransactionException;

public class Security {
	
	public void authorization(Account account, Customer customer) throws UnAuthorizedWithdrawTransactionException {
		
		if(account.getCustomer().getCustomerId()!=customer.getCustomerId()) {
			throw new UnAuthorizedWithdrawTransactionException();
		}
	}

}
