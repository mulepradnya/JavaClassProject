package Batchclass;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Assignment Operators in Java
		//=, +=, -=, *=, /= 
		
		int j = 20;
		j+=5;
		j = j + 5;
		System.out.println(j);
		
		j*=5;
		System.out.println(j);
		
		j/=5;
		System.out.println(j);
		
		//j=*5; - Not accepting in eclipse.
		
		//Relational Operators in Java - Use for comparison, if want to check any condition
		// ==, !=, >, <, >=, <=
		
		int x = 5;
		if (x==5) //== - compare equality
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		int y = 5;
		if(x!=y) //!= - not operator
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(x>=y) //greater than equal to
		{
			System.out.println("True1");
		}
		else
		{
			System.out.println("False1");
		}
		if(x<=y) //less than equal to
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
		
		
		
	}

}
