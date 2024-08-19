package handlingException;

public class Example1 {
	
	int x = -9;
	 public void m1()
	 {
		 System.out.println("value of x is: "+x);
	 }

	public static void main(String[] args) {

		Example1 obj = new Example1();
		obj.m1();
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		

	}

}
