package advaced2.assignment8;

import advaced2.assignment8.BankFund;
import advaced2.assignment8.LoanTransaction;

public class WellsBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFund wellsBankFund = new BankFund(90);
		Thread[] loanTran = new Thread[100];
		LoanTransaction[] loanTransactions = new LoanTransaction[100];
		for(int index = 0; index<loanTransactions.length;index++) {
			loanTransactions[index] = new LoanTransaction(wellsBankFund,(100+index),25);	
			loanTran[index] = new Thread(loanTransactions[index]);
		}
		
		for(int index = 0; index<loanTransactions.length;index++) {
			loanTran[index].start();
		}

	}

}
