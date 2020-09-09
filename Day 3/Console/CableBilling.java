/* Program Name: CableBilling
   Created By: John Michael Go
   Creation Date: Jan. 15, 2013 Day 3
   Note: Program will compute for total charge for commercial and residential customers who wish to add HD channels
*/

import java.util.*;
import java.io.*;

public class CableBilling{

	static Scanner console = new Scanner (System.in);

	// static variable commercial customer
	static final double COM_PROCESS_FEE = 15;
	static final double COM_SERVICE_FEE = 75;
	static final double COM_CONNECTION_FEE = 5;
	static final double COM_HD_CHANNEL = 50;

	// static variable residential user
	static final double RES_PROCESS_FEE = 25;
	static final double RES_SERVICE_FEE = 105;
	static final double RES_CONNECT_FEE = 25;
	static final double RES_HD_CHANNEL = 150;

	public static void main(String[]args){

	// variable declaration
	String Name, Veri, Verix, Choice;
	int Acct, Type, Sub, Chan, Date, Deli;
	Double ComA, ComB, ComC, aComHD, DisaComHD, totalDisaComHD, aResHD, ResA, ResB, ResC;
	boolean continueProg=true;
	// User input data
	System.out.println("");
	System.out.println("===============================================================================");
	System.out.println("|                        Cable Company Billing System                         |");
	System.out.println("===============================================================================");
	System.out.println("");
	System.out.print("Customer Name: ");
	Name = console.nextLine();
 	System.out.println("");
 	System.out.print("Account Number: ");
	Acct = console.nextInt();
	System.out.println("");
	System.out.print("Account Type [1] Commercial [2] Residential: ");
	Type = console.nextInt();
	System.out.println("");
	System.out.print("Years of Subscription: ");
	Sub = console.nextInt();
	System.out.println("");
	System.out.print("Number of HD Channels ordered (Minimum of 2): ");
	Chan = console.nextInt();

	if (Chan < 2)
	{ // channel less than two
		System.out.println("");
		System.out.println("You only entered 1 premium channel...");
		System.out.print("Would you like to set it to two? [1] Yes [2] No: ");
		Choice = console.next();

			switch (Choice)
				{
					case "1" : Chan = 2;
							   continueProg = true;
							   break;

					default  : continueProg = false;

				}

	} // less than 2 channels

	if (continueProg)
	{ // 2 or more channels begin
	System.out.println("");
	System.out.print("Bills up to date? [1] Yes [2] No: ");
	Date = console.nextInt();
	System.out.println("");

	 // Commercial customer with 2 or more years subscription and updated bill begin
	 if (Type == 1 && Sub >= 2 && Date == 1)
	 {
		 // if bill is updated begin
		 if (Date == 1)
		 {       // program will ask verification method
		 		 System.out.print("Customer verified bill through [1] e-mail [2] fax [3] phone: ");
		 		 Veri = console.next();
	             System.out.println("");

	                    switch(Veri)
	                    {

						case "1":
							Verix = "email"; break;
						case "2":
							Verix = "fax"; break;
						case "3":
							Verix = "phone"; break;
						default:
							Verix = "others"; break;
				        }

		 aComHD = Chan * COM_HD_CHANNEL;
		 DisaComHD = aComHD * .10;
		 totalDisaComHD = aComHD - DisaComHD;
		 ComA = COM_SERVICE_FEE + COM_CONNECTION_FEE + totalDisaComHD;

		 System.out.println("===============================================================================");
		 System.out.println("|                                                                             |");
		 System.out.println("|                              Customer Details                               |");
		 System.out.println("|                                                                             |");
		 System.out.println("===============================================================================");
		 System.out.println("");
		 System.out.println("Account Number             : " +Acct);
		 System.out.println("");
		 System.out.println("Customer Name              : " +Name);
		 System.out.println("");
		 System.out.println("Years Subscribed           : " +Sub);
		 System.out.println("");
		 System.out.println("===============================================================================");
		 System.out.println("|                                                                             |");
		 System.out.println("|                            Transaction Details                              |");
		 System.out.println("|                                                                             |");
		 System.out.println("===============================================================================");
		 System.out.println("");
		 System.out.println("HD Channels ordered        : " +Chan);
		 System.out.println("");
		 System.out.println("Processing Fee (waived)    : Php  0.00");
		 System.out.println("");
		 System.out.println("Basic Service Fee          : Php 75.00");
		 System.out.println("");
		 System.out.println("Basic Connection Fee       : Php  5.00");
		 System.out.println("");
		 System.out.println("HD Channels Fee (less 10%) : Php " + String.format("%.2f",totalDisaComHD));
		 System.out.println("");
		 System.out.println("Bill verified through      : " + Verix);
		 System.out.println("");
		 System.out.println("Total Charge               : Php " + String.format("%.2f",ComA));
		 System.out.println("");
		 System.out.println("===============================================================================");
		 System.out.println("");
		 System.out.println(" Remarks: Commercial customer with 2 or more years of subscription and updated bill also less 10% discount.");
		 System.out.println("");
		 System.out.println("");
		 System.out.println("");

	     } // if bill is updated end

    } // Commercial customer with 2 or more years subscription and updated bill end

    // Commercial customer with less than 2 years subscription and updated bill begin
    else if (Type == 1 && Sub < 2 && Date == 1)
    {
		 // if bill is updated begin
		 if (Date == 1)
		 {

				 System.out.print("Customer verified bill through [1] e-mail [2] fax [3] phone: ");
				 Veri = console.next();
	             System.out.println("");
	             System.out.print("History of delinquency [1] Yes [2] No: ");
				 Deli = console.nextInt();
	             System.out.println("");

	                    switch(Veri)
						{
						case "1":
							Verix = "email"; break;
						case "2":
						    Verix = "fax"; break;
						case "3":
							Verix = "phone"; break;
						default:
						    Verix = "others"; break;
				        }
				            // Commercial customer with less than 2 years subscription and delinquent updated bill begin
				        	if (Deli == 1)
				        	{
								aComHD = Chan * COM_HD_CHANNEL;
								ComC = COM_PROCESS_FEE + COM_SERVICE_FEE + COM_CONNECTION_FEE + aComHD;

								System.out.println("===============================================================================");
								System.out.println("|                                                                             |");
								System.out.println("|                              Customer Details                               |");
								System.out.println("|                                                                             |");
								System.out.println("===============================================================================");
                                System.out.println("");
								System.out.println("Account Number        : " +Acct);
								System.out.println("");
								System.out.println("Customer Name         : " +Name);
								System.out.println("");
								System.out.println("Years Subscribed      : " +Sub);
								System.out.println("");
								System.out.println("===============================================================================");
								System.out.println("|                                                                             |");
								System.out.println("|                            Transaction Details                              |");
								System.out.println("|                                                                             |");
								System.out.println("===============================================================================");
                                System.out.println("");
                                System.out.println("HD Channels ordered   : " +Chan);
		                        System.out.println("");
								System.out.println("Processing Fee        : Php 15.00");
								System.out.println("");
								System.out.println("Basic Service Fee     : Php 75.00");
								System.out.println("");
								System.out.println("Basic Connection Fee  : Php  5.00");
								System.out.println("");
								System.out.println("HD Channels Fee       : Php " + String.format("%.2f",aComHD));
								System.out.println("");
								System.out.println("Bill verified through : " +Verix);
								System.out.println("");
								System.out.println("Total Charge          : Php " + String.format("%.2f",ComC));
		                        System.out.println("");
		                        System.out.println("===============================================================================");
		                        System.out.println("");
		                        System.out.println(" Remarks: Commercial customer with less than 2 years subscription and delinquent updated bill also no 10% discount.");
		                        System.out.println("");
		                        System.out.println("");
		                        System.out.println("");

					    	} // Commercial customer with less than 2 years subscription and delinquent updated bill end
							// Commercial customer with less than 2 years subscription and no delinquent updated bill (10% HD Discount) begin
					    	else
					    	{
								aComHD = Chan * COM_HD_CHANNEL;
								DisaComHD = aComHD * .10;
								totalDisaComHD = aComHD - DisaComHD;
								ComB = COM_SERVICE_FEE + COM_CONNECTION_FEE + totalDisaComHD;

								System.out.println("===============================================================================");
								System.out.println("|                                                                             |");
								System.out.println("|                              Customer Details                               |");
								System.out.println("|                                                                             |");
								System.out.println("===============================================================================");
                                System.out.println("");
								System.out.println("Account Number             : " +Acct);
								System.out.println("");
								System.out.println("Customer Name              : " +Name);
								System.out.println("");
								System.out.println("Years Subscribed           : " +Sub);
								System.out.println("");
								System.out.println("===============================================================================");
								System.out.println("|                                                                             |");
								System.out.println("|                            Transaction Details                              |");
								System.out.println("|                                                                             |");
								System.out.println("===============================================================================");
                                System.out.println("");
                                System.out.println("HD Channels ordered        : " +Chan);
		                        System.out.println("");
								System.out.println("Processing Fee             : Php  0.00");
								System.out.println("");
								System.out.println("Basic Service Fee          : Php 75.00");
								System.out.println("");
								System.out.println("Basic Connection Fee       : Php  5.00");
								System.out.println("");
								System.out.println("HD Channels Fee (less 10%) : Php " + String.format("%.2f",totalDisaComHD));
								System.out.println("");
								System.out.println("Bill verified through      : " +Verix);
								System.out.println("");
								System.out.println("Total Charge               : Php " + String.format("%.2f",ComB));
		                        System.out.println("");
								System.out.println("===============================================================================");
		                        System.out.println("");
		                        System.out.println(" Remarks: Commercial customer with less than 2 years subscription and no delinquent updated bill (10% HD Discount).");
		                        System.out.println("");
		                        System.out.println("");
		                        System.out.println("");

						    } // Commercial customer with less than 2 years subscription and no delinquent updated bill (10% HD Discount) end

		 } // if bill is updated end

	} // Commercial customer with less than 2 years subscription and updated bill end

	// Residential customer with 5 or more years subscription and updated bill begin
	else if (Type == 2 && Sub >= 5)
	{
		 aResHD = Chan * RES_HD_CHANNEL;
		 ResA = RES_SERVICE_FEE + RES_CONNECT_FEE + aResHD;

		 System.out.print("Customer verified bill through [1] e-mail [2] fax [3] phone: ");
		 Veri = console.next();
	     System.out.println("");

		 switch(Veri)
			{
			case "1":
				Verix = "email"; break;
			case "2":
				Verix = "fax"; break;
			case "3":
				Verix = "phone"; break;
			default:
				Verix = "others"; break;
	        }

		 System.out.println("===============================================================================");
		 System.out.println("|                                                                             |");
		 System.out.println("|                              Customer Details                               |");
		 System.out.println("|                                                                             |");
		 System.out.println("===============================================================================");
         System.out.println("");
		 System.out.println("Account Number        : " +Acct);
		 System.out.println("");
		 System.out.println("Customer Name         : " +Name);
		 System.out.println("");
		 System.out.println("Years Subscribed      : " +Sub);
		 System.out.println("");
		 System.out.println("===============================================================================");
		 System.out.println("|                                                                             |");
		 System.out.println("|                            Transaction Details                              |");
		 System.out.println("|                                                                             |");
		 System.out.println("===============================================================================");
         System.out.println("");
         System.out.println("HD Channels ordered     : " +Chan);
		 System.out.println("");
		 System.out.println("Processing Fee (waived) : Php   0.00");
		 System.out.println("");
		 System.out.println("Basic Service Fee       : Php 105.00");
		 System.out.println("");
		 System.out.println("Basic Connection Fee    : Php  25.00");
		 System.out.println("");
		 System.out.println("HD Channels Fee         : Php " + String.format("%.2f",aResHD));
		 System.out.println("");
		 System.out.println("Bill verified through   : " + Verix);
		 System.out.println("");
		 System.out.println("Total Charge            : Php " + String.format("%.2f",ResA));
		 System.out.println("");
         System.out.println("===============================================================================");
		 System.out.println("");
         System.out.println(" Remarks: Residential customer with 5 or more years subscription and updated bill. ");
         System.out.println("");
         System.out.println("");
         System.out.println("");


    } // Residential customer with 5 or more years subscription and updated bill end

    else if (Type == 2 && Sub == 2 || Sub == 3 || Sub == 4)
    { // Residential customer with 2 to 4 years subscription and updated bill begin

    	 System.out.print("Customer verified bill through [1] e-mail [2] fax [3] phone: ");
		 Veri = console.next();
		 System.out.println("");
		 System.out.print("History of delinquency [1] Yes [2] No: ");
		 Deli = console.nextInt();
		 System.out.println("");

				switch(Veri)
				{
				case "1":
					Verix = "email"; break;
				case "2":
					Verix = "fax"; break;
				case "3":
					Verix = "phone"; break;
				default:
					Verix = "others"; break;
				}
    				// Residential customer with 2 to 4 years subscription and updated bill with delinquency begin
    				if (Deli == 1)
    				{
						 aResHD = Chan * RES_HD_CHANNEL;
						 ResB = RES_PROCESS_FEE + RES_SERVICE_FEE + RES_CONNECT_FEE + aResHD;

						 System.out.println("===============================================================================");
						 System.out.println("|                                                                             |");
						 System.out.println("|                              Customer Details                               |");
						 System.out.println("|                                                                             |");
						 System.out.println("===============================================================================");
                         System.out.println("");
						 System.out.println("Account Number        : " +Acct);
						 System.out.println("");
						 System.out.println("Customer Name         : " +Name);
						 System.out.println("");
						 System.out.println("Years Subscribed      : " +Sub);
						 System.out.println("");
						 System.out.println("===============================================================================");
						 System.out.println("|                                                                             |");
						 System.out.println("|                            Transaction Details                              |");
						 System.out.println("|                                                                             |");
						 System.out.println("===============================================================================");
                         System.out.println("");
						 System.out.println("HD Channels ordered   : " +Chan);
		                 System.out.println("");
						 System.out.println("Processing Fee        : Php  25.00");
						 System.out.println("");
						 System.out.println("Basic Service Fee     : Php 105.00");
						 System.out.println("");
						 System.out.println("Basic Connection Fee  : Php  25.00");
						 System.out.println("");
						 System.out.println("HD Channels Fee       : Php " + String.format("%.2f",aResHD));
						 System.out.println("");
						 System.out.println("Bill verified through : " + Verix);
		                 System.out.println("");
						 System.out.println("Total Charge          : Php " + String.format("%.2f",ResB));
                         System.out.println("");
                         System.out.println("===============================================================================");
		                 System.out.println("");
                         System.out.println(" Remarks: Residential customer with 2 to 4 years subscription and updated bill with delinquency ");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");

				    } // Residential customer with 2 to 4 years subscription and updated bill with delinquency end

				    else if (Deli == 2)
				    {
						aResHD = Chan * RES_HD_CHANNEL;
						ResB = RES_SERVICE_FEE + RES_CONNECT_FEE + aResHD;

						 System.out.println("===============================================================================");
						 System.out.println("|                                                                             |");
						 System.out.println("|                              Customer Details                               |");
						 System.out.println("|                                                                             |");
						 System.out.println("===============================================================================");
                         System.out.println("");
						 System.out.println("Account Number        : " +Acct);
						 System.out.println("");
						 System.out.println("Customer Name         : " +Name);
						 System.out.println("");
						 System.out.println("Years Subscribed      : " +Sub);
						 System.out.println("");
						 System.out.println("===============================================================================");
						 System.out.println("|                                                                             |");
						 System.out.println("|                            Transaction Details                              |");
						 System.out.println("|                                                                             |");
						 System.out.println("===============================================================================");
						 System.out.println("");
						 System.out.println("HD Channels ordered     : " +Chan);
                         System.out.println("");
						 System.out.println("Processing Fee (waived) : Php   0.00");
						 System.out.println("");
						 System.out.println("Basic Service Fee       : Php 105.00");
						 System.out.println("");
						 System.out.println("Basic Connection Fee    : Php  25.00");
						 System.out.println("");
						 System.out.println("HD Channels Fee         : Php " + String.format("%.2f",aResHD));
						 System.out.println("");
						 System.out.println("Bill verified through   : " + Verix);
		                 System.out.println("");
						 System.out.println("Total Charge            : Php " + String.format("%.2f",ResB));
						 System.out.println("===============================================================================");
		                 System.out.println("");
						 System.out.println(" Remarks: Residential customer with 2 to 4 years subscription and updated bill with no delinquency ");
						 System.out.println("");
						 System.out.println("");
						 System.out.println("");

					}


    } // Residential customer without conditions and updated bill begin
    else //if(Type == 2 && Sub < 2)
    {
		 System.out.print("Customer verified bill through [1] e-mail [2] fax [3] phone: ");
		 Veri = console.next();
		 System.out.println("");

		 aResHD = Chan * RES_HD_CHANNEL;
		 ResC = RES_PROCESS_FEE + RES_SERVICE_FEE + RES_CONNECT_FEE + aResHD;

		 switch(Veri)
			{
			case "1":
				Verix = "email"; break;
			case "2":
				Verix = "fax"; break;
			case "3":
				Verix = "phone"; break;
			default:
				Verix = "others"; break;
	        }

		 System.out.println("===============================================================================");
		 System.out.println("|                                                                             |");
		 System.out.println("|                              Customer Details                               |");
		 System.out.println("|                                                                             |");
		 System.out.println("===============================================================================");
         System.out.println("");
		 System.out.println("Account Number        : " +Acct);
		 System.out.println("");
		 System.out.println("Customer Name         : " +Name);
		 System.out.println("");
		 System.out.println("Years Subscribed      : " +Sub);
		 System.out.println("");
		 System.out.println("===============================================================================");
		 System.out.println("|                                                                             |");
		 System.out.println("|                            Transaction Details                              |");
		 System.out.println("|                                                                             |");
		 System.out.println("===============================================================================");
		 System.out.println("");
		 System.out.println("HD Channels ordered   : " +Chan);
         System.out.println("");
		 System.out.println("Processing Fee        : Php  25.00");
		 System.out.println("");
		 System.out.println("Basic Service Fee     : Php 105.00");
		 System.out.println("");
		 System.out.println("Basic Connection Fee  : Php  25.00");
		 System.out.println("");
		 System.out.println("HD Channels Fee       : Php " + String.format("%.2f",aResHD));
		 System.out.println("");
		 System.out.println("Bill verified through : " + Verix);
		 System.out.println("");
		 System.out.println("Total Charge          : Php " + String.format("%.2f",ResC));
         System.out.println("===============================================================================");
		 System.out.println("");
         System.out.println(" Remarks: Residential customer with 1 year or less subscription and updated bill");
         System.out.println("");
         System.out.println("");
         System.out.println("");

	} // Residential customer without conditions and updated bill end

	} // 2 or more channels end

		System.out.println("");
		System.out.println("Program will now end. Proceed with another transaction");
		System.out.println("");

    } // public static void

} // public static class