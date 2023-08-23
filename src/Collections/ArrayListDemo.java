package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array size is fixed
		//We can not add or remove elements from array
		//ArrayList contains duplicate values.
		//It maintains order
		
		ArrayList<Integer> object = new ArrayList<Integer> ();
		
		//To know the size of array
		System.out.println(object.size());
		
		//System.out.println(object.get(3));
		
		object.add(10);
		object.add(10);
		object.add(20);
		object.add(30);
		object.add(40);
		object.add(10);
		object.add(null);
		object.add(null);
		object.add(null);
		
		
		
		System.out.println(object);
		System.out.println(object.size());
		
		//To remove element as per index number wise
		object.remove(4);
		System.out.println(object);
		
		//To search any element - output in boolean
		System.out.println(object.contains(30));
				
		//To Add element at given index number
		object.add(2, 50);
		System.out.println(object);
		
		//To replace element at given index number
		object.set(4, 60);
		System.out.println(object);
		
		//To give us element at given index number
		System.out.println(object.get(3));
		
		System.out.println(object.size());
		
		//To print all elements of array
		for (int i=0; i<object.size(); i++) {
			System.out.println(object.get(i));
		}
		for (int i : object) {
			System.out.println(i);
		}
		
		//To remove all elements 
		object.clear();
		System.out.println(object.size());
				

	}

}
