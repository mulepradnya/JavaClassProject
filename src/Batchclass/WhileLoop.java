package Batchclass;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For loop - when number of iteration knows
		//While loop - when number of iterations don't know
		
		int i = 0;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		int j=0;
		int sum =0;
		while(j<=10) {
			sum = sum + j;
			j++;
		}
		System.out.println(sum);

		int x=0;
		do {
			System.out.println(x);
			x++;
		}
		while (x<10);
		
		
		
		
	}

}
