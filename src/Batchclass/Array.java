package Batchclass;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In array you modify value, update, Replace
		
		int a[] = {10, 20, 30, 40, 50};
		
		System.out.println(a[1]);
		a[1] = 60;
		System.out.println(a[1]);
		
		char ch[] = {'a', 'b', 'c', 'd', 'e'};
		String str1[] = {"Pradnya", "Gopal", "Anvi", "Jui"};

		for (int i3=0; i3<=a.length-1; i3++) {
			System.out.println(a[i3]+" ");
		}
		System.out.println();
		
		for(int k:a)
		{
			System.out.print(k+" ");
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(a));
		
		
		
		
		
				
	}

}
