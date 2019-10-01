package advaced2.assignment6;

import advaced2.assignment6.Customer;
import advaced2.assignment6.Account;
import advaced2.assignment6.UnAuthorizedWithdrawTransactionException;

public class Security {
	
	public void authorization(Account account, Customer customer) throws UnAuthorizedWithdrawTransactionException {
		
		if(account.getCustomer().getCustomerId()!=customer.getCustomerId()) {
			throw new UnAuthorizedWithdrawTransactionException();
		}
	}

}
