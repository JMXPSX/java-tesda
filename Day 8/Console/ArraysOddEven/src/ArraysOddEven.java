/* Program Name: ArrayOddEven
   Created By: John Michael Go
   Creation Date: Jan. 22, 2013 Day 8
   Note: This is a program that sorts even an odd numbers between 1 to 10.
*/
public class ArraysOddEven {

	public static void main(String[] args) {
			
				int[] num = {1,2,3,4,5,6,7,8,9,10};
				int numx;
				
				for (int i=0; i<num.length; ++i)
				{
					numx = num[i]%2;
				
					if (numx == 0)
				    {
				    System.out.println("The even numbers are: " +num[i]);
				    }  
	
				}
				
				for (int y=0; y<num.length; ++y)
				{
					numx = num[y]%2;
				
					if (numx != 0)
				    {
				    System.out.println("The odd numbers are: " +num[y]);
				    }  
	
				}

		}

	}


