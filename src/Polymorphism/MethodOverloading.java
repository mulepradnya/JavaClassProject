package Polymorphism;

public class MethodOverloading {
	static int a=50;
	static int b=100;
	
	void addition (int x, int y) {
		int sum = 0;
		sum = x+y;
		System.out.println("Sum of numbers void 2 x+y: "+sum);
		sum = a+b;
		System.out.println("Sum of numbers void 2 a+b: "+sum);
	}
	
	void addition (int x, int y, int z) {
		int sum = 0;
		sum = x+y;
		System.out.println("Sum of numbers Void 3 x+y: "+sum);
		sum = a+b;
		System.out.println("Sum of numbers void 3 a+b: "+sum);
	}
		
	static void addition (double c, int d) {
		double sum = 0;
		sum = c+d;
		System.out.println("Sum of numbers static d i c+d: "+sum);
		sum = a+b;
		System.out.println("Sum of numbers static d i a+b: "+sum);
	}
	
	void addition (int c, double d) {
		double sum = 0;
		sum = c+d;
		System.out.println("Sum of numbers void i d c+d: "+sum);
		sum = a+b;
		System.out.println("Sum of numbers void i d a+b: "+sum);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading object = new MethodOverloading ();
		object.addition(a, b);
		addition (5.5,b);
		object.addition(5, 4.0);
		
	}

}
