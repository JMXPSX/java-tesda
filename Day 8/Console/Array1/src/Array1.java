/* Program Name: Array1
   Created By: John Michael Go
   Creation Date: Jan. 22, 2013 Day 8
   Note: Program that shows lenght of an array.
*/

public class Array1 {
	
	public static void main(String[] args) {

		int[]num = new int[4];
			num[0]=1;
			num[1]=2;
			num[2]=3;
			num[3]=4;
		System.out.println(num.length);

		for (int i=0;i<num.length;++i){
			System.out.println(num[i]);
		}
	}

}
