package ExceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 0;
			int b = 10;
			int c = a/b;
			System.out.println(c);
			
			int i [] = {10, 20, 30};
			System.out.println(i[5]);
		}
		
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Please provide correct index");
		}
		
		catch (ArithmeticException b) {
			System.out.println("Can not devide 0");
		}
		
		//If we don't know which type of exception is then this Exception parent Class use
		//Exception is parent class handle each type of exception.
		catch (Exception k) {
			System.out.println("Something went wrong");
		}
		
		
	
		System.out.println("Hello World");
				
		

	}

}
