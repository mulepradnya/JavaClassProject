package Constructor;

public class Demo1 {
	
	int rollno;
	String name;
	public Demo1(int rollno1, String name1) {
		this.rollno = rollno1;
		this.name = name1;
		System.out.println("Roll No: "+rollno);
		System.out.println("Name: "+name);
	}
	
	public void method1 (int rollno1, String name1) {
		this.rollno = rollno1;
		this.name = name1;
		System.out.println("Method Roll No: "+rollno);
		System.out.println("Method Name: "+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 object = new Demo1 (1, "Pradnya");
		Demo1 object1 = new Demo1 (2, "Gopal");
		object.method1(1, "Pradnya");
		object.method1(2, "Goapl");
		object.method1(3, "Anvi");
		object.method1(4, "Jui");
		
		
	}

}
