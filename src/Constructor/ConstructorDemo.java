package Constructor;

public class ConstructorDemo {
	
	//It is a special type of method which is used to initialize the object.
	//constructor name should be same class name
	//it doesn't have any return type
	
	//Types
	//zero argument constructor
	//Parameterized constructor
	//Default constructor
	
	//can we overload constructor -- Yes
	//can we override constructor -- No
	
	//programmer will mention and call zero argument or parameterized constructor
	
	//public, private, protected, default
	
	int a;
	String name;
	boolean result; //default constructor

	public ConstructorDemo() { //zero argument constructor
		int a=5;
		System.out.println(a);
	}
	
	public ConstructorDemo (String name) { //Parameterized constructor
		System.out.println(name);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo object = new ConstructorDemo ();
		
		ConstructorDemo object1 = new ConstructorDemo ("Pradnya");
		
		System.out.println(object.a);
		System.out.println(object.name);
		System.out.println(object.result);
		
		
	}

}
