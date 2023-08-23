package Polymorphism;

public class MethodOverridingChild extends MethodOverridingParent {
	
	//Overrided Method
	void checkBalance () {
		System.out.println("My Balance is 10000");
	}
	
	void method2 () {
		System.out.println("I am in Method 2");
	}
	
	void method3 () {
		System.out.println("I am in Method 3 in Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method overriding = same name and same parameters and
		//different class which has inheritance relationship
		
		//Child reference					Child Object
		//All methods from parent and child class except
		//overrided method from child class
		MethodOverridingChild Object = new MethodOverridingChild() ;
		Object.checkBalance(); //due to reference of child class answer is always consider of child method
		Object.method1();
		Object.method2();
		Object.method3();
		
		//Parent reference					Parent Object
		//only parent methods we access here.
		//child class methods not able to access due to inheritance
		//All methods from parent class can be accessible
		MethodOverridingParent Object2 = new MethodOverridingParent();
		Object2.checkBalance();
		Object2.method1();
		Object2.method3();
		
		//Parent reference					Child Object				//UpCasting
		//only parent methods we access here, due to we give here parent reference.
		//All methods from parent except overrided method in child
		MethodOverridingParent Object3 = new MethodOverridingChild() ;
		Object3.checkBalance(); //child
		Object3.method1();
		Object3.method3();

		//Child reference					Parent Object				//DownCasting
		//MethodOverridingChild Object4 = new MethodOverridingParent(); - this is not allowed
		
		MethodOverridingParent Object4 = new MethodOverridingChild() ;
		MethodOverridingChild Object5 = (MethodOverridingChild) Object4; //casting
		//All methods from parent and child class we access here
		Object5.checkBalance(); //child
		Object5.method1();
		Object5.method2();
		Object5.method3();
		
		
		
		
		
		
	}

}
