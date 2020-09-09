/* Program Name: Array5
   Created By: John Michael Go
   Creation Date: Jan. 22, 2013 Day 8
   Note: Program that averages the values of an array.
*/

public class Array5 {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4};
		float sum = 0;
		for (int i=0;i<num.length;++i)
			sum += num[i];
		System.out.println(sum/num.length);

	}

}
