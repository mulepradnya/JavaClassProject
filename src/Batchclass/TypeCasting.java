package Batchclass;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		//Widening Casting (automatically) - converting a smaller type to a larger type size
		//byte -> short -> char -> int -> long -> float -> double

		//Narrowing Casting (manually) - converting a larger type to a smaller size type
		//double -> float -> long -> int -> char -> short -> byte
		

		int i = 5;
		double d = i;
		System.out.println(d);
		
		short s = 100;
		long l = s;
		System.out.println(l);
		
		double d1=10.59;
		int i1 = (int) d1;
		System.out.println(i1);
		
		float f = 5.2f;
		byte b =(byte) f;
		System.out.println(b);
		
		char ch = 'a';
		int x = ch;
		System.out.println(x);
		
		char ch1 = 'd';
		double d2 = ch1;
		System.out.println(d2);
		
		byte b2 = 90;
		char ch2 = (char) b2;
		System.out.println(ch2);
		
		short s1 = 122;
		char ch3 = (char) s1;
		System.out.println(ch3);
		
		
				
		
	}

}
