package ExceptionHandling;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 0;
			int b = 10;
			int c = a/b;
			System.out.println(c);
			
			try {
			int i [] = {10, 20, 30};
			System.out.println(i[5]);
			}
			catch (ArrayIndexOutOfBoundsException a1) {
				System.out.println("Please provide correct index");
			}
			catch (Exception k) {
				System.out.println("Something went wrong");
			}
			
		}
		
		catch (ArithmeticException b) {
			System.out.println("Can not devide 0");
		}
		
		catch (Exception k) {
			System.out.println("Something went wrong");
		}
		
		System.out.println("Hello World");
		
		
	}

}
