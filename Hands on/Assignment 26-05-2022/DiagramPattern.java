package corejava;

import java.util.Scanner;

public class DiagramPattern {

	public static void main(String[] args) {

		//creating scanner class
		Scanner scanner = new Scanner(System.in);
		
        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        
        // Print i number of stars
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=rows; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }


}


