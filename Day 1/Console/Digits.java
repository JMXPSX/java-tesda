/* Program Name: Digits
   Created By: John Michael Go
   Creation Date: Jan. 11, 2013 Day 1
   Note: Input three numbers and system will determine the largest number
*/

import java.util.*;

public class Digits {

public static void main (String[]args){

	Scanner console = new Scanner(System.in);
	int a, b, c;
	// enter 1st number
	System.out.println ("");
	System.out.print ("Enter 1st number: ");
	a = console.nextInt();
	System.out.println ("");
    // enter 2nd number
	System.out.print ("Enter 2nd number: ");
	b = console.nextInt();
	System.out.println ("");
    // enter 3rd number
	System.out.print ("Enter 3rd number: ");
	c = console.nextInt();
	System.out.println ("");
	System.out.println ("===============================================================================");
	System.out.println ("");
	// if a is greater than b and c
	if (a>b&&a>c) {
		System.out.println ("The largest number of the three digits is " +a);
	// if b is greater than c
	} else if
       (b>c) {
    	System.out.println ("The largest number of the three digits is " +b);

    } else {
		System.out.println ("The largest number of the three digits is " +c);

    }
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
	}

}

