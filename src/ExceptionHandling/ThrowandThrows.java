package ExceptionHandling;

public class ThrowandThrows {
	
	//JVM - Default Exception Handler
	public void squareCalculation (int num) {
		if (num<1) {
			throw new ArithmeticException ("Can not calculate square for zero or -ve number");
		}
		else {
			System.out.println("Square of "+ num + " is " + (num*num));
		}
		
		int a =5;
		int b =a/num;
	}
	
	public void method () {
		squareCalculation (0);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*The throw and throws is the concept of exception handling
		 where the throw keyword the exception explicitly from a method
		 or a block of code whereas the throws keyword is used in signature of the method.*/
		
		ThrowandThrows object = new ThrowandThrows ();
		object.squareCalculation(0);
		
		
		
		
		
	}

}
