/* Program Name: Conversion
   Created By: John Michael Go
   Creation Date: Jan. 11, 2013 Day 1
   Note: Feet will be converted to inches and centimeters
*/

import java.util.*;

public class Conversion{
    // variable declaration
	static Scanner console = new Scanner (System.in);
	static final double Centperinch = 2.54;
	static final int Inchperfoot = 12;

	public static void main(String[]args){

	int feet, inch, tinch;
	double tcent;
	// input feet
	System.out.println ("");
	System.out.print("Enter number in feet: ");
	System.out.flush();
	feet = console.nextInt();
	System.out.println ("");
    // input inches
	System.out.print("Enter number in inches: ");
	System.out.flush();
	inch = console.nextInt();
	System.out.println ("");
	// computation for feet to inches to centimeters
	tinch = (Inchperfoot * feet) + inch;
	tcent = tinch * Centperinch;
    System.out.println ("===============================================================================");
	System.out.println ("");
	System.out.println("The numbers you have entered are " +feet+ " for feet and " +inch+ " for inches");
    System.out.println ("");
	System.out.println("The total number of inches: " +tinch);
    System.out.println ("");
	System.out.println("The total number of centimeters: " + String.format("%.2f", tcent));
	System.out.println ("");
	System.out.println ("");
	System.out.println ("");
	}

}

