/* Program Name: Array6
   Created By: John Michael Go
   Creation Date: Jan. 22, 2013 Day 8
   Note: Program that sorts an integer array.
*/

import java.util.Arrays;

public class Array6 {

	
	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		arr[0] = 10;
		arr[1] = 14;
		arr[2] = 36;
		arr[3] = 27;
		arr[4] = 43;
		arr[5] = 18;
		
		Arrays.sort(arr);
		for (int i=0;i<arr.length;++i)
			System.out.println("Number:" +arr[i]);
	}

}
