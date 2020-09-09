/* Program Name: Donation
   Created By: John Michael Go
   Creation Date: Jan. 14, 2013 Day 2
   Note: Program calculates Adult and Kid ticket amount. Add the number of tickets sold and get the percentage to be donated from the total gross.
*/

import java.util.*;
import java.io.*;

public class Donation{

	static Scanner console = new Scanner (System.in);

	public static void main(String[]args){
	// variable declaration
	String movie;
	int aTickSold, kTickSold, tTickSold ;
	Double AduTick, KidTick, DonPer, GrossAmount, AmtDon, NetSale;

	System.out.println ("");
	System.out.print ("Enter Movie Name: "); // input movie name
	System.out.flush();
	movie = console.nextLine();
	System.out.println ("");
	System.out.print ("Adult Ticket Amount: "); // input adult ticket amount
	System.out.flush();
	AduTick = console.nextDouble();
	System.out.println ("");
	System.out.print ("Kid Ticket Amount: "); // input kid ticket amount
	System.out.flush();
	KidTick = console.nextDouble();
	System.out.println ("");
	System.out.print ("Number of Adult Tickets sold: "); // input number of adult tickets sold
	System.out.flush();
	aTickSold = console.nextInt();
	System.out.println ("");
	System.out.print ("Number of Kid Tickets sold: "); // input number of kid tickets sold
	System.out.flush();
	kTickSold = console.nextInt();
	System.out.println ("");
	System.out.print ("Donation Percentage: "); // input percentage of donation from total gross
	System.out.flush();
	DonPer = console.nextDouble();
	System.out.println ("");
	System.out.println ("");
	System.out.println ("===============================================================================");
	System.out.println ("");
	System.out.println ("");
	System.out.println ("Summary:");
	System.out.println ("");
	System.out.println ("");
	System.out.println ("");


	tTickSold = aTickSold + kTickSold; // total ticket sold
	GrossAmount = (AduTick * aTickSold) + (KidTick * kTickSold); // gross amount of adult and kid tickets sold
	AmtDon = GrossAmount * (DonPer/100); // amount donated
	NetSale = GrossAmount - AmtDon; // total sale less amount donated
	// display overall computation
	System.out.println ("Movie Name: " +movie );
	System.out.println ("");
	System.out.println ("Number of Tickets Sold: " + tTickSold);
	System.out.println ("");
	System.out.println ("Gross Amount: " + String.format("%.2f", GrossAmount));
	System.out.println ("");
	System.out.println ("Percentage of gross amount donated " + String.format("%.2f", DonPer)+"%");
	System.out.println ("");
	System.out.println ("Amount Donated: " + String.format("%.2f", AmtDon));
	System.out.println ("");
	System.out.println ("Net Sale: " + String.format("%.2f", NetSale));
	System.out.println ("");
	System.out.println ("");
	System.out.println ("===============================================================================");
	System.out.println ("");
	System.out.println ("");
	System.out.println ("");

	}

}


