/* Program Name: Denomination
   Created By: John Michael Go
   Creation Date: Jan. 14, 2013 Day 2
   Note: Program will denominate currency
*/

import java.util.*;
import java.io.*;

public class Denomination{
    // static variable declaration
	static Scanner console = new Scanner (System.in);
	static final double TWENTY_FIVE_CENTS = .25;
	static final double FIFTY_CENTS = .50;
	static final double ONE_PESO = 1;
	static final double FIVE_PESO = 5;
	static final double TEN_PESO = 10;
	static final double TWENTY_PESO = 20;
	static final double FIFTY_PESO = 50;
	static final double ONE_HUNDRED_PESO = 100;
	static final double FIVE_HUNDRED_PESO = 500;
	static final double ONE_THOUSAND_PESO = 1000;

	public static void main(String[]args){

	int Peso;
	double a,b,c,d,e,f,g,h,i,j;

	System.out.println("");
	System.out.print("Input number in peso: "); // input number in peso
	Peso = console.nextInt();
	System.out.println("");
	System.out.println("");
	System.out.println ("===============================================================================");
	System.out.println("");
    // computation
	a = (Peso / TWENTY_FIVE_CENTS);
	b = (Peso / FIFTY_CENTS);
	c = (Peso / ONE_PESO);
	d = (Peso / FIVE_PESO);
	e = (Peso / TEN_PESO);
	f = (Peso / TWENTY_PESO);
	g = (Peso / FIFTY_PESO);
	h = (Peso / ONE_HUNDRED_PESO);
	i = (Peso / FIVE_HUNDRED_PESO);
	j = (Peso / ONE_THOUSAND_PESO);

    // display computed value of denomination
	System.out.println("Denomination:");
	System.out.println("");
	System.out.println("");
	System.out.println("      .25 = There are " + String.format("%.2f", a) + " pieces of twenty five centavos in " + Peso);
	System.out.println("");
	System.out.println("      .50 = There are " + String.format("%.2f", b) + " pieces of fifty centavos in " + Peso);
	System.out.println("");
	System.out.println("     1.00 = There are " + String.format("%.2f", c) + " pieces of one pesos in " + Peso);
	System.out.println("");
	System.out.println("     5.00 = There are " + String.format("%.2f", d) + " pieces of five pesos in " + Peso);
	System.out.println("");
	System.out.println("    10.00 = There are " + String.format("%.2f", e) + " pieces of ten pesos in " + Peso);
	System.out.println("");
	System.out.println("    20.00 = There are " + String.format("%.2f", f) + " pieces of twenty pesos in " + Peso);
	System.out.println("");
	System.out.println("    50.00 = There are " + String.format("%.2f", g) + " pieces of fifty pesos in " + Peso);
	System.out.println("");
	System.out.println("   100.00 = There are " + String.format("%.2f", h) + " pieces of one hundred pesos in " + Peso);
	System.out.println("");
	System.out.println("   500.00 = There are " + String.format("%.2f", i) + " pieces of five hundred pesos in " + Peso);
	System.out.println("");
	System.out.println(" 1,000.00 = There are " + String.format("%.2f", j) + " pieces of one thousand pesos in " + Peso);
	System.out.println("");
	System.out.println("");
	System.out.println("");



	}

}


