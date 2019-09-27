package d3assignment23;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		int total = 100,count=0;
		try {
			int average = total/count;
			System.out.println(name.length());
			System.out.println("End of try block");
		}
		catch(ArithmeticException exception) {
			System.out.println("Arithmethic Exception "+exception.getMessage());
		}
		catch(NullPointerException exception) {
			System.out.println("Object is null "+exception.getMessage());
		}
		System.out.println("Continuing the execution....");
		name = "Jhon";
		System.out.println(name.length());

	}

}