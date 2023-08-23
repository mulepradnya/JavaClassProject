package Abstraction;

public class InterfaceChildClass implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceChildClass object = new InterfaceChildClass();
		object.method();
		object.method1();
		object.method2();
		object.method3();

	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("I am method");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("I am method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("I am method2");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("I am method3");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}

}
