/* Program Name: Dots
   Created By: John Michael Go
   Creation Date: Jan. 16, 2013 Day 4
   Note: Program countdowns from 10 to 1 before displaying a message.
*/

	public class Dots{
	
		public static void main(String[] args) 
		{
			
			for (int x = 10; x > 0; x--)
			{
				System.out.print (x);
				
				for (int y = 1; y <= 10; y++)
				{
					System.out.print ("");
					
					int z = 1;
					while ( z <= 100000000)
					z++;
					
					System.out.print (".");
																						
				}
						
				System.out.println ("\n");
							
			}
			
			System.out.println (" Happy New Year !");
		
		}
	
	}
