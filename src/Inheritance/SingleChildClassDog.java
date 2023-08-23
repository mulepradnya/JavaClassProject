package Inheritance;

public class SingleChildClassDog extends SingleParentClassAnimal {
	
	void barking() {
		System.out.println("Dog is Barking....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleChildClassDog fix = new SingleChildClassDog();
		fix.drinkingWater();
		fix.eating();
		fix.barking();

	}

}
