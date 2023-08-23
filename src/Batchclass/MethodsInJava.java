package Batchclass;

public class MethodsInJava {
	//Method Creation
	//Method Calling
	
	//Non Static method
	void addition () {
		System.out.println("I am in Addition Method");
	}
	
	//Static method
	static void addition1 () {
		System.out.println("I am in Static Addition Method");
	}
	
	//Parameterised method
	void addition (int a, int b) {
		System.out.println("I am in Parameters Addition Method: "+a+b);
	}
	
	//Return type
	int addition1 (int a, int b) {
		int c = 0;
		c=a+b;
		return c;
	}
	
	boolean addition3 () {
		System.out.println("My addition is done...");
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsInJava object = new MethodsInJava () ;
		MethodsInJava object1 = new MethodsInJava () ;
		object.addition();
		object1.addition (3, 76);
		addition1();
		object.addition(7, 2);
		System.out.println(object.addition1(10, 20));
		object.addition3();
		
	}

}
