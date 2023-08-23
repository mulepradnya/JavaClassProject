package Differences;

class A {
	int num = 10;
	
	public A () {
		System.out.println("Hello Class A");
	}
	
	public void method (int no) {
		
		System.out.println("Class A this Keyword " +this.num); //10
		
		System.out.println("Class A Keyword " +no); //40
	}
	
}

class B extends A {
	int num = 20;
	
	public void method (int no) { //parameterized method
		
		System.out.println("Class B this Keyword " +this.num); //20
		//this keyword always refer to current class.
		
		System.out.println("Class B Super Keyword " +super.num); //10
		//super keyword always refer to parent class.
		//super keyword not allowed in parent class.
		
		//this & super keyword not allowed in static context,
		//static access direct method not required object creation.
		
		System.out.println("Class B Keyword " +no); //30
		
		super.method(40); //class A method calling
		
		//this.method(no); - occurs exception, data structure type error
		
		}
	
	//constructor call
	public B () {
		
		super(); //In case of constructor super keyword should be the first statement
		System.out.println("Hello Class B");
		
	}
	
}

public class ThisandSuperKeywordDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B object = new B (); //object create hai isliye constructor call hoga
		object.method(30);
		
		//In main method we not able to use this & super keyword due to static method.
		//this & super keyword not allowed in static context,
		//static access direct method not required object creation.
		
	}

}
