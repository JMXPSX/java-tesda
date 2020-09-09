/* Program Name: NameAge
   Created By: John Michael Go
   Creation Date: Jan. 11, 2013 Day 1
   Note: Input user name and age and system will display it
*/

import java.util.*;

public class NameAge {

public static void main (String[]args){
	// declaration of variable
	Scanner console = new Scanner(System.in);
	String name;
	int age;
	// enter name
	System.out.println ("");
	System.out.print("What is your name ? ");
	name = console.next();
	System.out.println ("");
	// enter age
	System.out.print ("How old are you ? ");
	age = console.nextInt();
	System.out.println ("");
    System.out.print("");
    System.out.println ("===============================================================================");
    System.out.println ("");
	System.out.println ("Hello there " + name + " so you are already " + age + " years old");
	System.out.println ("");
	System.out.println ("");
	System.out.println ("");

	}

}