	/* Program Name: Payroll1
   Created By: John Michael Go
   Creation Date: Jan. 11, 2013 Day 1
   Note: Program calculates monthly salary with absents and deductions
*/

import java.util.*;

public class Payroll1{

	static Scanner console = new Scanner (System.in);

	public static void main(String[]args){

    // variable declaration
	String name, dept;
	int abs, hour;
	double day, week, month, wage, sss, pbg, tax, ttax, phl, twage, tabs;

    // inputs name, dept and absent
    System.out.println ("");
	System.out.print("Enter your name: ");
	name = console.next();
	System.out.println ("");
	System.out.print("Enter your dept: ");
	dept = console.next();
	System.out.println ("");
	System.out.print("Days absent: ");
	abs = console.nextInt();
	System.out.println("");

    // hourly, daily, weekly, monthly and total wage computation
	hour = 300;
	day = hour * 8;
	week = day * 5;
	month = week * 4;
	tabs = abs*day;
	wage = month - (abs*day);
    System.out.println("");
    System.out.println ("===============================================================================");

    // displays employee details
    System.out.println("");
    System.out.println("Employee Details:");
    System.out.println("");
	System.out.println("Name : " +name);
	System.out.println("Dept.: " +dept);
	System.out.println("");

	// displays salary details
	System.out.println("Salary Details:");
    System.out.println("");
	System.out.println("Your Hourly Rate is  :   300.00");
	System.out.println("Your Daily Rate is   :  " + String.format("%.2f", day));
	System.out.println("Your Weekly Rate is  : " + String.format("%.2f", week));
	System.out.println("Your Monthly Rate is : " + String.format("%.2f", month));

    // computation of deductions
	sss = month * .10;
	pbg = month * .10;
	phl = month * .10;
	tax = ((20-abs) * day);
	ttax = tax * .20;
	twage = wage - (pbg+sss+phl+ttax);

    // displays deductions
    System.out.println("");
    System.out.println("Deductions:");
    System.out.println("");
	if (abs > 0){
		System.out.println("SSS                             : " + String.format("%.2f", sss));
		System.out.println("Pag-Ibig                        : " + String.format("%.2f", pbg));
		System.out.println("Witholding Tax less " + abs + " absence/s : " + String.format("%.2f", ttax));
		System.out.println("Philhealth                      : " + String.format("%.2f", phl));
		System.out.println ("");
		System.out.println(
		"===============================================================================");

		// displays overall salary computation with absences
		System.out.println ("");
		System.out.println("Salary Computation:");
		System.out.println ("");
		System.out.println ("Your Total Workday/s in a Month  :       " +(20-abs));
		System.out.println ("");
		System.out.println("Deduction from " + abs + " absence/s       :  " + String.format("%.2f", tabs));
		System.out.println ("");
		System.out.println("Your Total Basic Income          : " + String.format("%.2f", wage));
		System.out.println ("");
		System.out.println("Less Monthly Deductions          : " + String.format("%.2f", (pbg+sss+phl+ttax)));
		System.out.println ("");
		System.out.println("Your Total Wage with Absence/s   : " + String.format("%.2f", twage));
		System.out.println ("");
		System.out.println(
		"===============================================================================");
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");

	// displays deductions
	}else{
		System.out.println("SSS            : " + String.format("%.2f", sss));
		System.out.println("Pag-Ibig       : " + String.format("%.2f", pbg));
		System.out.println("Witholding Tax : " + String.format("%.2f", ttax));
		System.out.println("Philhealth     : " + String.format("%.2f", phl));
		System.out.println ("");
		System.out.println(
		"===============================================================================");

		// displays overall salary computation without absences
		System.out.println ("");
		System.out.println("Salary Computation:");
		System.out.println ("");
		System.out.println ("Your Total Workday/s in a Month :       " +(20-abs));
		System.out.println ("");
		System.out.println("Your Total Basic Income         : " + String.format("%.2f", wage));
		System.out.println ("");
		System.out.println("Less Monthly Deductions         : " + String.format("%.2f", (pbg+sss+phl+ttax)));
		System.out.println ("");
		System.out.println("Your Total Wage                 : " + String.format("%.2f", twage));
		System.out.println ("");
		System.out.println (
		"===============================================================================");
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
	}


	}

}