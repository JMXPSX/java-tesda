/* Program Name: Array9
   Created By: John Michael Go
   Creation Date: Jan. 22, 2013 Day 8
   Note: This is a modified program that do descending sort for integer.
*/

import java.util.Arrays;
import java.util.Collections;

public class Array9 {

	public static void main(String[] args) {
		
		Integer[]arr = {10,11,18,22,19,34};
			
		Arrays.sort(arr,Collections.reverseOrder());
			for (int i=0;i<arr.length;++i)
				System.out.println("Number: " +arr[i]);

	}

}
