package d4assignment28;

public class WellsBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stubo
		Customer john = new Customer();
		john.setCustomerId(101);
		john.setCustomerName("John");
		john.setCustomerAddress("Texas");
		john.setPincode(1234);
		System.out.println(john.getCustomerId());
		System.out.println(john.getCustomerName());
		System.out.println(john.getCustomerAddress());
		System.out.println(john.getPincode());

	}

}