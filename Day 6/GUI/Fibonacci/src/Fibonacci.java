/* Program Name: Fibonacci
   Created By: John Michael Go
   Creation Date: Jan. 18, 2013 Day 6
   Note: Program determines the Fibonacci Sequence of two numbers.
*/

import javax.swing.JOptionPane;
public class Fibonacci {

	public static void main(String[] args) {
		
		//declare variables
		String inputString;
		String outputString;
		int previous1;
		int previous2;
		int current = 0;
		int counter;
		int nthFibonacci;
		
		inputString = JOptionPane.showInputDialog("Enter the first" 
		                         + " Fibonacci Number: ");
		previous1 = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("Enter the second"
				                 + " Fibonacci Number: ");
		previous2 = Integer.parseInt(inputString);
		
		outputString = "The first two numbers of the "
				     + "Fibonacci Sequence are: " 
				     + previous1 + " and " + previous2;
		
		inputString = JOptionPane.showInputDialog("Enter the position"
				     + " of the desired number in "
				     + "the Fibonacci Sequence: " );
		nthFibonacci = Integer.parseInt(inputString);
		
		if (nthFibonacci == 1)
			current = previous1;
		else if (nthFibonacci == 2)
			current = previous2;
		else{
			counter = 3;
		
		while(counter <= nthFibonacci)
		{
			current = previous2 + previous1;
			previous1 = previous2;
			previous2 = current;
			counter++;
		}
	}
		outputString = outputString + "\n The "
				       + nthFibonacci
				       + "th Fibonacci Number of "
				       + "The sequence is: "
				       + current;
		
		JOptionPane.showMessageDialog(null, outputString);
		

	}

}
