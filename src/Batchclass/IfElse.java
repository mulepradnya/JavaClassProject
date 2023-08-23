package Batchclass;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 99;
		if (age<18 && age>0)
		{
			System.out.println("Child");
			System.out.println("He/She can not vote");
		}
		else if (age>=18 && age<100)
		{
			System.out.println("Adult");
			System.out.println("He/She can Vote");
		}
		else
		{
			System.out.println("Please enter valid age...");
		}
		
		
		int Marks = 101;
		if (Marks>90 && Marks<=100)
		{
			System.out.println("Distinction");
		}
		else if (Marks>=70 && Marks<=90)
		{
			System.out.println("First Class");
		}
		else if (Marks>=50 && Marks<70)
		{
			System.out.println("Second Class");
		}
		else if (Marks<50 && Marks>0)
		{
			System.out.println("Fail...");
		}
		else
		{
			System.out.println("Please enter valid Marks");
		}
		
		
		String env = "xyz";
		if (env == "Dev")
		{
			System.out.println("Unit Testing");
		}
		else if (env == "INT")
		{
			System.out.println("Regression & Functional Testing");
		}
		else if (env == "UAT")
		{
			System.out.println("End-to-End Testing");
		}
		else if (env == "Prod")
		{
			System.out.println("Sanity Test");
		}
		else
		{
			System.out.println("Please Enter Valid Env");
		}
	}

}
