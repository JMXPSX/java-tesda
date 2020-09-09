/* Program Name: Assign2
   Created By: John Michael Go
   Creation Date: Jan. 16, 2013 Day 4
   Note: Program will ask for 5 digits and will display how many positive, negative and zero numbers.
*/

import javax.swing.JOptionPane;

public class Assign2{

public static void main(String[]args){
	// variable declaration
	int numX, numPlus=0, numMinus=0, numZero=0, numTotal=0;
	String numStr;

	numStr=JOptionPane.showInputDialog("Enter 1st number: "); // ask for the 1st input
	numX=Integer.parseInt(numStr);

	if (numX > 0){ // if number is positive begin

		numPlus = numPlus + 1;
		numTotal = numTotal + 1;

		} // if number is positive end

	else if (numX < 0){ // if number is negative begin

		numMinus = numMinus + 1;
		numTotal = numTotal + 1;

	} // if number is negative end

	else if (numX == 0){ // if number is zero begin

		numZero = numZero + 1;
		numTotal = numTotal + 1;
	} // if number is zero end

	else{
		numPlus=0;
		numMinus=0;
		numZero=0;


	}

	numStr=JOptionPane.showInputDialog("Enter 2nd number: "); // ask for the 2nd input
		numX=Integer.parseInt(numStr);

		if (numX > 0){ // if number is positive begin

			numPlus = numPlus + 1;
			numTotal = numTotal + 1;

			} // if number is positive end

		else if (numX < 0){ // if number is negative begin

			numMinus = numMinus + 1;
			numTotal = numTotal + 1;

		} // if number is negative end

		else if (numX == 0){ // if number is zero begin

			numZero = numZero + 1;
			numTotal = numTotal + 1;
		} // if number is zero end

		else{

			numPlus=0;
			numMinus=0;
			numZero=0;


	}

	numStr=JOptionPane.showInputDialog("Enter 3rd number: "); // ask for the 3rd input
			numX=Integer.parseInt(numStr);

			if (numX > 0){ // if number is positive begin

				numPlus = numPlus + 1;
				numTotal = numTotal + 1;

				} // if number is positive end

			else if (numX < 0){ // if number is negative begin

				numMinus = numMinus + 1;
				numTotal = numTotal + 1;

			} // if number is negative end

			else if (numX == 0){ // if number is zero begin

				numZero = numZero + 1;
				numTotal = numTotal + 1;
			} // if number is zero end

			else{

				numPlus=0;
				numMinus=0;
				numZero=0;


	}

	numStr=JOptionPane.showInputDialog("Enter 4th number: "); // ask for the 4th input
			numX=Integer.parseInt(numStr);

			if (numX > 0){ // if number is positive begin

				numPlus = numPlus + 1;
				numTotal = numTotal + 1;

				} // if number is positive end

			else if (numX < 0){ // if number is negative begin

				numMinus = numMinus + 1;
				numTotal = numTotal + 1;

			} // if number is negative end

			else if (numX == 0){ // if number is zero begin

				numZero = numZero + 1;
				numTotal = numTotal + 1;
			} // if number is zero end

			else{

				numPlus=0;
				numMinus=0;
				numZero=0;


	}

	numStr=JOptionPane.showInputDialog("Enter 5th number: "); // ask for the 5th input
			numX=Integer.parseInt(numStr);

			if (numX > 0){ // if number is positive begin

				numPlus = numPlus + 1;
				numTotal = numTotal + 1;

				} // if number is positive end

			else if (numX < 0){ // if number is negative begin

				numMinus = numMinus + 1;
				numTotal = numTotal + 1;

			} // if number is negative end

			else if (numX == 0){ // if number is zero begin

				numZero = numZero + 1;
				numTotal = numTotal + 1;
			} // if number is zero end

			else{

				numPlus=0;
				numMinus=0;
				numZero=0;

	}

	JOptionPane.showMessageDialog(null,"Total Positive Numbers: " + numPlus + "\n"
	+ "Total Negative Numbers: " + numMinus + "\n"
	+ "Total Zero Numbers: " + numZero + "\n"
    + "Total Numbers: " + numTotal , "Total Numbers", JOptionPane.INFORMATION_MESSAGE);

	System.exit(0);


} // public static void end

} // public class end