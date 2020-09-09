/* Program Name: Age
   Created By: John Michael Go
   Creation Date: Jan. 11, 2013 Day 1
   Note: Senior citizen gets 20% discount
*/

import java.util.*;

public class Age{

public static void main (String[]args){
	// variable declaration
	Scanner console = new Scanner(System.in);
	double amt, prc;
	int age;
	// inputs amount
	System.out.println ("");
	System.out.print ("Enter Amount: ");
	amt = console.nextInt();
	System.out.println ("");
	// inputs age
	System.out.print ("Enter Age: ");
	age = console.nextInt();
	System.out.println ("");
	// system determines age if discount is applicable
	System.out.println ("===============================================================================");
	System.out.println ("");
	if (age>=60){
		prc=amt-(amt*0.2);
		System.out.println ("The discounted price for senior citizens will be " +String.format("%.2f", prc));
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
	} else{
		System.out.println ("The price will still be " +String.format("%.2f", amt));
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
	}

	}

}

