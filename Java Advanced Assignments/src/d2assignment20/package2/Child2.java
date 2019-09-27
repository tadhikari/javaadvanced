package d2assignment20.package2;

import d2assignment20.package1.Base;

public class Child2 extends Base{

	public void getValues() {
		Base base = new Base();
		System.out.println(variable3);
		System.out.println(base.variable3);   // IMPORTANT
		System.out.println(variable4);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 child2 = new Child2();
		child2.getValues();

	}

}