/* Program Name: Exe1
   Created By: John Michael Go
   Creation Date: Jan. 17, 2013 Day 5
   Note: Program determines if the 2 numbers entered are divisible and not divisible by 5 and 6.
*/

import java.util.Scanner;

public class exe1 {
	
	static Scanner console = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int Num, Num5, Num6;
		boolean Numx, Numy, Numz;
		
		System.out.print ("Enter Number: ");
		Num = console.nextInt();
		
		Num5 = Num%5;
		Num6 = Num%6;
		Numx = (Num5 == 0 && Num6 == 0);
		Numy = (Num5 == 0 || Num6 == 0);
		Numz = (Num5 > 0 && Num6 > 0);
		
		System.out.println( (Num) + " is divisible by 5 and 6 = " + Numx);
		System.out.println( (Num) + " is divisible by 5 or 6 = " + Numy);
		System.out.println( (Num) + " is neither divisible by 5 and 6 = " + Numz);
		
	}

}
