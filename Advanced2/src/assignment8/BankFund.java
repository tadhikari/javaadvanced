/**
 * 
 */
/**
 * @author tribi
 *
 */
package assignment8;

import assignment8.InsufficientFundException;

public class BankFund {
	
	private double fund;
	public BankFund(double fund) {
		this.fund = fund;
	}
	public synchronized int checkFund(double amount) throws InsufficientFundException{
		if(fund<amount) {
			throw new InsufficientFundException("Insufficient fund");
		}
		return 0;
	}
	public synchronized double debitFund(double amount) {
		fund-=amount;
		return fund;
	}

}