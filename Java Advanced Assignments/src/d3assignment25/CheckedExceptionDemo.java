package d3assignment25;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("day3.assignment25.ExceptionDemo");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Exception : "+e);
		}		
	}
}