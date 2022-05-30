package corejava;

// java program to print star pattern

		import java.util.Scanner;

		public class DiagramPattern {
			
			// Main driver method

			public static void main(String[] args) {

				//creating scanner class
				Scanner scanner = new Scanner(System.in);
				
		        // Get the number of rows from the user
		        System.out.println("Enter the number of rows needed to print the pattern ");

		        int rows = scanner.nextInt();
		        System.out.println("## Printing the pattern ##");
		        
		        // Print i number of stars
		        for (int i=1; i<=4; i++)
		        {
		         
		        	//print j number of stars
		        	for (int j=1; j<=10; j++)
		            {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		        scanner.close();
		    }


		}



