package handlingException;

public class Example3 {

	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		try {
			int x = 10/0;
			System.out.println("Division result is :" + x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something went wrong!!" + e.getMessage());
		}
		System.out.println("program end");
		

	}

}
