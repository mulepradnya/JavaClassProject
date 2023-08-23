package Polymorphism;

public class MethodOverridingStaticChild extends MethodOverridingStaticParent {
	
	static void checkbalance () {
		System.out.println("My balance is 10000");
	}
	
	static void method3 () {
		System.out.println("I am in method 3 Child class");
	}

	static void method4 () {
		System.out.println("I am in method 4 Child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the method according to the type of reference is called, not according to the object.
		
		//Child reference					Child Object
		
		checkbalance();
		method1();
		method2();
		method3();
		method4();
		
		//It is not possible to override a static method in Java,
		//as they are bound to the class and not associated with an object.
		//They cannot be overridden because they do not act on a specific instance of an object.
		
		
		

	}

}
