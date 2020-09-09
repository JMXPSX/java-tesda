/* Program Name: Assign4
   Created By: John Michael Go
   Creation Date: Jan. 22, 2013 Day 8
   Note: This is a program that displays all values, sum and average in an array.
*/

import java.util.Arrays;

public class Assign4{
	
	public static void main(String[] args){
		// array 
		Integer[][] num = {{12,23,34,45,56},
						   {23,34,45,56,67},
						   {34,45,56,67,78},
						   {45,56,67,78,89},
		                   {56,67,78,89,90}}; 	
		int numX = 0, numY; // variable declaration
		// Loop for displaying array 
		System.out.print("OUTPUT:");
				for (int i=0; i<num.length; ++i){
					
					System.out.print("\n");
					
					for (int j=0; j<num[i].length; ++j ){
				
						System.out.print(num[i][j]);
						System.out.print(" ");
				
					}
						
				}
		
		System.out.print("\n");
		// Loop for adding the values in a row
				for (int i=0; i<num.length; ++i){
					System.out.print("\n");
					System.out.print("The Sum of row "+(i+1)+" : ");
			
					for (int j=0; j<num[i].length; ++j ){
				
						numX += num[i][j];
				
						}
					
					System.out.print(numX);
					numX = 0;
			
				}
				
				
		System.out.print("\n");
		// Loop for computing the average of each row
			for (int i=0; i<num.length; ++i){
			System.out.print("\n");
			System.out.print("The Average of each row "+(i+1)+" : ");
			
				for (int j=0; j<num[i].length; ++j ){
		
					numX += num[i][j];
								
					}
			
					numY = numX / 5;
					System.out.print(numY);
					numX = 0;
	
		    	}
		
	} // end static

} // end class
