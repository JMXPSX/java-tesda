/* Program Name: Assign3
   Created By: John Michael Go
   Creation Date: Jan. 17, 2013 Day 5
   Note: Program computes for the total item amount and determines if payment is enough or requires to add more.
*/

import java.util.*;

public class Assign3 {
	
		// static variable declaration
		static final double CANDY_PRICE = 1;
		static final double CHIPS_PRICE = 25;
		static final double GUM_PRICE = 7;
		static final double COOKIE_PRICE = 15;
		
		static Scanner console = new Scanner (System.in);

	public static void main(String[] args) {
		
		// variable declaration
		String addyn, Faddyn = null; 
		int prodNum, prodQty, prodItem;
		double prodAmt = 0, TprodAmt=0, payAmt, TpayAmt, addAmt, payAmtadd=0, payAmtaddx=0, payAmtx, tChange; 
		
		// menu
		System.out.println ("                                           Candy Machine ");
		System.out.println ("");
		System.out.println ("                                   Available Items:    Prices:");
		System.out.println ("");
		System.out.println ("                                   1.) Candy          Php  1.00");
		System.out.println ("                                   2.) Chips          Php 25.00");
		System.out.println ("                                   3.) Bubble Gum     Php  7.00");
		System.out.println ("                                   4.) Cookies        Php 15.00");
		System.out.println ("                                   5.) Done ! ");
		System.out.println ("");
		System.out.println ("                                                      Product:            Qty:            Amount:");
		System.out.println ("");
		    // for loop begin
			for (prodNum = 0; prodNum != 5; prodNum = prodNum)
			{
				System.out.print ("                   Select Product: ");
				prodNum = console.nextInt();
				TprodAmt = TprodAmt + prodAmt;
				
				switch (prodNum)
				{ // product selection begin
				
				case 1 : 
					System.out.print ("                                                       Candy               ");
					prodQty = console.nextInt();
					prodAmt = prodQty * CANDY_PRICE; 
					System.out.print (String.format("								                           %.2f",prodAmt));
					System.out.flush();
					break;
				case 2 :
					System.out.print ("                                                       Chips               ");
					prodQty = console.nextInt();
					prodAmt = prodQty * CHIPS_PRICE; 
					System.out.print (String.format("								                           %.2f",prodAmt));
					System.out.flush();
					break;
				case 3 :
					System.out.print ("                                                     Bubble Gum            ");
					prodQty = console.nextInt();
					prodAmt = prodQty * GUM_PRICE;
					System.out.print (String.format("								                           %.2f",prodAmt));
					System.out.flush();
					break;
				case 4 :
					System.out.print ("                                                       Cookies             ");
					prodQty = console.nextInt();
					prodAmt = prodQty * COOKIE_PRICE;
					System.out.print (String.format("								                           %.2f",prodAmt));
					System.out.flush();
					break;
				case 5 :
									
			} // product selection end
				
				System.out.println ("\n");
								
			} // for loop end
			// accepts money
			System.out.println ("                                                                                         ----------");
			System.out.println ("                                                                        Total Amount: Php  " + String.format("%.2f",TprodAmt));
			System.out.println ();
			System.out.print ("                                                                          Payment: Php       ");
			payAmt = console.nextDouble();
		// paid amount is more or equal to the total item amount 
		if (payAmt >= TprodAmt)	
		{
			System.out.println();
			TpayAmt = payAmt - TprodAmt;
			System.out.println ("                                                                          Change  : Php      " + String.format("%.2f", TpayAmt));
			System.out.println();
			System.out.print("                                           Thank You, Come Again!");
		}
		
		// paid amount is lesser than the total item amount begin
		else if (payAmt < TprodAmt)
		{
			
			payAmtaddx = payAmtaddx + payAmt ;
			//check
			//System.out.print(payAmtaddx);
			// program loop until paid amount is greater or equal to the total item amount
			for (payAmtaddx = payAmtaddx; payAmtaddx < TprodAmt; payAmtaddx = payAmtaddx)
			{
				// paid amount not enough and will ask if additional amount will be added
				System.out.print("Total Amount Paid: Php " + String.format("%.2f", payAmtaddx));
				System.out.println();
			    System.out.println("Your Payment is not enough...");
			    System.out.println();
			    System.out.print("Do you want to add another amount? (Y/N): ");
			    Faddyn = console.next();
			  					  
				  switch (Faddyn)
					{
					  	case "Y":
						case "y": 
							      System.out.print ("                                                                          Payment: Php       ");
							      payAmt = console.nextDouble();
							      break;
						
						case "N": 
						case "n":
							      System.out.println();
							      System.out.println("                                           Transaction cancelled");
								  System.out.print("                                           Thank You, Come Again!");
								  System.exit(0);
					     		  break;
					}
				  
				 // program adds amount paid until condition is not met
				 
				 payAmtaddx = payAmt + payAmtaddx;
				  
			}
			// computation for change
			
			System.out.println();
			System.out.println("                                                                                        ------------");
			tChange = payAmtaddx - TprodAmt;
			System.out.print ("                                                                          Change: Php       "+ String.format("%.2f",tChange)); 
			System.out.println();
			System.out.print("                                           Thank You, Come Again!");
			
		} // paid amount is lesser than the total item amount end
				
			
	} // public static void end

} // public class end
