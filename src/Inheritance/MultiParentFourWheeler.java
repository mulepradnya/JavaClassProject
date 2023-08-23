package Inheritance;

public class MultiParentFourWheeler extends MultiGrandParentVehical {
	
	void fueltype() {
		System.out.println("Petrol....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiParentFourWheeler object = new MultiParentFourWheeler();
		object.fueltype();
		object.running();
		

	}

}
