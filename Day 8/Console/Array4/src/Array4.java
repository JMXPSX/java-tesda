/* Program Name: Array4
   Created By: John Michael Go
   Creation Date: Jan. 22, 2013 Day 8
   Note: Sample program for string array.
*/

public class Array4 {

		public static void main(String[] args) {
	
			String[] name = {" JUVY ", " JONA ", " REX ", " MERIAM ", " SHEILA ", " EULA ", " DES "};
			
				System.out.print("The girls in this class are:");
				
					for(int i=0;i<name.length;++i){
						System.out.print(name[i]);
					}
					System.out.println();
	}

}
