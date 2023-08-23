package Inheritance;

public class MultiChildSUVCars extends MultiParentFourWheeler {
	void model() {
		System.out.println("I am SUV....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChildSUVCars cars = new MultiChildSUVCars();
		cars.fueltype();
		cars.model();
		cars.running();

	}

}
