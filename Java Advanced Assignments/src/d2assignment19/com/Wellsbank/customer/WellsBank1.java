package d2assignment19.com.Wellsbank.customer;

import d2assignment19.com.Wellsbank.account.SavingAccount;
import d2assignment19.com.Wellsbank.account.CurrentAccount;

public class WellsBank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer john = new Customer(12,"John Mack","Beaumont, Texas",1234);
		SavingAccount hariSA = new SavingAccount(101,john,1000);
		hariSA.deposit(1000);
		System.out.println(hariSA.balanceEnquiry());
		hariSA.withdraw(1600);
		System.out.println(hariSA.balanceEnquiry());
		Customer jenny = new Customer(34,"Jenney","Texas",546);
		CurrentAccount jennyCurrent = new CurrentAccount(201,jenny,500,2000);
		jennyCurrent.deposit(1500);
		System.out.println(jennyCurrent.balanceEnquiry());
		jennyCurrent.withdraw(1000);
		System.out.println(jennyCurrent.balanceEnquiry());
		jennyCurrent.withdraw(4000);
		System.out.println(jennyCurrent.balanceEnquiry());
		jennyCurrent.withdraw(3000);
		System.out.println(jennyCurrent.balanceEnquiry());
	}

}