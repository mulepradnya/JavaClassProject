package AccessModifier;

public class TestDemo2 extends TestDemo1{
	
	private void method1 () {
		System.out.println("Hello method1");
	}
	
	protected void method2 () {
		System.out.println("Hello method2");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestDemo2 object = new TestDemo2 ();
		object.method();
		object.method1();
		object.methodA();
		object.methodB();
		object.methodD();
		object.methodE();
		
		System.out.println(TestDemo1.name);
	}

}
