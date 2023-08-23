package Collections;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapOccerance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "caabbacccdbddd";
		//a=2, b=2, c=3, d=4
		
		 char ch [] = str.toCharArray();
		 //{} - Object data access
		 System.out.println(Arrays.toString(ch));
		 
		 HashMap<Character, Integer> object = new HashMap<Character, Integer>();
		 
		 object.put('S', 10);
		 
		 //Print Complete key & Value set
		 System.out.println(object.entrySet());
		 
		 System.out.println(object.size());
		 
		 for (int i=0; i<ch.length; i++) {
			
			 if(object.containsKey(ch[i])) {
				 object.put(ch[i], object.get(ch[i])+1);
			 }
			 else
				 object.put(ch[i], 1);
		 }
		 
		 System.out.println(object);
		 
		 
		 

	}

}
