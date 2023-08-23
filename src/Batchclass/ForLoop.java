package Batchclass;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to print the first 10 natural number
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		// Write a program to print the reverse first 10 natural number
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}

		// Write a program to calculate the sum of first 10 natural number
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		// Write a program for only print odd values between 0 and 15
		for (int i = 1; i < 17; i = i + 2) {
			System.out.println(i);
		}

		// Write a program for only print even values between 0 and 10
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
		}

		// 1 3 9 27 81
		for (int i = 1; i < 85; i = i * 3) {
			System.out.println(i);
		}

		// 1,2,fizz,4,buzz,fizz,7,8,fizz,buzz,11,fizz,13,14,fizzbuzz
		for (int i = 1; i < 16; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz ");
			} else if (i % 3 == 0) {
				System.out.print("Fizz ");
			} else if (i % 5 == 0) {
				System.out.print("Buzz ");
			} else {
				System.out.print(i + " ");
			}
		}
		//Factorial number program - 5! = 5*4*3*2*1
		{int fact = 1;
		for (int i1=5; i1>=1; i1--) {
			fact = fact * i1;
		}
			System.out.println(fact);
			
			
		}

	}
}
