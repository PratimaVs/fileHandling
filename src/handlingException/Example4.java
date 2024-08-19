package handlingException;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program started");
		
		try {
			int x = 10/0;
			System.out.println("Division result is :" + x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something went wrong!! " + e.getMessage());
		}
		finally {
		System.out.println("This is finally block.");
		}
	}

}
