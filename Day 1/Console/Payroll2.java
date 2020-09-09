/* Program Name: Payroll2
   Created By: John Michael Go
   Creation Date: Jan. 11, 2013 Day 1
   Note: Program calculates monthly salary with absents and deductions. Will also reduce tax deduction for senior citizen employees.
*/

import java.util.*;

public class Payroll2{

	static Scanner console = new Scanner (System.in);

	public static void main(String[]args){

    // variable declaration
	String name, dept;
	int age, abs, hour;
	double day, week, month, wage, sss, pbg, tax, ttax, phl, twage1, twage2, tabs, dsen, asen, tasen;

	// input data
	System.out.println ("");
	System.out.print("Enter your name: ");
	name = console.next();
	System.out.println ("");
	System.out.print("Enter your age: ");
	age = console.nextInt();
	System.out.println ("");
	System.out.print("Enter your dept: ");
	dept = console.next();
	System.out.println ("");
	System.out.print("Days absent: ");
	abs = console.nextInt();
	System.out.println("");

    // salary rate computation
	hour = 300;
	day = hour * 8;
	week = day * 5;
	month = week * 4;
	tabs = abs*day;
	wage = month - tabs;

    // displays employee details
	System.out.println ("===============================================================================");
	System.out.println("");
	System.out.println("Employee Details:");
	System.out.println("");
	System.out.println("Name : " +name);
	System.out.println("Age  : " +age);
	System.out.println("Dept.: " +dept);
	System.out.println("");

	// displays salary details
	System.out.println("Salary Details:");
    System.out.println("");
	System.out.println("Your Hourly Rate is  :   300.00");
	System.out.println("Your Daily Rate is   :  " + String.format("%.2f", day));
	System.out.println("Your Weekly Rate is  : " + String.format("%.2f", week));
	System.out.println("Your Monthly Rate is : " + String.format("%.2f", wage));

    // deduction and wage computation
	sss = wage * .10;
	pbg = wage * .10;
	phl = wage * .10;
	tax = ((20-abs) * day);
	ttax = tax * .20;
	asen= (day/2) * .20;
	tasen = asen * abs;
	twage1 = wage - (pbg+sss+phl+ttax);
	twage2 = ((wage - (pbg+sss+phl+ttax))+tasen);

	// displays deductions
	System.out.println("");
	System.out.println("Deductions:");
    System.out.println("");

    // with absent and senior citizen
	if (abs > 0 && age>=60){
		System.out.println("SSS                             : " + String.format("%.2f", sss));
		System.out.println("Pag-Ibig                        : " + String.format("%.2f", pbg));
		System.out.println("Witholding Tax less " + abs + " absence/s : " + String.format("%.2f", ttax));
		System.out.println("Philhealth                      : " + String.format("%.2f", phl));
		System.out.println("");
		System.out.println ("===============================================================================");
		System.out.println("");
		System.out.println("Salary Computation:");
		System.out.println ("");
		System.out.println ("Your Total Workday/s in a Month    :       " +(20-abs));
		System.out.println ("");
		System.out.println("Amount added for " + abs + " absence/s  (SC) :   " + String.format("%.2f", tasen));
		System.out.println ("");
		System.out.println("Your Total Basic Income            : " + String.format("%.2f", wage+tasen));
		System.out.println ("");
		System.out.println("Less Monthly Deductions            : " + String.format("%.2f", (pbg+sss+phl+ttax)));
		System.out.println ("");
		System.out.println("Your Total Wage with Absence/s     : " + String.format("%.2f", twage2));
		System.out.println ("");
		System.out.println ("===============================================================================");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}else if (abs > 0 && age<60) {

		// with absent but not senior citizen
		System.out.println("SSS                             : " + String.format("%.2f", sss));
		System.out.println("Pag-Ibig                        : " + String.format("%.2f", pbg));
		System.out.println("Witholding Tax less " + abs + " absence/s : " + String.format("%.2f", ttax));
		System.out.println("Philhealth                      : " + String.format("%.2f", phl));
		System.out.println("");
		System.out.println ("===============================================================================");
		System.out.println("");
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
		System.out.println("Your Total Wage with Absence/s   : " + String.format("%.2f", twage1));
		System.out.println ("");
		System.out.println ("===============================================================================");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}else{

		// no absences
		System.out.println("You have no absences!");
		System.out.println("");
		System.out.println("SSS            : " + String.format("%.2f", sss));
		System.out.println("Pag-Ibig       : " + String.format("%.2f", pbg));
		System.out.println("Witholding Tax : " + String.format("%.2f", ttax));
		System.out.println("Philhealth     : " + String.format("%.2f", phl));
		System.out.println("");
	    System.out.println ("===============================================================================");
		System.out.println("");
		System.out.println("Salary Computation:");
		System.out.println ("");
		System.out.println ("Your Total Workday/s in a Month :       " +(20-abs));
		System.out.println ("");
		System.out.println("Your Total Basic Income         : " + String.format("%.2f", wage));
		System.out.println ("");
		System.out.println("Less Monthly Deductions         : " + String.format("%.2f", (pbg+sss+phl+ttax)));
		System.out.println ("");
		System.out.println("Your Total Wage                 : " + String.format("%.2f", twage1));
		System.out.println ("");
		System.out.println ("===============================================================================");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	}

}