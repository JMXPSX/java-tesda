/* Program Name: Array8
   Created By: John Michael Go
   Creation Date: Jan. 22, 2013 Day 8
   Note: Program that sorts an integer array in descending order.
*/

import java.util.Arrays;
import java.util.Collections;

public class Array8 {

	
	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		arr[0] = 10;
		arr[1] = 14;
		arr[2] = 36;
		arr[3] = 27;
		arr[4] = 43;
		arr[5] = 18;
		
		Integer[]arrInteger = new Integer[arr.length];
			for (int i=0;i<arr.length;++i)
				
		arrInteger[i]=new Integer(arr[i]);
			
		Arrays.sort(arrInteger,Collections.reverseOrder());
			for(int i=0; i<arrInteger.length;++i)
				System.out.println("Number:" +arrInteger[i]);
	}

}