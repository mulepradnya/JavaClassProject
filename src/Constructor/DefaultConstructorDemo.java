package Constructor;

public class DefaultConstructorDemo {
	
	//if you not mention any constructor then it is default constructor
	// Compiler will call default constructor
	
	int a;
	String name;
	boolean result; // instance variable
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultConstructorDemo obj = new DefaultConstructorDemo ();
		System.out.println(obj.a);
		System.out.println(obj.name);
		System.out.println(obj.result); //local variable

	}

}
