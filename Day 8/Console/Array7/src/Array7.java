/* Program Name: Array7
   Created By: John Michael Go
   Creation Date: Jan. 22, 2013 Day 8
   Note: Program that sorts a string array.
*/

import java.util.Arrays;

public class Array7 {

	
	public static void main(String[] args) {
			
			String[]arr = new String[6];
			
			arr[0] = "Delta";
			arr[1] = "Bravo";
			arr[2] = "Gulf";
			arr[3] = "Alpha";
			arr[4] = "Oscar";
			arr[5] = "Nancy";
			
			Arrays.sort(arr);
			for (int i=0;i<arr.length;++i)
				System.out.println("Number: " +arr[i]);
		
		}
	}


