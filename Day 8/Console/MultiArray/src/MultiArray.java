/* Program Name: MultiArray
   Created By: John Michael Go
   Creation Date: Jan. 22, 2013 Day 8
   Note: This is a program for multi-dimensional array.
*/

public class MultiArray {

	public static void main(String[] arg) {
		
		String[][] name= {
				{"renato", " dela cruz"},
				{"bong", " revilla"},
				{"aga", " muhlach"},
				};
		for(int i=0; i<name.length; ++i){
			System.out.print("The Candidates are: ");
			for(int j=0;j<name[i].length;++j){
				
				System.out.print(name[i][j]);
				if (j<2)
					System.out.print("");
			}
			System.out.println("");
			
		}
		
		}
	}



