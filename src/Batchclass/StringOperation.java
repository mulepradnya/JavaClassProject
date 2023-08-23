package Batchclass;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String();
		str = "I Love Java";
		System.out.println(str.charAt(5));
		
		//Contains - jo hum log search kar rahe hai wo us project me hai ya nahi
		//Whether that value present in that string or not
		//output in boolean - true or false
		String str1 = "I Love Java";
		System.out.println(str1.contains("java"));
		
		String str2 = "I Love Java";
		System.out.println(str2.substring(7));
		System.out.println(str2.substring(5,9));
		
		String str3 = "		I Love 		Java		";
		System.out.println(str3.trim());
		
		String str4 = "I Love";
		String str5 = "Java";
		System.out.println(str4.concat(" Java"));
		System.out.println(str4.concat(" "+str5));
		
		String str6 = "I Love Java";
		System.out.println(str6.length());
		
		String str7 = "I Love Java";
		String [ ] arrstr = str7.split("o");
		for (String a : arrstr)
		System.out.println(a);
		
		String str8 = "I Love Java";
		System.out.println(str8.toUpperCase());
		
		String str9 = "I Love Java";
		System.out.println(str9.toLowerCase());
		
		//Empty - output in boolean - true or false
		String str10 = "I Love Java Basic";
		System.out.println(str10.isEmpty());
		
		//Equals - output in boolean - true or false
		String str11 = "I Love Java";
		System.out.println(str11.equals(str10));
		System.out.println(str11.equalsIgnoreCase(str10));
		
		//escape characters
		String str12 = "I love \"Java\"";
		System.out.println(str12);
		
		String str13 = "I love \"\"";
		System.out.println(str13);
		
		//Reverse in string
		String str15 = "Pradnya";
		String temp = "";
		for (int i=str15.length()-1; i>=0; i--) {
			temp=temp+str15.charAt(i);
			
		}
			System.out.println(temp);
		
		
}

}
