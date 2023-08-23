package ExceptionHandling;

public class TryCatchandFinally {
	
	public void finalize () {
		System.out.println("Called the finalize() method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TryCatchandFinally obj = new TryCatchandFinally ();
		obj=null;
		
		int a [] = {10, 20, 30};
		try {
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter correct index... ");
		}
		finally {
			System.out.println("Hello");
		}
		
		//finalize method
		System.gc();
		
		
		}

}
