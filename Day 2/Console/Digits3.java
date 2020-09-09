/* Program Name: Digits3
   Created By: John Michael Go
   Creation Date: Jan. 14, 2013 Day 2
   Note: Program will add the sum of any three digit number
*/

import java.util.*;
import java.io.*;

public class Digits3{

	static Scanner console = new Scanner (System.in);

	public static void main(String[]args){
	// variable declaration
	int num, dx, d3, d1, d2, dt;
	System.out.println("");
	System.out.print("Enter a three digit Number: ");
	num = console.nextInt();
	// program will only accept numbers within 100 to 999
	if (num>99 && num<1000){

	dx = num % 100;
	d1 = num / 100; // gets the 1st digit
	d2 = dx / 10;	// gets the 2nd digit
	d3 = dx % 10;	// gets the 3rd digit
 	dt = d1+d2+d3;  // adds the three numbers

	//output the total of the three digit number
	System.out.println("");
 	System.out.println("The sum of the three numbers is: " + dt);
 	System.out.println("");

 	}else{
	//program will ask user to try entering a three digit number
	System.out.println("");
 	System.out.println("Please enter a THREE digit number.");
 	System.out.println("");

 	}

	}

}