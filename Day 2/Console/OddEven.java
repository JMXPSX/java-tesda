/* Program Name: OddEven
   Created By: John Michael Go
   Creation Date: Jan. 14, 2013 Day 2
   Note: Program determines if number is odd or even
*/

import java.util.*;
import java.io.*;

public class OddEven{

	static Scanner console = new Scanner (System.in);

	public static void main(String[]args){

	int num;
	System.out.println ("");
	System.out.print ("Enter Number: "); // input number
	num = console.nextInt();
	System.out.println ("");

	if (num%2==0){
		// if number is even
		System.out.println ("");
		System.out.print ("The number you have entered is even");
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
    }else{
		// if number is odd
		System.out.println ("");
		System.out.print ("The number you have entered is odd");
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
    }

	}

}