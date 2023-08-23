package Batchclass;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//25.05.2023

		int a1 = 5;
		int b1 = 7;
		
		
		// bitwise and
		// 0101 & =5
		// 0111   =7
		// 0101   =5
		System.out.println("a&b = "  + (a1 & b1));
		
		// bitwise OR
		// 0101 | =5
		// 0111   =7
		// 0111   =7
		System.out.println("a|b = " + (a1 | b1));
				
		// bitwise XOR - answer ko reverse kardo
		// 0101 ^ =5
		// 0111   =7
		// 0010   =2
		System.out.println("a^b = " + (a1 ^ b1));
		
		// bitwise Complement (~) - 
		// ~ 0101 = 5
		// 1010   = 10
		System.out.println("~a = " + (~10));
	
		
		
	
	
	}

}
