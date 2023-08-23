package Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It is not maintain order
		//It is not allowing duplicate values
		
		HashSet<Integer> object = new HashSet<Integer>();
		object.add(10);
		object.add(20);
		object.add(30);
		object.add(10);
		object.add(null);
		object.add(null);
		object.add(null);
		System.out.println(object);
		
		//In HashSet specific element access not possible.
		//that's why this HashSet not able to use where we have to mention index number 
		//object.getClass();
		
		//To know the size, duplicate element not count in size
		System.out.println(object.size());
		
		//To remove element as per index number wise
		object.remove(20);
		System.out.println(object);
		
		//To print all elements of array
		for (int i=0; i<object.size(); i++) {
			System.out.println(object.size());
		}
		
		for (int i : object) {
			System.out.println(i);
		}
		
		//To remove all elements 
		object.clear();
		System.out.println(object.size());
		
		//To search any element - output in boolean
		System.out.println(object.contains(30));
		
		
	}

}
