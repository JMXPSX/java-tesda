/* Program Name: Grade
   Created By: John Michael Go
   Creation Date: Jan. 11, 2013 Day 1
   Note: System determines if the grade passed or failed
*/

import java.util.*;

public class Grade {

public static void main (String[]args){
	// variable declaration
	Scanner console = new Scanner(System.in);
	int grade;
	// input grade
	System.out.println ("");
	System.out.print ("Enter your grade: ");
	grade = console.nextInt();
	System.out.println ("");
	System.out.println ("===============================================================================");
	System.out.println ("");
	// pass or fail decision
	if (grade>=74){
		System.out.println ("Congratulations!, you passed!");
	} else{
		System.out.println ("Sorry you failed!");
	}
    System.out.println ("");
	System.out.println ("");
    System.out.println ("");
	}

}


