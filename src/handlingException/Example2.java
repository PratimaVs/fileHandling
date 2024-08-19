package handlingException;

public class Example2 {

	int x = -9;
	 public void m1()
	 {
		 System.out.println("value of x is: "+x);
	 }
	public static void main(String[] args)throws InterruptedException {

		Example2 obj = new Example2();
		obj.m1();
	//	Thread.sleep(0);

	}

}
