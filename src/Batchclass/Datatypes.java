package Batchclass;

import java.util.Arrays;

public class Datatypes {

	public static void main(String[] args) {
				
		//Primitive Data Type - Size already define - 8 Types
		//Boolean, Byte, Char, Short, Long, Double, Float, int

		int number = 10;
		System.out.println("number");
		System.out.println(number);
		
		boolean result = true;
		System.out.println(result);
		
		short s = 32767;
		System.out.println(s);
		
		long l = 9223372036854775807l;
		System.out.println(l);
		
		float f= 20.4999999f;
		System.out.println(f);
		
		double d = 20.4999999999999999d;
		System.out.println(d);
		
		char ch = 'a';
		System.out.println(ch);
		
		//Non Primitive data type
		String name = "Java Basics";
		System.out.println(name);
		
		String name1 = "20.499999999999999999";
		String name2 = "20.499999999999999999";
		System.out.println(name1);
		System.out.println(name1+name2);
		
		int name3 = 204999999;
		int name4 = 204999999;
		System.out.println(name3+name4);
		
		String name5 = "I Love Java";
		System.out.println(name5);
		
		int arr [] = new int[5];
		arr [0] = 2;
		arr [2] = 4;
		System.out.println(arr);
		System.out.println(arr[2]);
		
		int arr1[] = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr1));
			
	}

}
