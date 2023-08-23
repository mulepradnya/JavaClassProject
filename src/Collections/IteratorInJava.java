package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
		//It is called an 'Iterator' because 'Iterating' is the technical term for looping.
		//To use an Iterator, you must import it from the java.util package.
		
		ArrayList <String> object = new ArrayList <String> ();
		
		object.add("BMW");
		object.add("Audi");
		object.add("Mecedise");
		object.add("Skoda");
		
		//Get the Iterator
		Iterator <String> it = object.iterator();
		//ArrayList madhe String ghetale mhanun Iterator cha data type string ghetala aahe
		
		System.out.println("Name of 1st brand of car "+it.next());
		System.out.println("Name of 2nd brand of car "+it.next());
		
		while(it.hasNext()) { 
			System.out.println(it.next()); //ethe print kartana to vaule repeat print nahi karnar
		}
		//hasNext method return boolean only true or false it says that value it contain or not
		//next method gives return value in given sequence
		
		ArrayList <String> object1 = new ArrayList <String> ();
		
		object1.add("Apple");
		object1.add("Banana");
		object1.add("Cherry");
		object1.add("Dragonfruit");
		
		Iterator <String> fruit = object1.iterator();
		
		while(fruit.hasNext()) { 
			System.out.println(fruit.next());//ethe to purn name print karto aahe
		}
		
		System.out.println("Name of 1st brand of car "+fruit.next());
		System.out.println("Name of 2nd brand of car "+fruit.next());
		
		//parat ethe nahi to print karnar karan tyane ekda agother print kele aahe
		//to repeat nahi karnar, exception denar no such element mhanun
		
	}

}
