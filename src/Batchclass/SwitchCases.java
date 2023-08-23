package Batchclass;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Switch expression
		// case x: code block break
		// case y: code block
		// break; default: code block - work as per else work
		
		int days=1;
		switch (days)
		{
		case 1: System.out.println("Monday");
		case 2: System.out.println("Tuesday");
		case 3: System.out.println("Wednesday");
		case 4: System.out.println("Thursday");
		case 5: System.out.println("Friday");
		case 6: System.out.println("Saturday");
		case 7: System.out.println("Sunday");
		default: System.out.println("Please provide valid day");
		
		
		int day=5;
		switch (day)
		{
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default: System.out.println("Please provide valid day");
		}
		char day1='a';
		switch (day1)
		{
		case 1: System.out.println("Monday");
		break;
		case 'a': System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default: System.out.println("Please provide valid day");
		}
		String day2 = "Sunday";
		switch (day2)
		{
		case "Sunday": System.out.println("Sunday");
		break;
		case "Monday": System.out.println("Monday");
		break;
		case "Tuesday": System.out.println("Tuesday");
		break;
		case "Wednesday": System.out.println("Wednesday");
		break;
		case "Thursday": System.out.println("Thursday");
		break;
		case "Friday": System.out.println("Friday");
		break;
		case "Saturday": System.out.println("Saturday");
		break;
		default: System.out.println("Please provide valid day");
		}
			
		
		int Marks=70;
		switch(Marks)
		{case 90: System.out.println("Distiction");
		
		}
}}}
