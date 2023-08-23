package Inheritance;

public class HierarchicalChildClassB extends HierarchicalParentClassA {
	void method2 () {
		System.out.println("I am Method 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChildClassB object = new HierarchicalChildClassB ();
		object.method1();

	}

}
