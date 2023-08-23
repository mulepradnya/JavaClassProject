package Batchclass;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"abc", "xyz", "pqr"};
		int a[][]= {{1,2,3,4,5},{6,7,8,9,10,11},{11,12,13,14,15,16,17}};
		
		System.out.println("Array Length " +a.length);
		System.out.println("1st Array Length " +a[1].length);
		
		System.out.println(a[0][3]);
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		
	}

}
