package d2assignment20.package1;

public class Child1 extends Base {
	public void getValues() {
		System.out.println(getVariable());
		System.out.println(getVariable2());
		System.out.println(variable3);
		System.out.println(variable4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 child = new Child1();
		child.getValues();

	}

}