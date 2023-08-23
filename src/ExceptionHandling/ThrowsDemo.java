package ExceptionHandling;

import java.io.IOException;

public class ThrowsDemo {
	
	public void method (int num) throws ArithmeticException, IOException
	{
		if (num<1) {
			System.out.println("Inside the method ()");
			throw new ArithmeticException ("throwing ArithmeticException");
		}
		else
		{
			System.out.println("Number is positive");
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ThrowsDemo object = new ThrowsDemo ();
		try {
			object.method(-1);
		}
		catch (ArithmeticException e) {
			System.out.println("caught in main() method");
		}
		

	}

}
