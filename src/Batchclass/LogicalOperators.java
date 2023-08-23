package Batchclass;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java Logical Operators:
		// &&, ||, !
		
		int n=10;
		int p=11;
		System.out.println(n<p && n<12);
		//&& use at one time check two condition
		//any of one condition not satisfy then output false
		
		System.out.println(n<p || n==p);
		// || use from two condition any of one satisfy its ok
		//any of one condition satisfy the output true
		
		System.out.println();
		// ! - not operator - Jevha ek ch gosht saglyan madhun nako pahije asel tevha 
		//wo condition nahi hai to 

		String days = "Sunday";
		if (!(days =="Sunday"))
		{
			System.out.println("Go to office");
		}
		else
		{
			System.out.println("It's a Holiday");
		}
		
		
	}

}
