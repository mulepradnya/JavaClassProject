package AccessModifier;

class TestDemo1 {
	
	public void method () {
		System.out.println("Hello Method");
	}
	
	//Public Access Modifier
	public void methodA () {
		System.out.println("Hello Method A");
	}
	//Default Access Modifier
	void methodB () {
		System.out.println("Hello Method B");
	}
	//Private Access Modifier
	private void methodC () {
		System.out.println("Hello Method C");
	}
	//Protected Access Modifier
	protected void methodD () {
		System.out.println("Hello Method D");
	}
	
	//Final Access Modifier
	public final void methodE () {
		System.out.println("Hello Method E");
	}

	//Static Access Modifier
	static String name = "Pradnya";
	
	//Abstract Access Modifier
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo2 object = new TestDemo2 ();
		object.method();
		object.method2();

	}

}
