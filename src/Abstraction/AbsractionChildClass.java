package Abstraction;

public class AbsractionChildClass extends Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsractionChildClass object = new AbsractionChildClass();
		object.method();
		object.method2();
		
		
	}

	@Override
	void method2() {
		System.out.println("I am method 2");
		
	}

}
