package assignment6;

import assignment4.Customer;

public class Security {

	
	public void authorization(Account account, Customer customer) throws UnAuthorizedWithdrawTransactionException {
		
		if(account.getCustomer().getCustomerId()!=customer.getCustomerId()) {
			throw new UnAuthorizedWithdrawTransactionException();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
