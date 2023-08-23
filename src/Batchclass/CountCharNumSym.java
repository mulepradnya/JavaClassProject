package Batchclass;

public class CountCharNumSym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Character = 7
		//Number = 6
		//Symbol = 5
		String str = "Pradnya@#123456$%!";
		int number = 0;
		int upper = 0;
		int lower = 0;
		int symbol = 0;
		for(int i=0; i<=str.length()-1; i++) {
			if (str.charAt(i)>='0' && str.charAt(i)<='9') {
				number++;
			}
			else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
				lower++;
			}
			else if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
				upper++;
			}
			else {
				symbol++;
			}
		}
		System.out.println("Charactors = "+(lower+upper));
		System.out.println("Numbers = "+number);
		System.out.println("Symbols = "+symbol);
	}

}
