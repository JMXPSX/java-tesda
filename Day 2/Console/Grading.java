/* Program Name: Grading
   Created By: John Michael Go
   Creation Date: Jan. 14, 2013 Day 2
   Note: Program will retreive data from a text file and output to a different file
*/

import java.util.*;
import java.io.*;

public class Grading{

	public static void main(String[]args) throws IOException, FileNotFoundException{
	// variable declaration
	double Grade, Total = 0;
	String Name, Surname;

	// program will locate file
	Scanner inFile = new Scanner(new FileReader("f:\\Grading.txt"));

	// program will create a new file
	PrintWriter outFile = new PrintWriter ("f:\\Gradingfinal.txt");

	// get name
	Name = inFile.next();
	// get surname
	Surname = inFile.next();
	// displays Name and Surname
	outFile.println ("Student Name: " + Name + " " + Surname);
	// displays test scores
	outFile.print ("Test Scores: ");

	// read the 1st test score
	Grade = inFile.nextDouble();
	// output the test score
	outFile.printf (" %.2f ", Grade);
 	// update sum
	Total = Total + Grade;

    // read the 2nd test score
	Grade = inFile.nextDouble();
	// output the test score
	outFile.printf (" %.2f ", Grade);
	// update sum
	Total = Total + Grade;

	// read the 3rd test score
	Grade = inFile.nextDouble();
	// output the test score
	outFile.printf (" %.2f ", Grade);
	// update sum
	Total = Total + Grade;

 	// read the 4th test score
	Grade = inFile.nextDouble();
	// output the test score
	outFile.printf (" %.2f ", Grade);
	// update sum
	Total = Total + Grade;

	// read the 5th test score
	Grade = inFile.nextDouble();
	// output the test score
	outFile.printf (" %.2f ", Grade);
	// update sum
	Total = Total + Grade;

	outFile.println();
	// program will compute average grade
	outFile.printf ("Average Grade: %.2f %n", Total/5.0);

	inFile.close();
	outFile.close();

	}

}


