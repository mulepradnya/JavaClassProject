package Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//It is not maintain order
		//It is not allowing duplicate values
		
		//HashMap<Keys, values>
		HashMap<String, String> object = new HashMap<String, String>();
		object.put("MH", "Mumbai");
		object.put("GJ", "GandhiNagar");
		object.put("HR", "Chandighad");
		object.put("PNJ", "Chandighad");
		object.put("KA", "Banglore");
		object.put("MH", "Banglore");
		
		System.out.println(object);
		
		object.put("DL", null);
		object.put("UP", null);
		object.put("BH", null);
		System.out.println(object);
		
		//To print all keys elements
		System.out.println(object.keySet());
		
		//To print all values elements
		System.out.println(object.values());
		
		//To search any element - output in boolean
		System.out.println(object.containsKey("MH"));
		
		//Weather Hash is empty or not - output in boolean
		System.out.println(object.isEmpty());
		
		//To give us element at given key element
		System.out.println(object.get("MH"));
				
		//For each loop iteration, index is not required that's why	
		for (String i : object.keySet()) {
			System.out.println(i +" = "+object.get(i));			
		}
		
		//To remove all elements 
		object.clear();
		System.out.println(object.size());
		
		
		
	}

}
